package com.SnbGrs.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClasses
{
	 private WebDriver driver;
	//-----------------------------------------------------------------------------------------------------------------

	@FindBy(xpath="/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/div[1]/div/input")              // this web element for For username
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("PDS");
	}
	//------------------------------------------------------------------------------------------------------------------			
	@FindBy(xpath="/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/div[2]/div/input")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("Grs@123");
	}
	//-------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath="//button[@class='btn btn-success btn-sm']")
	private WebElement loginButton;
	
	public void clickLoginButton()
	{
		  loginButton.click();
	}
	//-------------------------------------------------------------------------------------------------------------------	
	public LoginPagePOMClasses(WebDriver driver)
	{
	
		this.driver=driver;
		  
		PageFactory.initElements(driver, this);
	}
}