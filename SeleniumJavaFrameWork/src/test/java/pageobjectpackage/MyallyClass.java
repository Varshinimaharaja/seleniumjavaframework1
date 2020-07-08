package pageobjectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyallyClass {
	
    static WebElement element = null;

	public static WebElement click_signin_button(WebDriver driver) {
		 
		element = driver.findElement(By.linkText("Sign In"));
	          return element;
	}
	
      public static  String get_current_url(WebDriver driver) {
    	     
    	  String url = driver.getCurrentUrl();
    	  return url;
      }

}
