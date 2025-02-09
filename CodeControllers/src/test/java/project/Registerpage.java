package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registerpage{
    WebDriver driver;

    By loginIcon = By.cssSelector(".svg-inline--fa.fa-user.landing_page_header_icons_children");
    By signUpButton = By.xpath("//p[normalize-space()='Sign Up']");
    By usernameField = By.name("name");
    By emailField = By.name("email");
    By passwordField = By.name("password");
    By roleDropdown = By.name("role");
    By registerButton = By.xpath("//button[normalize-space()='Register']");
    By successMessage = By.xpath("//p[contains(text(),'successfully account created')]");

    public Registerpage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginIcon() {
        driver.findElement(loginIcon).click();
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void selectRole(String role) {
        WebElement dropdown = driver.findElement(roleDropdown);
        Select select = new Select(dropdown);
        select.selectByVisibleText(role);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public boolean isRegistrationSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}
