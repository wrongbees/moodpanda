package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class WelcomePage {
    private static WelcomePage instance;

    private static final String endpoint = "/Welcome/";

    private static final By update_mood_btn = By.xpath("//div[@id='UpdateMoodWelcome']//button");

    public static WelcomePage getInstance() {
        if (instance == null) {
            instance = new WelcomePage();
        }
        return instance;
    }

    private SelenideElement getUpdateMood() {
        return $(update_mood_btn);
    }

    public WelcomeYesterday updateMoodClick() {
        getUpdateMood()
                .shouldBe(Condition.enabled)
                .click();
        return WelcomeYesterday.getInstance();
    }
}
