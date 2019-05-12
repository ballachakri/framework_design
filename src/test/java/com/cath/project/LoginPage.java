package com.cath.project;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.gl.E;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends DriverManager{

public void goToLoginPage()
{

    driver.get ("https://www.cathkidston.com/pws/secure/ManageAccount.ice");
    }

public void enterEmailId(String uid,String pwd)
{

    driver.findElement (By.xpath ("//input[@id='j_username']")).sendKeys (uid);

    System.out.println ("entered email");


    WebElement radio=driver.findElement (By.cssSelector ("input[id='i_have_a_password_login_form']"));

    JavascriptExecutor js=(JavascriptExecutor)driver;

    //js.executeScript ("scroll(0,350");
    js.executeScript ("arguments[0].scrollIntoView(true)",radio);

    System.out.println (radio.isDisplayed ());
    System.out.println (radio.isSelected ());
    System.out.println (radio.isEnabled ());
    System.out.println (radio.getText ());
//    radio.click ();



    System.out.println ("clicked have pwd");
            driver.findElement (By.xpath ("//input[@id='j_password']")).sendKeys (pwd);
    System.out.println ("entered password");

    WebElement sub= driver.findElement (By.xpath ("/*[@id='login_form_fields']/div[3]/button"));


}



}
