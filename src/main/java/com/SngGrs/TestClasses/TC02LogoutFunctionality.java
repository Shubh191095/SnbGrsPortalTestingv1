package com.SngGrs.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SnbGrs.POMClasses.HomePagePomClass;



public class TC02LogoutFunctionality extends TestBaseClass
{ 
 //============================================================================================================       
        @Test
        public void LogoutFunctionality() throws InterruptedException
        {
     
        System.out.println("Apply Validations");
        
        String expectedUrl="https://www.saucedemo.com/inventory.html";//aadhi https://www.saucedemo.com/ hot pn he 1st page vr aahe page open zalay nantar je url aahe te yete
        String actualUrl=driver.getCurrentUrl();
//================================================================================================================
       
        //Test ng chy jagevr aapn assertion use kru
        //Hard Assertions                               Assert.assertEquals=method aahe
        Assert.assertEquals (actualUrl, expectedUrl);
        
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

}
