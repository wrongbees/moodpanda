package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WelcomeNowPage {

    private static WelcomeNowPage instance;

    private static final String endpoint = "/Welcome/Now/";

    private static final By update_mood_btn = By.xpath("//div[@id='UpdateMoodWelcome']//button");
    private static final By title = By.xpath("//*[contains(text(), '3 of 3: How are you feeling right now?')]");

    

    public static WelcomeNowPage getInstance() {
        if (instance == null) {
            $(title).shouldBe(Condition.visible);
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
                .shouldBe(Condition.visible)
                .click();
        return FeedMyPage.getInstance();
    }
}
