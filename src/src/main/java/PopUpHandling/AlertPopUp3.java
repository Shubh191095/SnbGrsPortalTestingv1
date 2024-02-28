package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp3 {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(2000);
			
//3>>>>>>>>>For accept and reject button
			
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();    
			Thread.sleep(2000);
			
			Alert alt = driver.switchTo().alert();
			Thread.sleep(2000);
			
			
			alt.accept();  //reject button  alt.dismiss();
			Thread.sleep(2000);
			
			System.out.println("End of program");
			 

	}

}
