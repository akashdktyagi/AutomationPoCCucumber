package bddcucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features = {"E:\\_AkashStuff\\Automation\\EclipseWorkspace\\AutomationPoCCucumber\\src\\test\\resources\\features\\eCommerce\\DBExcelProductsFeature.feature"},//{"classpath:features/healthcare"},//"classpath:features/zeroapp"},
	glue= {"bddcucumber/ecommerce/stepdefs"},//{"bddcucumber/healthcare/stepdefs"},//"bddcucumber/zeroapp/stepdefs"},
	tags = {"@dbvalidation"},//,"@zero_app"},//login_feature, register_a_patient
	plugin ={"pretty" , "html:target/CucumberResults",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},//"json:target/cucumber-report.json"
	monochrome = true,
	dryRun=false

	)
public class DBExcelValidationRunner {
	

	
}
