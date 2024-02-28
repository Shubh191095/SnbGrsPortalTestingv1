package com.SauceDemo.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2TestNGAnnotaions
{
	
	@BeforeMethod
	public void setUpMethod()  //Pre-Conditions
	{
	  System.out.println("Browser,URL,Login");
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
	  System.out.println("loginFunctinality is verified");
	}
	
	@Test
	public void singleProductaddToCart()
	{
	  System.out.println("singleProductaddToCart is verified");
	}
	
	@AfterMethod
	public void tearDown()     //Post Condition
	{
	  System.out.println("browser close");
	}
	
}