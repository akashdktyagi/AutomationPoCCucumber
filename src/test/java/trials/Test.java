package trials;

import org.openqa.selenium.WebDriver;

import bddcucumber.managers.WebDriverManagerSingleton;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp();
		temp1();

		
		
	}
	
	public static void temp() {
		WebDriver d = WebDriverManagerSingleton.getInstanceOfWebDriverManager().getDriver();
		
		d.get("https://demo.openmrs.org/openmrs/index.htm");
		
	}
	
	public static void temp1() {
		WebDriver d1 = WebDriverManagerSingleton.getInstanceOfWebDriverManager().getDriver();
		System.out.println(d1.getTitle());
		
	}
}
