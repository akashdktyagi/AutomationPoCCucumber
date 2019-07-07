package bddcucumber.ecommerce.stepdefs;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Assert;

import bddcucumber.managers.ExcelManager;
import bddcucumber.managers.dbmanager.DBManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class STEPS_ExcelDBValidations {
	Object[][] oExelData=null;
	Object[][] oDBData=null;

	@Given("I fetch Data from Excel file path as {string} and Sheet name as {string}")
	public void i_fetch_Data_from_Excel_file_named_as(String filepath, String SheetName ) {

		try {
			oExelData = ExcelManager.FetchExcelFileContent(filepath, SheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Given("I fetch Data from DB using {string}")
	public void i_fetch_Data_from_DB_using(String query) {
		try {
			oDBData  = DBManager.FetchDataFromDB(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("compare the DB with Excel")
	public void compare_the_DB_with_Excel() {
		//Assert.assertEquals(oDBData, oExelData);
		
		//Sort Both arrats
		//Check 1
		Assert.assertEquals(oDBData.length, oExelData.length);
		
		//Check 2
		for(int i=0;i<oDBData.length;i++) {
			
			for(int j=0;j<oDBData.length;j++) {
				if (oDBData[i][j]==oExelData[i][j]) {
					Assert.assertTrue(true);
				}else {
					Assert.assertTrue(false);
				}
			}
		}

	}



}
