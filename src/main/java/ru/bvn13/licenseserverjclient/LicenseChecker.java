package ru.bvn13.licenseserverjclient;

import lombok.Getter;
import ru.bvn13.licenseserverjclient.soap.CheckLicense;
import ru.bvn13.licenseserverjclient.soap.CheckLicenseJ;
import ru.bvn13.licenseserverjclient.soap.CheckLicenseResponse;
import ru.bvn13.licenseserverjclient.soap.CheckLicenseWSService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by bvn13 on 21.06.2017.
 */
public class LicenseChecker {

    @Getter
    private String clientId;

    public LicenseChecker(String clientId) {
        this.clientId = clientId;
    }

    public Boolean checkLicense(String properties) {

        URL url = null;
        try {
            new URL("http://licenseserverj.cf/ws/checkLicense?WSDL");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }

        QName qname = new QName("http://checkLicenseJ.bvn13.ru", "checkLicense");
        CheckLicenseWSService service = (CheckLicenseWSService) CheckLicenseWSService.create(url, qname);

        CheckLicenseJ proxy = service.getSOAPOverHTTP();

        CheckLicense params = new CheckLicense();
        params.getArg0().setClientId(clientId);
        params.getArg0().setProperties(properties);

        CheckLicenseResponse result = (CheckLicenseResponse) proxy.checkLicense(params);

        return result.getReturn().isIsValid();
    }

}
