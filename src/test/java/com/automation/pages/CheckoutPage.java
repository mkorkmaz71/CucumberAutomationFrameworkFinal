package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement zip;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "cancel")
    WebElement cancelBtn;

    @FindBy(xpath = "//span[@class='title']")
    WebElement title;

    @FindBy(xpath = "//div[@class='checkout_info_wrapper']")
    WebElement checkoutWrapper;

    public void fillShippingDetails() {
        firstName.sendKeys(ConfigReader.getProperty("checkout.firstname"));
        lastName.sendKeys(ConfigReader.getProperty("checkout.lastname"));
        zip.sendKeys(ConfigReader.getProperty("checkout.zipcode"));
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void clickOnCancelBtn() {
        cancelBtn.click();
    }

    public void verifyUserOnCheckoutPage(){
        Assert.assertTrue(title.isDisplayed());
        Assert.assertTrue(checkoutWrapper.isDisplayed());
    }
}
