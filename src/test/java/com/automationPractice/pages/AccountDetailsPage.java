package com.automationPractice.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationPractice.seleniumUtilities.SeleniumWebElements;
import com.configuration.PageConfiguration;

public class AccountDetailsPage extends PageConfiguration {


	@FindBy (xpath = "//input[@id='firstname']")
	private WebElement txt_firstname ;
	
	@FindBy (xpath = "//input[@id='lastname']")
	private WebElement txt_lasttname ;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement txt_email ;
	
	public AccountDetailsPage(WebDriver driver) {
		super(driver);
		pageFactoryInitialize(this);
	}
	
	public void verifyProfiileDetails()
	{ 
		Assert.assertEquals( "Kiran", txt_firstname.getAttribute("value"));
		Assert.assertEquals( "Kale", txt_lasttname.getAttribute("value"));
		Assert.assertEquals( "test001122@gmail.com", txt_email.getAttribute("value"));
		System.out.println("Details verified successfully....");
		
	}
	
}
