package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;

    // Locators
    By shoppingCartIcon = By.cssSelector(".landing_page_header_cart");
    By increaseProductCountButton = By.cssSelector(".fa-solid.hover-effect.fa-plus");
    By checkoutButton = By.xpath("//button[normalize-space()='Checkout']");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to proceed to checkout
    public void proceedToCheckout() {
        driver.findElement(shoppingCartIcon).click();
        driver.findElement(increaseProductCountButton).click();
        driver.findElement(checkoutButton).click();
    }
}

