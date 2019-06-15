package bddcucumber.managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Author: Akash
 * Date: 15Jun2019
 * Usage Example:
 * WebDriverManagerSingleton browserManager= WebDriverManagerSingleton.getInstanceOfWebDriverManager();
 * driver = browserManager.getDriver();
 */
public class WebDriverManagerSingleton {
	
	//Instance of Singleton Class
	private static WebDriverManagerSingleton instanceOfSingletonClass=null;
	private WebDriver driver;
	
	//Private Constructor
	private WebDriverManagerSingleton() {
		System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	
	public void CloseDriver() {
		if (!(driver==null)) {
			driver.quit();
			driver = null;
			
		}
	}
	
}
