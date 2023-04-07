package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FaceBook {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize(); //for window to maximize
    }
    @Test
    public void googleTest() throws InterruptedException {

        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("hello@gmail.com");//user-name
        Thread.sleep(1000);
// driver.findElement(By.name("password")).sendKeys("secret_sauce");//user-name
// Thread.sleep(1000);
// driver.findElement(By.name("login-button")).click();
// Thread.sleep(1000);
// Assert.assertEquals(driver.getTitle(), "Swag Labs");

    }
    @AfterClass
    void close(){
        driver.close();
    }

}
