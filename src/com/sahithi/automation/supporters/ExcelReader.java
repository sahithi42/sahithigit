package com.sahithi.automation.supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sahithi.automation.customisedexceptions.FramworkException;

public class ExcelReader {
	private String filePath;
	private FileInputStream  fileInputStream;
	private 	Workbook workbook;
	private int indx ;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	private String cellValue;
	
	
public ExcelReader(String filePath) throws  IOException {
	  fileInputStream = new FileInputStream(filePath);
	 workbook= WorkbookFactory.create(fileInputStream);
}

public Sheet getSheetObj(String how, String howValue) throws FramworkException {
	if(workbook!=null) {
		if(how.equalsIgnoreCase("sheetname")) {
			sheet = workbook.getSheet(howValue);
		}
		else if(how.equalsIgnoreCase("index")) {
			int indx = Integer.parseInt(howValue);
			sheet = workbook.getSheetAt(indx);
		}
	}
	else {
		FramworkException exception = new FramworkException("workbook  is pointing to null");
		throw exception;
}
	return sheet;

}
public String getCellData(String how, String howValue,int rowNum,int cellNum) throws FramworkException{
	sheet =getSheetObj(how,howValue);
	if(sheet!=null) {
		row = sheet.getRow(rowNum);
		if(row!=null) {
			cell=row.getCell(cellNum);
			if(cell!=null) {
				if(cell.getCellType()==CellType.BOOLEAN) {
					cellValue=cell.getBooleanCellValue()+"";
				}
				else if(cell.getCellType()==CellType.STRING) {
					cellValue=cell.getStringCellValue();
					
				}
					
				else if(cell.getCellType()==CellType.NUMERIC) {
					cellValue=cell.getNumericCellValue()+"";
					
				}
				
			}
			else {
				FramworkException exception = new FramworkException("cell object is pointing to null");
				throw exception;
			}

		}
		else {
			FramworkException exception = new FramworkException("row object is pointing to null");
			throw exception;
		}

		
	}
	else {
		FramworkException exception = new FramworkException("sheet object is pointing to null");
		throw exception;
	}
	return cellValue;

}
public List<String>  getRowData(String how, String howValue,int rowNum) throws FramworkException{
	List<String> rowData = new ArrayList<String>();
	sheet =getSheetObj(how,howValue);
	if(sheet!=null) {
		row = sheet.getRow(rowNum);
		if(row!=null) {
		for(int i=0; i<=row.getLastCellNum();i++) {
			cell=row.getCell(i);
			if(cell!=null) {
				if(cell.getCellType()==CellType.BOOLEAN) {
					cellValue=cell.getBooleanCellValue()+"";
					rowData.add(cellValue);
				}
				else if(cell.getCellType()==CellType.STRING) {
					cellValue=cell.getStringCellValue();
					rowData.add(cellValue);
				}
					
				else if(cell.getCellType()==CellType.NUMERIC) {
					cellValue=cell.getNumericCellValue()+"";
					rowData.add(cellValue);
					
				}
				
			}
			else {
				FramworkException exception = new FramworkException("cell object is pointing to null");
				throw exception;
			}

		}
	
		}
		
		else {
			FramworkException exception = new FramworkException("row object is pointing to null");
			throw exception;
		}

		
	}
	else {
		FramworkException exception = new FramworkException("sheet object is pointing to null");
		throw exception;
	}

return rowData;

}
public List<String> getSheetData(String how,String howValue) throws FramworkException {
List<String> sheetData= new ArrayList<String>();
sheet=getSheetObj(how,howValue);
return sheetData;

}



public static void main(String[] args) throws IOException, FramworkException {
	ExcelReader er = new ExcelReader("TestData.xlsx");
	er.getSheetObj("index","0");
	

}

}

