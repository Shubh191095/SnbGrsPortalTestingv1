package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class QuickPay {


	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();       
        driver.manage().window().maximize();
		driver.get("http://10.180.184.30:8080/grs-web/#/login");
		Thread.sleep(2000);
		
		//3.2 Xpath By Contains
		//Syntax-> by text
		//tagname[contains(text().'value')]
		//:Ex. //a[contains(text(),'forgot your password?')]
		
		
		//For forgot Password
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]")).click();
		Thread.sleep(2000);
		
		
		//3-Xpath By Contains
		//Syntax-> by Attribute
		//tagname[contains(@attribute,'attribute_value')]
		//Ex: //input[contains(@class,'button')]
		
		driver.findElement(By.xpath("//input[@id='input_0']")).sendKeys("SHAM");
		Thread.sleep(3000);
	
	   //Click on submit button
	   
	   driver.findElement(By.xpath("//button[@class='btn  btn-success pull-right']")).click();
	   Thread.sleep(2000);
	
		//Click on close button
		
		 //  driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		  // Thread.sleep(5000);
	}
}
		
	
	