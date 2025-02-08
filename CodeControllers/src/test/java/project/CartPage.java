package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;

    // Locators
    private By shoppingCartButton = By.cssSelector(".landing_page_header_cart");
    private By increaseProductButton = By.cssSelector(".fa-solid.hover-effect.fa-plus");
    private By checkoutButton = By.xpath("//button[normalize-space()='Checkout']");
    
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(shoppingCartButton).click();
    }

    public void increaseProductQuantity() {
        driver.findElement(increaseProductButton).click();
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
