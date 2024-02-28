package com.SauceDemo.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 
{
//It is JavaUnit Framework designing the test class. We need to configured TestNg files in the selenium
//It can generate the test execution report.All test cases run at a time with help of TestNGsuite
//Test NG it works annotations and hole program can be run with the helps of annotation only. 
//Test helps for the report generation
//It can run without main method. 
//In test NG if-else concept not working
	
	//annotations in Test NG
	//1:@BeforeSuite      -> Used before suite
	//2:@BeforeTest       -> Used before test
	//3:@BeforeClass      -> Used before 

	//4:@BeforeMethod     -> Used before method
	//5:@Test             -> Used to execute the test method
	//6:@AfterMethod      -> Used after method
	
	//7:@AfterClass       -> Used After the class
	//8:@AfterTest        -> Used after test
	//9:@AfterSuite       -> Used after suite
	//NOTE*****--It is not necessary to use all the annotations in the script.
	//They maintains execution sequence always.
	
	
	//IMP *****
	//Browser,URL,Login               -->>  
	//Validation(If,Else)-Scenarios   -->>
	//LogOut,Browser Close            -->>
	
	
	//@beforeMethod        @Test          @SfterMethod
//
	//Browser,URL,Login  1.Login,Logout   BrowserClose
    //Browser,URL,Login  2.Login,Logout   BrowserClose
	//Browser,URL,Login  3.Login,Logout   BrowserClose
	//Browser,URL,Login  4.Login          BrowserClose
	
	
	
    @Test          //2
    public void loginTestCase()
    {
	System.out.println("login Test Case");
	}
    
  
    @BeforeMethod  //1
    public void beforeMethod()
    {
    	System.out.println("Before method");
    }
    
    
    @AfterMethod   //3
    public void afterMethod()
    {
    	System.out.println("After method");
    }
    //No execution will not happen as sequence
    //It will happen according to annotations    
    }
		