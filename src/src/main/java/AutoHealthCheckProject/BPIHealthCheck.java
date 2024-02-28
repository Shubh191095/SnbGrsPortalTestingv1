package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BPIHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/BPI/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================

	       //(PAYOUT)
	       
 		String text = driver.findElement(By.xpath("/html/body")).getText();	
 		text.replaceAll(" ", "");
 		String[] arr=text.split("\n", 0);
 		String[] updatedArr= Arrays.copyOfRange(arr, 1, arr.length) ;
 		String actualResponse=Arrays.toString(updatedArr);
 		System.out.println(actualResponse);
 		//StringBuilder str= new StringBuilder(text);
 		//str.spli
 		String expectedResponse= "BPI (PAYOUT) - http://localhost:80/BPI/remitOnlineTxn.php : 200: OK";
 		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BPI (PAYOUT)   .. PASSED");
 		else System.out.println("FAIL");
 		
 //=====================================================================================================================================================

 //(BALANCE_ENQUIRY)
 		expectedResponse= "BPI (BALANCE_ENQUIRY) - http://localhost:80/BPI/inqFundBalance.php : 200: OK";
 		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BPI (BALANCE_ENQUIRY) .. PASSED");
 		else System.out.println("FAIL");
 		
 //==========================================================================================================================================================================================================================================================================================================================================		

 //(STATUS_ENQUIRY)
 		expectedResponse= "BPI (STATUS_ENQUIRY) - http://localhost:80/BPI/InqRemitstatus.php : 200: OK";
         if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BPI (STATUS_ENQUIRY)  .. PASSED");
         else System.out.println("FAIL");

 //==========================================================================================================================================================================================================================================================================================================================================	 
 
         
 	}
 }
