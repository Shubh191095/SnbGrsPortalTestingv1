package com.SngGrs.TestClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SnbGrs.POMClasses.HomePagePomClass;
import com.SnbGrs.utilityClasses.ScreenshotClass;
import com.google.common.io.Files;

public class TC01LoginFunctionality extends TestBaseClass
{

//=================================================================================================================       
        @Test
        public void loginFunctionalityTest() throws IOException
        {
        
        String expectedTitle="Saudi National Bank";
        String actualTitle=driver.getTitle();
        
        //System.out.println("Verify the test case");
        log.info ("Verify the test case");
        
        
 //===============================================================================================================
        //Test ng chy jagevr aapn assertion use kru
        //Hard Assertions                               Assert.assertEquals=method aahe
        Assert.assertEquals (actualTitle, expectedTitle);
        
//================================================================================================================       
        //Logout and Take Screenshot
        ScreenshotClass.takeScreenshot(driver);
        
        HomePagePomClass hp=new HomePagePomClass(driver);
        hp.clickMenuButton();
        System.out.println("Clicked on menu button");
        //  log.info ("Clicked on menu button");
        
        
        hp.clicklogOutButton();
       System.out.println("Clicked on logout button");
       // log.info ("Clicked on logout button");
        }
}

