package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BAHLHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/BAHL/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/BAHL/ws/healthcheck";
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


	       //(Service name is not present)
 	       
    		String text = driver.findElement(By.xpath("/html/body")).getText();	
    		text.replaceAll(" ", "");
    		String[] arr=text.split("\n", 0);
    		String[] updatedArr= Arrays.copyOfRange(arr, 1, arr.length) ;
    		String actualResponse=Arrays.toString(updatedArr);
    		System.out.println(actualResponse);
    		//StringBuilder str= new StringBuilder(text);
    		//str.spli
    		String expectedResponse= "BAHL - http://119.159.243.38/WS_UAT_RTPSTieUp/Service.svc : 502: cannotconnect";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BAHL (Service name is not present)   .. PASSED");
    		else System.out.println("FAIL");
    		
    //=====================================================================================================================================================

    //(BALANCE_ENQUIRY)
    		expectedResponse= "BAHL (BALANCE_ENQUIRY) - http://localhost/BAHL/AccountBalanceEnquiry.php : 200: OK";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BAHL (BALANCE_ENQUIRY) .. PASSED");
    		else System.out.println("FAIL");
    		
    //==========================================================================================================================================================================================================================================================================================================================================		

    //(STATUS_ENQUIRY)
    		expectedResponse= "BAHL (STATUS_ENQUIRY) - http://localhost/BAHL/StatusEnquiry.php : 200: OK";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BAHL (STATUS_ENQUIRY)  .. PASSED");
            else System.out.println("FAIL");

    //==========================================================================================================================================================================================================================================================================================================================================	 

    //(PAYOUT)
        	expectedResponse= "BAHL (PAYOUT) - http://localhost/BAHL/PaymentService.php : 200: OK";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BAHL (PAYOUT)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
            //(ACCOUNT_VALIDATION)
        	expectedResponse= "BAHL (ACCOUNT_VALIDATION) - http://localhost/BAHL/TokenService.php : 200: OK";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BAHL (ACCOUNT_VALIDATION)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
        
            
    	}
    }
