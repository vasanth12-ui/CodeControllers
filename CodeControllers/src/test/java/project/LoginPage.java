package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Locators
    By loginButton = By.cssSelector(".svg-inline--fa.fa-user.landing_page_header_icons_children");
    By logInButton = By.xpath("//p[normalize-space()='Log In']");
    By emailField = By.name("email");
    By passwordField = By.name("password");
    By submitButton = By.cssSelector("button[type='submit']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to log in
    public void login(String email, String password) {
        driver.findElement(loginButton).click();
        driver.findElement(logInButton).click();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
}
