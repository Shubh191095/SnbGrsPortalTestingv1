package newone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimiseMaximise {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
        Thread.sleep(5000);
        
        driver.manage().window().minimize();
        Thread.sleep(5000);
        driver.close();
	}

}
