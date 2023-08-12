package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//        driver.get("https://demo.automationtesting.in/Frames.html");
//        WebElement iframe= driver.findElement(By.cssSelector("#google_esf"));
//        driver.switchTo().frame(iframe);
//        WebDriverWait waitForInputElement= new WebDriverWait(driver,3);
//        WebElement TextBox= driver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]"));
//        waitForInputElement.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > section > div > div > div > input[type=text]")));
//        TextBox.click();
//        TextBox.sendKeys("Hello World");
//        driver.switchTo().defaultContent();

        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://demo.automationtesting.in/Frames.html");
        webDriver.switchTo().frame("singleframe");
        WebElement text=webDriver.findElement(By.xpath("/html/body/section/div/div/div/input"));
        text.sendKeys("Hello World");
        Thread.sleep(2000);
        webDriver.switchTo().defaultContent();
        WebElement intParentFrame=webDriver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
        intParentFrame.click();
        webDriver.switchTo().frame(webDriver.findElement(By.cssSelector("body > section > div > div > iframe")));
        webDriver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]")).sendKeys("Helloworld");

    }
}
