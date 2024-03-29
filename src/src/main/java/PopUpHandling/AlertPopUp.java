package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(2000);
			
	//By using we can accept the the pop-up message (OK)

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();    
			Thread.sleep(2000);
			
	     	//Will get alert after this
			//Need  to handle this alert
			
			//Switch method use aslo use alert method
			//Switch selenium focus to alert
			Alert alt = driver.switchTo().alert();
			Thread.sleep(2000);
			
			//For click on ok button use accept method
			alt.accept();
			Thread.sleep(2000);
			
			System.out.println("End of program");
			 
	}
	

}
