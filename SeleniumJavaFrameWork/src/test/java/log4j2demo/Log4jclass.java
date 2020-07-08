package log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jclass {
	
	private static WebDriver driver = null;

	private static Logger logger = LogManager.getLogger(Log4jclass.class);
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.myally.ai/");
		driver.manage().window().maximize();
        pageobjectpackage.MyallyClass.click_signin_button(driver).click();
        logger.info("this is info msg");
        logger.warn("this warn msg");
        logger.fatal("this is fatal msg");
        logger.error("this is error msg");
        
	}

}
