package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${deviceHost}.properties"
})
public interface MobileConfig extends Config {
    @Key("bs")
    String bs();

    @Key("device")
    String device();

    @Key("osVersion")
    String osVersion();

    @Key("project")
    String projectName();

    @Key("build")
    String buildName();

    @Key("name")
    String testName();
}