package KeyboardsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPestProgram {

	public static void main(String[] args) throws InterruptedException {
	
		
		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://text-compare.com/");
			Thread.sleep(2000);
		
			
			
			WebElement area1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
			
			area1.sendKeys("India Is My Country");//Send
			
			
			Actions act =new Actions(driver);
			
			//Select All>>>Control+A
			
			//By sing KeysDown method and use keys class
			
			act.keyDown(Keys.CONTROL);
			act.sendKeys("A");
			act.keyUp(Keys.CONTROL);//KeyUP method use
			act.perform();
			
			//Copy >>>> Control+C
			act.keyDown(Keys.CONTROL);
			act.sendKeys("C");
			act.keyUp(Keys.CONTROL);//KeyUP method use
			act.perform();
			
			//From left to right page By finding Xpath for second page
			
			WebElement area2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
			area2.click();
			
			//Past >>>> Control+V
			act.keyDown(Keys.CONTROL);
			act.sendKeys("V");
			act.keyUp(Keys.CONTROL);//KeyUP method use
			act.perform();
			
		
			
			
		

	}

}
