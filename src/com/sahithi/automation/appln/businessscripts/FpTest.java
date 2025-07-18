package com.sahithi.automation.appln.businessscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sahithi.automation.base.BaseTest;
import com.sahithi.automation.customisedexceptions.FramworkException;
import com.sahithi.automation.utilities.PojoReader;

public class FpTest extends BaseTest{
	@Test
	public void fpTest() throws FramworkException, IOException {
		/*getDriver().get("https://www.flipkart.com");
 
		WebElement nxt= getDriver().findElement(By.id("java"));
		 nxt.click();*/
		 getDriver().get(PojoReader.getConPr().getValue("fb_url"));

	}
}
