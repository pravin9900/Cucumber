package com.automationPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.configuration.PageConfiguration;

public class CreateAccountPage extends PageConfiguration{


	@FindBy (xpath = "//input[@id='email_create']")
	private WebElement txt_email ;
	
	@FindBy (xpath = "//button[@id='SubmitCreate']")
	private WebElement createAccount_Btn ;
	
	@FindBy (xpath = "//label[contains(.,'Mr.')]")
	private WebElement gender_Rbtn ;
	
	@FindBy (xpath = "//input[@id='customer_firstname']")
	private WebElement txt_Cus_firstname ;
	
	@FindBy (xpath = "//input[@id='customer_lastname']")
	private WebElement txt_Cus_lastname ;
	
	@FindBy (xpath = "//input[@id='passwd']")
	private WebElement txt_password ;
	
	@FindBy (xpath = "//input[@id='firstname']")
	private WebElement txt_firstname ;
	
	public CreateAccountPage(WebDriver driver)
	{
		super(driver);
		pageFactoryInitialize(this);
	}
	
	
}
