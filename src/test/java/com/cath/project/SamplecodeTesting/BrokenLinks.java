package com.cath.project.SamplecodeTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BrokenLinks {

    static WebDriver driver;

    public static void main (String[] args) {
        WebDriverManager.chromedriver ().setup ();

        driver = new ChromeDriver ();

        driver.get ("https://www.cathkidston.com/");
        winHand ();
//        List <WebElement> links=driver.findElements (By.tagName ("a"));
//
//        System.out.println (links.size ());
//
//        for(int i=0;i<links.size ();i++)
//        {
//            WebElement ele=links.get (i);
//
//            String url=ele.getAttribute ("href");
//            verifyLink (url);
//        }


    }

    public static void verifyLink (String urlLiks) {
        try {

            URL url = new URL (urlLiks);
            HttpURLConnection hcon = (HttpURLConnection) url.openConnection ();
            hcon.setConnectTimeout (3000);
            hcon.connect ();

            if (hcon.getResponseCode () == 200) {
                System.out.println (urlLiks + " - " + hcon.getResponseMessage ());
            }
            if (hcon.getResponseCode () == hcon.HTTP_NOT_FOUND) {
                System.out.println (urlLiks + " - " + hcon.getResponseMessage () + " - " + hcon.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
    }

    static String cwin;

    public static void winHand ( ) {
        cwin = driver.getWindowHandle ();

        System.out.println (cwin);

        Set <String> parent = driver.getWindowHandles ();

        Iterator<String> il =parent.iterator ();

        while (il.hasNext ())
        {
          String childwin=il.next ();

          if(!parent.equals (childwin))
            {
                driver.switchTo ().window (childwin);
                System.out.println (driver.switchTo ().window (childwin));
                driver.close ();
            }
        }
driver.switchTo ().window (cwin);
    }

}



