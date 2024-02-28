package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp4 {

	public static void main(String[] args) throws InterruptedException {


		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(2000);
			
 //4>>>>>>>>>For send keys
			
			driver.findElement(By.xpath("//button[@id='promtButton']")).click();    
            Thread.sleep(2000);
            
            Alert alt = driver.switchTo().alert();
			Thread.sleep(2000);
		
			alt.sendKeys("Shubham");
			Thread.sleep(2000);
			
			System.out.println("End of program");

	}

}
