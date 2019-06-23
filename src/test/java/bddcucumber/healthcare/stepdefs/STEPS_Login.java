package bddcucumber.healthcare.stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bddcucumber.healthcare.po.PO_Login;
import bddcucumber.managers.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class STEPS_Login {
	WebDriverManagerSingleton browserManager = WebDriverManagerSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	Scenario scn ;
	PO_Login PO_Login = PageFactory.initElements(driver, PO_Login.class);

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}
	
	@When("I enter user name as {string}")
	public void enter_user_name(String u) {
		PO_Login.SetUserName(u);
		scn.write("Entered Username: " + u);
	}

	@When("I enter password as {string}")
	public void enter_password(String p) {
		PO_Login.SetPassword(p);
		scn.write("Entered password: " + p);
	}

	@When("I click submit button")
	public void click_submit_button() {
		PO_Login.ClickSubmitButton();
		scn.write("Click Submit Button");
	}

	@Then("I should be logged in to the application with title as {string}")
	public void should_be_logged_in_to_the_application(String title) {
		//Wait for 20 seconds for title to Appear
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleIs(title));
		
		String expected_title = title;
		String actual_title = driver.getTitle();
		Assert.assertEquals(expected_title, actual_title);
		scn.write("Title Matched. Login Successfull");
	}

	
	@Then("application should give error message as {string}")
	public void application_should_give_error_message_as(String string) {

		String actual = PO_Login.GetErrorMessage();
		String expected = string.trim();
		
		if (actual.contains(expected)) {
			Assert.assertTrue("Actual and Expected Error Message Matched", true);
			scn.write("PASSED: Actual and Expected Error Message Matched");
		}else {
			Assert.assertTrue("Actual and Expected Error Message did not Matched", false);
			scn.write("FAILED: Actual and Expected Error Message did not Matched ");
		}
	}
	
}
