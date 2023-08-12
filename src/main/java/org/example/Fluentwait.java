package org.example;

import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Fluentwait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        // Click on the button to trigger the action
        WebElement triggerButton = driver.findElement(By.cssSelector("#populate-text"));
        triggerButton.click();

        // Define FluentWait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20)) // Maximum timeout duration
                .pollingEvery(Duration.ofSeconds(2)) // Polling interval
                .ignoring(NoSuchElementException.class); // Exception to ignore

//        Function<WebDriver,WebElement> obj= driverNew->driverNew.findElement(By.cssSelector("")) ;
        // Use FluentWait to wait until a condition is met

        WebElement changingText = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("h2"));
            }
        });

        WebElement displayButton = driver.findElement(By.id("display-other-button"));

        Wait<WebDriver> webDriverFluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(2000))
                .ignoring(NoSuchElementException.class);

        displayButton.click();

        


//        changingText.click();

//        WebElement displayButton=wait.until(Function<>)
//        WebElement hiddenElement = wait.until(obj.apply(driver));
//
//        WebDriver driver2=obj.apply(driver);
//        WebElement hidden=wait.until(obj.apply(driver));

        // Print the success message
//        System.out.println("The hidden element is now displayed: " + hiddenElement.isDisplayed());

        // Close the browser
    }
}
