package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDownMenu {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu");
        WebElement element= driver.findElement(By.cssSelector("#post-2646 > div.twelve.columns > div > div > div > p > select"));
        Select select = new Select(element);
        select.selectByVisibleText("India");
        WebElement selectedOption = select.getFirstSelectedOption();
        String text=selectedOption.getText();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement hamBurgerMenu= driver.findElement(By.cssSelector("#mobile_menu_toggler"));
//        hamBurgerMenu.click();
        System.out.println("The text is "+text);
    }
}
