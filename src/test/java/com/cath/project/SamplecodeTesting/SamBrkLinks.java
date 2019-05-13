package com.cath.project.SamplecodeTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class SamBrkLinks {


    public static void main (String[] args) throws IOException {

        WebDriverManager.chromedriver ().setup ();

        WebDriver d=new ChromeDriver ();
        d.get ("https://www.argos.co.uk/");
        d.manage ().window ().maximize ();

        List <WebElement> alllinks=d.findElements (By.tagName ("a"));

        System.out.println (alllinks.size ());

        for(int i=0;i<alllinks.size ();i++)
        {
        WebElement element=alllinks.get (i);

        String url=element.getAttribute ("href");

        verifyLinks (url);

                }
        d.quit ();
    }

    public static void verifyLinks(String url) throws IOException {
        URL link=new URL(url);

        HttpURLConnection hc=(HttpURLConnection)link.openConnection ();

        hc.setConnectTimeout (2000);

        hc.connect ();

        if(hc.getResponseCode ()==200)
        {
            System.out.println (url + " - " + hc.getResponseMessage ());
        }
        if(hc.getResponseCode ()==400)
        {
            System.out.println (url + " - " + hc.getResponseMessage ());
        }
     hc.disconnect ();
    }
}
