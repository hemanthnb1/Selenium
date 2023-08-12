package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://web-playground.ultralesson.com/");

        // Create instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Find the element to scroll to and perform the scroll action using JavascriptExecutor
        WebElement newsletterSection = driver.findElement(By.cssSelector("#shopify-section-footer > footer > div.footer__content-top.page-width"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", newsletterSection);

        WebElement newsletterHeading = driver.findElement(By.cssSelector("#shopify-section-footer > footer > div.footer__content-top.page-width > div.footer__blocks-wrapper.grid.grid--1-col.grid--2-col.grid--4-col-tablet > div:nth-child(2) > h2"));
        String fetchedHeadingText = (String) js.executeScript("return arguments[0].textContent;", newsletterHeading);
        System.out.println("Fetched text: " + fetchedHeadingText);

        WebElement emailInputField = driver.findElement(By.cssSelector("#NewsletterForm--footer"));
        js.executeScript("arguments[0].click();", emailInputField);
        js.executeScript("arguments[0].value='abc@gmail.com';", emailInputField);

        // Fetch the email value from the input field using JavascriptExecutor
        String fetchedEmailValue = js.executeScript("return arguments[0].value;", emailInputField).toString();
        System.out.println("Fetched value: " + fetchedEmailValue);

    }
}
