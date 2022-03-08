package class13.ReqSpecRespSpecUrlSpec;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

public class CreateResponseSpecGitRepo {

	public static void main(String[] args) {
		
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		builder.expectHeader("Server", Matchers.equalTo("GitHub.com"));
		builder.expectHeader("Content-Type", Matchers.equalTo("application/json; charset=utf-8"));
		Root repoPojo = new Root();
		repoPojo.setName("NewPRepo13");
		repoPojo.setDescription("NewPrivateRepo description");
		RestAssured.responseSpecification = builder.build();
		Root root = RestAssured.given().
						header("Authorization", "Bearer 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").
						contentType(ContentType.JSON).
						body(repoPojo).
					when().
						post("https://api.github.com/orgs/hnw2021/repos").
					then().
						log().all().
						statusCode(201).extract().as(Root.class);
		String repoName = root.getName();
		MatcherAssert.assertThat("NewPRepo13", Matchers.equalTo(repoName));
	}
}