package com.SauceDemo.Practice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice10SoftAssertions 
{

	//In soft asserts.the subsequent assertions keep on running even though one assert validation fails,
	//i.e., the test execution does not stop.
	
	
	@Test
	public void loginTest()
	{
		//Aapn eth integer,Boolean,double value pn use karu shkto
		String expectedTitle="Swag Labs";
		String actualTitle="Swag Labs";
	
	 //Soft Assertion Object creation       SoftAssert=class
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle,expectedTitle,"Title not matched");
	
	//Url Check
	
	String expectedUrl="https://www.saucedemo.com/inventory.html";
	String actualUrl="https://www.saucedemo.com/inventory.html";
	
	//Soft Assertions usedAssert class and assertequals method
	soft.assertEquals(actualUrl,expectedUrl,"Url not matched");
	
	//Accurate result apply this method  
	//Compulsory in soft assertion                assertAll=Method
	soft.assertAll();
	
	}
	
//assertTrue navachi method aahe  (true) tr test case pass (false) tr test case failed
//vr 2 assertion aahet pn test case 1 aata 2 test cases aahet @Test pn ek aahe
	
	@Test
	public void logoutTest()
	{
		//Assert.assertTrue(true);
		
	}
}

