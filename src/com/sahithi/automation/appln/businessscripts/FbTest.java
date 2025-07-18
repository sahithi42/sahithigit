package com.sahithi.automation.appln.businessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sahithi.automation.base.BaseTest;
import com.sahithi.automation.customisedexceptions.FramworkException;
import com.sahithi.automation.utilities.PojoReader;

public class FbTest extends BaseTest{
	@Test
	public void fbTest() throws FramworkException, IOException {
		//getDriver().get("https://www.facebook.com");
		 //WebElement un = getDriver().findElement(By.id("job"));
		// un.clear();
	
		 getDriver().get(PojoReader.getConPr().getValue("fb_url"));
		 
		 
	}
}
