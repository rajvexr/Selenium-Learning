package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("screenshot.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       WebElement specific = driver.findElement(By.tagName("h3"));
        file = specific.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("heading.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
