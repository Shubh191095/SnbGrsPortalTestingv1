package AutoHealthCheckProject;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NBPHealthCheck {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://10.180.184.30:8080/integration-web-launcher/NBP/ws/healthcheck");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//===================================	======================================================================================
//Check URL		
		  String expectedURL ="http://10.180.184.30:8080/integration-web-launcher/NBP/ws/healthcheck";
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
	     		String expectedResponse= "NBP (TOKEN_REQUEST) - https://ermpushapitest.nbp.com.pk/ERMV2/api/v2/Authenticate?Agency_Code=38 : 403: Forbidden";
	     		if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching NBP (TOKEN_REQUEST)   .. PASSED");
	     		else System.out.println("FAIL");
	     		
	     //=====================================================================================================================================================

	   
	     //==========================================================================================================================================================================================================================================================================================================================================		

	     //(STATUS_ENQUIRY)
	     		expectedResponse= "NBP (STATUS_ENQUIRY) - https://ermpushapitest.nbp.com.pk/ERMV2/api/v2/TransactionStatusByIds : 403: Forbidden";
	             if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching NBP (STATUS_ENQUIRY)  .. PASSED");
	             else System.out.println("FAIL");

	     //==========================================================================================================================================================================================================================================================================================================================================	 

	     //(PAYOUT)
	         	expectedResponse= "NBP (PAYOUT) - https://ermpushapitest.nbp.com.pk/ERMV2/api/v2/{api} : 403: Forbidden";
	             if(actualResponse.contains(expectedResponse)) System.out.println("Response are matching NBP (PAYOUT)          .. PASSED");
	             else System.out.println("FAIL");
	             
	     //======================================================================================================================================================       
	             
	             
	     	}
	     }
