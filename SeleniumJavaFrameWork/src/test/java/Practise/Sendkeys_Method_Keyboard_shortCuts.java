package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Method_Keyboard_shortCuts {

	public static void main(String[] args) {
		WebDriver driver = null;


		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        
		driver.findElement(By.name("firstname")).sendKeys("varshini"+Keys.TAB+"maharaja"+Keys.TAB+"varsh345@gmail.com");
		
		
		driver.findElement(By.id("day")).sendKeys("24");
		
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		 
		
		//Identify radio button.
		driver.findElement(By.xpath("//input[@value='1']")).sendKeys(Keys.SPACE);

	}

}
