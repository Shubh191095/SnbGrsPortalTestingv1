package HowToTakeSS;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DateFornat {

	private static TakesScreenshot driver;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
//==================================================================================================================		
        //For multiple screenshot for same element
	    WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		driver.get("http://10.180.184.30:8080/grs-web/#/login");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//==================================================================================================================		
		Date d=new Date();
		System.out.println(d);
		//Simple Format class used
		//Date Format JAVA class
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss"); // SimpleDateFormat=Constuucter
		String date = d1.format(d);
		System.out.println(date);
//==================================================================================================================
		//Screenshot location
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(f, new File("C:\\Users\\Shubham\\Desktop\\Automation Practice\\Automation Screen Shots\\Quickpaylogin"+date+".jpg"));
	    System.out.println ("Screenshot is Taken Login Page");
//==================================================================================================================	
	} 
}
