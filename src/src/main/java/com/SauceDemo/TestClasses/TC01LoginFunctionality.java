package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePomClass;
import com.SauceDemo.POMClasses.LoginPagePOMClasses;
import com.SauceDemo.utilityClasses.ScreenshotClass;

public class TC01LoginFunctionality extends TestBaseClass
{

	
//2::	@Test
//       public void LoginFunctionalityTest() throws InterruptedException, IOException
//     {
	
					
      //1::	public static void main(String[] args) throws InterruptedException, IOException
	//{
	
//=================================================================================================================
	//3:: Test NG this method used always
//	WebDriver driver;//Globally declared
//	@BeforeMethod
//	public void setUoMethod() throws InterruptedException//We are used SetUpMethod With @BeforeMethod annotations
//	{
//		
//		//WebDriver driver=new ChromeDriver(); aadhi global declared hot pn 3 method use kele so driver klai red line yet hoti so aapn tayla locali kru 3 method sathi
//		driver=new ChromeDriver();  //Initialized
//		System.out.println("browser open");
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL open");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        Thread.sleep(2000);      
//    
//        //Login 
//        //Login Sathi Object create for calling
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
//	
//=================================================================================================================       
        @Test
        public void loginFunctionalityTest() throws IOException
        {
        
        String expectedTitle="http://10.180.184.30:8080/grs-web/#/login";  
        String actualTitle=driver.getTitle();
        
        System.out.println("Verify the test case");
        
 //===============================================================================================================
        //Test ng chy jagevr aapn assertion use kru
        //Hard Assertions                               Assert.assertEquals=method aahe
        Assert.assertEquals (actualTitle, expectedTitle);
        
//================================================================================================================        
        
        //TestNG madhe if else concept work hot nahi so assertions laun aapn condition verify karu shkto 
        
//        if(expectedTitle.equals(actualTitle))
//        {
//        	 System.out.println("Test case 1st passed");
//        }
//        else
//        {
//        	System.out.println("Test case 1st failed");
//        }
//================================================================================================================       
        //Logout and Take Screenshot
        ScreenshotClass.takeScreenshot(driver);
        
        HomePagePomClass hp=new HomePagePomClass(driver);
        hp.clickMenuButton();
        System.out.println("Clicked on menu button");
        
        hp.clicklogOutButton();
        System.out.println("Clicked on logout button");
        }
}
//=================================================================================================================
//      @AfterMethod
//      public void tesrDown() throws IOException        //Always tearDown method will used with @AfterMethod annotations
//      {
//             
//        //logout 
//        driver.close();//quit hot aadhi pn socket exception yet hot so close kel
//        System.out.println("End of program");
//        
//        //Use if required-only in test class
//        //driver.switchTo().alert()
//        //driver.switchTo().window(actualTitle);
//	}


