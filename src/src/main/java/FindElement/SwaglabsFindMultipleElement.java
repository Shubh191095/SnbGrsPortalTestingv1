package FindElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabsFindMultipleElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https:/www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce"); 
		
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		
		Thread.sleep(2000);
		
//Add to cart single product-->>>>>>>>>>>>>
		
		//WebElement cart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		//cart.click();

		
//Add to cart two Product-->>>>>>>>>>>>>>>>>
		
		//List<WebElement> allProducts = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		
		//allProducts.get(0).click();
		//allProducts.get(1).click();
		//allProducts.get(2).click();
		//allProducts.get(3).click();
		//allProducts.get(4).click();
		//allProducts.get(5).click();
		//allProducts.get(6).click();	
		
//Add to cart Multiple Product---->>>>>>>>>>
	
		List<WebElement> allProducts = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		
		for (int i=0; i<allProducts.size();i++)
		{
			allProducts.get(i).click();
		}
		
	}

}
