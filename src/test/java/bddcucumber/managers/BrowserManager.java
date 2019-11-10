package bddcucumber.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager {

	public static WebDriver GetBrowser(String sBrowserType) {
		WebDriver driver = null;;
		if (sBrowserType.equals("chrome")) {
		  driver = new ChromeDriver();
		}else if (sBrowserType.equals("firefox")) {
			driver = new FirefoxDriver();
		}
			
		return driver;
		
	}
}
