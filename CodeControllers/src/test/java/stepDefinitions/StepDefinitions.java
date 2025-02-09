package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {

    WebDriver driver;

    @Given("the user is on the PayPal login page")
    public void userIsOnLoginPage() {
        
        // Initialize the Chrome driver
        driver = new ChromeDriver();
        driver.get("https://pay-pal-pioneers-068.vercel.app/");
        driver.manage().window().maximize();
    }

    @When("the user logs in with valid credentials")
    public void userLogsInWithValidCredentials() {
        try {
            WebElement loginButton = driver.findElement(By.cssSelector(".svg-inline--fa.fa-user.landing_page_header_icons_children"));
            loginButton.click();
            Thread.sleep(2000);

            WebElement logInButton = driver.findElement(By.xpath("//p[normalize-space()='Log In']"));
            logInButton.click();
            Thread.sleep(2000);

            WebElement emailField = driver.findElement(By.name("email"));
            emailField.sendKeys("vasanthakumarg1212@gmail.com");

            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("vasa1212");

            WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
            submitButton.click();

            Thread.sleep(5000); // Wait for login to complete
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("the user should be redirected to the home page")
    public void userShouldBeRedirectedToHomePage() {
        WebElement homePageElement = driver.findElement(By.className("landing_page_home")); // Assuming this is a valid home page element
        Assert.assertTrue(homePageElement.isDisplayed(), "Home page was not displayed after login.");
    }

    @Given("the user is logged in")
    public void userIsLoggedIn() {
        // This step assumes that the user is already logged in, you can skip login steps if needed
    }

    @When("the user selects a product and adds it to the cart")
    public void userSelectsProductAndAddsToCart() throws InterruptedException {
        WebElement product = driver.findElement(By.className("what_would_you_like_cards_img"));
        product.click();
        Thread.sleep(5000);

        WebElement recommendedProduct = driver.findElement(By.xpath("//button[normalize-space()='Riesling Trocken']"));
        recommendedProduct.click();
        Thread.sleep(3000);

        WebElement wineProduct = driver.findElement(By.xpath("(//div[@class='product-card-container'])[6]"));
        wineProduct.click();
        Thread.sleep(3000);

        WebElement addToCart = driver.findElement(By.xpath("//p[normalize-space()='Add to cart']"));
        addToCart.click();
        Thread.sleep(5000);
    }

    @Then("the cart page should show the product added")
    public void cartPageShouldShowProductAdded() {
        WebElement cartIcon = driver.findElement(By.cssSelector(".landing_page_header_cart"));
        cartIcon.click();

        WebElement cartProduct = driver.findElement(By.className("cart_product_name"));
        Assert.assertTrue(cartProduct.isDisplayed(), "Product was not added to cart.");
    }

    @When("the user proceeds to checkout")
    public void userProceedsToCheckout() throws InterruptedException {
        WebElement checkoutButton = driver.findElement(By.xpath("//button[normalize-space()='Checkout']"));
        checkoutButton.click();
        Thread.sleep(3000);
    }

    @Then("the user should enter shipping details")
    public void userEntersShippingDetails() throws InterruptedException {
        driver.findElement(By.xpath("//input[@class='chakra-input css-ox0j2p']")).sendKeys("Vasanthakumar");
        driver.findElement(By.xpath("(//input[@class='chakra-input css-ox0j2p'])[2]")).sendKeys("G");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("6369558784");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vasanthakumarg1212@gmail.com");
        driver.findElement(By.xpath("//div[@class='checkout-info']//div[5]//input[1]")).sendKeys("Be quick with the process");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);
    }

    @When("the user selects a payment method and places an order")
    public void userSelectsPaymentMethodAndPlacesOrder() {
        driver.findElement(By.xpath("//div[@class='checkout-info']//label[1]//span[1]")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("Payment method selected");

        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("Order placed successfully");
    }

    @Then("the order should be confirmed")
    public void orderShouldBeConfirmed() {
        WebElement confirmationMessage = driver.findElement(By.cssSelector(".thankyou-details"));
        Assert.assertTrue(confirmationMessage.isDisplayed(), "Order placement failed.");
        driver.quit();
    }
}
