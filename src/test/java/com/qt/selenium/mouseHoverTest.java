package com.qt.selenium;

import org.example.selenium.InteractionAndNavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class mouseHoverTest{

    @Test
    public void test() {

        Setup.driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement avatar = Setup.driver.findElement(By.xpath("//img[@alt='User Avatar'][1]"));
        InteractionAndNavigation.wait(2000);
        new Actions(Setup.driver).moveToElement(avatar).perform();
        InteractionAndNavigation.wait(2000);
        Setup.driver.findElement(By.xpath("//a[@href='/users/1']")).click();
    }


}
