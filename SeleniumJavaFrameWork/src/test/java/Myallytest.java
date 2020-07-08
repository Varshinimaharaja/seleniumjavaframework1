import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myallytest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.myally.ai/");
		driver.manage().window().maximize();
        pageobjectpackage.MyallyClass.click_signin_button(driver).click();
        pageobjectpackage.MyallyClass.get_current_url(driver);
        
        
       
	}

}
