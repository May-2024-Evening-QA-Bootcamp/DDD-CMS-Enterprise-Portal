package dddUtils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import dataTestObject.User;

public class ExcelUtility {
	String fileName;
	String sheetName;
	// created getter method with below 2
	private Workbook workbook;
	private Sheet sheet;
	
	public ExcelUtility(String fileName, String sheetName) {
		init(fileName, sheetName);
	}
	
	private void init (String fileName, String sheetName) {
		try {
			InputStream iStream = getClass().getClassLoader().getResourceAsStream(fileName);
			workbook = WorkbookFactory.create(iStream);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Map<Object, Object>> getData(){
		int totalRows = sheet.getLastRowNum();
		List<Map<Object, Object>> sheetData = new ArrayList<Map<Object,Object>>();
		
		for(int i = 1; i <= totalRows; i++) {
			Row row = sheet.getRow(i);
			Map<Object, Object> rowMap = new LinkedHashMap<Object, Object>();
			
			for(int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				
				if(cell != null) {
					String key = sheet.getRow(0).getCell(j).getStringCellValue();
					Object value = null;
					
					if(cell.getCellType() == CellType.NUMERIC) {
						value = (int) cell.getNumericCellValue();
					}else if(cell.getCellType() == CellType.STRING) {
						value = cell.getStringCellValue();
					}else if(cell.getCellType() == CellType.BOOLEAN) {
						value = cell.getBooleanCellValue();
					}					
					rowMap.put(key, value);
				}
			}
			
			if(rowMap.get("Execute") != null) {
				if(String.valueOf(rowMap.get("Execute")).toLowerCase().trim().equalsIgnoreCase("y")) {
					sheetData.add(rowMap);
				}
			}			
		}		
		return sheetData;
	}
	
	private String getValue(Map<Object, Object> map, String key) {
		String value = "";
		try {
			value = map.get(key).toString();
		}catch (NullPointerException e) {
		}
		return value;
	}
	
	public List<User> getUsers(){
		List<User> listOfUsers = new ArrayList<User>();
		
		List<Map<Object, Object>> dataMaps = getData();
		
		for(Map<Object, Object> map : dataMaps) {
			User user = new User(getValue(map, "UserId"), getValue(map, "Password"));
			listOfUsers.add(user);		
		}		
		return listOfUsers;
	}
	
	
	// getter method from 2 private variable from the top
	public Workbook getWorkbook() {
		return workbook;
	}

	public Sheet getSheet() {
		return sheet;
	}


}
