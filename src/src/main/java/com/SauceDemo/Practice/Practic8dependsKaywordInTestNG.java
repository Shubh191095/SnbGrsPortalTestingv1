package com.SauceDemo.Practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practic8dependsKaywordInTestNG 

{
	
	//depends keywords madhe ek method second method vr depend aste j paryant te run hot nahi
	//to paryant atyvr depends asnari method pn run honar nahi
	//Priority la pn over write krto ha keyword

	@Test
	public void loginTest() 
	{
	  System.out.println("login test");
	}
	
	@Test  (dependsOnMethods= {"loginTest"})
	public void singleProductTest()
	{
	  System.out.println("Single product test");
	}																																																																																																	
																																																																																																		
																																																																																																		
}
