package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBCHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/CBC/ws/healthcheck");
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
 		String expectedResponse= "CBC (PAYOUT) - http://grsqaserver/CBC/Initiate_Transaction_json.php : 502: notresolvable";
 		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching CBC (PAYOUT)   .. PASSED");
 		else System.out.println("FAIL");
 		
 //=====================================================================================================================================================

 //(STATUS_ENQUIRY)
 		expectedResponse= "CBC (STATUS_ENQUIRY) - http://10.180.184.30/CBC/Status_Enquiry_json.php : 502: cannotconnect";
         if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching CBC (STATUS_ENQUIRY)  .. PASSED");
         else System.out.println("FAIL");

 //==========================================================================================================================================================================================================================================================================================================================================	 
              
 	}
 }
