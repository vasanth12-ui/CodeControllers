package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Locators
    private By loginButton = By.cssSelector(".svg-inline--fa.fa-user.landing_page_header_icons_children");
    private By logInText = By.xpath("//p[normalize-space()='Log In']");
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By submitButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public void login(String email, String password) {
        clickLoginButton();
        driver.findElement(logInText).click();
        enterEmail(email);
        enterPassword(password);
        clickSubmitButton();
    }
}
