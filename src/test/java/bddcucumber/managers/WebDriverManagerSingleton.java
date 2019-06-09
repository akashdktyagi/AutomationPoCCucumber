package bddcucumber.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Author: Akash
 * Usage Example:
 * WebDriverManagerSingleton 
 */
public class WebDriverManagerSingleton {
	
	//Instance of Singleton Class
	private static WebDriverManagerSingleton instanceOfSingletonClass=null;
	private WebDriver driver;
	
	//Private Constructor
	private WebDriverManagerSingleton() {
		System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//To create instance of Class
	public static WebDriverManagerSingleton getInstanceOfWebDriverManager() {
		
		if(instanceOfSingletonClass==null) {
			instanceOfSingletonClass = new WebDriverManagerSingleton();
		}
		return instanceOfSingletonClass;
	}
	
	//to get Driver
	public  WebDriver getDriver() {
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
}
