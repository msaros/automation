package com.endava.Gmail;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by msaros on 8/3/2015.
 */
public class GmailTest {

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass()
    {
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void after()
    {
        driver.close();
    }


    @Before
    public void goToPage()
    {
    driver.get("http://mail.google.com");
    }
    @Test
    public void testGmail()
    {
        WebElement userNameField = driver.findElement(By.id("Email"));
        userNameField.sendKeys("automationgraduates@gmail.com");
        WebElement nextButton = driver.findElement(By.id("next"));
        nextButton.click();
        WebElement passwordField = driver.findElement(By.id("Passwd"));
        passwordField.sendKeys("lunaalbastra");
        WebElement signIn = driver.findElement(By.id("signIn"));
        signIn.click();
        WebElement compose = driver.findElement(By.xpath("//div[contains(@class,'T-I J-J5-Ji T-I-KE L3')]"));
        compose.click();
        WebElement to = driver.findElement(By.className("vO"));
        to.sendKeys("mihaela.saros-rogobete@endava.com");
        WebElement subject = driver.findElement(By.className("aoT"));
        subject.sendKeys("Test");
        WebElement body = driver.findElement(By.xpath("//div[contains(@class, 'LW-avf')]"));
        body.sendKeys("Tests");
        WebElement send = driver.findElement(By.xpath("//div[text()='Send']"));
        send.click();







    }






}
