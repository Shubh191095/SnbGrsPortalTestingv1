package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/HDFC/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/HDFC/ws/healthcheck";
	      String actualURL=driver.getCurrentUrl();
	        
	       if(expectedURL.equals(actualURL))
	       {
	    	   System.out.println("Expected URL equals actualURL");   
	       }
	       else
	       { 
	    	   System.out.println("expected URL notequals actualURL");
	    	   
	    	   driver.close();
	   		 
	   		   System.out.println("*** End Of Program");
		   }
	         
//=========================================================================================================================	           

//(TOKEN_REQUEST)
	       
		String text = driver.findElement(By.xpath("/html/body")).getText();	
		text.replaceAll(" ", "");
		String[] arr=text.split("\n", 0);
		String[] updatedArr= Arrays.copyOfRange(arr, 1, arr.length) ;
		String actualResponse=Arrays.toString(updatedArr);
		System.out.println(actualResponse);
		//StringBuilder str= new StringBuilder(text);
		//str.spli
		String expectedResponse= "HDFC (TOKEN_REQUEST) - https://api-uat.hdfcbank.com/auth/oauth/v2/token?grant_type=client_credentials&scope=SNB : 405: Method Not Allowed";
				//+ ", , HDFC (BALANCE_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_FetchBalance : 401: Unauthorized, , HDFC (STATUS_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_StatusInquiry : 401: Unauthorized, , HDFC (PAYOUT) - https://api-uat.hdfcbank.com/API/NewIndiaLink_Payment : 401: Unauthorized]";
		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching HDFC (TOKEN_REQUEST)   .. PASSED");
		else System.out.println("FAIL");
		
//=====================================================================================================================================================

//(BALANCE_ENQUIRY)
		expectedResponse= "HDFC (BALANCE_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_FetchBalance : 401: Unauthorized";
				//+ ", , HDFC (BALANCE_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_FetchBalance : 401: Unauthorized, , HDFC (STATUS_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_StatusInquiry : 401: Unauthorized, , HDFC (PAYOUT) - https://api-uat.hdfcbank.com/API/NewIndiaLink_Payment : 401: Unauthorized]";
		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching HDFC (BALANCE_ENQUIRY) .. PASSED");
		else System.out.println("FAIL");
		
//==========================================================================================================================================================================================================================================================================================================================================		

//HDFC (STATUS_ENQUIRY)
		expectedResponse= "HDFC (STATUS_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_StatusInquiry : 401: Unauthorized";
		//+ ", , HDFC (BALANCE_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_FetchBalance : 401: Unauthorized, , HDFC (STATUS_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_StatusInquiry : 401: Unauthorized, , HDFC (PAYOUT) - https://api-uat.hdfcbank.com/API/NewIndiaLink_Payment : 401: Unauthorized]";
        if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching HDFC (STATUS_ENQUIRY)  .. PASSED");
        else System.out.println("FAIL");

//==========================================================================================================================================================================================================================================================================================================================================	 

//HDFC (PAYOUT)
    	expectedResponse= "HDFC (PAYOUT) - https://api-uat.hdfcbank.com/API/NewIndiaLink_Payment : 401: Unauthorized";
		//+ ", , HDFC (BALANCE_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_FetchBalance : 401: Unauthorized, , HDFC (STATUS_ENQUIRY) - https://api-uat.hdfcbank.com/API/NewIndiaLink_StatusInquiry : 401: Unauthorized, , HDFC (PAYOUT) - https://api-uat.hdfcbank.com/API/NewIndiaLink_Payment : 401: Unauthorized]";
        if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching HDFC (PAYOUT)          .. PASSED");
        else System.out.println("FAIL");
        
//======================================================================================================================================================       
        
        
	}
}
