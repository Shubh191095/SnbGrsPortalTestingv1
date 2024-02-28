package Yogesh;

public class G1 {

	public static void main(String[] args) {
		package com.oracle;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

import java.util.Collections;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;

		public class SeleniumTest {

			public static void main(String[] args) throws InterruptedException{
				
				System.setProperty("webdriver.chrome.driver", "D:/ABA-Bank/chromedriver-win64/chromedriver.exe");
				
				//WebDriver.Options

				    ChromeOptions options = new ChromeOptions();
				    options.setExperimentalOption("useAutomationExtension", false);
				    options.addArguments("--remote-debugging-port=9225");
				    options.addArguments("disable-infobars");
				    options.addArguments("--remote-allow-origins=*");
				    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
				    WebDriver driver = new ChromeDriver(options);
				
				//WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.manage().window().maximize();
				
				driver.navigate().to("http://10.180.184.30:8080/grs-web/#/login");
				Thread.sleep(1000);
				driver.findElement(By.id("inputEmail3")).sendKeys("kchecker");
				Thread.sleep(1000);
				driver.findElement(By.name("password")).sendKeys("Oracle@12345");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
				
				Thread.sleep(5000);
				
				driver.findElement(By.name("search")).sendKeys("QPAY001373567654");
				Thread.sleep(1000);
				driver.findElement(By.id("search-btn")).click();

				Thread.sleep(2000);
				
				
		          //Scroll down the webpage by 5000 pixels  
		        JavascriptExecutor js = (JavascriptExecutor)driver;  
		       js.executeScript("scrollBy(0, 500)");   
		       Thread.sleep(5000);
		          
		         // Click on the Search button  
		        driver.findElement(By.linkText("Recipient Information")).click();  
		        Thread.sleep(5000);
		        
		        driver.findElement(By.linkText("Transaction Information")).click();   
		        Thread.sleep(5000);
		        js.executeScript("scrollBy(0, 500)"); 
		        Thread.sleep(5000);
		        
		        driver.findElement(By.linkText("Transaction History")).click();
		        Thread.sleep(2000);
		        js.executeScript("scrollBy(0, 500)"); 
			}
		}
		
		
	}

}
