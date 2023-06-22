package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage {

    @FindBy(id = "checkout_complete_container")
    WebElement confirmation;

    public void verifyConfirmationPageDisplayed() {
        System.out.println(confirmation.getText());
    }
}
