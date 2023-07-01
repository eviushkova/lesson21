package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${deviceHost}.properties",
})
public interface MobileDriverConfig extends Config {

    @Key("os_version")
    String mobileVersion();

    @Key("device")
    String mobileDevice();

    @Key("appPath")
    String mobileAppPath();

    @Key("platformName")
    String mobilePlatformName();

//    @Key("browsrrstackPlatformName")
//    String browsrrstackPlatformName();

    @Key("appPackage")
    String mobileAppPackage();

    @Key("appActivity")
    String mobileAppActivity();

    @Key("appUrl")
    String mobileUrl();
}