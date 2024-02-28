package com.SngGrs.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SnbGrs.POMClasses.LoginPagePOMClasses;

public class TestBaseClass
{
	//Multiple browser sathi if eles ladder use krav lagnar
	//Inheritance concept are used
	//assertion sathi if else nahi use hot baki sathi hote so use kel 
	WebDriver driver;//Globally declared
	
	//getLogger=method
	Logger log = Logger.getLogger("SnbGrsPortalTestingv1");//Logs create karnaysathi use krt aahe he
	
	@Parameters("browserName")//TestNg annotations Import from testNg 2nd option aahe
	@BeforeMethod
	public void setUp(String browserName) //throws InterruptedException//We are used SetUpMethod With @BeforeMethod annotations
	{
		System.setProperty("webdriver.chrome.driver",
				"./drivers/C:\\Users\\Shubham\\Desktop\\Google Chrome.lnk");
    if(browserName.equals("chrome"))
	{
	//WebDriver driver=new ChromeDriver(); aadhi global declared hot pn 3 method use kele so driver khali red line yet hoti so aapn tayla locali kru 3 method sathi
	driver=new ChromeDriver();  //Initialized
	}
	else
	{
	System.setProperty("webdriver.Mozilla Firefox.driver",
					"./drivers/C:\\Program Files\\Mozilla Firefox");//Aadhi eth ./deivers/  he location nvt pn aata 
	//new folder madunch browser la call honar so he location dile 
	driver=new FirefoxDriver();
	}
	//Logs create karnaysathi
	log.info("browser open");
	PropertyConfigurator.configure("log4j.properties");

	System.out.println("browser open");
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL open");//System ln chay jagi logs write kra
	//log.info("URL open");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    //Wait sathi up or down kuthl pn wait use karu shkto
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //Thread.sleep(2000);      
    
    //Login 
    //Login Sathi Object create for calling
    LoginPagePOMClasses lp = new LoginPagePOMClasses(driver);
        
    lp.sendUsername();        //user-name
    //Thread.sleep(2000);  
    //System.out.println("Enter the username");    
    log.info("Enter the username");
        
    lp.sendpassword();        //password
    // Thread.sleep(2000);  
    // System.out.println("Enter the password");
    log.info ("Enter the password");
        
    lp.clickLoginButton();    //login click
    //Thread.sleep(2000);      
    //System.out.println("Enter the login button");
    log.info ("Enter the login button");
	}
	 
	@AfterMethod
    public void tesrDown() throws IOException  //Always tearDown method will used with @AfterMethod annotations
    {   
    //logout 
    driver.close();//quit hot aadhi pn socket exception yet hot so close kel
    System.out.println("End of program");
    //log.info ("End of program");
        
    //Use if required-only in test class
    //driver.switchTo().alert()
    //driver.switchTo().window(actualTitle);
	}
}


