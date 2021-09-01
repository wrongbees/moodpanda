package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FeedMyPage {
    private static FeedMyPage instance;

    private static final String endpoint = "/Feed/?Me=1";

    private static final By full_name = By.xpath("//*[@id = 'ContentPlaceHolderContent_MyMoodPandaNav1_ImageProfile']/following::span[1]");

    public static FeedMyPage getInstance() {
        if (instance == null) {
            instance = new FeedMyPage();
        }
        return instance;
    }

    public SelenideElement getFullName() {
        return $(full_name);
    }
}
