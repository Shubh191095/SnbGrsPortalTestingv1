package MouseActions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MouseActionProgram1 {

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
			
		WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']"));//.click();
			Thread.sleep(2000);
			 
    //Using Action class and perform method
			
			//Mouse action click on login button
			Actions act = new Actions(driver);
			act.click(loginButton).perform();
			
			
	}
}
