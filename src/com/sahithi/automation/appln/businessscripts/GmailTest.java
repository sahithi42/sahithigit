package com.sahithi.automation.appln.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sahithi.automation.base.BaseTest;
import com.sahithi.automation.customisedexceptions.FramworkException;
import com.sahithi.automation.utilities.PojoReader;

public class GmailTest extends BaseTest{
String	cell00Value="";
	@Test                                                                                                   
	public void gmailTest() throws IOException, FramworkException {
		
		/*FileInputStream fipConf=new FileInputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\config.properties");
		Properties prConf = new Properties();
		prConf.load(fipConf);
		String url=prConf.getProperty("prod_url");*/
		
		//String url=PojoReader.getConPr().getValue("prod_url");
		//getDriver().get(url);
		FileInputStream fip=new FileInputStream("C:\\\\Users\\\\sahit\\\\eclipse-workspace\\\\framework9\\\\src\\\\com\\\\sahithi\\\\automation\\\\appln\\\\testdata\\\\TestData .xlsx");
		Workbook workbook =WorkbookFactory.create(fip);
		Sheet sheet = workbook.getSheet("Gmail_data");
		Cell cell00= sheet.getRow(0).getCell(0);
		if(cell00.getCellType()==CellType.NUMERIC) {
			cell00Value = cell00.getStringCellValue()+"";
		}
		else if(cell00.getCellType()==CellType.STRING) {
			cell00Value = cell00.getStringCellValue()+"";
		
		}
		else if(cell00.getCellType()==CellType.BOOLEAN) {
			cell00Value= cell00.getBooleanCellValue()+"";
			
		}
		
		getDriver().get(PojoReader.getConPr().getValue("prod_url"));
		
	/*	FileInputStream fipOR=new FileInputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\src\\com\\sahithi\\automation\\appln\\objectrepository\\or_gmail.properties");
		Properties prOR= new Properties();
		prConf.load(fipOR);
		String unId=prOR.getProperty("un_id"); 
		String nxtId=prOR.getProperty("nxt_id");*/
	
		
 WebElement un = getDriver().findElement(By.id(PojoReader.getOrPr().getValue("un_id")));
 un.clear();
 
 
 
 
 un.sendKeys("sahithim66@gmail.com");
 
 WebElement nxt= getDriver().findElement(By.id(PojoReader.getOrPr().getValue("nxt_id")));
 nxt.click();
 
	}

}
