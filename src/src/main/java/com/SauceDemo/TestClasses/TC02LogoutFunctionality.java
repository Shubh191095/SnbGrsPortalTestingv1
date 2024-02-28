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

public class TC02LogoutFunctionality extends TestBaseClass
{


//	@Test
//     public void LoginFunctionalityTest() throws InterruptedException
//     {
	
    //public static void main(String[] args) throws InterruptedException 
    //{
	
//	WebDriver driver;   //Globally declared
//	@BeforeMethod
//	public void setUoMethod() throws InterruptedException 
//	{
//		//WebDriver driver=new ChromeDriver();
//		driver=new ChromeDriver();  //Initialized
//		System.out.println("browser open");
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL open");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        Thread.sleep(2000);  
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
//	 }
        
 //============================================================================================================       
        @Test
        public void LogoutFunctionality() throws InterruptedException
        {
     
        System.out.println("Apply Validations");
        
        String expectedUrl="http://10.180.184.30:8080/grs-web/app.html#/Home";//aadhi https://www.saucedemo.com/ hot pn he 1st page vr aahe page open zalay nantar je url aahe te yete
        String actualUrl=driver.getCurrentUrl();  
//================================================================================================================
       
        //Test ng chy jagevr aapn assertion use kru
        //Hard Assertions                               Assert.assertEquals=method aahe
        Assert.assertEquals (actualUrl, expectedUrl);
        
//================================================================================================================        
        //TestNG madhe if else concept work hot nahi so assertions laun aapn condition verify karu shkto 
//        if(expectedUrl.equals(actualUrl))
//        {
//        	 System.out.println("Test case 2nd passed");
//        }
//        else
//        {
//        	System.out.println("Test case 2nd failed");
//        }
//===============================================================================================================        
      //Home Page Object Creation Logout
      //Logout and Take Screenshot
        
        HomePagePomClass hp = new HomePagePomClass(driver);
        
        hp.clickMenuButton();
        Thread.sleep(2000);  
        System.out.println("Clicked on menu button");
        
        hp.clicklogOutButton();
        Thread.sleep(2000);  
        System.out.println("Clicked on logout button");
        }
//===================================================================================================================        
//        @AfterMethod
//        public void tesrDown() 
//        {
//        //logout
//        driver.close();
//        System.out.println("End of program");
//      	}
}
