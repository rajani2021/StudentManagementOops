package api.automation.class3.gettingheaderbody;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetStatusCodeStatusValidation {

	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		
		String statusLine = res.getStatusLine();
		System.out.println(statusLine);
	}

}
