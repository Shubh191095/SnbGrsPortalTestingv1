package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HBTFHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/HBTF/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/HBTF/ws/healthcheck";
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
    		String expectedResponse= "HBTF - https://uolp.hbtf.com.jo/SoapAdapter/services/creation : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching HBTF (Service name not present)   .. PASSED");
    		else System.out.println("FAIL");
    		
//    //=====================================================================================================================================================
//
//    //(BALANCE_ENQUIRY)
//    		expectedResponse= "HBTF (BALANCE_ENQUIRY) - http://localhost/HBTF/response.php?balance_inquiry=1 : 200: OK";
//    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching HBTF (BALANCE_ENQUIRY) .. PASSED");
//    		else System.out.println("FAIL");
//    		
//    //==========================================================================================================================================================================================================================================================================================================================================		
//
//    //(STATUS_ENQUIRY)
//    		expectedResponse= "HBTF (STATUS_ENQUIRY) - http://localhost/HBTF/response.php?update=1 : 200: OK";
//            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching HBTF (STATUS_ENQUIRY)  .. PASSED");
//            else System.out.println("FAIL");
//
//    //==========================================================================================================================================================================================================================================================================================================================================	 
//
//    //(PAYOUT)
//        	expectedResponse= "HBTF (PAYOUT) - http://localhost/HBTF/response.php?payout=1 : 200: OK";
//            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching HBTF (PAYOUT)          .. PASSED");
//            else System.out.println("FAIL");
//            
//    //======================================================================================================================================================       
//            
//            
    	}
    }
