
package ru.bvn13.licenseserverjclient.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for checkClientLicenseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkClientLicenseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" form="qualified"/>
 *                   &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *                   &lt;element name="properties" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "checkClientLicenseResponse", propOrder = {
    "response"
})
public class CheckClientLicenseResponse {

    @XmlElement(namespace = "")
    protected CheckClientLicenseResponse.Response response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link CheckClientLicenseResponse.Response }
     *     
     */
    public CheckClientLicenseResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckClientLicenseResponse.Response }
     *     
     */
    public void setResponse(CheckClientLicenseResponse.Response value) {
        this.response = value;
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
     *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" form="qualified"/>
     *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
     *         &lt;element name="properties" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
        "valid",
        "properties"
    })
    public static class Response {

        @XmlElement(required = true)
        protected String clientId;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        protected boolean valid;
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
         * Gets the value of the valid property.
         * 
         */
        public boolean isValid() {
            return valid;
        }

        /**
         * Sets the value of the valid property.
         * 
         */
        public void setValid(boolean value) {
            this.valid = value;
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
