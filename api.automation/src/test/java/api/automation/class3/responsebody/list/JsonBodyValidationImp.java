package api.automation.class3.responsebody.list;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class JsonBodyValidationImp {

	public static void main(String[] args) {
		JsonPath jpath = RestAssured.
						 given().
						 when().
						 	get("https://reqres.in/api/users/2").
						 then().
						 statusCode(200).
						 extract().
						 jsonPath();
		String str = jpath.get("data.first_name");
		System.out.println(str);
		MatcherAssert.assertThat(str, Matchers.equalTo("Janet"));
		
	}

}
