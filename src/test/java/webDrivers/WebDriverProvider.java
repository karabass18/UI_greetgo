package webDrivers;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configuration() {
        String remoteUrl = config.getRemoteURL();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }
    }
}