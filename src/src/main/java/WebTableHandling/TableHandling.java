package WebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

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
	        
	        //Find single element column name
	        WebElement column1=driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[1]/div[3]/form/div/div[2]/div/div[2]/div/table/thead/tr/th[1]"));
		    column1.click();
		    Thread.sleep(2000);
            System.out.println(column1.getText());
	}

}
