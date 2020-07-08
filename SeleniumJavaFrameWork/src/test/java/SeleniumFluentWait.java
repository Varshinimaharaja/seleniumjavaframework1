import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


public class SeleniumFluentWait {
	


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

        
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(30, TimeUnit.SECONDS)
        		.pollingEvery(5, TimeUnit.SECONDS)
        		.ignoring(Exception.class);

        		WebElement element=wait.until(new Function<WebDriver, WebElement>() {
        		public WebElement apply(WebDriver driver) {
        		WebElement linkelement=  driver.findElement(By.xpath("//h3[contains(text(), 'ABCD kids - Apps on Google Play')]"));
        		   
        		
        		if(linkelement.isEnabled()){
        			System.out.println("sucess");
        			
        		
        		}
        		return linkelement;
        		
        		}
        		});
        		
        	element.click();
	
	
	
	}


	}

