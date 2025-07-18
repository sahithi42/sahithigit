package com.sahithi.automation.listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.sahithi.automation.utilities.ScreenshotUtility;

public class TCActivityListenerAdapter extends TestListenerAdapter {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TC execution is started :"+result.getName());
		}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC execution is success :"+result.getName());
		}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC execution is failed :"+result.getName());
		String exceptionMsg = result.getThrowable().toString();
		System.out.println(exceptionMsg);
		try {
			ScreenshotUtility.takesScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC is skipped :"+result.getName());
		String exceptionMsg = result.getThrowable().toString();
		System.out.println(exceptionMsg);
		try {
			ScreenshotUtility.takesScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		}
}
