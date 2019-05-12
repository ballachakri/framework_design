package com.cath.project.SamplecodeTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess {

    public static void main (String[] args) {
        WebDriverManager.chromedriver ().setup ();

        ChromeOptions opt=new ChromeOptions ();
        opt.setHeadless (true);

        WebDriver myDriver=new ChromeDriver (opt);
        myDriver.get ("https://www.cathkidston.com");

        System.out.println (" tile "+ myDriver.getCurrentUrl ());
    }
}
