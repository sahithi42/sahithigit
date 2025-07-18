package com.sahithi.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadProg {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		/*File file= new File("C:\\Users\\sahit\\eclipse-workspace\\framework9\\src\\com\\sahithi\\automation\\appln\\testdata\\TestData (2).xlsx");
		FileInputStream fip = new FileInputStream(file);*/
		
		FileInputStream fip = new FileInputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\src\\com\\sahithi\\automation\\appln\\testdata\\TestData .xlsx");
		
		Workbook workbook = WorkbookFactory.create(fip); //Workbook vasthadi excel file
		int noofSheets=workbook.getNumberOfSheets();
			System.out.println("No of sheets :"+noofSheets);
		
		List list=workbook.getAllNames();
		System.out.println(list);
		
		int activeSheet=workbook.getActiveSheetIndex();
		System.out.println("active sheet is :"+ activeSheet);
		
	/*Sheet sheet0=workbook.getSheetAt(0);
		System.out.println(sheet0);*/
		
		Sheet sheet = workbook.getSheet("Gmail_data");
		int noofRows=sheet.getLastRowNum();
		System.out.println("noof rows in a sheet is :"+ noofRows);
		
		Row row0=sheet.getRow(0);
		int row0CellCount = row0.getLastCellNum();
		System.out.println("row0CellCount is :"+row0CellCount);
		
		Cell cell00= row0.getCell(0);
		String cell00Value = cell00.getStringCellValue();
		System.out.println("0th row 0th cell data is :"+cell00Value);
		
		Cell cell01= row0.getCell(1);
		String cell01Value = cell01.getStringCellValue();
		System.out.println("0th row 1st cell data is :"+cell01Value);
		
		
		Cell cell02= row0.getCell(2);
		String cell02Value = cell02.getStringCellValue();
		System.out.println("0th row 2th cell data is :"+cell02Value);
		
		Row row1=sheet.getRow(1);
		int row1CellCount = row1.getLastCellNum();
		System.out.println("row1CellCount is :"+row1CellCount);
		
	}

}
