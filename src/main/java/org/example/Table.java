package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.findElement(By.id("countries"));
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        //Prints Each Header
//        List<WebElement> headers = rows.get(0).findElements(By.tagName("td"));
//        for (WebElement header : headers) {
//            System.out.println(header.getText());
//        }
        for (WebElement row : rows) {
            List<WebElement> cells=row.findElements(By.tagName("td"));
            System.out.println(cells.get(1).getText());
        }

        for (WebElement row : rows) {
            List<WebElement>cells=row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                if(cell.getText().equals("India"))
                {
                    JavascriptExecutor js= (JavascriptExecutor)driver;
                    js.executeScript("arguments[0].scrollIntoView;",cell);
                    cells.get(0).findElement(By.tagName("input")).click();
                }

            }
            System.out.println();
        }

        driver.quit();

    }
}
