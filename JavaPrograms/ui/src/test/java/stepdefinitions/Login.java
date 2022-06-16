package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ETTPage;
import pages.LoginPage;

public class Login {
	public BaseDriver baseDriver;
	public LoginPage loginPage;
	public ETTPage ettPage;
	public ExtentTest test;
	
	public Login(BaseDriver picobaseDriver) {
		baseDriver=picobaseDriver;
		loginPage=new LoginPage(baseDriver.driver);
		ettPage=new ETTPage(baseDriver.driver);
		test=baseDriver.test;
	}
	
	@Given("I navigate to login page")
	public void iNavigateToLoginPage() {
		test.info("Enter the url");
		baseDriver.driver.get("https://demo.actitime.com/login.do");
	}
	@When("I enter {string} as username")
	public void iEnterAsUsername(String un) {
		test.info("Enter the username:"+un);
		loginPage.setUserName(un);
	}
	@When("I enter {string} as password")
	public void iEnterAsPassword(String pw) {
		test.info("Enter the password:"+pw);
		loginPage.setPassword(pw);
	}
	@When("I click on login button")
	public void iClickOnLoginButton() {
		test.info("click login button");
		loginPage.clickLoginButton();
	}
	@Then("I should see home page")
	public void iShouldSeeHomePage() {
		boolean result = ettPage.verifyHomePageIsDisplayed("Enter");
		if(result)
		{
			test.pass("Hompage is Displayed");
		}
		else
		{
			test.fail("Hompage is Not Displayed");
		}
		assert result; 
	}



}
