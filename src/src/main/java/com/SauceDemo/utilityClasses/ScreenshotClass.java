package com.SauceDemo.utilityClasses;

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
		File destFile = new File("C:\\Users\\Shubham\\Desktop\\Automation Practice\\Automation Screen Shots\\SauceDemoLogin.jpg");
		FileHandler.copy(sourceFile, destFile);
	 
	}
}
