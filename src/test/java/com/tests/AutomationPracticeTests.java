package com.tests;

import java.util.concurrent.TimeUnit;

import com.academy.telesens.lesson13.PropertyProvider;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class AutomationPracticeTests {
    private WebDriver driver;
    private String baseUrl = "http://automationpractice.com/index.php";

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", PropertyProvider.get("driver.chrome"));
        System.setProperty("webdriver.gecko.driver", PropertyProvider.get("driver.firefox"));
      //  driver = new ChrоmeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testAuth() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("username");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("pwd");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

        String errMsgExpected = "Invalid email address.1";
        String errMsgActual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(errMsgActual, errMsgExpected);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}