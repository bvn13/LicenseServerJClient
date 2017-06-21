
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

    private final static QName _CheckLicense_QNAME = new QName("http://checkLicenseJ.bvn13.ru", "checkLicense");
    private final static QName _CheckLicenseResponse_QNAME = new QName("http://checkLicenseJ.bvn13.ru", "checkLicenseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bvn13.licenseserverjclient.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckLicenseResponse }
     * 
     */
    public CheckLicenseResponse createCheckLicenseResponse() {
        return new CheckLicenseResponse();
    }

    /**
     * Create an instance of {@link CheckLicense }
     * 
     */
    public CheckLicense createCheckLicense() {
        return new CheckLicense();
    }

    /**
     * Create an instance of {@link CheckLicenseRequest }
     * 
     */
    public CheckLicenseRequest createCheckLicenseRequest() {
        return new CheckLicenseRequest();
    }

    /**
     * Create an instance of {@link CheckLicenseResponse.Return }
     * 
     */
    public CheckLicenseResponse.Return createCheckLicenseResponseReturn() {
        return new CheckLicenseResponse.Return();
    }

    /**
     * Create an instance of {@link CheckLicense.Arg0 }
     * 
     */
    public CheckLicense.Arg0 createCheckLicenseArg0() {
        return new CheckLicense.Arg0();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://checkLicenseJ.bvn13.ru", name = "checkLicense")
    public JAXBElement<CheckLicense> createCheckLicense(CheckLicense value) {
        return new JAXBElement<CheckLicense>(_CheckLicense_QNAME, CheckLicense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://checkLicenseJ.bvn13.ru", name = "checkLicenseResponse")
    public JAXBElement<Object> createCheckLicenseResponse(Object value) {
        return new JAXBElement<Object>(_CheckLicenseResponse_QNAME, Object.class, null, value);
    }

}
