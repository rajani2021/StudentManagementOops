package api.automation.class3.responsebody.list;

import io.restassured.RestAssured;

public class GetResponseGivenWhenThen {
	public static void main(String[] args) {
		RestAssured.given().
		when().
			get("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			statusLine("HTTP/1.1 200 OK");
		System.out.println("Execution Successful");
	}
}
