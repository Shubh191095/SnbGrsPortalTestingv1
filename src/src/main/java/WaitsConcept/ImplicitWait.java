package WaitsConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
         //Implicit Wait  only time apply
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Explicit Wait time and condition apply
		WebDriverWait WebDriverWaitwait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement password= wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//body//div//form/div[1]//input")).sendKeys("SHUBHAM")));
	
		//Fluent Wait Time Apply Condition Apply Pooling Frequency (5sec,10sec,15sec)apply
	}

}
