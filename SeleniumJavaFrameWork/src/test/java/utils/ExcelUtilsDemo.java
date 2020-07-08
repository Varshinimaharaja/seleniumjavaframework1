package utils;

public class ExcelUtilsDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		ExcelUtils excel = new ExcelUtils("C:/Users/Lenovo/workspace/SeleniumJavaFrameWork/Excel/Data.xlsx.xlsx", "Sheet1");
	    extracted(excel);
        ExcelUtils.getRowCount(0, 0);	
	}

	private static void extracted(ExcelUtils excel) {
		ExcelUtils.getCellData(0, 0);
	}
	

}
