package bddcucumber.healthcare.stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import bddcucumber.healthcare.po.PO_Home;
import bddcucumber.healthcare.po.PO_Login;
import bddcucumber.healthcare.po.PO_RegisterAPatient;
import bddcucumber.healthcare.po.PO_Cmn;
import bddcucumber.managers.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class STEPS_RegisterAPatient {
	WebDriverManagerSingleton browserManager = WebDriverManagerSingleton.getInstanceOfWebDriverManager();
	WebDriver driver =browserManager.getDriver() ;
	PO_Home PO_Home= PageFactory.initElements(driver, PO_Home.class);
	PO_Cmn PO_Cmn= PageFactory.initElements(driver, PO_Cmn.class);
	PO_RegisterAPatient PO_RegisterAPatient= PageFactory.initElements(driver, PO_RegisterAPatient.class);
	
	Scenario scn ;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}
	
	
	@Then("I click on {string} tab")
	public void i_click_on_tab(String string) {
		PO_Home.Click_Link_register();
	}

	@Given("Register a Patient Form is displayed")
	public void register_a_Patient_Form_is_displayed() {
		String actual = PO_Cmn.GetBreadCrumbText();
		String expected = "Register a patient";
		
		if (actual.contains(expected)) {
			scn.write("Register a patient page is displayed");
			Assert.assertTrue("Register a patient page is displayed", true);
		}else {
			scn.write("Register a patient page is not displayed");
			Assert.assertTrue("Register a patient page is displayed", false);
		}

	}

	@When("register a patient form fields is filled as {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void all_the_register_a_patient_form_fields_is_filled_as(String name, String familyname, String gender, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
		PO_RegisterAPatient.SetName(name);
		PO_RegisterAPatient.SetFamilyName(familyname);
		PO_RegisterAPatient.ClickGenderSideMenu();
		PO_RegisterAPatient.SelectGender(gender);
	}

	@When("confirm button is clicked")
	public void confirm_button_is_clicked() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("patient is register in the system with patient Id generated")
	public void patient_is_register_in_the_system_with_patient_Id_generated() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("patient records are displayed in Find patient tab under menu")
	public void patient_records_are_displayed_in_Find_patient_tab_under_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
