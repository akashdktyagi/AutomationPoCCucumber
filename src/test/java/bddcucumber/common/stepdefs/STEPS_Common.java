package bddcucumber.common.stepdefs;
import org.openqa.selenium.WebDriver;
import bddcucumber.managers.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/*
 * Author: Akash
 * Date: 23June2019
 * Detail: TO keep all the common step definitions
 */
public class STEPS_Common {
	WebDriver driver;
	WebDriverManagerSingleton browserManager;
	Scenario scn ;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}
	
	@Given("navigate to url as {string}")
	public void navigate_to_url(String url) {
		driver.get(url);
		scn.write("Navigated to URL: " + url);
	}
	
	@Given("As a user when I launch application in {string}")
	public void as_a_user_launch_application(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			browserManager= WebDriverManagerSingleton.getInstanceOfWebDriverManager();
			driver = browserManager.getDriver();
			scn.write("Chrome Driver Invoked");
		}else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "E:\\_AkashStuff\\Automation\\dependencies\\gecko\\geckodriver.exe");
			//driver =  new FirefoxDriver();
		}
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		browserManager.CloseDriver();
		scn.write("Browser Closed");
	}
}// end class
