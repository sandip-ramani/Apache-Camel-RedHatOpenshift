
package com.redhat.training.carbonfootprintservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarbonFootprintResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarbonFootprintResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarbonFootprint" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarbonFootprintResponse", propOrder = {
    "carbonFootprint"
})
public class CarbonFootprintResponse {

    @XmlElement(name = "CarbonFootprint")
    protected double carbonFootprint;

    /**
     * Gets the value of the carbonFootprint property.
     * 
     */
    public double getCarbonFootprint() {
        return carbonFootprint;
    }

    /**
     * Sets the value of the carbonFootprint property.
     * 
     */
    public void setCarbonFootprint(double value) {
        this.carbonFootprint = value;
    }

}
