package bddcucumber.zeroapp.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_ZeroAppLogin {

	//Step 1 Driver
	WebDriver driver;

	//Step: Paramatrized constructor
	public PO_ZeroAppLogin(WebDriver d) {
		driver = d;
	}

	//Elements or Locators
	@FindBy(how = How.ID,using = "user_login")
	WebElement txtbx_username;

	@FindBy(how = How.ID,using = "user_password") 
	WebElement txtbx_password;

	@FindBy(how = How.NAME,using = "submit") 
	WebElement btn_submit;
	
	@FindBy(how = How.ID,using = "Outpatient Clinic")
	WebElement tab_outpatient_clinic;
	
	
	@FindBy(how = How.CLASS_NAME,using = "alert alert-error")
	WebElement txt_error_msg;

	//Methods
	public void SetUserName(String u) {
		txtbx_username.sendKeys(u);
	}

	public void SetPassword(String u) {
		txtbx_password.sendKeys(u);
	}

	public void ClickSubmitButton() {
		//tab_outpatient_clinic.click();
		btn_submit.click();
	}
	
	public String GetErrorMessage() {
		return txt_error_msg.getText();
	}
	
}
