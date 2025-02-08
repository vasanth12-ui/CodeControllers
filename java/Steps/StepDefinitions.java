package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import project.LoginPage;
import project.WinePage;
import project.CartPage;
import project.CheckoutPage;

public class StepDefinitions {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage;
    WinePage winePage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @Given("I open the PayPal login page")
    public void iOpenTheLoginPage() {
        driver.get("https://pay-pal-pioneers-068.vercel.app/");
        loginPage = new LoginPage(driver);
    }

    @When("I login with email {string} and password {string}")
    public void iLoginWithEmailAndPassword(String email, String password) {
        loginPage.login(email, password);
    }

    @When("I select a wine product and add it to the cart")
    public void iAddWineToCart() {
        winePage = new WinePage(driver);
        winePage.navigateToRedWine();
        winePage.selectRecommendedWine();
        winePage.selectWineProduct();
        winePage.addToCart();
    }

    @When("I proceed to checkout")
    public void iProceedToCheckout() {
        cartPage = new CartPage(driver);
        cartPage.openCart();
        cartPage.proceedToCheckout();
    }

    @Then("I should see the checkout page")
    public void iShouldSeeTheCheckoutPage() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterName("Vasanthakumar");
        checkoutPage.enterLastName("G");
        checkoutPage.enterPhone("6369558784");
        checkoutPage.enterAddress("Perambalur, Tamilnadu");
        System.out.println("Information process completed.");
    }
}

