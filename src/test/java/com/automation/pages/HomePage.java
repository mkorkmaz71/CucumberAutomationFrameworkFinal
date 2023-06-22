package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    WebElement item1;

    @FindBy(xpath = "//a[@class = 'shopping_cart_link']")
    WebElement cart;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filter;

    @FindBy(xpath = "//select[@class='product_sort_container']/option[@value='hilo']")
    WebElement highToLowLink;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerIcon;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    List<WebElement> priceList;

    public void clickOnAddToCartBtnOfFirstProduct() {
        item1.click();
    }

    public void clickOnCartIcon() {
        cart.click();
    }

    public void verifyHomePage() {
        Assert.assertTrue(cart.isDisplayed());
        Assert.assertTrue(filter.isDisplayed());
    }

    public void sortPriceHighToLow() {
        highToLowLink.click();
    }

    public void clickOnHamburgerIcon() {
        burgerIcon.click();
    }

    public void clickOnFilterIcon() {
        filter.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }

    public void verifyPriceHighToLow() {
        double max = Double.MAX_VALUE;
        for (int i = 0; i < priceList.size(); i++) {
            double big = Double.parseDouble(priceList.get(i).getText().replace("$", ""));
            System.out.println(big);
            if (max >= big) {
                max = big;
            } else {
                Assert.fail();
            }
        }
        Assert.assertTrue(true);
    }
}
