package com.example.steps;

import com.example.utils.BaseTest;
import com.example.utils.TestContext;
import com.example.utils.TestData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    private TestContext testContext;

    @Before
    public void setUp() {
        BaseTest.setUp();
        testContext = BaseTest.getTestContext();
    }

    @After
    public void tearDown() {
        BaseTest.tearDown();
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        testContext.getDriver().get(TestData.BASE_URL.getValue() + TestData.LOGIN_URL.getValue());
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        testContext.getLoginPage().enterUsername(TestData.VALID_USERNAME.getValue());
        testContext.getLoginPage().enterPassword(TestData.VALID_PASSWORD.getValue());
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        testContext.getLoginPage().clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        assertTrue(testContext.getDriver().findElement(By.cssSelector("div.flash.success")).isDisplayed());
    }
}
