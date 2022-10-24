package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionAndNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //LOCATORS
        driver.get("https://yosuva.com/TestLogin.html");
//        driver.navigate().to("https://yosuva.com/TestLogin.html");
//        driver.findElement(By.id("fname"));
//        driver.findElement(By.name("fname"));
//        driver.findElement(By.tagName("h2"));
//        driver.findElement(By.className("city"));
//        driver.findElement(By.linkText("Click Here"));
//        driver.findElement(By.partialLinkText("Click"));
//        driver.findElement(By.cssSelector("input#lname"));
//        driver.findElement(By.cssSelector("h2.city"));
        //driver.findElement(By.cssSelector("p.city.para"));
        //li>ul>a>span
        //body>h2
//        driver.findElement(By.cssSelector("h2.city"));
//        driver.findElement(By.xpath("//*[@href='/downloads']")); // '//*'-> means any element
        // '//h2[@class='city']' ->locates the element
        // '//span[text()='Downloads']' -> can also locate an element through its text if there is no id or class
        // '//*[text()='Downloads']' -> also use the star to locate the text as well
        // '//input[@type='text' and @id='fname']' // can also use 'or'
        // '//h2[contains(text(), 'HTML')]' can use @class, @id
        // '//h2[starts-with(text(), 'HT')]' starting letters can also use for class, @id
//        driver.navigate().refresh();
//        wait(20000);
//        driver.navigate().refresh();
//        wait(20000);
//        driver.navigate().refresh();
//        wait(20000);
//        driver.navigate().refresh();

        //INTERACTING WITH ELEMENTS

        driver.findElement(By.id("fname")).sendKeys("Rajveer");
        wait(2000);
        driver.findElement(By.id("lname")).sendKeys("Singh");
//        driver.findElement(By.id("lname")).submit(); rather than using on click since it's the last input on form
        wait(2000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        wait(2000);
        driver.navigate().back();
        wait(2000);
        driver.navigate().forward();
        wait(2000);
        driver.navigate().back();
        wait(2000);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id='fname' and @id='lname']")).clear();
        wait(2000);
        driver.findElement(By.linkText("Click Here")).click();
        wait(2000);
        driver.navigate().back();
        wait(2000);
        driver.quit();


//        driver.quit();
    }

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds); //this a type of waiting command
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}