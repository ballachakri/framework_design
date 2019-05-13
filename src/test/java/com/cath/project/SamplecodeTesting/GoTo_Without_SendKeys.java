package com.cath.project.SamplecodeTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class GoTo_Without_SendKeys {


    public static void main (String[] args) {
        WebDriverManager.chromedriver ().setup ();

        WebDriver d=new ChromeDriver ();
        d.get ("https://www.argos.co.uk/");
        d.manage ().window ().maximize ();


        // first find element
        WebElement txt=d.findElement (By.xpath ("//input[@class='form-control']"));

        // to move to particular element
        Actions act=new Actions (d);
        act.moveToElement (txt).build ().perform ();

        // enter text with using sendKeys
        JavascriptExecutor js=(JavascriptExecutor)d;
        js.executeScript("arguments[0].value='hello';",txt);

        // move scroll into view and enter text without sendKeys
        WebElement searchTxt=d.findElement (By.xpath ("//input[@name='searchTerm']"));
        js.executeScript ("arguments[0].scrollIntoView(true);",searchTxt);
        js.executeScript ("arguments[0].value='laptop';",searchTxt);



       // clicking button using JavaScript Executor
        WebElement button=d.findElement (By.xpath ("//button[@class='_2mKaC']"));
        js.executeScript("arguments[0].click();",button);




        // scrolling window down
        js.executeScript ("scroll(0,1500)");
        System.out.println ("scrolled");

    }


}
