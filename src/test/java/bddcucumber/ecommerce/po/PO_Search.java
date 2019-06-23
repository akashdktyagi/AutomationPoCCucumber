package bddcucumber.ecommerce.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;


public class PO_Search {
	WebDriver driver;
	
	public PO_Search(WebDriver d) {
		driver = d;
	}

	@FindBy(how = How.ID,using = "products_search_11")
	private WebElement container_search_products;


	public void validate_search_results() {
		Assert.assertEquals(true, container_search_products.isDisplayed());
	}
	

	
}
