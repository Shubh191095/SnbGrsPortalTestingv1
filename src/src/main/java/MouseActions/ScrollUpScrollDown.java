package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);

	        driver.findElement(By.id ("inputEmail3")).sendKeys("SITCHECKER1");
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys("Grs@1234");
			Thread.sleep(200);
			
		    driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
			Thread.sleep(2000);
			
			         //Casting js=refrance variable
					//input in Javas cript Language
					//window class----Scroll back method
			
			//Scroll down
		         	JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window, scrollBy(0,2000)");
					Thread.sleep(5000);
					
			//Scroll Up
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("window, scrollBy(0,-2000)");
					Thread.sleep(5000);
					
	}
	
	

}
