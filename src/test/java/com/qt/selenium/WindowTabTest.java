package com.qt.selenium;

import com.qt.pages.WebPages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.selenium.InteractionAndNavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowTabTest extends Setup {

    @Test
    public void test() {

        WebPages webPages = new WebPages();

        driver.get("https://the-internet.herokuapp.com/windows");
        InteractionAndNavigation.wait(2000);
        driver.findElement(webPages.newWindow).click();
        Set<String> windows = driver.getWindowHandles(); //unique information about each window
        Iterator<String> stringIterator = windows.iterator();
        String parentWindow = stringIterator.next(); //main window with the hyperlinks
        String childWindow = stringIterator.next(); //this is tab or windows opening in browser
        driver.switchTo().window(childWindow);
        InteractionAndNavigation.wait(2000);
        driver.close(); //close the current tab or window
        driver.switchTo().window(parentWindow);

        Assert.assertEquals(driver.getTitle(), "The Internet");

    }


}
