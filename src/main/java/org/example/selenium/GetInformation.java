package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInformation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        String hrefValue = driver.findElement(By.linkText("Click Here")).getAttribute("href");
        String colour = driver.findElement(By.linkText("Click Here")).getCssValue("color");
        System.out.println(colour + " " + hrefValue);
        if(driver.findElement(By.linkText("Click Here")).isDisplayed()) {
            System.out.println("Displayed");
        } else{
            System.out.println("does not exist");
        }
    }
}
