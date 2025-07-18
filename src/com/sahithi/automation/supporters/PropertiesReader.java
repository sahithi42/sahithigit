package com.sahithi.automation.supporters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.sahithi.automation.customisedexceptions.FramworkException;

public class PropertiesReader {

	private String filePath;
	private FileInputStream fileInputStream;
	private Properties properties ;
	private String value;
	
	
	
	public PropertiesReader(String filePath) throws IOException {
		this.filePath=filePath;
		
		fileInputStream =new FileInputStream(filePath);
		 properties = new Properties();
		properties.load(fileInputStream);
	}
	
	public String getValue(String key) throws FramworkException{
		if(properties!=null) {
			value = properties.getProperty(key);
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		return value;
	}
	
	public String getValue(String key, String defaultValue) throws FramworkException{
		if(properties!=null) {
			value = properties.getProperty(key);
			if(value==null) {
				value=defaultValue;
				
			}
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		return value;
	}
	
	public String getValue(Object key) throws FramworkException{
		if(properties!=null) {
			value = (String) properties.get(key);
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		return value;
	}
	
	public String getValue(Object key, Object defaultValue) throws FramworkException{
		if(properties!=null) {
			value = (String) properties.getOrDefault(key, defaultValue);
			if(value==null) {
				value=(String) defaultValue;
			}
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		return value;
	}
	
	public void writeKeyValue(String key, String value) throws IOException, FramworkException {
	if(properties!=null) {
	 properties.setProperty(key, value);
	 FileOutputStream  fileOutputStream=new  FileOutputStream(filePath);
	 properties.store(fileOutputStream, "File is saved succesfully");
	 
	}
	else {
		FramworkException exception = new FramworkException("properties object is pointing to null");
		throw exception;
	}
	
	}
	
	public void writeKeyValue(Object key, Object value) throws IOException, FramworkException {
		if(properties!=null) {
		 properties.put(key, value);
		 FileOutputStream  fileOutputStream=new  FileOutputStream(filePath);
		 properties.store(fileOutputStream, "File is saved succesfully");
		 
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		
		}
	
	
	public void removeKeyValue(String key, String value) throws IOException, FramworkException {
		if(properties!=null) {
		 properties.remove(key, value);
		 FileOutputStream  fileOutputStream=new  FileOutputStream(filePath); //save file
		 properties.store(fileOutputStream, "File is saved succesfully");
		 
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		
		}
	
	public void removeKey(String key ) throws IOException, FramworkException {
		if(properties!=null) {
		 properties.remove(key);
		 FileOutputStream  fileOutputStream=new  FileOutputStream(filePath);
		 properties.store(fileOutputStream, "File is saved succesfully");
		 
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		
		}
	
	public void removeValue( String value) throws IOException, FramworkException {
		if(properties!=null) {
		 properties.remove( value);
		 FileOutputStream  fileOutputStream=new  FileOutputStream(filePath);
		 properties.store(fileOutputStream, "File is saved succesfully");
		 
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		
		}
	
	public Set<String> getAllKeys() throws IOException, FramworkException {
		Set<String> keys = new HashSet<String>();
		
		if(properties!=null) {
		Set setKeys =properties.keySet();
		for(Object obj: setKeys) {
			String str = (String) obj;
			keys.add(str);
		}
		 FileOutputStream  fileOutputStream=new  FileOutputStream(filePath);
		 properties.store(fileOutputStream, "File is saved succesfully");
		 
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		return keys;
		
		}
	
	public List<String> getAllValues() throws IOException, FramworkException {
		List<String> values= new ArrayList<String>();
		
		if(properties!=null) {
		Set setKeys =properties.keySet();
		for(Object obj: setKeys) {
			String str = (String) obj;
		String val=(String) properties.get(str);
		values.add(val);
		}
		 FileOutputStream  fileOutputStream=new  FileOutputStream(filePath);
		 properties.store(fileOutputStream, "File is saved succesfully");
		 
		}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		}
		return values;
		
	}
	
	
	
	public Map<String, String> getAKeysValues() throws IOException, FramworkException {
		Map<String,String> keyvalues= new HashMap<String,String>();
		
		if(properties!=null) {
		Set setKeys =properties.keySet();
		for(Object obj: setKeys) {
			String str = (String) obj;
		String val=(String) properties.get(str);
		keyvalues.put(str, val);
		}
		 FileOutputStream  fileOutputStream=new  FileOutputStream(filePath);
		 properties.store(fileOutputStream, "File is saved succesfully");
		 
	}
		else {
			FramworkException exception = new FramworkException("properties object is pointing to null");
			throw exception;
		     }
		return keyvalues;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
