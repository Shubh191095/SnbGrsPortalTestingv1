package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BRIHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/BRI/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/BRI/ws/healthcheck";
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
    		String expectedResponse= "BRI (TOKEN_REQUEST) - http://localhost:80/BRI/requestToken.php : 200: OK";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BRI (TOKEN_REQUEST)   .. PASSED");
    		else System.out.println("FAIL");
    		
    //=====================================================================================================================================================

    //(BALANCE_ENQUIRY)
    		expectedResponse= "BRI (BALANCE_ENQUIRY) - http://localhost:80/BRI/inquiryVostro.php : 200: OK";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BRI (BALANCE_ENQUIRY) .. PASSED");
    		else System.out.println("FAIL");
    		
    //==========================================================================================================================================================================================================================================================================================================================================		

    //(STATUS_ENQUIRY)
    		expectedResponse= "BRI (STATUS_ENQUIRY) - http://localhost:80/BRI/inquiryTransaction.php : 200: OK";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BRI (STATUS_ENQUIRY)  .. PASSED");
            else System.out.println("FAIL");

    //==========================================================================================================================================================================================================================================================================================================================================	 

    //(PAYOUT)
        	expectedResponse= "BRI (PAYOUT) - http://localhost:80/BRI/paymentAccount.php : 200: OK";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BRI (PAYOUT)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
            
            
    	}
    }
