package bddcucumber.healthcare.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_Cmn {
	WebDriver driver;
	
	public PO_Cmn(WebDriver d) {
		driver = d;
	}

	@FindBy(how = How.ID,using = "breadcrumbs")
	WebElement txt_breadcrumbs;

	public String GetBreadCrumbText() {
		return txt_breadcrumbs.getText();
	}
	
	
}
