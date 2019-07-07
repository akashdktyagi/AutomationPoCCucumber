package trials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandlingDemoTestApp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Static.html");;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		/*
		//Frame Switch
		//Switch Frame by WebElement
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		
		//or switch frame by name
		driver.switchTo().frame("SingleFrame");
		
		//or switch frame by index
		driver.switchTo().frame(0);
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
	
		inputbox.sendKeys("Akash");
	
	*/
		WebElement source = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		
		Actions obj = new Actions(driver);
		obj.dragAndDrop(source, target).perform();
	
		
		
		
	}
}
