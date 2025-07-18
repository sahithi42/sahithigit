package com.sahithi.automation.utilities;

import com.sahithi.automation.base.BaseTest;

public interface DriverPaths {
	
	String edgeKey = "webdriver.edge.driver";
	String edgeValue =BaseTest.getCurDir()+"\\Drivers\\edgedriver.exe";

	String chromeKey = "webdriver.chrome.driver";
	String chromeValue = BaseTest.getCurDir()+"\\Drivers\\chromedriver.exe";

	String firefoxKey = "webdriver.gecko.driver";
	String firefoxValue = BaseTest.getCurDir()+"\\Drivers\\geckodriver.exe";

}
