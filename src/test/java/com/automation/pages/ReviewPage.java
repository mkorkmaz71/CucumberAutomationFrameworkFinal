package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage {

    @FindBy(id = "finish")
    WebElement finish;

    @FindBy(xpath = "//div[contains(@class, 'summary_total_label')]")
    WebElement total;

    public void printReviewPageDetails() {
        System.out.println(total.getText());
    }

    public void clickOnFinish() {
        finish.click();
    }
}
