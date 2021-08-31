package tests;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.FeedMyPage;
import pages.FeedPage;
import pages.MoodPandaPage;
import pages.WelcomePage;


public class SmokeTests extends BaseTest {


    @Test
    public void LoginTest() throws InterruptedException {
        FeedMyPage  feedMyPage = MoodPandaPage.getInstance()
                .clickLogin()
                .clickCreateLoginLink()
                .setFirstName(user)
                .setSurnameInitial(user)
                .setGenderSelector(user)
                .setYearOfBirthSelector(user)
                .setEmailField(user)
                .setPasswordField(user)
                .setConfirmPasswordField(user)
                .loginClick()
                .updateMoodClick()
                .updateMoodClick()
                .updateMoodClick();

        feedMyPage.getFullName()
                .shouldBe(Condition.visible)
                .shouldHave(Condition.exactText(String.format("%s %s",user.getFirstName(), user.getSurName())));

    }

    @Test
    public void deleteAccountTest(){

        MoodPandaPage.getInstance()
                .clickLogin()
                .setEmailField(user)
                .setPasswordField(user)
                .clickLoginButton()
                .accountClick()
                .accountDeleteClick()
                .setYourPasswordField(user)
                .DeleteAccountButton();
    }

//    @Test
//    public void connection() {
//        FeedPage feedPage = MoodPandaPage.getInstance()
//                .clickLogin()
//                .setEmailField()
//                .setPasswordField()
//                .clickLoginButton();
//    }
}
