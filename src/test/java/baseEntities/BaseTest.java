package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import core.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import models.User;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;


public class BaseTest {
    public ReadProperties properties;
    public User user;

    @BeforeSuite
    public static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );

        // Настройка slf4j
        org.apache.log4j.BasicConfigurator.configure();
    }

    @BeforeSuite
    public void prepareData() {
        properties = ReadProperties.getInstance();

        user = User.builder()
                .firstName(properties.getFirstName())
                .surName(properties.getSurName())
                .email(properties.getEmail())
                .gender(properties.getGender())
                .yearOfBirth(properties.getYearOfBirth())
                .password(properties.getPassword())
                .build();
    }


    @BeforeTest
    public void setUp() {
        // Настройка Selenide
        Configuration.baseUrl = ReadProperties.getInstance().getURL();
        Configuration.browser = ReadProperties.getInstance().getBrowserName();
        Configuration.startMaximized = true;
        //Configuration.headless = true;
        Configuration.fastSetValue = true;

        open("/");
    }
}
