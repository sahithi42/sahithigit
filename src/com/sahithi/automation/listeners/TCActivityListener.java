package com.sahithi.automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sahithi.automation.utilities.ScreenshotUtility;

public class TCActivityListener implements ITestListener {

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
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		}
	@Override
	public void onStart(ITestContext result) {
		System.out.println("suite execution is started");
		}
	@Override
	public void onFinish(ITestContext result) {
		System.out.println("suite excetion is completed");
		}
	
}
