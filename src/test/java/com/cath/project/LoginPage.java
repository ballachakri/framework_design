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
    WebElement radio=driver.findElement (By.xpath ("//*[@id='login_form']/fieldset/div[2]/div[1]/label"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript ("arguments[0].scrollIntoView(true)",radio);
    radio.click ();
    System.out.println ("radio button clicked");
    WebDriverWait wait=new WebDriverWait (driver,3000);
    WebElement pwdTxt=wait.until (ExpectedConditions.visibilityOfElementLocated (By.xpath ("//input[@id='j_password']")));
    pwdTxt.sendKeys (pwd);

    driver.findElement (By.xpath ("//button[@class='submit button btn btn_primary btn_large btn_block']")).click ();


}



}
