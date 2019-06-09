package bddcucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="src/test/resources/features/Login.feature",
	glue="bddcucumber/stepdefs",
	tags = {"@login_feature"},//login_feature, register_a_patient
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
