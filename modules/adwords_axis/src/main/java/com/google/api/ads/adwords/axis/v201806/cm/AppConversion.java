// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * AppConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;


/**
 * A ConversionTracker for mobile apps.
 */
public class AppConversion  extends com.google.api.ads.adwords.axis.v201806.cm.ConversionTracker  implements java.io.Serializable {
    /* App ID of the app conversion tracker. This field is required
     * for certain
     *                     conversion types, in particular, Android app install
     * (first open) and
     *                     Android app install (from Google Play).
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String appId;

    /* App platform of the app conversion tracker. This field defaults
     * to NONE.
     *                     Once it is set to a value other than NONE it cannot
     * be changed again. It must be
     *                     set at the same time as AppConversionType.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppPlatform".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201806.cm.AppConversionAppPlatform appPlatform;

    /* The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned for conversion trackers
     * using snippets.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String snippet;

    /* The type of AppConversion, which identifies a conversion as
     * being either download or
     *                     in-app purchase. This field can only be set once
     * and future reads will populate the type
     *                     appropriately. It is an error to change the value
     * once it is set. This field must be set
     *                     at the same time as AppPlatform. */
    private com.google.api.ads.adwords.axis.v201806.cm.AppConversionAppConversionType appConversionType;

    /* The postback URL. When the conversion type specifies a postback
     * url,
     *                     Google will send information about each conversion
     * event to that url as they happen.
     *                     Details, including formatting requirements for
     * this field:
     *                     https://developers.google.com/app-conversion-tracking/docs/app-install-feedback
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppPostbackUrl".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.String appPostbackUrl;

    public AppConversion() {
    }

    public AppConversion(
           java.lang.Long id,
           java.lang.Long originalConversionTypeId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201806.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201806.cm.ConversionTrackerCategory category,
           java.lang.String googleEventSnippet,
           java.lang.String googleGlobalSiteTag,
           com.google.api.ads.adwords.axis.v201806.cm.DataDrivenModelStatus dataDrivenModelStatus,
           java.lang.Long conversionTypeOwnerCustomerId,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Integer ctcLookbackWindow,
           com.google.api.ads.adwords.axis.v201806.cm.ConversionDeduplicationMode countingType,
           java.lang.Double defaultRevenueValue,
           java.lang.String defaultRevenueCurrencyCode,
           java.lang.Boolean alwaysUseDefaultRevenueValue,
           java.lang.Boolean excludeFromBidding,
           com.google.api.ads.adwords.axis.v201806.cm.AttributionModelType attributionModelType,
           java.lang.String mostRecentConversionDate,
           java.lang.String lastReceivedRequestTime,
           java.lang.String conversionTrackerType,
           java.lang.String appId,
           com.google.api.ads.adwords.axis.v201806.cm.AppConversionAppPlatform appPlatform,
           java.lang.String snippet,
           com.google.api.ads.adwords.axis.v201806.cm.AppConversionAppConversionType appConversionType,
           java.lang.String appPostbackUrl) {
        super(
            id,
            originalConversionTypeId,
            name,
            status,
            category,
            googleEventSnippet,
            googleGlobalSiteTag,
            dataDrivenModelStatus,
            conversionTypeOwnerCustomerId,
            viewthroughLookbackWindow,
            ctcLookbackWindow,
            countingType,
            defaultRevenueValue,
            defaultRevenueCurrencyCode,
            alwaysUseDefaultRevenueValue,
            excludeFromBidding,
            attributionModelType,
            mostRecentConversionDate,
            lastReceivedRequestTime,
            conversionTrackerType);
        this.appId = appId;
        this.appPlatform = appPlatform;
        this.snippet = snippet;
        this.appConversionType = appConversionType;
        this.appPostbackUrl = appPostbackUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("alwaysUseDefaultRevenueValue", getAlwaysUseDefaultRevenueValue())
            .add("appConversionType", getAppConversionType())
            .add("appId", getAppId())
            .add("appPlatform", getAppPlatform())
            .add("appPostbackUrl", getAppPostbackUrl())
            .add("attributionModelType", getAttributionModelType())
            .add("category", getCategory())
            .add("conversionTrackerType", getConversionTrackerType())
            .add("conversionTypeOwnerCustomerId", getConversionTypeOwnerCustomerId())
            .add("countingType", getCountingType())
            .add("ctcLookbackWindow", getCtcLookbackWindow())
            .add("dataDrivenModelStatus", getDataDrivenModelStatus())
            .add("defaultRevenueCurrencyCode", getDefaultRevenueCurrencyCode())
            .add("defaultRevenueValue", getDefaultRevenueValue())
            .add("excludeFromBidding", getExcludeFromBidding())
            .add("googleEventSnippet", getGoogleEventSnippet())
            .add("googleGlobalSiteTag", getGoogleGlobalSiteTag())
            .add("id", getId())
            .add("lastReceivedRequestTime", getLastReceivedRequestTime())
            .add("mostRecentConversionDate", getMostRecentConversionDate())
            .add("name", getName())
            .add("originalConversionTypeId", getOriginalConversionTypeId())
            .add("snippet", getSnippet())
            .add("status", getStatus())
            .add("viewthroughLookbackWindow", getViewthroughLookbackWindow())
            .toString();
    }

    /**
     * Gets the appId value for this AppConversion.
     * 
     * @return appId   * App ID of the app conversion tracker. This field is required
     * for certain
     *                     conversion types, in particular, Android app install
     * (first open) and
     *                     Android app install (from Google Play).
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this AppConversion.
     * 
     * @param appId   * App ID of the app conversion tracker. This field is required
     * for certain
     *                     conversion types, in particular, Android app install
     * (first open) and
     *                     Android app install (from Google Play).
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }


    /**
     * Gets the appPlatform value for this AppConversion.
     * 
     * @return appPlatform   * App platform of the app conversion tracker. This field defaults
     * to NONE.
     *                     Once it is set to a value other than NONE it cannot
     * be changed again. It must be
     *                     set at the same time as AppConversionType.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppPlatform".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201806.cm.AppConversionAppPlatform getAppPlatform() {
        return appPlatform;
    }


    /**
     * Sets the appPlatform value for this AppConversion.
     * 
     * @param appPlatform   * App platform of the app conversion tracker. This field defaults
     * to NONE.
     *                     Once it is set to a value other than NONE it cannot
     * be changed again. It must be
     *                     set at the same time as AppConversionType.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppPlatform".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAppPlatform(com.google.api.ads.adwords.axis.v201806.cm.AppConversionAppPlatform appPlatform) {
        this.appPlatform = appPlatform;
    }


    /**
     * Gets the snippet value for this AppConversion.
     * 
     * @return snippet   * The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned for conversion trackers
     * using snippets.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this AppConversion.
     * 
     * @param snippet   * The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned for conversion trackers
     * using snippets.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the appConversionType value for this AppConversion.
     * 
     * @return appConversionType   * The type of AppConversion, which identifies a conversion as
     * being either download or
     *                     in-app purchase. This field can only be set once
     * and future reads will populate the type
     *                     appropriately. It is an error to change the value
     * once it is set. This field must be set
     *                     at the same time as AppPlatform.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.AppConversionAppConversionType getAppConversionType() {
        return appConversionType;
    }


    /**
     * Sets the appConversionType value for this AppConversion.
     * 
     * @param appConversionType   * The type of AppConversion, which identifies a conversion as
     * being either download or
     *                     in-app purchase. This field can only be set once
     * and future reads will populate the type
     *                     appropriately. It is an error to change the value
     * once it is set. This field must be set
     *                     at the same time as AppPlatform.
     */
    public void setAppConversionType(com.google.api.ads.adwords.axis.v201806.cm.AppConversionAppConversionType appConversionType) {
        this.appConversionType = appConversionType;
    }


