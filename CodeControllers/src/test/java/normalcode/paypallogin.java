package normalcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paypallogin {
    public static void main(String[] args) throws InterruptedException {
       ;

        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the PayPal login page
            driver.get("https://pay-pal-pioneers-068.vercel.app/");
            driver.manage().window().maximize();

            // Wait for the page to load
            Thread.sleep(3000);

            // Click on the login button
            WebElement login = driver.findElement(By.cssSelector(".svg-inline--fa.fa-user.landing_page_header_icons_children"));
            login.click();

            // Wait for the login modal to appear
            Thread.sleep(2000);

            // Click on the "Log In" button
            WebElement log = driver.findElement(By.xpath("//p[normalize-space()='Log In']"));
            log.click();

            // Wait for the login form to load
            Thread.sleep(2000);

            // Enter email and password
            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("vasanthakumarg1212@gmail.com");

            WebElement pass = driver.findElement(By.name("password"));
            pass.sendKeys("vasa1212");

            // Click on the submit button
            WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
            submit.click();

            // Wait for the login to complete
            Thread.sleep(5000);
            System.out.println("You can see successfully printed my name VasanthakumarG");

            // Navigate to the wine page
            WebElement red = driver.findElement(By.className("what_would_you_like_cards_img"));
            red.click();
            System.out.println("Wine page");

            // Wait for the wine page to load
            Thread.sleep(5000);

            // Select a recommended wine
            WebElement recommended = driver.findElement(By.xpath("//button[normalize-space()='Riesling Trocken']"));
            recommended.click();

            // Wait for the wine selection to load
            Thread.sleep(3000);

            // Select a specific wine
            WebElement wine = driver.findElement(By.xpath("(//div[@class='product-card-container'])[6]"));
            wine.click();

            // Wait for the product page to load
            Thread.sleep(3000);

            // Verify the product page
            WebElement verify = driver.findElement(By.cssSelector(".product-page-head"));
            System.out.println("Product page loaded successfully");

            // Add to cart
            WebElement add = driver.findElement(By.xpath("//p[normalize-space()='Add to cart']"));
            if (add.isDisplayed()) {
                System.out.println("Product added to cart");
            } else {
                System.out.println("Product NOT added to cart");
            }
            add.click();

            // Wait for a few seconds to observe the result
            Thread.sleep(5000);

            // Navigate back to the home page
            driver.navigate().to("https://pay-pal-pioneers-068.vercel.app/");

            // Click on the shopping cart
            WebElement shoppingCart = driver.findElement(By.cssSelector(".landing_page_header_cart"));
            shoppingCart.click();

            // Wait for the cart page to load
            Thread.sleep(3000);

            // Increase product count
            WebElement increaseProduct = driver.findElement(By.cssSelector(".fa-solid.hover-effect.fa-plus"));
            increaseProduct.click();
            System.out.println("Increased product count you can see number will be add 2");

            // Proceed to checkout
            WebElement checkoutButton = driver.findElement(By.xpath("//button[normalize-space()='Checkout']"));
            checkoutButton.click();
            System.out.println("Proceeding to checkout");

            // Wait for the checkout page to load
            Thread.sleep(3000);

            // Enter shipping details
            driver.findElement(By.xpath("//span[normalize-space()='I have an account']")).click();
            System.out.println("Entered checkout details");

            WebElement nameField = driver.findElement(By.xpath("(//input[@class='chakra-input css-ox0j2p'])[1]"));
            nameField.sendKeys("Vasanthakumar");

            WebElement lastname = driver.findElement(By.xpath("(//input[@class='chakra-input css-ox0j2p'])[2]"));
            lastname.sendKeys("G");

            WebElement phoneField = driver.findElement(By.xpath("//input[@type='number']"));
            phoneField.sendKeys("6369558784");

            WebElement email1 = driver.findElement(By.xpath("//input[@type='email']"));
            email1.sendKeys("");

            WebElement message = driver.findElement(By.xpath("//div[@class='checkout-info']//div[5]//input[1]"));
            message.sendKeys("Be quick with the process");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
             System.out.println("information process completed");
             
            WebElement addressField = driver.findElement(By.xpath("(//input[@class='chakra-input css-ox0j2p'])[1]"));
            addressField.sendKeys("Perambalur,Tamilnadu");
            WebElement district = driver.findElement(By.xpath("(//input)[5]"));
            district.sendKeys("perambalur");
            WebElement Stade = driver.findElement(By.xpath("(//input)[6]"));
            Stade.sendKeys("Tamilnadu");
            WebElement pincode= driver.findElement(By.xpath("(//input)[7]"));
            pincode.sendKeys("621704"); 
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            System.out.println("Delivery information completed");
            // Click on the "Continue to Payment" button
          

            // Wait for the payment page to load
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@class='checkout-info']//label[1]//span[1]")).click();
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            System.out.println(" payment method Sucess full");
            //order review page
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            System.out.println(" order review page ");
            // Wait for the order confirmation page to load
            Thread.sleep(5000);

            // Verify order confirmation
            WebElement confirmationMessage = driver.findElement(By.cssSelector(".thankyou-details"));
            if (confirmationMessage.isDisplayed()) {
                System.out.println("Thank you for your purchase!");
            } else {
                System.out.println("Order placement failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}