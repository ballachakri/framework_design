package com.cath.project.SamplecodeTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClickAllLinks {

    public static void main (String[] args) {

        WebDriverManager.chromedriver ().setup ();

        WebDriver d=new ChromeDriver ();
        d.get ("https://www.argos.co.uk/");
        d.manage ().window ().maximize ();


        List <WebElement> links=d.findElements (By.tagName ("a"));

        for(int i=0;i<links.size ();i++)
        {

           WebElement ele=links.get (i);

          // String u=ele.getAttribute ("href");

          ele.click ();
          d.navigate ().back ();
          d.manage ().timeouts ().implicitlyWait (3000, TimeUnit.MILLISECONDS);

        }

    }
}
