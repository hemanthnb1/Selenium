package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://web-playground.ultralesson.com");
        WebElement searchButton= driver.findElement(By.cssSelector("#shopify-section-header > sticky-header > header > div > details-modal > details > summary"));
        WebElement searchbar=driver.findElement(By.cssSelector("#Search-In-Modal"));
        searchButton.click();
        searchbar.click();
        searchbar.sendKeys("Jeans");
        Thread.sleep(1000);
        WebElement Product=driver.findElement(By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[2]/div/ul/li[1]/a/div"));
        Product.click();


    }
}
