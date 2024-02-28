package KeyboardsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandlingProg1 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://the-internet.herokuapp.com/key_presses");
			Thread.sleep(2000);

	    //by using action class and Perform method
			
			Actions act=new Actions(driver);
			act.sendKeys("p").perform();
			
			WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
			
			String valueActual =result.getText();
			
			System.out.println(valueActual);
			
			String valueExpected="You entered: P";
			
			if(valueActual.equals(valueExpected))
			{
				System.out.println("pass");
			}	
			else
			{
				System.out.println("fail");
			}

			//For Back Space
			
		//	act.sendKeys(Keys.BACK_SPACE).perform();
			
			
	}

}
