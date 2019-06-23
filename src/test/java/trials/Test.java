package trials;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import bddcucumber.managers.WebDriverManagerSingleton;

public class Test implements IAInterface,IBInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//temp();
		//temp1();
		
		String [] a1 = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		String [] a2 = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		ArrayList<String> finalString = new ArrayList<String>();
		
		for (int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				finalString.add(a1[i]+a2[j]);
			}
		}
		
		System.out.print(finalString.toString());
		

		
		
	}
	
	public static void temp() {
		//WebDriver d = WebDriverManagerSingleton.getInstanceOfWebDriverManager().getDriver();
		
		//d.get("https://demo.openmrs.org/openmrs/index.htm");
		
	}
	
	public static void temp1() {
	//	WebDriver d1 = WebDriverManagerSingleton.getInstanceOfWebDriverManager().getDriver();
	//	System.out.println(d1.getTitle());
		
	}
}
