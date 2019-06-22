package bddcucumber.zeroapp.stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import bddcucumber.healthcare.po.PO_Login;
import bddcucumber.managers.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class STEPS_ZeroAppLogin {
	WebDriver driver;
	WebDriverManagerSingleton browserManager;
	Scenario scn ;
	PO_Login PO_Login;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}
	
	@Given("navigate to url as {string}")
	public void navigate_to_url(String url) {
		driver.get(url);
		
		//Initialize
		PO_Login = PageFactory.initElements(driver, PO_Login.class);
	}
	
	@Given("As a user when I launch application in {string}")
	public void as_a_user_launch_application(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
			//driver = new ChromeDriver();
			browserManager= WebDriverManagerSingleton.getInstanceOfWebDriverManager();
			driver = browserManager.getDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\_AkashStuff\\Automation\\dependencies\\gecko\\geckodriver.exe");
			//driver =  new FirefoxDriver();
		}

		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		String expected_title = title;
		String actual_title = driver.getTitle();
		Assert.assertEquals(expected_title, actual_title);
		scn.write("Title Matched. Login Successfull");
	}


	//@Then("close the browser")
	@After
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		browserManager.CloseDriver();
		scn.write("Browser Closed");
	
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
