package pageobjectpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoibiboTravelDetails {

    static WebElement element = null;
	private String[] args;
    int firstname = Integer.parseInt(args[0]);
    int lastname = Integer.parseInt(args[1]);
    int email = Integer.parseInt(args[2]);
	private WebDriver driver;
    
    

		public static void Enter_travel_details(WebDriver driver) {
	    	WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Yes, secure my trip')]/parent::div/input")));
			driver.findElement(By.xpath("//label[contains(text(),'Yes, secure my trip')]/parent::div/input")).click();
			Select AdultNamedropdown = new Select(driver.findElement(By.id("Adulttitle1")));
			AdultNamedropdown.selectByValue("3");
			driver.findElement(By.id("AdultfirstName1")).sendKeys("varshini");
			driver.findElement(By.id("AdultlastName1")).sendKeys("maharaja");
			driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
			driver.findElement(By.id("mobile")).sendKeys("9876543213");
			}
		
		
		public static void Enter_From_To_Destination(WebDriver driver) {
		    // click on round trip
		    driver.findElement(By.id("roundTrip")).click();
		    System.out.println(driver.getTitle());
		    //Implict wait
	        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    //Explict wait 
		    WebDriverWait wait = new WebDriverWait(driver, 120);
            // Enter Delhi tp Mumbai
			driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("delhi");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='react-autosuggest-1']/li[1]")));
			driver.findElement(By.xpath("//ul[@id='react-autosuggest-1']/li[1]")).click();
	        driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).sendKeys("mumbai");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='react-autosuggest-1']/li[1]")));
			driver.findElement(By.xpath("//ul[@id='react-autosuggest-1']/li[1]")).click();
			//click on calendar
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			driver.findElement(By.id("departureCalendar")).click();
			driver.findElement(By.id("fare_20200905")).click();
			//Click on search button 
			driver.findElement(By.id("gi_search_btn")).click();
		    }
		
		
		public static void Select_highest_price_and_book(WebDriver driver) {
			//Explict wait 
		    WebDriverWait wait = new WebDriverWait(driver, 120);
			//Sort the prices from higher to lower
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='PRICE']")));
	        driver.findElement(By.xpath("//li[@id='PRICE']")).click();
			driver.findElement(By.xpath("//div[text()='Round Trip Offers']/parent::div/child::div[4]//child::div[2]//li[@id='PRICE']")).click();
			//select highest price 
			driver.findElement(By.xpath("//i[@class='icon-rupee ico11'][1]/parent::span/parent::span/following-sibling::span")).click();
			driver.findElement(By.xpath("//div[@class='fltHpyRtrnWrp']//child::label[1]")).click();
			//click on book 
			driver.findElement(By.xpath("//*[@type='button' and @value='BOOK']")).click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			}
		
		
		public static void Make_payment_via_amazonpay_wallet(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 120);
			driver.findElement(By.xpath("//div[contains(text(),'Proceed ')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Proceed To Payment')]")));
			driver.findElement(By.xpath("//span[contains(text(),'Proceed To Payment')]")).click();
			//payment through Wallet- amazon pay
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='tab_wallet']/div[2]//i")));
			driver.findElement(By.xpath("//div[@id='tab_wallet']/div[2]//i")).click();
			}

}