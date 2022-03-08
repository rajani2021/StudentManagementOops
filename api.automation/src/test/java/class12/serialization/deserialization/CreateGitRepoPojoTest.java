package class12.serialization.deserialization;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateGitRepoPojoTest {

	public static void main(String[] args) {
		CreateGitRepoPojo repoPojo = new CreateGitRepoPojo();
		repoPojo.setName("NewRRepo2");
		repoPojo.setDescription("NewRRepo1 description");
		RestAssured.given().
						header("Authorization", "Bearer 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").
						contentType(ContentType.JSON).
						body(repoPojo).
					when().
						post("https://api.github.com/orgs/hnw2021/repos").
					then().
						statusCode(201);
	}
}