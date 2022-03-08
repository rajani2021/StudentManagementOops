package api.automation.class3.gettingheaderbody;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GettingResponseBody {

	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		String str = res.getBody().asString();
		System.out.println(str);
	}

}
