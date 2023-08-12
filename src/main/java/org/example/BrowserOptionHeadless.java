package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class BrowserOptionHeadless {

    public static void main(String[] args) {
        WebDriverManager.safaridriver().setup();
        WebDriver webderiver1= new SafariDriver();
        webderiver1.get("https://web-playground.ultralesson.com/");

    }
}
