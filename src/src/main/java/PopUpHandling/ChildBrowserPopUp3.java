package PopUpHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp3 {

	public static void main(String[] args) throws InterruptedException {
		
		//How to switch 1 page to 2nd page
		//method used->>driver.switchTo.window("Address")
		
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//website Open
		driver.get("https://www.google.com/docs/about/");
		Thread.sleep(2000);
		
		String mainPageAddress=driver.getWindowHandle();
		
		System.out.println("MainPage-"+mainPageAddress);
		
		//Click on button
		WebElement startLink=driver.findElement(By.xpath("/html/body/main/div/section[1]/div/div/div[1]/div/div[2]/a[2]"));
		startLink.click();
		Thread.sleep(2000);
		
		//List follows the index concept so we are used list
		List<String>allPageAddresses=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("All Page Addresses");
		
	    //Switch selenium focum on 2nd page
		driver.switchTo().window(allPageAddresses.get(1));
		Thread.sleep(2000);
		
		//Went on next page
		WebElement textBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
        textBox.sendKeys("SHUBHAM");
        Thread.sleep(2000);
        
        System.out.println("End of program");
	
	}

}
