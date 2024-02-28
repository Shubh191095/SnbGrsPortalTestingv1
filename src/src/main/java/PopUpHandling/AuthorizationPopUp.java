package PopUpHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthorizationPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String url ="the-internet.herokuapp.com/basic_auth";
				
		String username = "admin";
		String password = "admin";
		
		String mainURL = "https://"+username+":"+password+"@"+url;
			
		driver.get(mainURL);
	

	}

}
