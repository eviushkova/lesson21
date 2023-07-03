package guru.qa.helpers;

import guru.qa.config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

import static guru.qa.helpers.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class Browserstack {

    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    public static String videoUrl(String sessionId) {

        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .filter(withCustomTemplates())
                .auth().basic(config.username(), config.password())
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
