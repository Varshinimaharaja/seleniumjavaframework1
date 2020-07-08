import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtentReportDemo {
	
       private static final String DEPRECATION = "deprecation";
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings(DEPRECATION)
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentReporter.html");

		//create extentreports and attach reporters
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		// create a toggle 
		ExtentTest test1 = extent.createTest("Myallytest", "this is test to click on signin button in myallly page");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starinf test case");
		driver.get("https://www.myally.ai/");
		test1.pass("navigated sucesfully");
		
		driver.manage().window().maximize();
		test1.pass("maximized the windows");

        pageobjectpackage.MyallyClass.click_signin_button(driver).click();
		test1.pass("clicked on signed button");

        driver.close();
		driver.quit();
		test1.pass("close the browser");
		
		test1.info("Test Completed");
        test1.pass("details");
        
        extent.flush();
	}
}
