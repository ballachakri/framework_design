package com.cath.project;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.io.FileHandler.copy;

public class Utils extends DriverManager{

public void screenShotGenerator(String image) throws IOException {

    TakesScreenshot screenshot=(TakesScreenshot)driver;

    File srcFile=screenshot.getScreenshotAs(OutputType.FILE);

    FileHandler.copy (srcFile, new File ("C:\\Users\\sball\\Desktop\\cathExcerise\\src\\test\\java\\ScreenShots\\"+image+".png"));
    System.out.println ("generated screen shot");
     }
}