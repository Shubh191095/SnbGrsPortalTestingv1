package com.SauceDemo.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClasses
{
	//1:Login page
	//Username
	//Password
	//LoginButton
	
	
	//Steps
	//Seprate seprate page wise class
	//Elements la private kra method la public kra
	//Folling incapsulation concept
	
	//Adv of POM class
	//Readable format madhe script write karu shkto
	//Easy to maintain
	//Reusable Script
	
	
	//IMP>>>>aapn incapsulation use krt aaho web element private kela asel tr tayla eka method madhe gheu teva aapn aapn tayla dusray class amshe exis kru shkto mhanun ya method la public karu tay method ch nav je action perform krt aaho tech nav day ex click
	
	//POM test class design pattern
	//POM used for code store maintain the code
	//WebElement find
	//Actions on webElement

	//1.WebDrive Declared
	//We will not use this
	 private WebDriver driver;
	
	//private Actions act;//Only eth declired kra nahi For mouse action       >>>>>>>>>>>>>>>>>>>>>>>>>>>>1
	//Normal click chay jahi mouse action use krachi asnar tr
	
	
	//driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click(); 
	//username.sendKeys("standard_user");
	//we are not using find element method we are using annotations in pom
	//annotations>>>>@-->>method only -Functionality
	//Selenium import

	//2.find the element by @FIndBy(Annotation like a method starts from @)
	//POM Strictly follows Encapsulation and Abstraction concept
	//Encapsulation madhe variable always private beacouse dusray class madhe use nahi kraych aahe pn indirectly use krach aahe 
	//so method la public banu 
	//-----------------------------------------------------------------------------------------------------------------		     
	//@FindBy annotation like a method only 
	//Find by import form selenium F and B always capital
	//-----------------------------------------------------------------------------------------------------------------

	@FindBy(xpath="//input[@id='user-name']")              // this web element for For username
	private WebElement username;//Reference variable

	//actions on element method		
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	//------------------------------------------------------------------------------------------------------------------			
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;//Reference variable

	//actions on element method		
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	//-------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;//Reference variable

	//actions on element method		
	public void clickLoginButton()
	{
		  loginButton.click();
		
		//act.click(loginButton).perform(); //2>> loginButton.click(); vapra nahitr act.click(loginButton).perform(); 
	}
	//-------------------------------------------------------------------------------------------------------------------	

	//Constructor declare with argument //class name = Constructor name

	public LoginPagePOMClasses(WebDriver driver)
	{
		//local driver chi value golbal driver la assign keli
		//global = local mapping
		this.driver=driver;
		//selenium class PageFactory.         method=initElements   
		PageFactory.initElements(driver, this);//This means this method argument also driver is argument
		
		    // act =new Actions(driver); //Initialised kra constructor madhe four mouse action
		    ////Normal click chay jahi mouse action use krachi asnar tr
		
		
	}

    //Steps Process
	//1.WebDriver driver; global
	//2.element find ->>>> @FindBy
	//3.Method --->>> Element action
	//4. Constructor---->>>>This and pageFactory
	//	}
	
	
	////Normal click chay jahi mouse action use krachi asnar tr
	//1 private Actions act;
	//2 act.click(loginButton).perform();
	//3 act =new Actions(driver); 




}