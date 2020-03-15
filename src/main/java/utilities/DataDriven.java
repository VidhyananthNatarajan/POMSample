package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static String [][] readexcelData(String fileName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wBook = new XSSFWorkbook("./Testdata/"+fileName+"");
		//XSSFWorkbook wBook = new XSSFWorkbook("src\\main\\java\\utilities\\CreateLead.xlsx")
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		String [][] data = new String[rowcount][colcount];
		for (int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0;j<colcount;j++) {
				XSSFCell cell = row.getCell(j);
				String cellvalue =cell.getStringCellValue();
				data[i-1][j] =cellvalue;
				
				
				}
				
			}
		
		
		wBook.close();
		return data;
		
	}

}
