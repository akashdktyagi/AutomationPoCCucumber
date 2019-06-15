package bddcucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

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
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		
	features = {"classpath:features/healthcare"},//,"classpath:features/zeroapp"},
	glue= {"bddcucumber/healthcare/stepdefs"},//"bddcucumber/zeroapp/stepdefs"},
	tags = {"@register_a_patient"},//,"@zero_app"},//login_feature, register_a_patient
	plugin ={"pretty" , "html:target/CucumberResults"},
	monochrome = true,
	dryRun=false

	)
public class TestRunner {
	
	//This class will be empty
	/*
	 * Important Links;
	 * junit-cucumber Options
	 * https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/
	 */
	
}
