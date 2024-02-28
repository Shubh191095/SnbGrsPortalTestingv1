package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		//By normal process we can inspect and handle
		
		   WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[3]/div/md-dialog/md-content/div/div/button[1]")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("/html/body/div[3]/div/md-dialog/md-content/div/div/button[1]")).click();
			Thread.sleep(2000);
			 

	}

}
