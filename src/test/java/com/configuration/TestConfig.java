package com.configuration;

import org.openqa.selenium.WebDriver;

import com.automationPractice.BaseTest.BaseTest;

public class TestConfig {

	 
	  public WebDriver selenium()
	  {
		return BaseTest.getInstance().getDriver();  
	  }
 
}
