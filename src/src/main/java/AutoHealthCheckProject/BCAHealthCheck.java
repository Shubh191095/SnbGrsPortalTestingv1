package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BCAHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/BCA/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/BCA/ws/healthcheck";
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
    		String expectedResponse= "BCA (TOKEN_REQUEST) - https://devapi.klikbca.com/api/oauth/token : 404: Not Found";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BCA (TOKEN_REQUEST)   .. PASSED");
    		else System.out.println("FAIL");
    		
    //=====================================================================================================================================================

    //(BALANCE_ENQUIRY)
    		expectedResponse= "BCA (BALANCE_ENQUIRY) - https://devapi.klikbca.com/fire/accounts/balance : 504: Gateway Timeout";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BCA (BALANCE_ENQUIRY) .. PASSED");
    		else System.out.println("FAIL");
    		
    //==========================================================================================================================================================================================================================================================================================================================================		

    //(STATUS_ENQUIRY)
    		expectedResponse= "BCA (STATUS_ENQUIRY) - https://devapi.klikbca.com/fire/transactions : 504: Gateway Timeout";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BCA (STATUS_ENQUIRY)  .. PASSED");
            else System.out.println("FAIL");

    //==========================================================================================================================================================================================================================================================================================================================================	 

    //(PAYOUT)
        	expectedResponse= "BCA (PAYOUT) - https://devapi.klikbca.com/fire/transactions/{txnType} : 400: Bad Request";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BCA (PAYOUT)          .. PASSED");
            else System.out.println("Payout FAIL");
            
    //======================================================================================================================================================       
            
            
    	}
    }
