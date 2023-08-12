package org.example;
 import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import java.util.List;

public class DynamicDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://web-playground.ultralesson.com");

        // Find the search bar and search icon using their locators
        WebElement searchIcon = driver.findElement(By.cssSelector("#shopify-section-header > sticky-header > header > div > details-modal > details > summary"));
        WebElement searchBar = driver.findElement(By.cssSelector("#Search-In-Modal"));

        // Perform the search
        searchIcon.click();
        searchBar.sendKeys("Jeans");

        // Create a WebDriverWait object
//        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wait for the dynamic dropdown options to be loaded
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("predictive-search__list-item")));

        Thread.sleep(1000);
        // Get the dynamic dropdown options
        List<WebElement> dynamicDropDownOptions = driver.findElements(By.cssSelector("h3.predictive-search__item-heading.h5"));
        Thread.sleep(1000);
        for (WebElement dynamicOption : dynamicDropDownOptions) {
            if (dynamicOption.getText().contains("Levi's Commuter Skinny Jeans")) {
                dynamicOption.click();
                break;
            }
        }
        Thread.sleep(3000);
            driver.quit();
    }
}
