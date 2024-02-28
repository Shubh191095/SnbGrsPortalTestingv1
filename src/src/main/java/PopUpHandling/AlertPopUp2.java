package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(2000);
		
		//2>>>>>>>>>For accept after 5sec
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();    
		Thread.sleep(5000);
	
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		
		
		alt.accept();
		Thread.sleep(5000);
		
		System.out.println("End of program");
		 

	}

}
