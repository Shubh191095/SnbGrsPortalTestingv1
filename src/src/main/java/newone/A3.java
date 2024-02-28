package newone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			driver.manage().window().maximize();

	}

}
