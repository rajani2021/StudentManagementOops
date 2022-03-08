package api.automation.class3.gettingheaderbody;

import java.io.File;

import io.restassured.path.json.JsonPath;

public class GetNestedJsonBodyValue {

	public static void main(String[] args) {
		File file = new File("response1.json");
		JsonPath jpath = new JsonPath(file);
		String fname = jpath.get("data.first_name");
		System.out.println("FirstName = "+fname);
		
		String lname = jpath.get("data.last_name");
		System.out.println("LastName = "+lname);
		
		String email = jpath.get("data.email");
		System.out.println("Email = "+email);
		
		String url = jpath.getString("support.url");
		System.out.println("url = "+url);
		
		String text = jpath.getString("support.text");
		System.out.println("text = "+text);
	}
}
