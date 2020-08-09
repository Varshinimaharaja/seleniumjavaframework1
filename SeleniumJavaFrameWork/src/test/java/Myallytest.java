import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myallytest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		WebElement registerpage = driver.findElement(By.linkText("Skip Sign In"));
		registerpage.click();
		driver.findElement(By.name("FirstName")).sendKeys("varshini");
		driver.findElement(By.name("LastName")).sendKeys("maharaja");
		driver.findElement(By.name("Adress")).sendKeys("hyderbad");
		driver.findElement(By.name("EmailAdress")).sendKeys("varshini.maharaja@gmail.com");
		driver.findElement(By.name("Phone")).sendKeys("7416857970");
		driver.findElement(By.name("submit ")).click();
		

		
		

		
		
        
        
       
	}

}
