package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {

		ExcelUtils excel = new ExcelUtils("C:/Users/Lenovo/git/seleniumjavaframework1/SeleniumJavaFrameWork/Excel/MenuList1.xlsx", "Scenorio1st");
	    extracted(excel);
        ExcelUtils.getRowCount(0, 0);	
	}

	private static void extracted(ExcelUtils excel) {
		ExcelUtils.getCellData(0, 0);
	}
	

}
