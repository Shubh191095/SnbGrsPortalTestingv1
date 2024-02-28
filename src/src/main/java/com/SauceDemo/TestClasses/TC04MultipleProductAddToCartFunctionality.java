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

public class TC04MultipleProductAddToCartFunctionality  extends TestBaseClass
{

//===================================================================================================================
//	WebDriver driver;   //Globally declared
//	@BeforeMethod
//	public void setUoMethod() throws InterruptedException 
//	{
//		
//     	WebDriver driver=new ChromeDriver();
//		driver=new ChromeDriver();  //Initialized
//		System.out.println("browser open");
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL open");
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//      Thread.sleep(2000);  
//         
//        LoginPagePOMClasses lp = new LoginPagePOMClasses(driver);
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
//=================================================================================================================      
    @Test
    public void MultipleProductAddToCartFunctionality()  throws IOException 
    {   
	
	//All product Select //Home page cha object create kra
         HomePagePomClass hp = new HomePagePomClass(driver);
        
        hp.addAllProduct(); //All product select nahi hot so test case fail jate so 2 product gheu
        System.out.println("all products are added to cart");
        
        //Validation
        String actualResult=hp.getTestFromCartButton();
        String expctedResult="2";
        
//================================================================================================================
        
        //Test ng chy jagevr aapn assertion use kru
        //Hard Assertions                               Assert.assertEquals=method aahe
        Assert.assertEquals (actualResult, expctedResult);
        
//================================================================================================================                
        //TestNG madhe if else concept work hot nahi so assertions laun aapn condition verify karu shkto         
        
//        if(expctedResult.equals(actualResult))
//    {
//	System.out.println("Test cases 4th passed");
//	}
//        else 
//        {
//        	System.out.println("Test cases 4th failed");
//        }
//        
        
//=================================================================================================================        
        //Logout And Take Screenshot
        ScreenshotClass.takeScreenshot(driver);
        
        HomePagePomClass hp1=new HomePagePomClass(driver);
        
        hp1.clickMenuButton();
        System.out.println("Clicked on menu button");
        
        hp1.clicklogOutButton();
        System.out.println("Clicked on logout button");
        }
        
//===================================================================================================================        
//         @AfterMethod
//        public void tesrDown() throws IOException       
//        {
//          //logout 
//          driver.close();
//          System.out.println("End of program");
//  	}

  }

