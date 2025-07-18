package com.sahithi.automation.appln.objectrepository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesProg {

	public static void main(String[] args) throws IOException {
		
FileInputStream fip= new FileInputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\config.properties");
		
		/*loading file*/ Properties  properties = new  Properties(); 
		 
		 properties.load(fip);
		 
		 properties.setProperty("java", "practice");

		 properties.setProperty("selenium", "hardwork");
		
		 properties.setProperty("job", "subject");
		
		 properties.setProperty("company", "nmc");
		 
		 properties.put("jobs", "subject");
		
		/*save file*/ FileOutputStream fop= new  FileOutputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\config.properties");
		properties.store(fop, "file is successfully saved");
		
		
		
		
		/*File file = new File("C:\Users\sahit\eclipse-workspace\framework9\config.properties");
			FileInputStream fip= new FileInputStream(file);
		
		//FileInputStream fip= new FileInputStream(new File("C:\Users\sahit\eclipse-workspace\framework9\config.properties");
	
		location of file FileInputStream fip= new FileInputStream("C:\\Users\\sahit\\eclipse-workspace\\framework9\\config.properties");
		
		loading file Properties  properties = new  Properties(); 
		 
		 properties.load(fip);
		String prod_url_val= properties.getProperty("prod_url");
		System.out.println(prod_url_val);
		
		String qa_url_val= properties.getProperty("qa_url");
		System.out.println(qa_url_val);
		
		String prod_un_val= properties.getProperty("prod_un");
		System.out.println(prod_un_val);
		
		String prod_pwd_val= properties.getProperty("prod_pwd");
		System.out.println(prod_pwd_val);
		
		String qa_un_val= properties.getProperty("qa_un");
		System.out.println(qa_un_val);
		
		String qa_pwd_val= properties.getProperty("qa_pwd");
		System.out.println(qa_pwd_val);
		
		String prod_url_vall= properties.getProperty("prod_urll456", "hello");
		System.out.println(prod_url_vall);//Programmer specified default val
		
		String str1=(String) properties.get("prod_url");
		System.out.println(str1);*/

	}

}

