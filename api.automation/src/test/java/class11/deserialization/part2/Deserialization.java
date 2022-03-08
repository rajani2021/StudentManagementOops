package class11.deserialization.part2;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class Deserialization {

	public static void main(String[] args) {
		Root root = RestAssured.given().
					when().
						get("https://reqres.in/api/users/2").
					then().
						statusCode(200).
						extract().as(Root.class);
					
			//Data class Validation		
					
				int id = root.getData().getId();
				System.out.println("Id = "+id);
				String email = root.getData().getEmail();
				System.out.println("Email = "+email);
				String fname = root.getData().getFirst_name();
				System.out.println("FirstName = "+fname);
				String lname = root.getData().getLast_name();
				System.out.println("LastName = "+lname);
		
			//Support Class Validation
		
		  String url = root.getSupport().getUrl(); System.out.println("url = "+url);
		  String text = root.getSupport().getText();
		  System.out.println("Text = "+text);
		 
				MatcherAssert.assertThat(fname, Matchers.equalTo("Janet"));
				MatcherAssert.assertThat(url, Matchers.equalTo("https://reqres.in/#support-heading"));
	}
}