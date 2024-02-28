package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUBHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/AUB/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/AUB/ws/healthcheck";
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


	       //(Service name not present)
 	       
    		String text = driver.findElement(By.xpath("/html/body")).getText();	
    		text.replaceAll(" ", "");
    		String[] arr=text.split("\n", 0);
    		String[] updatedArr= Arrays.copyOfRange(arr, 1, arr.length) ;
    		String actualResponse=Arrays.toString(updatedArr);
    		System.out.println(actualResponse);
    		//StringBuilder str= new StringBuilder(text);
    		//str.spli
    		String expectedResponse= "AUB - http://222.127.151.21:8500/ws/express.cfc : 502: cannotconnect";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching AUB (Service name not present)   .. PASSED");
    		else System.out.println("FAIL");
    		
    //=====================================================================================================================================================

    //(BALANCE_ENQUIRY)
    		expectedResponse= "AUB (BALANCE_ENQUIRY) - http://222.127.151.21:8500/ws/express.cfc : 502: cannotconnect";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching AUB (BALANCE_ENQUIRY) .. PASSED");
    		else System.out.println("FAIL");
    		
    //==========================================================================================================================================================================================================================================================================================================================================		

    //(STATUS_ENQUIRY)
    		expectedResponse= "AUB (STATUS_ENQUIRY) - http://222.127.151.21:8500/ws/express.cfc : 502: cannotconnect";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching AUB (STATUS_ENQUIRY)  .. PASSED");
            else System.out.println("FAIL");

    //==========================================================================================================================================================================================================================================================================================================================================	 

    //(PAYOUT)
        	expectedResponse= "AUB (PAYOUT) - http://10.180.184.30/CBC/transmitOFACRemittance2.php : 502: cannotconnect";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching AUB (PAYOUT)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
            //(SANCTIONS_CLEARANCE)
        	expectedResponse= "AUB (SANCTIONS_CLEARANCE) - http://222.127.151.21:8500/ws/express.cfc : 502: cannotconnect";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching AUB (SANCTIONS_CLEARANCE)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
        
            
    	}
    }
