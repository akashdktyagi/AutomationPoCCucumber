package bddcucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//mvn sonar:sonar -Dsonar.projectKey=akashdktyagi_AutomationPoCCucumber -Dsonar.organization=akashdktyagi-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=7356ed40450dc767d462b82f6e45fca08b2ea454
/*
 * Cucumber Options:
 * 1. Plugin : For reporting and output folders configs 
 * a. pretty
 * b. HTML
 * c. JSON
 * 2. DryRun: For getting the step Defs info for un-implemented steps
 * 3. Strict: if true then , exec fails if step def is not found for a step
 * 4. Monochrome:default is false. Console is more readable if set as true
 * 5. Features:  mention the feature file location, cucumber can find all the .feature files
 * in all the package and subpackages
 * 6. Glue: To mention step defs location of the Feature files.
 * 7. Snippet : To generate Snippets in specific format of underscore or camel case
 * 8. Tags: for grouping of the tests
 * Not: tag{"~@reg"} 
 * And: tag{"@reg","@smoke"}
 * or:  tag{"@reg,@smoke"}
 * and or not together : tag{"@reg,@smoke","~sanity"}
 * 
 * For Extent Report pacakge name has been added under Plugin section
 * For Details on How to Add Extent Report Cucumber Adapter 
 * follow below links:
 * http://extentreports.com/docs/versions/4/java/cucumber4.html
 * http://extentreports.com/docs/versions/4/java/extentservice.html
 * https://github.com/extent-framework/extentreports-cucumber4-adapter
 * 
 * To Run from Command Line: mvn test –DCucumber.options=”Your Options”
 * https://www.toolsqa.com/selenium-cucumber-framework/run-cucumber-test-from-command-line-terminal/
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		
	features = {"classpath:features/eCommerce"},//{"classpath:features/healthcare"},//"classpath:features/zeroapp"},
	glue= {"bddcucumber/ecommerce/stepdefs","bddcucumber/healthcare/stepdefs"},//{"bddcucumber/healthcare/stepdefs"},//"bddcucumber/zeroapp/stepdefs"},
	//tags = {"@temp,@positive","~@reg"},//,"@zero_app"},//login_feature, register_a_patient
	plugin ={"pretty" , "html:target/CucumberResults",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},//"json:target/cucumber-report.json"
	monochrome = true,
	dryRun=false

	)
public class TestRunner2 {
	
	//This class will be empty
	/*
	 * Important Links;
	 * junit-cucumber Options
	 * https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/
	 * If ur getting error with Cucumber and Extent report Adapter
	 * https://stackoverflow.com/questions/54721039/getting-initialization-error-noclassdeffounderror-cucumber-runtime-io-urloutpu
	 */
	
}
