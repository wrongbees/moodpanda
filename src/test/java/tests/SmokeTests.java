package tests;

import baseEntities.BaseTest;
import models.User;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;
import pages.FeedPage;
import pages.MoodPandaPage;


public class SmokeTests extends BaseTest {

//    @Test
//    public void LoginTest(){
//        User user = User.builder()
//                .
//    }
    @Test
    public void connection() {
        FeedPage feedPage = MoodPandaPage.getInstance()
                .clickLogin()
                .setEmailField()
                .setPasswordField()
                .clickLoginButton();
    }
}
