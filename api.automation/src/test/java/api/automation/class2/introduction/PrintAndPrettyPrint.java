package api.automation.class2.introduction;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PrintAndPrettyPrint {

	public static void main(String[] args) {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		res.print();
		System.out.println("------------------------");
		res.prettyPrint();
		System.out.println("------------------------");
		res.asPrettyString();
	}

}
