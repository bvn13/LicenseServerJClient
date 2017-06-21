
package ru.bvn13.licenseserverjclient.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for checkLicenseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkLicenseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkLicenseResponse", propOrder = {
    "_return"
})
public class CheckLicenseResponse {

    @XmlElement(name = "return")
    protected CheckLicenseResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link CheckLicenseResponse.Return }
     *     
     */
    public CheckLicenseResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckLicenseResponse.Return }
     *     
     */
    public void setReturn(CheckLicenseResponse.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clientId",
        "date",
        "isValid",
        "properties"
    })
    public static class Return {

        @XmlElement(required = true)
        protected String clientId;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        protected boolean isValid;
        @XmlElement(required = true)
        protected String properties;

        /**
         * Gets the value of the clientId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientId() {
            return clientId;
        }

        /**
         * Sets the value of the clientId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientId(String value) {
            this.clientId = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the isValid property.
         * 
         */
        public boolean isIsValid() {
            return isValid;
        }

        /**
         * Sets the value of the isValid property.
         * 
         */
        public void setIsValid(boolean value) {
            this.isValid = value;
        }

        /**
         * Gets the value of the properties property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperties() {
            return properties;
        }

        /**
         * Sets the value of the properties property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperties(String value) {
            this.properties = value;
        }

    }

}
