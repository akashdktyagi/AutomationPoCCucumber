package bddcucumber.ecommerce.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;


public class PO_Header {
	WebDriver driver;
	
	public PO_Header(WebDriver d) {
		driver = d;
	}

	@FindBy(how = How.ID,using = "search_input")
	private WebElement txtbx_search_box;
	
	@FindBy(how = How.CLASS_NAME,using = "ty-icon-search")
	private WebElement btn_submit;

	public void SetSearchBox(String arg) {
		txtbx_search_box.sendKeys(arg);
	}
	
	public void ClickSearchSumitButton() {
		btn_submit.click();
	}
	
}