    /**
     * Gets the appPostbackUrl value for this AppConversion.
     * 
     * @return appPostbackUrl   * The postback URL. When the conversion type specifies a postback
     * url,
     *                     Google will send information about each conversion
     * event to that url as they happen.
     *                     Details, including formatting requirements for
     * this field:
     *                     https://developers.google.com/app-conversion-tracking/docs/app-install-feedback
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppPostbackUrl".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.String getAppPostbackUrl() {
        return appPostbackUrl;
    }


    /**
     * Sets the appPostbackUrl value for this AppConversion.
     * 
     * @param appPostbackUrl   * The postback URL. When the conversion type specifies a postback
     * url,
     *                     Google will send information about each conversion
     * event to that url as they happen.
     *                     Details, including formatting requirements for
     * this field:
     *                     https://developers.google.com/app-conversion-tracking/docs/app-install-feedback
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppPostbackUrl".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setAppPostbackUrl(java.lang.String appPostbackUrl) {
        this.appPostbackUrl = appPostbackUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppConversion)) return false;
        AppConversion other = (AppConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId()))) &&
            ((this.appPlatform==null && other.getAppPlatform()==null) || 
             (this.appPlatform!=null &&
              this.appPlatform.equals(other.getAppPlatform()))) &&
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.appConversionType==null && other.getAppConversionType()==null) || 
             (this.appConversionType!=null &&
              this.appConversionType.equals(other.getAppConversionType()))) &&
            ((this.appPostbackUrl==null && other.getAppPostbackUrl()==null) || 
             (this.appPostbackUrl!=null &&
              this.appPostbackUrl.equals(other.getAppPostbackUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        if (getAppPlatform() != null) {
            _hashCode += getAppPlatform().hashCode();
        }
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getAppConversionType() != null) {
            _hashCode += getAppConversionType().hashCode();
        }
        if (getAppPostbackUrl() != null) {
            _hashCode += getAppPostbackUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AppConversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "appId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appPlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "appPlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AppConversion.AppPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appConversionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "appConversionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AppConversion.AppConversionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appPostbackUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "appPostbackUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
