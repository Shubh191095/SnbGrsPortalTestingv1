package com.SauceDemo.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice9HardAssertions {

	//Assertions in testNg are a way btp verify that the expected results and actual results matched or not
			//EX.Checking the tide of the wab-pagess
			
			//:Hard Assertions in TestNG
			//>Hard Assertions are those asserts that stop the test execution when an asserts statement fails and  
			//>the subsequent asserts statement are therefore not validate.
			
		@Test
		public void loginTest()
		{
			String expectedTitle="Swag Labs";
			String actualTitle="Swag Labs";
		
		//Hard Assertions usedAssert class and assertequals method
		Assert.assertEquals(actualTitle,expectedTitle);
		
		
		//Url Check
		
		String expectedUrl="https://www.saucedemo.com/inventory.html";
		String actualUrl="https://www.saucedemo.com/inventory.html";
		
		//Hard Assertions usedAssert class and assertequals method
		Assert.assertEquals(actualUrl,expectedUrl);
			
		}
		
//assertTrue navachi method aahe  (true) tr test case pass (false) tr test case failed
		//vr 2 assertion aahet pn test case 1 aata 2 test cases aahet @Test pn ek aahe
		
		@Test
		public void logoutTest()
		{
			Assert.assertTrue(true);
			//Assert.assertTrue(false, "Forcefully failed");//nots madhe aadi failes then false aahe
		}
	}
