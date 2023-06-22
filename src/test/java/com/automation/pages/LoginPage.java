package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMsg;

    public void userOpenWebsite(){
        driver.get(ConfigReader.getProperty("application.url"));
    }

    public void doLogin(String usernameVal, String passwordVal) {
        usernameInput.sendKeys(usernameVal);
        passwordInput.sendKeys(passwordVal);
        loginBtn.click();
    }

    public void verifyLoginPage() {
        Assert.assertTrue(usernameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(loginBtn.isDisplayed());
    }

    public void verifyInvalidLoginErrorIsDisplayed() {
        Assert.assertTrue(errorMsg.isDisplayed());
    }
}
