package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePomClass 
{

	//2:HomePage
	//Product1 click
	//Product2 click
	//Product3 click
	//Product4 click
	//Product5 click
	//Product6 click
	//Add to cart icon
	//Dropdowm
	
	//Menu:
	//All items
	//About
	//Logout
	//Reset app State
	
	  //Steps Process
	//1.WebDriver driver; global
	//2.element find ->>>> @FindBy
	//3.Method --->>> Element action
	//4. Constructor---->>>>This and pageFactory
	
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")              // this web element for For menuButton
	private WebElement menuButton;//Reference variable

	//actions on element method		
	public void clickMenuButton()
	{
		menuButton.click();
	}
	//------------------------------------------------------------------------------------------------------------
	@FindBy(xpath="//a[@id='logout_sidebar_link']")              // this web element for For logout Button
	private WebElement logOutButton;//Reference variable

	//actions on element method		
	public void clicklogOutButton()
	{
		logOutButton.click();
	}
	
	//----------------------------------------------------------------------------------------------------------
	//Constructor
	
	public HomePagePomClass(WebDriver driver)
	{	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		s = new Select(filterButton);  //Declired kelay nanter initialised kel for drop down
	}
	
	
	//SIngle Product Element
	//Add to cart element
	//Method Action
	
	//Single Bag Product Element
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")              
	private WebElement bagButton;//Reference variable

	//actions on element method		
		public void bagButton()
		{
			bagButton.click();
		}
	
	//add to cart button
		@FindBy(xpath="//div[@id='shopping_cart_container']")   //    shopping_cart_container means 1 so xpath this        
		private WebElement addToCartButton;
		
		public String getTestFromCartButton()            //string valun reture karnar so string ghetla int nahi
		{
			String totalProducts = addToCartButton.getText();
			return totalProducts;
		}
		
		//Multiple product selection  6
		@FindBy(xpath="//button[text()='Add to cart']")  //xpath multiple element deto so list madhe add karu        
		private List<WebElement>multipleAddToCart;      //Add to cart means all so xpath this
		
		public void addAllProduct()            //string valun reture karnar so string ghetla int nahi
		{
			//for(int i=0;i<multipleAddToCart.size();i++)
		  	for(int i=0;i<2;i++)   //Logic by umayr
		{
			multipleAddToCart.get(i).click();
		}
			
       }
		//DROP DOWN BUTTON JR ASNAR TR
		
		private Select s;    //declared eth aani initialized constrictor madhe kra vr aahe  
		@FindBy(xpath="//select[@class='product_sort_container']") //Filter Button
		
		private WebElement filterButton;
	
		public void clickOnfilterButton()       
		{
			filterButton.click();	
		    s.selectByVisibleText("Nam(A to Z)");
	    }					
}
