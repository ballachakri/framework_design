package com.cath.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends DriverManager{

public void searchItem(String item)
{
    WebElement searchTxt=driver.findElement(By.xpath ("//input[@id='top_search']"));

    searchTxt.sendKeys (item);

    driver.findElement (By.xpath ("//*[@id=\"search\"]/fieldset/div/button")).click ();

}


}
