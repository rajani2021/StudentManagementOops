package api.automation.class2.introduction;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstScript {

	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
	}

}
