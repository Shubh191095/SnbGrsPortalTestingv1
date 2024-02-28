package com.SnbGrs.utilityClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.SauceDemo.Practice.SampleClass;

    public class Listeners implements ITestListener
    {
    WebDriver driver;  //Fail scenarios sathi driver aahet so tayla globally declared kru
    //We are used iTestListeners and result variable
	public void onStart(ITestResult result)
	//onStart =methods of ITest listeners
	//ITestResult result = interface
	{
	System.out.println("test case execution is start");
	}
	
	public void onFinish(ITestResult result)//onFinish=methods of ITest listeners
	{
	System.out.println("test case execution is finished");
	}
	
	public void onTestSuccess(ITestResult result)
	{
	System.out.println("test case is successfully passed");
	}			
	
	public void onTestFailure(ITestResult result)
	{
	System.out.println("test case is failed and hence taking the screenshot");
	
	this.driver=((SampleClass)result.getInstance()).driver;//Syntax
		
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./screenshot/SauceDemoLogin101.jpg");
	
	try 
	{
	FileHandler.copy(sourceFile, destFile);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	
    public void onTestStart(ITestResult result)
    {
    System.out.println("Sanity test is started");	
    }
    }
