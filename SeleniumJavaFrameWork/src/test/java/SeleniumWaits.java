import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		selenumwaitsdemo();
	}

     public  static void  selenumwaitsdemo(){
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
 		driver = new ChromeDriver();
 		
 		//implict waits 
 		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
 		
 		driver.get("https://www.myally.ai/");
 		driver.manage().window().maximize();
 		driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("email")).sendKeys("varshini@myally.ai");
        
        //Explict waits
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("hdjsfhd")));

        driver.findElement(By.name("hdjsfhd"));
        driver.quit();
        driver.close();
        
        
     }
	
	
	
}
