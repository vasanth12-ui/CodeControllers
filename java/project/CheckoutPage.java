package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;

    // Locators
    private By nameField = By.xpath("(//input[@class='chakra-input css-ox0j2p'])[1]");
    private By lastNameField = By.xpath("(//input[@class='chakra-input css-ox0j2p'])[2]");
    private By phoneField = By.xpath("//input[@type='number']");
    private By addressField = By.xpath("(//input[@class='chakra-input css-ox0j2p'])[1]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }
}
