package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;
import pages.FeedPage;
import pages.MoodPandaPage;

import static com.codeborne.selenide.Selenide.open;

public class SmokeTests extends BaseTest {

    @Test
    public void connection(){
        FeedPage feedPage = MoodPandaPage.getInstance()
                .clickLogin()
                .setEmailField()
                .setPasswordField()
                .clickLoginButton();
    }
}
