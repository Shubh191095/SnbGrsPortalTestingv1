package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPagePOMClasses;

public class TestBaseClass
{
	//Multiple browser sathi if eles ladder use krav lagnar
	//Inheritance concept are used
	//assertion sathi if else nahi use hot baki sathi hote so use kel 
	WebDriver driver;//Globally declared
	
	@Parameters("browserName")//TestNg annotations Import from testNg 2nd option aahe
	@BeforeMethod
	public void setUp(String browserName) //throws InterruptedException//We are used SetUpMethod With @BeforeMethod annotations
	    {
		if(browserName.equals("chrome"))
		{
		//WebDriver driver=new ChromeDriver(); aadhi global declared hot pn 3 method use kele so driver khali red line yet hoti so aapn tayla locali kru 3 method sathi
		driver=new ChromeDriver();  //Initialized
		}
		else
		{
			System.setProperty("webdriver.Mozilla Firefox.driver",
					"C:\\Program Files\\Mozilla Firefox");
			driver=new FirefoxDriver();
		}

		
		System.out.println("browser open");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Thread.sleep(2000);      
    
        //Login 
        //Login Sathi Object create for calling
        LoginPagePOMClasses lp = new LoginPagePOMClasses(driver);
        
        lp.sendUsername();        //user-name
       // Thread.sleep(2000);  
        System.out.println("Enter the username");
        
        lp.sendpassword();        //password
       // Thread.sleep(2000);  
        System.out.println("Enter the password");
        
        lp.clickLoginButton();    //login click
      //  Thread.sleep(2000);  
        System.out.println("Enter the login button");
	    }
	 
	    @AfterMethod
        public void tesrDown() throws IOException        //Always tearDown method will used with @AfterMethod annotations
        {   
        //logout 
        driver.close();//quit hot aadhi pn socket exception yet hot so close kel
        System.out.println("End of program");
        
        //Use if required-only in test class
        //driver.switchTo().alert()
        //driver.switchTo().window(actualTitle);
	    }

}


