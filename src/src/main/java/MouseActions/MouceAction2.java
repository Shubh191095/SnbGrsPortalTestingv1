package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouceAction2 {

	public static void main(String[] args) throws InterruptedException {
	

		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/buttons");
			Thread.sleep(2000);

			Actions act =new Actions (driver);
			
			//normal click
			WebElement clickMeButton = driver.findElement(By.xpath("//Button[text()='Click Me']"));
			act.click(clickMeButton).perform();
			String data1=clickMeButton.getText();
			System.out.println(data1);
			Thread.sleep(2000);
			
			
			//Write ClickMe=context click
			WebElement rightClickMeButton = driver.findElement(By.xpath("//Button[text()='Right Click Me']"));
			act.contextClick(rightClickMeButton).perform();
			String data2 = rightClickMeButton.getText();
			System.out.println(data2);
			Thread.sleep(2000);
			
			
			
			//Double ClickMe
			WebElement doubleClickMeButton = driver.findElement(By.xpath("//Button[text()='Double Click Me']"));
			act.doubleClick(doubleClickMeButton).perform();
			String data3 = doubleClickMeButton.getText();
			System.out.println(data3);
			Thread.sleep(2000);
			
	}

}
