package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver=new ChromeDriver();       
	        driver.manage().window().maximize();
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);

		//	5-Absolute Xpath
		//	Navigate From the root of parent to immediate child continue till the target
		//	>>>> For this "/"(Single forward Slash) is used.
			
			driver.findElement(By.xpath("/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("SITCHECKER1");
			Thread.sleep(2000);
			
		
			driver.findElement(By.xpath("/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("Grs@1234");
			Thread.sleep(2000);
			

			driver.findElement(By.xpath("/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/div[3]/div/button")).click();
			Thread.sleep(2000);
		
			
	}
	
}
