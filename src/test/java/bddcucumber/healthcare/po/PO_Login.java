package bddcucumber.healthcare.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_Login {

	//Step 1 Driver
	WebDriver driver;

	//Step: Paramatrized constructor
	public PO_Login(WebDriver d) {
		driver = d;
	}

	//Elements or Locators
	@FindBy(how = How.ID,using = "username")
	WebElement txtbx_username;

	@FindBy(how = How.ID,using = "password") 
	WebElement txtbx_password;

	@FindBy(how = How.ID,using = "loginButton") 
	WebElement btn_submit;
	
	@FindBy(how = How.ID,using = "Outpatient Clinic")
	WebElement tab_outpatient_clinic;
	
	
	@FindBy(how = How.ID,using = "error-message")
	WebElement txt_error_msg;

	//Methods
	public void SetUserName(String u) {
		txtbx_username.sendKeys(u);
	}

	public void SetPassword(String u) {
		txtbx_password.sendKeys(u);
	}

	public void ClickSubmitButton() {
		tab_outpatient_clinic.click();
		btn_submit.click();
	}
	
	public String GetErrorMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(txt_error_msg));
		return txt_error_msg.getText();
	}
	
}
