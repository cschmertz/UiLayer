package com.example.utils;

import org.openqa.selenium.WebDriver;
import com.example.pages.LoginPage;

public class TestContext {

    private WebDriver driver;
    private LoginPage loginPage;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(LoginPage loginPage) {
        this.loginPage = loginPage;
    }
}
