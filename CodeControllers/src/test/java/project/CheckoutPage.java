package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;

    // Locators
    By shippingDetailsButton = By.xpath("//span[normalize-space()='I have an account']");
    By nameField = By.xpath("(//input[@class='chakra-input css-ox0j2p'])[1]");
    By lastNameField = By.xpath("(//input[@class='chakra-input css-ox0j2p'])[2]");
    By phoneField = By.xpath("//input[@type='number']");
    By messageField = By.xpath("//div[@class='checkout-info']//div[5]//input[1]");
    By addressField = By.xpath("(//input[@class='chakra-input css-ox0j2p'])[1]");
    By districtField = By.xpath("(//input)[5]");
    By stateField = By.xpath("(//input)[6]");
    By pincodeField = By.xpath("(//input)[7]");
    By submitButton = By.cssSelector("button[type='submit']");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to complete the checkout process
    public void enterShippingDetails(String name, String lastName, String phone, String address, String district, String state, String pincode) {
        driver.findElement(shippingDetailsButton).click();
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(messageField).sendKeys("Be quick with the process");
        driver.findElement(submitButton).click();

        driver.findElement(addressField).sendKeys(address);
        driver.findElement(districtField).sendKeys(district);
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(pincodeField).sendKeys(pincode);
        driver.findElement(submitButton).click();
    }
}

