
package ru.bvn13.licenseserverjclient.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkClientLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkClientLicense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
@XmlType(name = "checkClientLicense", propOrder = {
    "request"
})
public class CheckClientLicense {

    @XmlElement(namespace = "")
    protected CheckClientLicense.Request request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CheckClientLicense.Request }
     *     
     */
    public CheckClientLicense.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckClientLicense.Request }
     *     
     */
    public void setRequest(CheckClientLicense.Request value) {
        this.request = value;
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
        "properties"
    })
    public static class Request {

        @XmlElement(required = true)
        protected String clientId;
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
