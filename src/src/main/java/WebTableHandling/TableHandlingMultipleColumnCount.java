package WebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandlingMultipleColumnCount {

	public static void main(String[] args) throws InterruptedException {


		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);
		
			driver.findElement(By.id ("inputEmail3")).sendKeys("SITCHECKER1");
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys("Grs@1234");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
			Thread.sleep(5000);
			
	        System.out.println("User login successful");
	    
	        
       //Multiple columns count 
        List <WebElement>columns = driver.findElements(By.xpath("//thead//tr//th"));
	       System.out.println(columns.size());
	       System.out.println("columns");

	}

}
