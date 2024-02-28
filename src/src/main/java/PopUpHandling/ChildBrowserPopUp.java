package PopUpHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		
    //From one window to another window
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Website open
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//Get window handle method are used
		String mainPageAddress=driver.getWindowHandle();
		System.out.println("MainPage-"+mainPageAddress);
		
		WebElement startLink = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
		startLink.click();
		Thread.sleep(2000);
		
		//click on button
		WebElement startLink1= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/span/span"));
		startLink1.click();
		Thread.sleep(2000);
		
		Set<String>allPageAddress=driver.getWindowHandles();
		System.out.println("AllPageAddresses-"+allPageAddress);
		
	}

}
