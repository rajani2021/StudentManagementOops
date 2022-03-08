package api.automation.class3.gettingheaderbody;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GettingResponseBodyJsonPath {

	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		res.print();
		JsonPath jpath = res.jsonPath();
		String name1 = jpath.get("data.first_name");
		System.out.println(name1);
		
		String lastName = jpath.getString("data.last_name");
		System.out.println(lastName);
		
		String emailId = jpath.get("data.email");
		System.out.println(emailId);
		
		int id = jpath.getInt("data.id");
		System.out.println(id);
	}

}
