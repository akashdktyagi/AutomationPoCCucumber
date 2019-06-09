package bddcucumber.stepdefs;
import healthcare.po.*;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class STEPS_RegisterAPatient {
	WebDriver driver;
	Scenario scn ;
	PO_Login PO_Login;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}
	
	@Then("I click on {string} tab")
	public void i_click_on_tab(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Register a Patient Form is displayed")
	public void register_a_Patient_Form_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("All the register a patient form fields is filled as {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void all_the_register_a_patient_form_fields_is_filled_as(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
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
