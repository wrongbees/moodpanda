package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import models.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountDeletePage {
    private static AccountDeletePage instance;

    private static final String endpoint = "/Account/Delete/";

    private static final By your_password_field = By.id("ContentPlaceHolderContent_TextBoxPassword");
    private static final By delete_account_btn = By.id("ContentPlaceHolderContent_ButtonSave");

    public static AccountDeletePage getInstance(){

        if (instance == null){
            instance = new AccountDeletePage();
        }
        return instance;
    }

    private SelenideElement getYourPasswordField(){
        return $(your_password_field);
    }

    private SelenideElement getDeleteAccountButton(){
        return $(delete_account_btn);
    }

    public AccountDeletePage setYourPasswordField(User user){
        getYourPasswordField()
                .shouldBe(Condition.visible)
                .sendKeys(user.getPassword());

        return instance;
    }

    public void DeleteAccountButton(){
        getDeleteAccountButton()
                .shouldBe(Condition.visible)
                .click();
    }
}
