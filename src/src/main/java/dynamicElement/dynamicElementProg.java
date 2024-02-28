package dynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicElementProg {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Dynamic Element
		
		driver.findElement(By.xpath("//body//div//form/div[1]//input")).sendKeys("SHUBHAM");
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("TESTING");
		Thread.sleep(2000);
		
		//Dynamic Element handal by by Asolute or Relative Xpath or Contains method we can handle dynamin element

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		Thread.sleep(2000);
		
		

	}

}
