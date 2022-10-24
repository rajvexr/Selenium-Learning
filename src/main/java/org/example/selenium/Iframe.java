package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr"); //switching driver to iframe so can interact with text
        driver.findElement(By.tagName("p")).clear();
        driver.findElement(By.tagName("p")).sendKeys("hey hey hey hey hey");
        driver.switchTo().defaultContent(); //switching from iframe back to driver


    }
}
