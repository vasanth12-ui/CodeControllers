package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WinePage {
    WebDriver driver;

    // Locators
    By redWineButton = By.className("what_would_you_like_cards_img");
    By recommendedWineButton = By.xpath("//button[normalize-space()='Riesling Trocken']");
    By wineProduct = By.xpath("(//div[@class='product-card-container'])[6]");
    By addToCartButton = By.xpath("//p[normalize-space()='Add to cart']");

    // Constructor
    public WinePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to navigate to wine and add to cart
    public void selectWine() {
        driver.findElement(redWineButton).click();
        driver.findElement(recommendedWineButton).click();
        driver.findElement(wineProduct).click();
        driver.findElement(addToCartButton).click();
    }
}
