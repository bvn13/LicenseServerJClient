
package ru.bvn13.licenseserverjclient.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bvn13.licenseserverjclient.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckClientLicense_QNAME = new QName("http://checkLicenseJ.bvn13.ru", "checkClientLicense");
    private final static QName _CheckClientLicenseResponse_QNAME = new QName("http://checkLicenseJ.bvn13.ru", "checkClientLicenseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bvn13.licenseserverjclient.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckClientLicenseResponse }
     * 
     */
    public CheckClientLicenseResponse createCheckClientLicenseResponse() {
        return new CheckClientLicenseResponse();
    }

    /**
     * Create an instance of {@link CheckClientLicense }
     * 
     */
    public CheckClientLicense createCheckClientLicense() {
        return new CheckClientLicense();
    }

    /**
     * Create an instance of {@link CheckLicenseRequest }
     * 
     */
    public CheckLicenseRequest createCheckLicenseRequest() {
        return new CheckLicenseRequest();
    }

    /**
     * Create an instance of {@link CheckLicenseResponse }
     * 
     */
    public CheckLicenseResponse createCheckLicenseResponse() {
        return new CheckLicenseResponse();
    }

    /**
     * Create an instance of {@link CheckClientLicenseResponse.Response }
     * 
     */
    public CheckClientLicenseResponse.Response createCheckClientLicenseResponseResponse() {
        return new CheckClientLicenseResponse.Response();
    }

    /**
     * Create an instance of {@link CheckClientLicense.Request }
     * 
     */
    public CheckClientLicense.Request createCheckClientLicenseRequest() {
        return new CheckClientLicense.Request();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckClientLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://checkLicenseJ.bvn13.ru", name = "checkClientLicense")
    public JAXBElement<CheckClientLicense> createCheckClientLicense(CheckClientLicense value) {
        return new JAXBElement<CheckClientLicense>(_CheckClientLicense_QNAME, CheckClientLicense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckClientLicenseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://checkLicenseJ.bvn13.ru", name = "checkClientLicenseResponse")
    public JAXBElement<CheckClientLicenseResponse> createCheckClientLicenseResponse(CheckClientLicenseResponse value) {
        return new JAXBElement<CheckClientLicenseResponse>(_CheckClientLicenseResponse_QNAME, CheckClientLicenseResponse.class, null, value);
    }

}
