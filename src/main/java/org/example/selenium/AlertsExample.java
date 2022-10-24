package org.example.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AlertsExample{
    public static void main(String[] args) {
        String driverPath = "./src/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverPath);
        FirefoxOptions foxOptions = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(foxOptions);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        InteractionAndNavigation.wait(2000);
        alert.accept();
        InteractionAndNavigation.wait(2000);
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        InteractionAndNavigation.wait(2000);
        alert.accept();
        InteractionAndNavigation.wait(2000);
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        InteractionAndNavigation.wait(2000);
        alert.dismiss();
        InteractionAndNavigation.wait(2000);
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        InteractionAndNavigation.wait(2000);
        alert.sendKeys("Accepting the alert");
        InteractionAndNavigation.wait(2000);
        alert.accept();

    }
}
