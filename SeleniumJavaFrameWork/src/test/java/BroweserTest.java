import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroweserTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myally.ai/");
		driver.manage().window().maximize();
		WebElement search =  driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		
		
		
		
	}

}
