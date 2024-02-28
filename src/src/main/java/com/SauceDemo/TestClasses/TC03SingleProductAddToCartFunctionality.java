package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePomClass;
import com.SauceDemo.POMClasses.LoginPagePOMClasses;
import com.SauceDemo.utilityClasses.ScreenshotClass;

public class TC03SingleProductAddToCartFunctionality extends TestBaseClass
{

//	@Test 
//	public void singleProductAddToCart() throws InterruptedException
//	{
	
	//public static void main(String[] args) throws InterruptedException {
		
	
	
//===================================================================================================================
//	WebDriver driver;   //Globally declared
//	@BeforeMethod
//	public void setUoMethod() throws InterruptedException 
//	{
//	//	WebDriver driver=new ChromeDriver();
//		driver=new ChromeDriver();  //Initialized
//		System.out.println("browser open");
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL open");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        Thread.sleep(2000);  
//         
//LoginPagePOMClasses lp = new LoginPagePOMClasses(driver);
//        
//        lp.sendUsername();        //user-name
//        Thread.sleep(2000);  
//        System.out.println("Enter the username");
//        
//        lp.sendpassword();        //password
//        Thread.sleep(2000);  
//        System.out.println("Enter the password");
//        
//        lp.clickLoginButton();    //login click
//        Thread.sleep(2000);  
//        System.out.println("Enter the login button");
//	}
//===================================================================================================================        
        @Test
        public void SingleProductAddToCartFunctionality() throws IOException 
        {
        
        //Home Page Object Creation
        HomePagePomClass hp = new HomePagePomClass(driver);
        
        //Single product
        
        hp.bagButton();
        System.out.println("Product is selected and added to cart");
        
        String actualResult=hp.getTestFromCartButton();
        
        String expectedResult="1";

//================================================================================================================
        
        //Test ng chy jagevr aapn assertion use kru
        //Hard Assertions                               Assert.assertEquals=method aahe
        Assert.assertEquals (actualResult, expectedResult);
        
//================================================================================================================                
        //TestNG madhe if else concept work hot nahi so assertions laun aapn condition verify karu shkto 
//        if(expectedResult.equals(actualResult))
//        {
//        	 System.out.println("Test case 3rd passed");
//        }
//        else
//        {
//        	System.out.println("Test case 3rd failed");
//        }

      //================================================================================================================                
        
        //Logout
        
        //Take Screenshot
        ScreenshotClass.takeScreenshot(driver);
        
        HomePagePomClass hp1=new HomePagePomClass(driver);
        hp1.clickMenuButton();
        System.out.println("Clicked on menu button");
        
        hp1.clicklogOutButton();
        System.out.println("Clicked on logout button");
        }
        
//===================================================================================================================        
//        @AfterMethod
//        public void tesrDown() throws IOException       
//        {
//          //logout 
//          driver.close();
//          System.out.println("End of program");
//  	}

  }
