package com.cath.project;


import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SampleFtpFile {

    static WebDriver fdriver;
    @Before
    public void setUp()
    {
       WebDriverManager.chromedriver ().setup ();
        fdriver=new ChromeDriver ();
        fdriver.get ("http://www.google.com");
        fdriver.manage ().window ().maximize ();
        Dimension d=new Dimension (300,450);

        fdriver.manage ().window ().setSize (d);
    }


    @Test
    public void enterName() throws InterruptedException {

        JavascriptExecutor js=(JavascriptExecutor)fdriver;
        System.out.println (js.executeScript ("return navigator.appCodeName;"));
        Thread.sleep (2500);
        System.out.println (js.executeScript ("return navigator.userAgent;"));




    }

  //  @After
    public void close()
    {
        fdriver.quit ();
    }


}
