package com.sahithi.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
	
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriteProg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
FileInputStream fip = new FileInputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\src\\com\\sahithi\\automation\\appln\\testdata\\TestData .xlsx");
		
		Workbook workbook = WorkbookFactory.create(fip); 
		Sheet sheet = workbook.getSheet("Gmail_data");
		
		Row row0 = sheet.getRow(0)	;
		
		Cell cell03 = row0.createCell(3);
		
		cell03.setCellValue("subject");
		
		Row row4 = sheet.createRow(4);
		Cell cell40=row4.createCell(0);
		cell40.setCellValue("hardwork");
		
		Cell cell41 = row4.createCell(1);
		cell41.setCellValue("jobb");
		
		//to save file
		FileOutputStream fop= new FileOutputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\src\\com\\sahithi\\automation\\appln\\testdata\\TestData .xlsx");
		workbook.write(fop); //to safe file
		workbook.close();
		
	}

}
