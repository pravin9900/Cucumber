package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.automationPractice.BaseTest.BaseTest;
import com.automationPractice.pages.AccountDetailsPage;
import com.automationPractice.pages.HeaderPage;
import com.automationPractice.pages.LoginPage;
import com.automationPractice.pages.MyAccountPage;
import com.configuration.TestConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
 

public class LoginFunctionality extends TestConfig {

	WebDriver driver ;
	HeaderPage headerPage ;
	LoginPage loginPage ;
	MyAccountPage myAccountPage ;
	AccountDetailsPage accountDetailsPage;
	
	@Given("Open automation Practise website")
	public void open_automation_practise_website() {
		System.setProperty("webdriver.chrome.driver", "BrowserDrivers//chromedriver.exe");
		driver = BaseTest.getInstance().getDriver();
		selenium().get("http://automationpractice.com/index.php");
	}

	@Given("click on signin button")
	public void click_on_signin_button() {
		headerPage = new HeaderPage(selenium());
		try {
			headerPage.clickOnSignIn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("enter email address {string}  && password {string} in text box")
	public void enter_email_address_password_in_text_box(String string, String string2) {
		loginPage = new LoginPage(selenium());
		try {
			loginPage.enterLoginDetails(string, string2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("click on sign in Button")
	public void click_on_sign_in_button() {
		try {
			loginPage.clickOnSignIn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Verify the user logged in successfully or not")
	public void verify_the_user_logged_in_successfully_or_not() throws Exception {
		loginPage.validateErrorMessage();
		String actURL = selenium().getCurrentUrl();
		String expURL = "http://automationpractice.com/index.php?controller=my-account";
		
		if(actURL.contains(expURL))
		{
			Assert.assertEquals(expURL, actURL);
			System.out.println("User Login is successful...");
			myAccountPage = new MyAccountPage(selenium());
			myAccountPage.clickOnMyPersonalInfo();
			accountDetailsPage = new AccountDetailsPage(selenium());
			accountDetailsPage.verifyProfiileDetails();
			headerPage.clickOnSignOut();
		}
		
	}
	 
}
