package com.cath.project;

import cucumber.api.java.gl.E;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import javax.xml.bind.SchemaOutputResolver;

public class DriverManager {

private String browser="rome";

public static WebDriver driver;

    public void setUpTheBrowser()
    {
       switch (browser) {
           case "chrome":
           WebDriverManager.chromedriver ().setup ();
           driver=new ChromeDriver ();
           break;
           case "ie":
               WebDriverManager.iedriver ();
               driver=new InternetExplorerDriver ();
               break;
           case "edge":
               WebDriverManager.edgedriver ().setup ();
               driver=new EdgeDriver ();
               break;
           default:
               WebDriverManager.firefoxdriver ().setup ();
               driver=new FirefoxDriver ();
               break;

       }
    }

    public void navigateTo(String url)
    {
        driver.get (url);
    }

    public void clearCookies()
    {
        driver.manage ().deleteAllCookies ();
    }


    public void killCookies()
    {
        driver.findElement (By.xpath ("//div[@class='cookie_cta']")).click ();

    }

    public void maximizeBrowser()
    {
        driver.manage ().window ().maximize ();
    }


    public void disAbleAlert()
    {

    driver.findElement (By.xpath ("//*[@id='onesignal-popover-cancel-button']")).click ();
//        if (isAlertPresent (driver)) {
//            Alert al=driver.switchTo ().alert ();
//            System.out.println (al.getText ());
//            al.accept ();
//
//        }

    }

//public boolean isAlertPresent(WebDriver driver)
//{
//    try{
//
//        driver.switchTo ().alert ();
//        return true;
//
//    }catch(NoAlertPresentException e)
//    {
//        return false;
//    }
//}


    public void closeBrowser()
    {
        driver.quit ();
    }





    public void applyWaits() throws Exception
    {
        driver.wait (500);
    }
}
