package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


        WebDriverWait waitForTextChange= new WebDriverWait(driver,12);
        WebElement changeText= driver.findElement(By.cssSelector("#populate-text"));
        changeText.click();
        waitForTextChange.until(ExpectedConditions.textToBe(By.cssSelector("#h2"),"Selenium Webdriver"));

        WebDriverWait  waitForDisplay= new WebDriverWait(driver,13);
        WebElement display= driver.findElement(By.cssSelector("#display-other-button"));
        display.click();
        waitForDisplay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/button[4]")));

        WebDriverWait  waitForEnableButton= new WebDriverWait(driver,13);
        WebElement clickableButton = driver.findElement(By.id("enable-button"));
        clickableButton.click();
        waitForEnableButton.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#disable")));


        WebDriverWait waitForElementToBeChecked = new WebDriverWait(driver, 12);
        WebElement checkboxButton = driver.findElement(By.cssSelector("#checkbox"));
        checkboxButton.click();
        waitForElementToBeChecked.until(ExpectedConditions.elementSelectionStateToBe(By.cssSelector("#ch"), true));



    }

}
