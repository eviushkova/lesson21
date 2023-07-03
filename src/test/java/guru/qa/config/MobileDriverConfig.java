package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:mobile.properties",
})
public interface MobileDriverConfig extends Config {
    @Key("osVersion")
    String mobileVersion();

    @Key("deviceName")
    String mobileDevice();

    @Key("appPath")
    String mobileAppPath();

    @Key("platformName")
    String mobilePlatformName();

    @Key("appPackage")
    String mobileAppPackage();

    @Key("appActivity")
    String mobileAppActivity();

    @Key("url")
    String mobileUrl();
}