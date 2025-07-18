package com.sahithi.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadProg1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fip = new FileInputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\src\\com\\sahithi\\automation\\appln\\testdata\\TestData .xlsx");
		
		Workbook workbook = WorkbookFactory.create(fip); 
	    Sheet sheet= workbook.getSheet("Gmail_Data");
			
		for(int i=0; i<=sheet.getLastRowNum(); i++) {	
			Row row=sheet.getRow(i);
			
			for(int j=0; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);
				if(cell.getCellType()==CellType.NUMERIC) {
					double val= cell.getNumericCellValue();
					System.out.println(val);
				}
				else if(cell.getCellType()==CellType.STRING) {
					String val= cell.getStringCellValue();
					System.out.println(val);
				}
				else if(cell.getCellType()==CellType.BOOLEAN) {
					boolean val= cell.getBooleanCellValue();
					System.out.println(val);
				}
			}
		}
		
		
	}
}


