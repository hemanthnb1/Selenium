package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");

        WebDriverWait alertwithok=new WebDriverWait(driver,5);
//        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button")).click();
        alertwithok.until(ExpectedConditions.alertIsPresent());
        Alert alertWithOK = driver.switchTo().alert();
        Thread.sleep(2000);
        alertWithOK.accept();


//          Alert with Ok and Cancel:
        WebDriverWait alertWithokAndCancel= new WebDriverWait(driver,7);
        driver.findElement(By.cssSelector("#main > div.container > div.post_type_exist.clearfix > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-859c260.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-33.elementor-top-column.elementor-element.elementor-element-01aedcf > div > div > div > center > button")).click();
        alertWithokAndCancel.until(ExpectedConditions.alertIsPresent());
        Alert alertWithOkAndcancel= driver.switchTo().alert();
        Thread.sleep(2000);
        alertWithOkAndcancel.accept();

        //LocalHost
//        driver.get("http://127.0.0.1:5500/h.html");
//        driver.findElement(By.cssSelector("#clickme")).click();

        //Not working
//        WebDriverWait waitTillInput=new WebDriverWait(driver,4);
//        driver.findElement(By.cssSelector("#main > div.container > div.post_type_exist.clearfix > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-859c260.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-33.elementor-top-column.elementor-element.elementor-element-d0c9145 > div > div > div > center > button")).click();
//        Alert prompt= driver.switchTo().alert();
//        waitTillInput.until(ExpectedConditions.alertIsPresent());
//        prompt.sendKeys("Automation");
//        prompt.accept();


    }
}
