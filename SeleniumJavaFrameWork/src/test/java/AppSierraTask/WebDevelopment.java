package AppSierraTask;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDevelopment {

	 static WebElement element = null;
	 private static WebDriver driver = null;
	private String[] args;	
	
	 
		@BeforeTest
		public void SetUpChrome(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		
		
		@Test
		public void GoibiboBooking(){
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
	    
	    pageobjectpackage.GoibiboTravelDetails.Enter_From_To_Destination(driver);
	      
	    pageobjectpackage.GoibiboTravelDetails.Select_highest_price_and_book(driver);
	      
		pageobjectpackage.GoibiboTravelDetails.Enter_travel_details(driver);
		
		pageobjectpackage.GoibiboTravelDetails.Make_payment_via_amazonpay_wallet(driver);
		
		}
		
		
		
		@AfterTest
		public void closegoibibo() {
			
			//close browser
			 driver.close();
			 driver.quit();
			 System.out.println("Test completed succesfully");

		}


		
	}
	      

	

	


