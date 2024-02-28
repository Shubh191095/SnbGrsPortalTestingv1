package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver=new ChromeDriver();       
	        driver.manage().window().maximize();
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);
			
		
			driver.findElement(By.xpath("(//input[contains(@name,'inputEmail')])[1]")).sendKeys("SITCHECKER1");
			Thread.sleep(2000);
			
			//Password by contains attribute
			driver.findElement(By.xpath("(//input[contains(@type,'password')])[1]")).sendKeys("Grs@1234");
			Thread.sleep(2000);
			
			//contains by text
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(2000);
		
		

	}

}
