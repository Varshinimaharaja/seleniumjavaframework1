import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultiBrowserDemo {
    WebDriver driver = null;

    
	@Parameters("browsername")
    @BeforeTest
	public void setup(String browsername){
    	System.out.println("test in running" +browsername);
    	
    	if(browsername.equalsIgnoreCase("chrome")) {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myally.ai/");
		driver.manage().window().maximize();
    	}
    	else {
        	System.out.println("unable to run on" +browsername);

    	}
	}
	@Test
	public void test1(){
    	System.out.println("test1");

		
	}
	
	@AfterTest
	public void teardown(){
    	System.out.println("test2");

		
	}
}





