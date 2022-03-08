package api.automation.class3.gettingheaderbody;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.path.json.JsonPath;

public class PerPageValidation {

	public static void main(String[] args) {
		File file = new File("response2.json");
		JsonPath jpath = new JsonPath(file);
		int perPage = jpath.getInt("per_page");
		System.out.println(perPage);
		int dataArraySize = jpath.get("data.size()");
		
		System.out.println(dataArraySize);
		MatcherAssert.assertThat(dataArraySize, Matchers.equalTo(perPage));
		
	}

}
