package class12.part2.Private;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreatePrivateGitRepo {

	public static void main(String[] args) {
		Root repoPojo = new Root();
		repoPojo.setName("NewPRepo7");
		repoPojo.setDescription("NewPrivateRepo description");
		repoPojo.setMyprivate(true);
		Root root = RestAssured.given().
						header("Authorization", "Bearer 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").
						contentType(ContentType.JSON).
						body(repoPojo).
					when().
						post("https://api.github.com/orgs/hnw2021/repos").
					then().
						log().body().
						statusCode(201).extract().as(Root.class);
		String repoName = root.getName();
		MatcherAssert.assertThat("NewPRepo7", Matchers.equalTo(repoName));
	}
}