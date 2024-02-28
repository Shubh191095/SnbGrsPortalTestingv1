package WaitsConcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weight {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.()manage()timeouts().implicitlyWait(Duration.ofSeconds(20)
		
WebElement username = driver.findElement)By.xpath
username.sendKeys("standard_user");

WebElement password = driver.findElement)By.xpath
password.sendKeys("secerate_source");

WebElement loginButton = driver.findElement)By.xpath
loginButton.Click();

	}

	private static Object timeouts() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void manage() {
		// TODO Auto-generated method stub
		
	}

}
