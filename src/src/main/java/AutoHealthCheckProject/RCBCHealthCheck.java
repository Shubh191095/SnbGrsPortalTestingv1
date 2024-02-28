package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RCBCHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/RCBC/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/RCBC/ws/healthcheck";
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
    		String expectedResponse= "RCBC (TOKEN_REQUEST) - https://next.rcbcconnect.com/rcbc-sit/security/authentication/oauth2/token : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching RCBC (TOKEN_REQUEST)   .. PASSED");
    		else System.out.println("FAIL");
    		
//    //=====================================================================================================================================================

            //(BALANCE_ENQUIRY)//(STATUS_ENQUIRY) //(PAYOUT)
    		expectedResponse= "RCBC - https://next.rcbcconnect.com/rcbc-uat/telemoney/ERWService/EtripServices : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching RCBC (BALANCE_ENQUIRY,STATUS_ENQUIRY,PAYOUT) .. PASSED");
    		else System.out.println("FAIL");
    		
//===================================================================================================================================================       
            
            
    	}
    }
