package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsProgram1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
        Thread.sleep(2000);
        
        //Id
        
    	driver.findElement(By.id ("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		//Pass
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//Click
		
		driver.findElement(By.id("login-button")).click();
		
		
  //Title compare test case 1
        
      //  String expectedTitle = "Swag Labs";
        		

	      //String actualTitle=	driver.getTitle();
        

	      //  if(expectedTitle.equals(actualTitle	))

	      // {

	      //	System.out.println("User is successfully login test case is passed");

	      //  }
        

	      //   else

	      // {

	      //System.out.println("Test case is fail");

            // }
        

            //  driver.close();
		

            //System.out.println("End Of Program");
        

	      //driver.close();

       // Test case 2 one time one run honar 1 or 2
        
        String expectedURL ="https://www.saucedemo.com/v1/inventory.htm";
        String actualURL=driver.getCurrentUrl();
        
       if(expectedURL.equals(actualURL))
       {
    	   System.out.println("Test case is passedd");
    	   
       }
       else
       { 
    	   System.out.println("Test case is failed");
    	 
    	   driver.close();
   		 
   		   System.out.println("End Of Program");
           
           driver.close();
       }
	}
	

}
