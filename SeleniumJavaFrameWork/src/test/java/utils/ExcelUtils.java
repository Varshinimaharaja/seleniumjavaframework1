package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 static XSSFWorkbook workbook;
	 static XSSFSheet sheet;
	 
	 public ExcelUtils(String excelPath, String sheetName){
		 try{
			 
		 workbook = new XSSFWorkbook("C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/Excel/Data.xlsx.xlsx");
	     sheet = workbook.getSheet("Sheet1");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 
	 }
	 public static void main(String[] args) throws IOException {
		getRowCount(0, 0);
		getCellData(0, 0);
	}
	
	public static void getRowCount(int rowNum, int colNum) {
		try {
			
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows in excel "+rowCount);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());;
		    exp.printStackTrace();
		    
		    
		}
		
		}
	
	public static void getCellData(int rowNum, int colNum) {

		 String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("no of rows in excel "+cellData);
			
			

	}

}
