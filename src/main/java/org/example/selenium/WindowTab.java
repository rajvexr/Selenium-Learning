package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowTab {  //new tab or window
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        InteractionAndNavigation.wait(2000);
        driver.findElement(By.xpath("//*[@href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles(); //unique information about each window
        Iterator<String> stringIterator = windows.iterator();
        String parentWindow = stringIterator.next(); //main window with the hyperlinks
        String childWindow = stringIterator.next(); //this is tab or windows opening in browser
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.tagName("h3")).getText()); //getting text in terminal
        InteractionAndNavigation.wait(2000);
        driver.close(); //close the current tab or window
        driver.switchTo().window(parentWindow);

    }
}
