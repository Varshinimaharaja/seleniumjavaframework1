
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Myallytest2TestNGtest {
	
	 private static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public  void Myallysignin() {
		// goto my ally
		
		driver.get("https://www.myally.ai/");
		//max the window
		driver.manage().window().maximize();
		//click on sign in button 
        pageobjectpackage.MyallyClass.click_signin_button(driver).click();
        //get the current
        pageobjectpackage.MyallyClass.get_current_url(driver);
        
       
	}
	
	
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
		 driver.close();
		 driver.quit();
		 System.out.println("test compeleted sucessfully");
		 
		 		
		
	}

}
