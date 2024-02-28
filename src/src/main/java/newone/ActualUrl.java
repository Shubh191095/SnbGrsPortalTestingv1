package newone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActualUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();       
		
		
		//Condition 1 only check URL is correct
		
		
	    driver.get("https://www.facebook.com/");  //actual
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		//get URL
		
		//String actualURL = driver.getCurrentUrl();
         //System.out.println(actualURL);
         
	    ///Get Title  
        driver.getTitle();
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);


         //driver.close();
		
		
		
		//Condition COmpare the url with actual url
		
		//driver.get("https://www.facebook.com/");  //actual
	//	driver.manage().window().maximize();
		//Thread.sleep(2000);
		
	//	String expectedURL= ("https://www.facebook.com/");
		
		//String actualURL = driver.getCurrentUrl();
		
	//	if (expectedURL.equals(actualURL))
		//{
			//System.out.println("Test case is passed");
				
		//}
		//else 
		//{
			//System.out.println("Test case is failed");
			
		//}
			
		
        //driver.close();
	//}
//Note 1st condition sathi }}  second condition sathi }
         
       }}
