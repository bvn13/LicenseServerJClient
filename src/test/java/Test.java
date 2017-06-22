import ru.bvn13.licenseserverjclient.LicenseChecker;

/**
 * Created by bvn13 on 21.06.2017.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("test");

        LicenseChecker ch = new LicenseChecker("AutoPartsBonifacio");
        System.out.println(ch.checkLicense(""));

    }

}
