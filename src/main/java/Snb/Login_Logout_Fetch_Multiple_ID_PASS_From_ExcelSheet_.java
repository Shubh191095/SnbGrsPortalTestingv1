package Snb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Logout_Fetch_Multiple_ID_PASS_From_ExcelSheet_ {

	public static void main(String[] args) throws InterruptedException, IOException {
FileInputStream fis = new FileInputStream ("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Portal Id's and passwords\\Portal Id passwords.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook (fis);
		XSSFSheet sheet = workbook.getSheet("ID PASSWORDS Sheet");
		int rowcount =sheet .getLastRowNum();
		int colcount =sheet .getRow(1).getLastCellNum();
		System.out.println("rowcount:"+rowcount+"colcount:+colcount");
		//for (int i=2; i<rowcount ;i++)
		
		for (int i=2; i<rowcount;i++)
		{
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);
			
			XSSFRow celldata = sheet .getRow(i);
			
			String Username =celldata.getCell(0).getStringCellValue();
			String Password =celldata.getCell(1).getStringCellValue();
			
			driver.findElement(By.id ("inputEmail3")).sendKeys(Username);
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys(Password);
			Thread.sleep(2000);
				
			System.out.println(i+"."+Username+" || "+Password);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.quit();
			//break;
			
		 }
	  }
   }
