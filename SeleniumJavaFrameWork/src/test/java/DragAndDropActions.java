import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		


public class DragAndDropActions {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 private static WebDriver driver = null;

			
			@BeforeTest
			public void setUpTest() {
				
				System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			
			@Test
			public  void DragAndDropMethod() {
				// goto my ally
				
				driver.get("http://demo.guru99.com/test/drag_drop.html");
				//max the window
				driver.manage().window().maximize();
		        //get the current
		        Actions act = new Actions(driver);
		         WebElement source_locator = driver.findElement(By.xpath("//li[@id='credit2']"));
		        		 
		         WebElement target_locator = driver.findElement(By.xpath("//li[@class='placeholder']"));
		        		 

		        act.dragAndDrop(source_locator, target_locator).build().perform();
		        driver.get("http://www.google.com/");
//		        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		        System.out.println(driver.getTitle());
		        Actions act1 = new Actions(driver);
		        act1.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
		        driver.get("http://www.bing.com/");
		        System.out.println(driver.getTitle());
		        act1.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
		        driver.get("http://www.yahoo.com/");
		        System.out.println(driver.getTitle());
		        driver.close();
		        driver.quit();
		        
		        


		        
			}

}
