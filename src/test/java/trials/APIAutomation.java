package trials;

import static io.restassured.RestAssured.*;
//http://www.holidaywebservice.com//HolidayService_v2/HolidayService2.asmx?wsdl



import io.restassured.response.Response;


/**
 * 
 * @author NEO
 * HTTP Status Codes:https://en.wikipedia.org/wiki/List_of_HTTP_status_codes
 * 
 */
public class APIAutomation {
	public APIAutomation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Response resp = given().when().get("https://reqres.in/api/users?page=2").andReturn();
		String respString = resp.asString();
		
		int respStatusCode = resp.statusCode();
		

		System.out.println("Status code is: " + respStatusCode);
		System.out.println("Status code is: " + respString);
	}
	
	
}
