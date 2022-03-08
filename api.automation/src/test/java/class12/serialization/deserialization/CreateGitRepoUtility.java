package class12.serialization.deserialization;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateGitRepoUtility {
	public static void main(String[] args) {

		RestAssured.given().
						header("Authorization", "Bearer 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").
						contentType(ContentType.JSON).
						body(UtilityHelper.CreateGitPublicRepoHelper("NewRepo3", "NewRepo3 Description")).
					when().
						post("https://api.github.com/orgs/hnw2021/repos").
					then().
						statusCode(201);

		
	}
}
