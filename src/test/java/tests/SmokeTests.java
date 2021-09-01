package tests;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.FeedMyPage;
import pages.MoodPandaPage;
import pages.RegisterPage;

import static com.codeborne.selenide.Selenide.open;


public class SmokeTests extends BaseTest {


    @Test
    @Description("Позитивный тест на создние пользователя")
    public void loginTest() {
        open("/");
        FeedMyPage feedMyPage = MoodPandaPage.getInstance()
                .clickLogin()
                .clickCreateLoginLink()
                .setFirstName(user)
                .setSurnameInitial(user)
                .setGenderSelector(user)
                .setYearOfBirthSelector(user)
                .setEmailField(user)
                .setPasswordField(user)
                .setConfirmPasswordField(user)
                .loginSuccessfulClick()
                .updateMoodClick()
                .updateMoodClick()
                .updateMoodClick();

        feedMyPage.getFullName()
                .shouldBe(Condition.visible)
                .shouldHave(Condition.exactText(String.format("%s %s", user.getFirstName(), user.getSurName())))
                .getWrappedDriver().close();

    }

    @Test(dependsOnMethods = "loginTest")
    @Description("Негативный тест на возможность повторного создания пользователя")
    public void reСreateАnАccount() {
        open("/");

        RegisterPage registerPage = MoodPandaPage.getInstance()
                .clickLogin()
                .clickCreateLoginLink()
                .setFirstName(user)
                .setSurnameInitial(user)
                .setGenderSelector(user)
                .setYearOfBirthSelector(user)
                .setEmailField(user)
                .setPasswordField(user)
                .setConfirmPasswordField(user)
                .loginUnsuccessfulClick();

        registerPage.
                getErrorTitle()
                .shouldHave(Condition.exactOwnText("This email is already registed with MoodPanda"))
                .getWrappedDriver().close();

    }

    @Test(dependsOnMethods = "reСreateАnАccount")
    @Description("Позитивный тест на удаление пользователя")
    public void deleteAccountTest() {
        open("/");

        MoodPandaPage.getInstance()
                .clickLogin()
                .setEmailField(user)
                .setPasswordField(user)
                .successfulClickLoginButton()
                .accountClick()
                .accountDeleteClick()
                .setYourPasswordField(user)
                .DeleteAccountButton();

        MoodPandaPage.getInstance()
                .clickLogin()
                .setEmailField(user)
                .setPasswordField(user)
                .unsuccessfulClickLoginButton()
                .getErrorTitle()
                .shouldHave(Condition.exactOwnText("Could not find account."))
                .getWrappedDriver().close();
    }
}
