package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WelcomeNowPage {

    private static WelcomeNowPage instance;

    private static final String endpoint = "/Welcome/Now/";

    private static final By update_mood_btn = By.xpath("//div[@id='UpdateMoodWelcome']//button");

    public static WelcomeNowPage getInstance() {
        if (instance == null) {
            instance = new WelcomeNowPage();
        }
        return instance;
    }

    private SelenideElement getUpdateMood() {
        return $(update_mood_btn);
    }

    public FeedMyPage updateMoodClick() {
        getUpdateMood()
                .shouldBe(Condition.enabled)
                .click();
        return FeedMyPage.getInstance();
    }
}
