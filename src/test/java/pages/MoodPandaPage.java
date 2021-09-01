package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MoodPandaPage {
    private static MoodPandaPage instance;


    private final static By login_href = By.xpath("//a[@href='/Login/' and text()='Login'] ");

    public static MoodPandaPage getInstance() {

        if (instance == null) {
            instance = new MoodPandaPage();
        }
        return instance;
    }

    public SelenideElement getLoginSelector() {
        return $(login_href);
    }

    public LoginPage clickLogin() {
        getLoginSelector()
                .click();
        return LoginPage.getInstance();
    }

}
