package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
    WebDriver driver;

    // Locators
    By paymentMethodButton = By.xpath("//div[@class='checkout-info']//label[1]//span[1]");
    By reviewOrderButton = By.cssSelector("button[type='submit']");
    By confirmationMessage = By.cssSelector(".thankyou-details");

    // Constructor
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to complete the order
    public void completeOrder() {
        driver.findElement(paymentMethodButton).click();
        driver.findElement(reviewOrderButton).click();
        WebElement confirmation = driver.findElement(confirmationMessage);
        if (confirmation.isDisplayed()) {
            System.out.println("Thank you for your purchase!");
        } else {
            System.out.println("Order placement failed.");
        }
    }
}
