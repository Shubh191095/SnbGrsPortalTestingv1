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

public class TC04MultipleBanksVostroBalanceCheck  extends TestBaseClass
{
//=================================================================================================================      
    @Test
    public void MultipleProductAddToCartFunctionality()  throws IOException 
    {   
	
	//All product Select //Home page cha object create kra
         HomePagePomClass hp = new HomePagePomClass(driver);
        
        hp.addAllProduct(); //All product select nahi hot so test case fail jate so 2 product gheu
        System.out.println("all Banks Vostro Blance Is Compare");
        
        //Validation
        String actualResult=hp.getTestFromCartButton();
        String expctedResult="41";
        
//================================================================================================================
        
        //Test ng chy jagevr aapn assertion use kru
        //Hard Assertions                               Assert.assertEquals=method aahe
        Assert.assertEquals (actualResult, expctedResult);
        
//=================================================================================================================        
        //Logout And Take Screenshot
        ScreenshotClass.takeScreenshot(driver);
        
        HomePagePomClass hp1=new HomePagePomClass(driver);
        
        hp1.clickMenuButton();
        System.out.println("Clicked on menu button");
        
        hp1.clicklogOutButton();
        System.out.println("Clicked on logout button");
        }

  }

