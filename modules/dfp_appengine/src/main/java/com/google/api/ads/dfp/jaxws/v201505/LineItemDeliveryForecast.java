
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The forecasted delivery of a {@link ProspectiveLineItem}.
 *           
 * 
 * <p>Java class for LineItemDeliveryForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemDeliveryForecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitType" type="{https://www.google.com/apis/ads/publisher/v201505}UnitType" minOccurs="0"/>
 *         &lt;element name="predictedDeliveryUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveredUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemDeliveryForecast", propOrder = {
    "lineItemId",
    "orderId",
    "unitType",
    "predictedDeliveryUnits",
    "deliveredUnits",
    "matchedUnits"
})
public class LineItemDeliveryForecast {

    protected Long lineItemId;
    protected Long orderId;
    @XmlSchemaType(name = "string")
    protected UnitType unitType;
    protected Long predictedDeliveryUnits;
    protected Long deliveredUnits;
    protected Long matchedUnits;

    /**
     * Gets the value of the lineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemId(Long value) {
        this.lineItemId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderId(Long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setUnitType(UnitType value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the predictedDeliveryUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPredictedDeliveryUnits() {
        return predictedDeliveryUnits;
    }

    /**
     * Sets the value of the predictedDeliveryUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPredictedDeliveryUnits(Long value) {
        this.predictedDeliveryUnits = value;
    }

    /**
     * Gets the value of the deliveredUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliveredUnits() {
        return deliveredUnits;
    }

    /**
     * Sets the value of the deliveredUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliveredUnits(Long value) {
        this.deliveredUnits = value;
    }

    /**
     * Gets the value of the matchedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchedUnits() {
        return matchedUnits;
    }

    /**
     * Sets the value of the matchedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchedUnits(Long value) {
        this.matchedUnits = value;
    }

}