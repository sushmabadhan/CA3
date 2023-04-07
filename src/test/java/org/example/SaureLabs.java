package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

public class SaureLabs
{
    ChromeDriver driver;
    @BeforeClass
    void setupDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @Test
    void loginToSite() throws InterruptedException
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
    }
    @AfterTest
    void addToCart() throws InterruptedException {
//        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("shopping_cart_container")).click();
////driver.findElement(By.class("shopping_cart_link"))
//        Thread.sleep(1000);
//
//        Thread.sleep(2000);
//        String a = String.valueOf(driver.findElement(By.className("inventory_item_price")).getClass());
//        System.out.println(a);

        Thread.sleep(1000);
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(1000);

    }






    @AfterTest
    void closeDriver()
    {
        driver.close();
    }
}