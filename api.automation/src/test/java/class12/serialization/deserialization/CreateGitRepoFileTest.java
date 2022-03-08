package class12.serialization.deserialization;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateGitRepoFileTest {

	public static void main(String[] args) {
		File file = new File("createRepo.json");
		RestAssured.given().
						header("Authorization", "Bearer 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").
						contentType(ContentType.JSON).
						body(file).
					when().
						post("https://api.github.com/orgs/hnw2021/repos").
					then().
						statusCode(201);
	}
}