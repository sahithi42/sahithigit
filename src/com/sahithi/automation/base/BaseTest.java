package com.sahithi.automation.base;
 

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.sahithi.automation.utilities.DriverPaths;
import com.sahithi.automation.utilities.ScreenshotUtility;

public class BaseTest {
	  private static WebDriver driver;
	  private static String curDir;
	  private static  String tcName;
    @Parameters("browser")
	@BeforeSuite
	public void openBrowser(@Optional("chrome")String browser) {
		 curDir=System.getProperty("user.dir");
      if(browser.equalsIgnoreCase("chrome")) {
          System.setProperty(DriverPaths.chromeKey,DriverPaths.chromeValue);
          ChromeOptions options= new ChromeOptions();
          options.addArguments("--remote-allow-origins=*");       
          driver= new ChromeDriver(options);
        init();
      }
      else if (browser.equalsIgnoreCase("firefox")) {
    	  System.setProperty(DriverPaths.firefoxKey, DriverPaths.firefoxValue);
          driver= new FirefoxDriver();
          init();
    
      }
      else if (browser.equalsIgnoreCase("edge")) {
    	  System.setProperty(DriverPaths.edgeKey, DriverPaths.edgeValue);
        driver= new EdgeDriver();
        init();
      }
    
	}
	private void init(){
	     driver.manage().window().maximize();
         driver.manage().deleteAllCookies(); 
	}
	
	@AfterSuite
	public void closeBrowser(){
		if(driver!=null) {
			driver.close();
		}
		else {
			
			System.out.println("driver is pointing to null"); 
		}
	}
	
	/*@BeforeMethod
	public void beforeTCExecution(Method method) {
		tcName=method.getName();
		System.out.println("Current TC Executed is:"+tcName);
	}
	
	@AfterMethod
	public  void afterTCExecution(ITestResult results) throws IOException  {
		if(results.getStatus()==ITestResult.SUCCESS) {
		System.out.println("TC is passed:"+ results.getName());
		}
	else if (results.getStatus()==ITestResult.FAILURE) {
			System.out.println("TC is failed:"+ results.getName());
		   String exceptionMsg=results.getThrowable().toString();   
		   System.out.println("   "+exceptionMsg);
		   ScreenshotUtility.takesScreenshot();
	}
	else if (results.getStatus()==ITestResult.FAILURE) {
		
		System.out.println("TC is skipped:"+ results.getName());
		   String exceptionMsg=results.getThrowable().toString();
		   System.out.println("   "+exceptionMsg); 
		   ScreenshotUtility.takesScreenshot();
       }
	} */
    public static WebDriver getDriver(){
	return driver;
		 
	}
	public static String getCurDir() { 
		return curDir;
	}
	public static String getTcName() {
		return tcName;
	}
}
 