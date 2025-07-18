package com.sahithi.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sahithi.automation.base.BaseTest;

public interface ScreenshotUtility {

	public static String takesScreenshot() throws IOException {
		 TakesScreenshot   takesScreenshot = (TakesScreenshot) BaseTest.getDriver(); 
			File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
			String imagePath=BaseTest.getCurDir()+"\\Screenshots\\"+BaseTest.getTcName()+".png.";
			FileUtils.copyFile(file, new File(imagePath));  
			return imagePath;
			
	}
	public static String takesScreenshot(String tcName) throws IOException {
		 TakesScreenshot   takesScreenshot = (TakesScreenshot) BaseTest.getDriver(); 
			File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
			String imagePath=BaseTest.getCurDir()+"\\Screenshots\\"+tcName+".png.";
			FileUtils.copyFile(file, new File(imagePath)); 
			return imagePath;
			
	}
}
