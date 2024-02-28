package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MGHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/MG/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/MG/ws/healthcheck";
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
    		String expectedResponse= "MG (CANCELLATION) - https://extws.moneygram.com/extws/services/AgentConnect1512 : 200: null";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching MG (CANCELLATION)   .. PASSED");
    		else System.out.println("FAIL");
    		
    //=====================================================================================================================================================

    //(No Service Name)
    		expectedResponse= "MG - https://extws.moneygram.com/extws/services/AgentConnect1512 : 200: null";
    		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching MG (BALANCE_ENQUIRY) .. PASSED");
    		else System.out.println("FAIL");
    		
    //==========================================================================================================================================================================================================================================================================================================================================		

    //(STATUS_ENQUIRY)
    		expectedResponse= "MG (STATUS_ENQUIRY) - https://extws.moneygram.com/extws/services/AgentConnect1512 : 200: null";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching MG (STATUS_ENQUIRY)  .. PASSED");
            else System.out.println("FAIL");

    //==========================================================================================================================================================================================================================================================================================================================================	 

    //(PAYOUT)
        	expectedResponse= "MG (PAYOUT) - https://extws.moneygram.com/extws/services/AgentConnect1512 : 200: null";
            if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching MG (PAYOUT)          .. PASSED");
            else System.out.println("FAIL");
            
    //======================================================================================================================================================       
            
            
    	}
    }
