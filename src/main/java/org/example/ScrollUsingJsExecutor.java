package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingJsExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://web-playground.ultralesson.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("argument[0].scrollIntoView;",driver.findElement(By.cssSelector("#shopify-section-footer > footer > div.footer__content-top.page-width")));

        Thread.sleep(2000);

//        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

        js.executeScript("window.scrollBy(0,-2000);");
    }
}
