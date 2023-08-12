package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOptionMaximised {

        public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver webdriver= new FirefoxDriver();
            webdriver.get("https://web-playground.ultralesson.com/");
        }
    }
