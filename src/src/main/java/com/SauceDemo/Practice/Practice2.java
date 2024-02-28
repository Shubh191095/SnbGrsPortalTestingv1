package com.SauceDemo.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice2
{
	//Sequence***
	
	//1:Before Suite
	//2:Before Test
	
	//3:Before Class
	//4:Before Method
	//5:Test Case-1
	//6:After method				
	//7:After Class
	
	//8:After Test
	//9:After Suite
	
	@BeforeSuite   //Annotation use krto teva capital letter used and method write karto teva small letter used
    public void beforeSuite()
    {
     System.out.println("Before Suite");
    }
//================================================================================================================	
	@BeforeTest
    public void beforeTest()
    {
     System.out.println("Before Test");
    }
//================================================================================================================	
	 @BeforeClass
	 public void beforeClass()
	 {
	 System.out.println("Before Class");
	 }
//================================================================================================================	
    @ BeforeMethod
    public void beforeMethod()
    {
     System.out.println("Before Method");
    }
//===============================================================================================================		
	@Test
	public void testCase1()
	{
	System.out.println("Test case-1");
	}
//================================================================================================================		
	@Test
	public void testCase2()
	{
	System.out.println("Test case-2");
	}
//================================================================================================================			
	@AfterMethod    
    public void afterMethod()
    {
	System.out.println("After method");
    }
//================================================================================================================		
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
//================================================================================================================		
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
//================================================================================================================			
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
//=============================================================================================================			

	
//***TEST RESULTS
//SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
//SLF4J: Defaulting to no-operation (NOP) logger implementation
//SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
//Before Suite
//Before Test
//Before Class
//Before Method
//Test case-1
//After method
//Before Method
//Test case-2
//After method
//After class
//After Test
//PASSED: com.SauceDemo.Practice.Practice2.testCase1
//PASSED: com.SauceDemo.Practice.Practice2.testCase2

//Baki annotation sinle single run honar
//Before method
//Test Annotaion
//After Method
//Varche 3 test annotations Jevde test cases asnar tevday well run honar

