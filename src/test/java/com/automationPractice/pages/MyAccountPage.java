package com.automationPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationPractice.seleniumUtilities.SeleniumWebElements;
import com.configuration.PageConfiguration;

public class MyAccountPage extends PageConfiguration {

	@FindBy (xpath = "//span[text()='My personal information']")
	private WebElement personalInfo ;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		pageFactoryInitialize(this);
	}
	
	public void clickOnMyPersonalInfo()
	{
		try {
			SeleniumWebElements.clickOnElement(personalInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
