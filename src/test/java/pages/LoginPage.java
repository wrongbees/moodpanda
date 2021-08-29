package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import core.ReadProperties;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static LoginPage instance;


    private static final String endpoint = "/Login/";

    private static final By title = By.xpath("//*[contains(text(),'Login to MoodPanda')]");
    private static final By email_field = By.id("ContentPlaceHolderContent_TextBoxEmail");
    private static final By password_field = By.id("ContentPlaceHolderContent_TextBoxPassword");
    private static final By login_btn = By.id("ContentPlaceHolderContent_ButtonLogin");

    public LoginPage getInstance() {
        if (instance == null) {
            instance = new LoginPage();
        }
        return instance;
    }

    private SelenideElement getTitle() {
        return $(title);
    }

    private SelenideElement getEmailField() {
        return $(email_field);
    }

    private SelenideElement getPasswordField() {
        return $(password_field);
    }

    private SelenideElement getLoginBtn() {
        return $(login_btn);
    }

    public String getTitleText() {
        return getTitle().getText();
    }

    public LoginPage setEmailField(String email) {
        getEmailField()
                .shouldBe(Condition.visible)
                .sendKeys(email);
        return instance;
    }

    public LoginPage setEmailField() {
        getEmailField()
                .shouldBe(Condition.visible)
                .sendKeys(ReadProperties.getInstance().getEmail());
        return instance;
    }

    public LoginPage setPasswordField(String password) {
        getPasswordField()
                .shouldBe(Condition.visible)
                .sendKeys(password);
        return instance;
    }

    public LoginPage setPasswordField() {
        getPasswordField()
                .shouldBe(Condition.visible)
                .sendKeys(ReadProperties.getInstance().getPassword());
        return instance;
    }

    public FeedPage clickLoginButton() {
        getLoginBtn()
                .shouldBe(Condition.enabled)
                .click();
        return FeedPage.getInstance();
    }

}
