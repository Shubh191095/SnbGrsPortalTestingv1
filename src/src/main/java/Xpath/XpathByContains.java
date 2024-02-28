package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
	

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
			
		//3-Xpath By Contains
	    //Syntax-> by Attribute
		//tagname[contains(@attribute,'attribute_value')]
		//ex: //input[contains(@class,'button')]
		
		driver.findElement(By.xpath("//input[contains(@id,'inputEmail3')]")).sendKeys("SITCHECKER1");
		Thread.sleep(2000);
		
		//Password by contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Grs@1234");
		Thread.sleep(2000);
		
		//contains by text
		driver.findElement(By.xpath("//button[contains(text(),'sign in')]")).click();
		Thread.sleep(2000);
	
		
		//3.2 Xpath By Contains
		//Syntax-> by text
		//://tagname[contains(text().'value')]
		//:Ex. //a[contains(text(),'forgot your password?')]
	
		    driver.findElement(By.xpath("")).sendKeys("");
			
			driver.findElement(By.xpath("")).sendKeys("");
			
			driver.findElement(By.xpath("")).click();
			
		
		
	}

}
