package HowToHandleDropDown;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolUpScroolDown2 {

	public static void main(String[] args) throws InterruptedException {


		  WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);
			
			//Using JavaScriptExecutor
		
		
		
		
	}

}
