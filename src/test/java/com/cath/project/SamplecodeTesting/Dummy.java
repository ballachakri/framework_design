package com.cath.project.SamplecodeTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

    public static void main (String[] args) {
        WebDriverManager.chromedriver ().setup ();
        WebDriver myDriver=new ChromeDriver ();
        myDriver.get ("https://www.cathkidston.com");
        myDriver.manage ().window ().maximize ();


        WebElement pop=myDriver.findElement (By.xpath ("//button[@id='onesignal-popover-allow-button']"));
        if(pop.isDisplayed ())
        {
            pop.click ();
        }
        System.out.println (pop.isDisplayed ());
        System.out.println (pop.getAttribute ("value"));



        //myDriver.quit ();
    }
}
