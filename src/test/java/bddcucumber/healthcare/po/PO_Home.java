package bddcucumber.healthcare.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Home {

	
	//Step 1 Driver
	WebDriver driver;

	//Step: Paramatrized constructor
	public PO_Home(WebDriver d) {
		driver = d;
	}

	//Elements or Locators
	@FindBy(how = How.ID,using = "referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
	WebElement link_register;

	@FindBy(how = How.ID,using = "referenceapplication-vitals-referenceapplication-vitals-extension")
	WebElement link_capture_vitals;

	@FindBy(how = How.ID,using = "org-openmrs-module-coreapps-activeVisitsHomepageLink-org-openmrs-module-coreapps-activeVisitsHomepageLink-extension")
	WebElement link_active_visits;
	
	@FindBy(how = How.ID,using = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
	WebElement link_find_record;

	public void Click_Link_register( ) {
		this.link_register.click();
	}

	public void Click_Link_capture_vitals( ) {
		this.link_capture_vitals.click();
	}

	public void Click_Link_active_visits( ) {
		this.link_active_visits.click();
	}

	public void Click_Link_find_record() {
		this.link_find_record.click();
	}

	
	
}
