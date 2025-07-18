package com.sahithi.automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTC implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		return false;
	}

}
