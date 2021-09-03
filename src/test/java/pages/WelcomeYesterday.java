package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WelcomeYesterday {
    private static WelcomeYesterday instance;

    private static final String endpoint = "/Welcome/Yesterday/";

    private static final By update_mood_btn = By.xpath("//div[@id='UpdateMoodWelcome']//button");
    private static final By title = By.xpath("//*[contains(text(), '2 of 3: How did you feel yesterday?')]");

    public static WelcomeYesterday getInstance() {
        if (instance == null) {
            $(title).shouldBe(Condition.visible);
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
