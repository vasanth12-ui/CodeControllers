package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import project.Registerpage;

import static org.junit.Assert.assertTrue;

public class RegisterSteps {
    WebDriver driver;
    Registerpage registerPage;

    @Given("User navigates to the register page")
    public void userNavigatesToTheRegisterPage() {
        driver = new ChromeDriver();
        driver.get("https://pay-pal-pioneers-068.vercel.app/");
        driver.manage().window().maximize();
        registerPage = new Registerpage(driver);
        registerPage.clickLoginIcon();
        registerPage.clickSignUpButton();
    }

    @When("User enters username {string}, email {string}, password {string} and selects role {string}")
    public void userEntersDetailsAndRole(String username, String email, String password, String role) {
        registerPage.enterUsername(username);
        registerPage.enterEmail(email);
        registerPage.enterPassword(password);
        registerPage.selectRole(role);
    }

    @When("User clicks the Register button")
    public void userClicksTheRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Then("User should see the account creation success message")
    public void userShouldSeeTheAccountCreationSuccessMessage() {
        assertTrue("Registration not successful", registerPage.isRegistrationSuccessful());
        driver.quit();
    }
}
