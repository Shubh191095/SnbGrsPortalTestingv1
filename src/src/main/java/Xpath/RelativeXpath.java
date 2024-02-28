package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver=new ChromeDriver();       
	        driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);

			//6-Relative Xpath
			//Navigate from the root of parent to any chield and continue to the target 
			//>>Foe this "//"(Double forword slach) is used
			
			driver.findElement(By.xpath("//body//div//form/div[1]//input")).sendKeys("SITCHECKER1");
			Thread.sleep(2000);
			
		
			driver.findElement(By.xpath("//body//div//form/div[2]//input")).sendKeys("Grs@1234");
			Thread.sleep(2000);
			

			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(2000);
	
	}
}
