package com.SauceDemo.Practice;

import org.testng.annotations.Test;

public class Practice7TimeoutKeyword 

{
	//Jr ekhadi test case jast time ghet asnar tr tayla fail kru shkto
	
//------------------------------------------------------------------------------------------------------------	
		
		@Test
		public void testA()
		{
		System.out.println("Test A");
		}
		
//------------------------------------------------------------------------------------------------------------		
		
		@Test (timeOut=2000)
		public void testB() throws InterruptedException
		{
			Thread.sleep(10000);
		    System.out.println("Test B");
		}
		
		}

