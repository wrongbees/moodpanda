package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class WelcomePage {
    private static  WelcomePage instance;

    private static final String endpoint = "/Register/";

    private static final By update_mood_btn = By.id("//div[@id='UpdateMoodWelcome']//button");

    public static WelcomePage getInstance() {
        if (instance == null) {
            instance = new WelcomePage();
        }
        return instance;
    }

    private SelenideElement getUpdateMood(){
        return $(update_mood_btn);
    }

    public void updateMoodClick(){
        getUpdateMood()
                .shouldBe(Condition.visible)
                .click();
    }
}
