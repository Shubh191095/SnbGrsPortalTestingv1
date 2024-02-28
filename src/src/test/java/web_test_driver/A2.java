package web_test_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("8975007917");
		driver.findElement(By.id("pass")).sendKeys("Shubham@1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.getCurrentUrl();

	}

}
