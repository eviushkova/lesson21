package guru.qa.tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Tag("mobile")
public class AndroidLocalTests extends TestBase {

    @DisplayName("Getting started - onboarding")
    @Test
    void checkOnboardingScreenTest() {
        step("Check that the text string 'The Free Encyclopedia …in over 300 languages' is visible on the page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Click on the link 'Continue'", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Check that the text string 'New ways to explore' is visible on the page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("New ways to explore"));
        });

        step("Click on the link 'Continue'", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Check that the text string 'Reading lists with sync' is visible on the page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Reading lists with sync"));
        });

        step("Click on the link 'Continue'", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Check that the text string 'Send anonymous data' is visible on the page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Send anonymous data"));
        });
    }
}