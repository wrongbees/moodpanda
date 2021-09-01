package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import models.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static LoginPage instance;


    private static final String endpoint = "/Login/";

    private static final By title = By.xpath("//*[contains(text(),'Login to MoodPanda')]");
    private static final By email_field = By.id("ContentPlaceHolderContent_TextBoxEmail");
    private static final By password_field = By.id("ContentPlaceHolderContent_TextBoxPassword");
    private static final By login_btn = By.id("ContentPlaceHolderContent_ButtonLogin");
    private static final By create_account_link = By.id("ContentPlaceHolderContent_HyperLinkRegister");
    private static final By error_title = By.id("ContentPlaceHolderContent_MessageError");

    public static LoginPage getInstance() {
        if (instance == null) {
            instance = new LoginPage();
        }
        return instance;
    }

    private SelenideElement getTitle() {
        return $(title);
    }

    public SelenideElement getErrorTitle() {
        return $(error_title);
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

    private SelenideElement getCreateAccount() {
        return $(create_account_link);
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

    public LoginPage setEmailField(User user) {
        getEmailField()
                .shouldBe(Condition.visible)
                .sendKeys(user.getEmail());
        return instance;
    }

    public LoginPage setPasswordField(String password) {
        getPasswordField()
                .shouldBe(Condition.visible)
                .sendKeys(password);
        return instance;
    }

    public LoginPage setPasswordField(User user) {
        getPasswordField()
                .shouldBe(Condition.visible)
                .sendKeys(user.getPassword());
        return instance;
    }


    public FeedPage successfulClickLoginButton() {
        getLoginBtn()
                .shouldBe(Condition.enabled)
                .click();
        return FeedPage.getInstance();
    }

    public LoginPage unsuccessfulClickLoginButton() {
        getLoginBtn()
                .shouldBe(Condition.enabled)
                .click();
        return instance;
    }

    public RegisterPage clickCreateLoginLink() {
        getCreateAccount()
                .shouldBe(Condition.enabled)
                .click();

        return RegisterPage.getInstance();
    }


}


