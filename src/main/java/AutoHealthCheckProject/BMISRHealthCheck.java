package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMISRHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/BMISR/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/BMISR/ws/healthcheck";
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
    		String expectedResponse= "BMISR (TOKEN_REQUEST) - https://irs-uat.banquemisr.com:443/auth/realms/BM-ISO/protocol/openid-connect/token : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BMISR (TOKEN_REQUEST)   .. PASSED");
    		else System.out.println("FAIL");
    		
    //==========================================================================================================================================================================================================================================================================================================================================		

    //(STATUS_ENQUIRY)
    		expectedResponse= "BMISR (STATUS_ENQUIRY) - https://irs-uat.banquemisr.com:443/ISO/rest/external/inquiryTransferStatus : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BMISR (STATUS_ENQUIRY)  .. PASSED");
            else System.out.println("FAIL");

    //==========================================================================================================================================================================================================================================================================================================================================	 

    //(PAYOUT)
        	expectedResponse= "BMISR (PAYOUT) - https://irs-uat.banquemisr.com:443/ISO/rest/external/postTransfer : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BMISR (PAYOUT)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
            //(PAYOUT)
        	expectedResponse= "BMISR (PAYOUT) - https://irs-uat.banquemisr.com:443/ISO/rest/external/postTransfer : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BMISR (PAYOUT)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
            //(ACCOUNT_VALIDATION)
        	expectedResponse= "BMISR (ACCOUNT_VALIDATION) - https://irs-uat.banquemisr.com:443/ISO/rest/external/checkAccStatus : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching BMISR (ACCOUNT_VALIDATION)          .. PASSED");
            else System.out.println("FAIL");
            
    	}
    }
