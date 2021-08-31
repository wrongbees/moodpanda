package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    private static RegisterPage instance;

    private static final String endpoint = "/Register/";

    private static final By title = By.xpath("//*[contains(text(),'Create MoodPanda Account')]");
    private static final By first_name_field = By.id("ContentPlaceHolderContent_TextBoxFirstName");
    private static final By surname_initial_field = By.id("ContentPlaceHolderContent_TextBoxSurname");
    private static final By gender_selector = By.id("ContentPlaceHolderContent_DropDownListGender");
    private static final By year_of_birth_selector = By.id("ContentPlaceHolderContent_DropDownListYearOfBirth");
    private static final By email_field = By.id("ContentPlaceHolderContent_TextBoxEmail");
    private static final By password_field = By.id("ContentPlaceHolderContent_TextBoxPassword");
    private static final By confirm_password_field = By.id("ContentPlaceHolderContent_TextBoxPasswordConfirm");
    private static final By login_btn = By.id("ContentPlaceHolderContent_ButtonLogin");

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }

        return instance;
    }

    private SelenideElement getLogin() {
        return $(login_btn);
    }

    private SelenideElement getFirstNameField() {
        return $(first_name_field);
    }

    private SelenideElement getSurnameInitialField() {
        return $(surname_initial_field);
    }

    private SelenideElement getPasswordField() {
        return $(password_field);
    }

    private SelenideElement getEmailField() {
        return $(email_field);
    }

    private SelenideElement getConfirmPasswordField() {
        return $(confirm_password_field);
    }

    private WebElement getGenderSelector() {
        return $(gender_selector).getWrappedDriver().findElement(gender_selector);
    }

    private WebElement getYearOfBirthSelector() {
        return $(year_of_birth_selector).getWrappedDriver().findElement(year_of_birth_selector);
    }


    public RegisterPage setFirstName(String name) {
        getFirstNameField()
                .shouldBe(Condition.enabled)
                .sendKeys(name);

        return instance;
    }

    public RegisterPage setFirstName(User user) {
        getFirstNameField()
                .shouldBe(Condition.visible)
                .sendKeys(user.getFirstName());

        return instance;
    }

    public RegisterPage setSurnameInitial(String surnameInitial) {
        getSurnameInitialField()
                .shouldBe(Condition.enabled)
                .sendKeys(surnameInitial);

        return instance;
    }

    public RegisterPage setSurnameInitial(User user) {
        getSurnameInitialField()
                .shouldBe(Condition.enabled)
                .sendKeys(user.getSurName());

        return instance;
    }

    public RegisterPage setPasswordField(String password) {
        getPasswordField()
                .shouldBe(Condition.enabled)
                .sendKeys(password);

        return instance;
    }

    public RegisterPage setPasswordField(User user) {
        getPasswordField()
                .shouldBe(Condition.enabled)
                .sendKeys(user.getPassword());

        return instance;
    }

    public RegisterPage setConfirmPasswordField(String password) {
        getConfirmPasswordField()
                .shouldBe(Condition.enabled)
                .sendKeys(password);

        return instance;
    }

    public RegisterPage setConfirmPasswordField(User user) {
        getConfirmPasswordField()
                .shouldBe(Condition.enabled)
                .sendKeys(user.getPassword());

        return instance;
    }

    public RegisterPage setEmailField(String email) {
        getEmailField()
                .shouldBe(Condition.enabled)
                .sendKeys(email);

        return instance;
    }

    public RegisterPage setEmailField(User user) {
        getEmailField()
                .shouldBe(Condition.enabled)
                .sendKeys(user.getEmail());

        return instance;
    }

    public RegisterPage setGenderSelector(String gender){

        Select select = new Select(getGenderSelector());
        select.selectByVisibleText(gender);

        return instance;
    }

    public RegisterPage setGenderSelector(User user){

        Select select = new Select(getGenderSelector());
        select.selectByVisibleText(user.getGender());

        return instance;
    }

    public RegisterPage setYearOfBirthSelector(String birthday){

        Select select = new Select(getYearOfBirthSelector());
        select.selectByVisibleText(birthday);

        return instance;
    }

    public RegisterPage setYearOfBirthSelector(User user){

        Select select = new Select(getYearOfBirthSelector());
        select.selectByVisibleText(user.getYearOfBirth());

        return instance;
    }


    public WelcomePage loginClick(){
        getLogin()
                .shouldBe(Condition.visible)
                .click();
        return WelcomePage.getInstance();
    }
}
