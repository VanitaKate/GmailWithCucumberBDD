package Configurations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConnectivity {

	FileInputStream fis;
	XSSFWorkbook WB;
	XSSFSheet sheet;
	String projPath= System.getProperty("user.dir");
	File src= new File("C:\\Users\\Administrator\\eclipse-workspace\\SimpleCucumber\\TestData\\TestData.xlsx");

	public String getCellData(String sheetName,int rowNum,int columnNum) {
		try {
			fis=new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			WB= new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sheet=WB.getSheet(sheetName);
		int totalRows=sheet.getPhysicalNumberOfRows();
		System.out.println("total Rows are: "+totalRows);
		int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
		String cellData=sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
		System.out.println("cell Data is : "+cellData);
		return cellData;		
	}

	public int getRowCount(String excelPath, String sheetName) throws IOException {
		File src= new File(excelPath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook WB= new XSSFWorkbook(fis);
		XSSFSheet sheet=WB.getSheet(sheetName);
		int totalRows=sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of rows are: "+totalRows);
		return totalRows;

	}
	public int getColumnCount(String excelPath, String sheetName) throws IOException {
		File src= new File(excelPath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook WB= new XSSFWorkbook(fis);
		XSSFSheet sheet=WB.getSheet(sheetName);
		int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total no. of columns are: "+totalColumns);

		return totalColumns;

	}
}


