package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WinePage {
    WebDriver driver;

    // Locators
    private By redWineCard = By.className("what_would_you_like_cards_img");
    private By recommendedWineButton = By.xpath("//button[normalize-space()='Riesling Trocken']");
    private By wineProduct = By.xpath("(//div[@class='product-card-container'])[6]");
    private By addToCartButton = By.xpath("//p[normalize-space()='Add to cart']");
    
    public WinePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRedWine() {
        driver.findElement(redWineCard).click();
    }

    public void selectRecommendedWine() {
        driver.findElement(recommendedWineButton).click();
    }

    public void selectWineProduct() {
        driver.findElement(wineProduct).click();
    }

    public void addToCart() {
        WebElement addButton = driver.findElement(addToCartButton);
        if (addButton.isDisplayed()) {
            System.out.println("Product added to cart");
        } else {
            System.out.println("Product NOT added to cart");
        }
        addButton.click();
    }
}
