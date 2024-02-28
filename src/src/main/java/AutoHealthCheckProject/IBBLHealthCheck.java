package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBBLHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/IBBL/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/IBBL/ws/healthcheck";
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


	       //(STATUS_ENQUIRY)
 	       
    		String text = driver.findElement(By.xpath("/html/body")).getText();	
    		text.replaceAll(" ", "");
    		String[] arr=text.split("\n", 0);
    		String[] updatedArr= Arrays.copyOfRange(arr, 1, arr.length) ;
    		String actualResponse=Arrays.toString(updatedArr);
    		System.out.println(actualResponse);
    		//StringBuilder str= new StringBuilder(text);
    		//str.spli
    		String expectedResponse= "IBBL (STATUS_ENQUIRY) - http://localhost:80/IBBL/response.php : 200: OK";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching IBBI (STATUS_ENQUIRY)   .. PASSED");
    		else System.out.println("FAIL");
    		
    //=====================================================================================================================================================

    //(BALANCE_ENQUIRY)
    		expectedResponse= "IBBL (BALANCE_ENQUIRY) - http://localhost:80/IBBL/response.php : 200: OK";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching IBBI (BALANCE_ENQUIRY) .. PASSED");
    		else System.out.println("FAIL");
    		  
    //==========================================================================================================================================================================================================================================================================================================================================	 

    //(PAYOUT)
        	expectedResponse= "IBBL (PAYOUT) - http://localhost:80/IBBL/response.php : 200: OK";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching IBBI (PAYOUT)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
            
    	}
    }
