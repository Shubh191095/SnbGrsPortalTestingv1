package HowToTakeSS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShootProgram {

	public static void main(String[] args) throws InterruptedException, IOException {
//==================================================================================================================		
	    WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		driver.get("http://10.180.184.30:8080/grs-web/#/login");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//==================================================================================================================		
        System.out.println("Correct URL");
        //If we want to atke new screenshots that time we should change the name Quickpaylogin so we can take multiples ss for the same functionality
        //Take Screen Shots
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f, new File("C:\\Users\\Shubham\\Desktop\\Automation Practice\\Automation Screen Shots\\Quickpaylogin.jpg"));
        System.out.println ("Screenshot is Taken Login Page");
//==================================================================================================================        
        //Login       
        driver.findElement(By.id ("inputEmail3")).sendKeys("PDS2");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Grs@1234");
		Thread.sleep(000);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
		Thread.sleep(5000);
//==================================================================================================================		
	    File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\Automation Practice\\Automation Screen Shots\\Quickpayhomepage.jpg"));
	    System.out.println ("Screenshot is Taken Home page");
//==================================================================================================================
	}
}
