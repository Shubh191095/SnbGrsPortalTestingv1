package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WhowToHandleiFrame {

	public static void main(String[] args) throws InterruptedException {
		
	   	    WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			Thread.sleep(2000);
			
			//Frame Element
			WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame2']"));
			
			//Switch to IFrame-Pass the frame element
			driver.switchTo().frame(frameElement);
		
			WebElement dropDown =driver.findElement(By.xpath("//select[@id='animals']"));
			dropDown.click();
			
			Select s = new Select(dropDown);
			s.selectByVisibleText("Avatar");
			System.out.println("End of program");
	
	}

}
