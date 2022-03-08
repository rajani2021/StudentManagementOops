package api.automation.class3.gettingheaderbody;

import java.io.File;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OtherJpathValidations {

	public static void main(String[] args) {
		//Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		File file = new File("response2.json");
		
		JsonPath jpath = new JsonPath(file);
		String email = jpath.get("data[1].email");
		
		List<String> fnameList = jpath.getList("data.first_name");
		System.out.println("Email = "+email);
		System.out.println(fnameList);
		//equalTo
		MatcherAssert.assertThat(email, Matchers.equalTo("tobias.funke@reqres.in"));
		//hasItem
		MatcherAssert.assertThat(fnameList, Matchers.hasItem("Lindsay"));
		//contains
		MatcherAssert.assertThat(fnameList, Matchers.contains("Lindsay", "Tobias", "Byron", "George", "Rachel"));
		//containsInAnyOrder
		MatcherAssert.assertThat(fnameList, Matchers.containsInAnyOrder("Lindsay", "Tobias", "George", "Rachel", "Byron"));
	}

}
