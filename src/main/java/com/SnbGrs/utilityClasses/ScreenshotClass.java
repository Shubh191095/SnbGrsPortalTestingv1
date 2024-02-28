package com.SnbGrs.utilityClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class ScreenshotClass 
{
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	//File destFile = new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayHomePage.jpg"));
	//java project sathi aadhi varch hot pn mavan project aahta new ss location add keli
    File destFile = new File("./screenshot/Quickpay.jpg");
	FileHandler.copy(sourceFile, destFile); 
	
	
	}
}
