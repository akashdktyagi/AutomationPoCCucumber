package bddcucumber.ecommerce.po.stepdefs;

import org.openqa.selenium.WebDriver;

import bddcucumber.healthcare.po.PO_Login;
import bddcucumber.managers.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class STEPS_CsCartHomeSearch {
	WebDriver driver;
	WebDriverManagerSingleton browserManager;
	Scenario scn ;
	PO_Login PO_Login;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}
	
	@When("I enter product in top search box")
	public void i_enter_product_in_top_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("click on search submit button")
	public void click_on_search_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("page navigates to product search results")
	public void page_navigates_to_product_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("proudct results are displayed")
	public void proudct_results_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	

	
}
