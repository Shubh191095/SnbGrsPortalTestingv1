package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {56

	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		//2-Xpatrh By Text

		//Syntex->
		//tagname[text()='value']
		//Ex //span[text()='Password']
		
		//input[@name='username']
		
	driver.findElement(By.xpath("")).sendKeys("");
		
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.findElement(By.xpath("")).click();
		
		
		//
		
	}

}
