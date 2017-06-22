package ru.bvn13.licenseserverjclient;

import lombok.Getter;
import ru.bvn13.licenseserverjclient.soap.*;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceRef;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by bvn13 on 21.06.2017.
 */
public class LicenseChecker {

    @Getter
    private String clientId;

    @WebServiceRef(wsdlLocation = "http://licenseserverj.cf/ws/checkLicense?WSDL")
    private CheckLicenseWSService service;

    public LicenseChecker(String clientId) {
        this.clientId = clientId;
    }

    public CheckClientLicenseResponse.Response checkLicense(String properties) {

        try {
            URL url = new URL("http://licenseserverj.cf/ws/checkLicense?WSDL");

            QName qname = new QName("http://checkLicenseJ.bvn13.ru", "CheckLicenseWSService");

            Service service = Service.create(url, qname);

            CheckLicenseWS checkLicenseWS = service.getPort(CheckLicenseWS.class);

            CheckClientLicense.Request params = new CheckClientLicense.Request();
            params.setClientId(clientId);
            params.setProperties(properties);

            CheckClientLicenseResponse.Response result = checkLicenseWS.checkClientLicense(params);

            return result;
        } catch (MalformedURLException e) {
            CheckClientLicenseResponse.Response result = new CheckClientLicenseResponse.Response();
            result.setClientId(this.clientId);
            result.setProperties("error");
            result.setValid(false);

            e.printStackTrace();
            return result;
        }
    }

}
