package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			Thread.sleep(2000);

			WebElement Oslobox=driver.findElement(By.id("box1"));
			
			WebElement NorwayBox=driver.findElement(By.id("box101"));
			
			Actions act =new Actions(driver);
			
			act.dragAndDrop(Oslobox, NorwayBox).perform();//build nahi write kel tri chalnar
			
			System.out.println("Drag And Drop Successful");
			Thread.sleep(2000);
			
			
	}

}
