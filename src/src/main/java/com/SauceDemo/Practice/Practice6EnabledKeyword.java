package com.SauceDemo.Practice;

import org.testng.annotations.Test;

public class Practice6EnabledKeyword 

{
//Jr ekhaday test case la run nasnar krayvh tr used EnabledKeyword
	
//------------------------------------------------------------------------------------------------------------	
		
		@Test (enabled=false)
		public void testA()
		{
		System.out.println("Test A");
		}
		
//------------------------------------------------------------------------------------------------------------		
		
		@Test 
		public void testB()
		{
		System.out.println("Test B");
		}
		
//------------------------------------------------------------------------------------------------------------

		@Test
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


