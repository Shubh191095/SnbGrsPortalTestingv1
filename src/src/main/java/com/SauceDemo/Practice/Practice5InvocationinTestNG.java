package com.SauceDemo.Practice;

import org.testng.annotations.Test;

public class Practice5InvocationinTestNG 
{

	 //IMPORTANT*** LOAD TESTING FOR PERFORMANCE TESTING
	 //We are able to set how many times the test cases should run
	//Invocation count by default 1(Kiti well run honar)
	//Invocation count 0 asla tr te test case skip honar
	
//------------------------------------------------------------------------------------------------------------	
	
		@Test (invocationCount=5)
		public void testA()
		{
		System.out.println("Test A");
		}
		
//------------------------------------------------------------------------------------------------------------		
		
		@Test (priority=-1)
		public void testB()
		{
		System.out.println("Test B");
		}
		
//------------------------------------------------------------------------------------------------------------

		@Test (priority=-2,invocationCount=5)
		public void testC()
		{
		System.out.println("Test C");
		}
		
//------------------------------------------------------------------------------------------------------------
			
		@Test
		public void testD()
		{
		System.out.println("Test D");
		}
		
//------------------------------------------------------------------------------------------------------------

		@Test
		public void testE()
		{
		System.out.println("Test E");
		}
		
//------------------------------------------------------------------------------------------------------------

		}
