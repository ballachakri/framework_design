package com.cath.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultsPage extends DriverManager{

public String getCurrentURL()
{
    String cURL=driver.getCurrentUrl ();
    return cURL;
}

public String itemsDisplayed()
{
String itemfound=driver.findElement (By.xpath ("//div[@id='search_summary']")).getText ();

  return itemfound;

}
}
