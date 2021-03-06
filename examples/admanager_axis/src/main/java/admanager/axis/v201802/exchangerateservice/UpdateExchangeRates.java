// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package admanager.axis.v201802.exchangerateservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v201802.StatementBuilder;
import com.google.api.ads.admanager.axis.v201802.ApiError;
import com.google.api.ads.admanager.axis.v201802.ApiException;
import com.google.api.ads.admanager.axis.v201802.ExchangeRate;
import com.google.api.ads.admanager.axis.v201802.ExchangeRatePage;
import com.google.api.ads.admanager.axis.v201802.ExchangeRateRefreshRate;
import com.google.api.ads.admanager.axis.v201802.ExchangeRateServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.rmi.RemoteException;
import java.util.Arrays;

/**
 * This example updates an exchange rate's refresh rate. To determine which exchange rates
 * exist, run GetAllExchangeRates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateExchangeRates {

  private static class UpdateExchangeRatesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.EXCHANGE_RATE_ID, required = true,
        description = "The ID of the exchange rate to update.")
    private Long exchangeRateId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param exchangeRateId the ID of the exchange rate to update.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long exchangeRateId)
      throws RemoteException {
    // Get the ExchangeRateService.
    ExchangeRateServiceInterface exchangeRateService =
        adManagerServices.get(session, ExchangeRateServiceInterface.class);

    // Create a statement to only select a single exchange rate by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id and refreshRate = :refreshRate")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", exchangeRateId)
        .withBindVariableValue("refreshRate", ExchangeRateRefreshRate.FIXED);

    // Get the exchange rate.
    ExchangeRatePage page =
        exchangeRateService.getExchangeRatesByStatement(statementBuilder.toStatement());

    ExchangeRate exchangeRate = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the exchange rate value to 1.5.
    exchangeRate.setExchangeRate(15000000000L);

    // Update the exchange rate on the server.
    ExchangeRate[] exchangeRates = exchangeRateService.updateExchangeRates(
        new ExchangeRate[] {exchangeRate});

    for (ExchangeRate updatedExchangeRate : exchangeRates) {
      System.out.printf("Exchange rate with ID %d, currency code '%s',"
          + " direction '%s', and exchange rate %.2f was updated.%n",
          updatedExchangeRate.getId(), updatedExchangeRate.getCurrencyCode(),
          updatedExchangeRate.getDirection().getValue(),
          (updatedExchangeRate.getExchangeRate() / 10000000000f));
    }
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdManagerServices adManagerServices = new AdManagerServices();

    UpdateExchangeRatesParams params = new UpdateExchangeRatesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.exchangeRateId = Long.parseLong("INSERT_EXCHANGE_RATE_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.exchangeRateId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
