package com.sahithi.automation.utilities;

import java.io.IOException;

import com.sahithi.automation.supporters.PropertiesReader;

public class PojoReader {
      
	public static PropertiesReader getConPr() throws IOException {
		PropertiesReader conPropertiesReader = new PropertiesReader(FilePaths.confFile);
		return conPropertiesReader;
		
	}
	
    
	public static PropertiesReader getOrPr() throws IOException {
		PropertiesReader orPropertiesReader= new PropertiesReader(FilePaths.orFile);
		return orPropertiesReader;
		
	}
	
	
}
