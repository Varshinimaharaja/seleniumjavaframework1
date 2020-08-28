package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ExcelUtils {
	 static XSSFWorkbook workbook;
	 static XSSFSheet Sheet1;
	 static XSSFSheet Sheet2;
	 static WebElement element = null;
	private static WebDriver driver = null;
	String[] args;	
	 
    @BeforeTest
    public static void getwebsite() throws IOException {
    	XSSFWorkbook workbook = new XSSFWorkbook("C:/Users/Lenovo/git/seleniumjavaframework1/SeleniumJavaFrameWork/Excel/Data.xlsx.xlsx");
    	XSSFSheet Sheet1 = workbook.getSheet("Sheet1");
    	XSSFSheet Sheet2 = workbook.getSheet("Sheet2");
    	
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/vendor/chrome/chromedriver_win32/chromedriver.exe");
 		driver = new ChromeDriver();
 		driver.get("https://magento2demo.rootways.com/");
 		driver.manage().window().maximize();
    }
    	
	@org.testng.annotations.Test
	public void Test() {
	
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
        try {
        	 workbook = new XSSFWorkbook("C:/Users/Lenovo/git/seleniumjavaframework1/SeleniumJavaFrameWork/Excel/Data.xlsx.xlsx");
        	 Sheet1 = workbook.getSheet("Sheet1");
        	 Sheet2 = workbook.getSheet("Sheet2");
        WebElement ele1,ele2,ele3,ele4;
		ele1 = driver.findElement(By.xpath("//li[@class='nav-1 category-item']//a[@href='https://magento2demo.rootways.com/halfwidth.html']"));
		String actual1 =  ele1.getText();
		ele2 = driver.findElement(By.xpath("//li[@class='nav-1-1 category-item']//a[@href='https://magento2demo.rootways.com/half-width/domande-giudiziali.html']//span[.='Domande giudiziali']"));
		String actual2 =  ele2.getText();
		ele3 = driver.findElement(By.xpath("//li[@class='nav-1-1-1 category-item']//a[@href='https://magento2demo.rootways.com/half-width/domande-giudiziali/domande-giudiziali-1.html']/span[.='Domande giudiziali 1']"));
		String actual3 =  ele3.getText();
		ele4 =  driver.findElement(By.xpath("//li[@class='nav-1-1-1-3 category-item']//a[@href='https://magento2demo.rootways.com/half-width/domande-giudiziali/domande-giudiziali-1/testing.html']/span[.='testing']"));
		String actual4 =  ele4.getText(); 
		Actions doAction = new Actions(driver);
		Thread.sleep(20000);
		
	
		doAction.moveToElement(ele1).build().perform();
		Assert.assertTrue(actual1.contains("HALF"));
		String cellData1 = Sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Excepted value to be clicked is: "+ cellData1 +",      Actual value: "+ actual1 );
		assertEquals(actual1,cellData1);
		Thread.sleep(20000);
		
		doAction.moveToElement(ele2).build().perform();
		Assert.assertTrue(ele2.getText().contains("Domande giudiziali"));
		String cellData2 = Sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Excepted dropdown value after clicking the half option: "+ cellData2 +",       Actual value: "+ actual2 );
		assertEquals(actual2,cellData2);
		Thread.sleep(2000);
		
		doAction.moveToElement(ele3).build().perform();
		Assert.assertTrue(ele3.getText().contains("Domande giudiziali 1"));
		String cellData3 = Sheet1.getRow(1).getCell(2).getStringCellValue();
		System.out.println("Excepted dropdown value after clicking the Domande giudiziali: "+ cellData3 +",      Actual value: "+ actual3 );
		assertEquals(actual3,cellData3);
		Thread.sleep(2000);
		
		
		doAction.moveToElement(ele4).build().perform();
		Assert.assertTrue(ele4.getText().contains("testing"));
		String cellData4 = Sheet1.getRow(1).getCell(3).getStringCellValue();
		System.out.println("Excepted dropdown value after clicking the Domande giudiziali1 is: "+ cellData4 +",       Actual value: "+ actual4 );
		assertEquals(actual4,cellData4);
		Thread.sleep(4000);

		
	// scenorio2
        
	   Thread.sleep(20000);
	    driver.navigate().refresh();
	   Thread.sleep(5000);
	
	   WebElement ele5,ele6,ele7;
	   ele5 = driver.findElement(By.xpath("//li[@class='nav-1 category-item']//a[@href='https://magento2demo.rootways.com/halfwidth.html']"));
	   ele6 = driver.findElement(By.xpath("//li[@class='nav-1-3 category-item']//a[@href='https://magento2demo.rootways.com/half-width/office-desk.html']/span[.='Office Desk']"));
	   ele7 = driver.findElement(By.xpath("//li[@class='nav-1-3-1 category-item']//a[@href='https://magento2demo.rootways.com/half-width/office-desk/bathroom-furniture.html']/span[.='Bathroom Furniture']"));
	   String actual7 =  ele7.getText(); 
	   
	   Thread.sleep(20000);
	   doAction.moveToElement(ele5).build().perform();
	   Assert.assertTrue(ele5.getText().contains("HALF"));
	   Thread.sleep(2000);
	   doAction.moveToElement(ele6).build().perform();
	   Assert.assertTrue(ele6.getText().contains("Office Desk"));
	   Thread.sleep(2000);
	   doAction.moveToElement(ele7).build().perform();
	   Assert.assertTrue(ele7.getText().contains("Bathroom Furniture"));
	   String cellDataInSheet2 = Sheet2.getRow(1).getCell(0).getStringCellValue();
	   System.out.println("Excepted dropdown value after clicking the Domande giudiziali1 in scenorio2 is: "+ cellDataInSheet2 +",    Actual value: "+ actual7 );
	   assertEquals(actual7,cellDataInSheet2);
	   Thread.sleep(2000);
	
	}
	catch(Exception exp) {
			System.out.println(exp.getMessage());;
		    exp.printStackTrace(); }
	}
    
	  }
        
	@AfterTest()
	public void tearDown()
	{
		driver.close();
	}
	
        
        
        
private static void assertEquals(String actual1, String cellData1) {
		// TODO Auto-generated method stub
		
	}
}





		
	

			
    
    	




