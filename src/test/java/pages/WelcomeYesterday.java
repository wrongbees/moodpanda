package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WelcomeYesterday {
    private static WelcomeYesterday instance;

    private static final String endpoint = "/Welcome/Yesterday/";

    private static final By update_mood_btn = By.xpath("//div[@id='UpdateMoodWelcome']//button");

    public static WelcomeYesterday getInstance() {
        if (instance == null) {
            instance = new WelcomeYesterday();
        }
        return instance;
    }

    private SelenideElement getUpdateMood() {
        return $(update_mood_btn);
    }

    public WelcomeNowPage updateMoodClick() {
        getUpdateMood()
                .shouldBe(Condition.enabled)
                .click();

        return WelcomeNowPage.getInstance();
    }
}
