package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage {
    private static FeedPage instance;

    private static final String endpoint = "/Feed/";

    private static final By account = By.xpath("//*[@class = 'navbar-hidesmall' and contains(text(),'Account')]");
    private static final By account_delete = By.xpath("//*[@id='Settings']//a[@href='/Account/Delete']");


    public static FeedPage getInstance(){

        if (instance == null){
            instance = new FeedPage();
        }
        return instance;
    }

    private SelenideElement getAccount(){ return $(account);}
    private SelenideElement getAccountDelete(){ return $(account_delete);}

    public FeedPage accountClick() {
        getAccount()
                .shouldBe(Condition.visible)
                .click();

        return instance;
    }

    public AccountDeletePage accountDeleteClick() {
        getAccountDelete()
                .shouldBe(Condition.visible)
                .click();

        return AccountDeletePage.getInstance();
    }
}
