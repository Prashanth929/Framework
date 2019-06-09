package com.CapsuleApplication.Utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataGenerator 
{
	static Workbook book;
	
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	private static String ExelPath="C:\\Users\\User\\eclipse-workspace\\CapsuleApplication\\src\\main\\java\\com\\CapsuleApplication\\TestData\\Information.xlsx";
	
	public static Object[][] getTestData(String sheetName)
	{
			try {
					FileInputStream file = new FileInputStream(ExelPath);
					book = WorkbookFactory.create(file);
				} 
			catch (Exception e)
				{
					e.printStackTrace();
				}
					sheet = book.getSheet(sheetName);
					Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i < sheet.getLastRowNum(); i++) 
			{
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) 
				{
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				}
			}
		return data;
	}
}
