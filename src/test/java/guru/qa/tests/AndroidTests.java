package guru.qa.tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

    public class AndroidTests extends TestBase {

        @Test
        @DisplayName("Successful search")
        void successfulSearchTest() {
            step("Type search", () -> {
                $(AppiumBy.accessibilityId("Search Wikipedia")).click();
                $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
            });
            step("Verify content found", () ->
                    $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                            .shouldHave(sizeGreaterThan(0)));
        }

        @Test
        @DisplayName("Open article test")
        void openArticleTest() {
            step("Type search", () -> {
                $(AppiumBy.accessibilityId("Search Wikipedia")).click();
                $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Morocco");
            });
            step("Open page", () ->
                    $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                            .click());
            step("Check error", () -> {
                $(AppiumBy.id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldBe(visible);
            });
        }
    }


