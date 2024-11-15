package dddUnitTest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelReadingTest {
	@Test
	// workbook and excel sheet is same
	// we got value of a cell from this below method
	public void readDataByInputStream() throws EncryptedDocumentException, IOException {
		// Alternate of Input Stream is by showing File location
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("loginDataMay2024.xlsx");
		// make sure you choose the .ss one
		Workbook workbook = WorkbookFactory.create(inputStream);
		// make sure you choose the .ss one
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		System.out.println(cell.getStringCellValue());	
	}
	
	@Test
	// we got values of a row from the below method
	public void readDataByFile() throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\Tofael\\eclipse-workspace\\may2024.gov.cms.portal\\src\\test\\resources\\loginDataMay2024.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		// int a = row.getPhysicalNumberOfCells(); // avoid null value, so we choose the below method
		int totalCell = row.getLastCellNum();
		System.out.println("Total cells : " + totalCell);
		
		List<Object> rowData = new ArrayList<Object>();
		
		for (int i = 0; i < totalCell; i++) {
			Cell cell = row.getCell(i);
			// in excel sheet, reader read as a String, but if we have int data then we have to cast it
			if (cell != null) {
				if (cell.getCellType() == CellType.NUMERIC) {
					rowData.add((int) cell.getNumericCellValue()); // cast by int (int)
				} else {
					rowData.add(cell.getStringCellValue());
				}
			} else {
				rowData.add(cell); // it will add null
			}
		}
		System.out.println(rowData);			
	}
	
	@Test
	public void readDataByMap() throws EncryptedDocumentException, IOException {
		// File file = new File("C:\\Users\\Tofael\\eclipse-workspace\\february.gov.cms.portal\\src\\test\\resources\\loginData.xlsx");
		// Workbook workbook = WorkbookFactory.create(file);
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("loginDataMay2024.xlsx");
		Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		System.out.println("Total rows : " + totalRows);
		
		List<Map<Object, Object>>sheetData = new ArrayList<Map<Object, Object>>();
		
		// why count start from 1? because 0 contain header [userid and password]
		for(int i = 1; i<=totalRows; i++) {
			Row row = sheet.getRow(i);
			
			// why we used LinkedHashMap? to get data index wise, only Hashmap choose data randomly
			// We write Object? because we can retrieve various data type like String, int, boolean
			Map<Object, Object> rowMap = new LinkedHashMap<>();
			
			for(int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				
				if(cell != null) {
					// TODO: @Nasir to discuss next 2 lines
					Object key = sheet.getRow(0).getCell(j).getStringCellValue(); // to read header
					Object value = null;
					
					if(cell.getCellType() == CellType.NUMERIC) {
						value = (int) cell.getNumericCellValue();
					}else if(cell.getCellType() == CellType.STRING) {
						value = cell.getStringCellValue();
					}else if(cell.getCellType() == CellType.BOOLEAN) {
						value = cell.getBooleanCellValue();
					} 
					// we add data in Map by put() method
					rowMap.put(key, value);
				} 
				
			}
			
			if(rowMap.get("Execute") != null) {
				if(String.valueOf(rowMap.get("Execute")).trim().equalsIgnoreCase("y")) {
					sheetData.add(rowMap);
				}
			}
			
		}
		// Java lambda is used
		sheetData.forEach(System.out::println);
		// To find out one row by get method of Map
		// System.err.println(sheetData.get(0).get("Password"));
		// err represent error outcome as printed red color
		
		
		
	}
	
	
	
	
	

}
