package webDrivers;

import org.aeonbits.owner.Config;


public interface WebDriverConfig extends Config {


    @Key("remoteUrl")
    String getRemoteURL();
}