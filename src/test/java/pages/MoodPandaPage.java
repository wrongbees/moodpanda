package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MoodPandaPage {

    private final static By login_href = By.xpath("//a[@href='/Login/' and text()='Login'] ");

    private SelenideElement getLoginSelector() {
        return $(login_href);
    }

}
