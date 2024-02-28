package web_test_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();       
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.navigate().back();      //Facebook
		Thread.sleep(5000);
		
		driver.navigate().forward();   //Google
		Thread.sleep(5000);
		
		driver.navigate().refresh();   //Google
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		driver.close();      // close current window
		driver.quit();       //close browser
		
		
	}
	

}
