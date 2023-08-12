package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class isDislplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        WebDriverWait waitForElementToBeChecked = new WebDriverWait(driver, 12);
        WebElement checkboxButton = driver.findElement(By.cssSelector("#checkbox"));
        checkboxButton.click();
        waitForElementToBeChecked.until(ExpectedConditions.elementSelectionStateToBe(By.cssSelector("#ch"),true));
        System.out.println("It's Displayed "+ checkboxButton.isDisplayed());
        System.out.println("It is Enabled"+ checkboxButton.isEnabled());
        Thread.sleep(2000);
        System.out.println("Is it checked "+ checkboxButton.isSelected());// h


//        driver.get("https://www.google.com/");
//        WebElement search= driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc"));
////        search.click();
//        search.sendKeys("youtube");

    }
}

