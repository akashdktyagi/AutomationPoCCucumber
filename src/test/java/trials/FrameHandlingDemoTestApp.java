package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemoTestApp {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");;
		
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
		
		
		
	}
}
