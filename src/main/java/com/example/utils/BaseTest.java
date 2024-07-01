package com.example.utils;

import com.example.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static TestContext testContext = new TestContext();
    protected static PropertiesConfig propertiesConfig;

    public static void setUp() {
        propertiesConfig = new PropertiesConfig();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        testContext.setDriver(driver);
        testContext.setLoginPage(new LoginPage(driver));
    }

    public static void tearDown() {
        if (testContext.getDriver() != null) {
            testContext.getDriver().quit();
        }
    }

    public static TestContext getTestContext() {
        return testContext;
    }

    public static PropertiesConfig getPropertiesConfig() {
        return propertiesConfig;
    }
}
