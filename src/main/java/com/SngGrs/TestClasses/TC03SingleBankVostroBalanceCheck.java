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
import com.SnbGrs.utilityClasses.ScreenshotClass;

public class TC03SingleBankVostroBalanceCheck extends TestBaseClass
{

//===================================================================================================================        
        @Test
        public void SingleProductAddToCartFunctionality() throws IOException 
        {
        
        //Home Page Object Creation
        HomePagePomClass hp = new HomePagePomClass(driver);
        
        //Single product
        
        hp.bagButton();
        System.out.println("One Bank Vostro Blance Is Compare");
        
        String actualResult=hp.getTestFromCartButton();
        
        String expectedResult="1";

//================================================================================================================
        
        //Test ng chy jagevr aapn assertion use kru
        //Hard Assertions                               Assert.assertEquals=method aahe
        Assert.assertEquals (actualResult, expectedResult);
        
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
        

  }
