package bddcucumber.healthcare.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_RegisterAPatient {
	//Step 1 Driver
	WebDriver driver;

	//Step: Paramatrized constructor
	public PO_RegisterAPatient(WebDriver d) {
		driver = d;
	}


	@FindBy(how = How.NAME,using = "breadcrumbs")
	private WebElement txt_breadcrumbs;

	//Elements or Locators
	@FindBy(how = How.NAME,using = "givenName")
	WebElement txtbx_name;

	@FindBy(how = How.NAME,using = "familyName")
	WebElement txtbx_surname;

	@FindBy(how = How.ID,using = "genderLabel")
	WebElement link_side_menu_gender;
	
	@FindBy(how = How.ID,using = "gender-field")
	WebElement select_gender;

	//Methods
	public void SetName(String u) {
		txtbx_name.sendKeys(u);
	}

	public void SetFamilyName(String u) {
		txtbx_surname.sendKeys(u);
	}

	public void ClickGenderSideMenu() {
		link_side_menu_gender.click();
	}
	
	public void SelectGender(String arg) {
		Select s = new Select(select_gender);
		s.selectByVisibleText(arg);
		
	}
	
}
