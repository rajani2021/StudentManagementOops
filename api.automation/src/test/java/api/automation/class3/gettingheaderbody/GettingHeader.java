package api.automation.class3.gettingheaderbody;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GettingHeader {

	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		String header = res.getHeader("Server");
		System.out.println("header = "+header);
		System.out.println("------------------------");
		Headers headers = res.getHeaders();
		System.out.println(headers);
	}

}
