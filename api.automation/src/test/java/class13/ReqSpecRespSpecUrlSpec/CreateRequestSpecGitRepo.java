package class13.ReqSpecRespSpecUrlSpec;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class CreateRequestSpecGitRepo {

	public static void main(String[] args) {
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.addHeader("Authorization", "Bearer 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");
		builder.addHeader("Content-Type", "application/json; charset=utf-8");
		Root repoPojo = new Root();
		repoPojo.setName("NewPRepo14");
		repoPojo.setDescription("NewPrivateRepo description");
		RestAssured.requestSpecification = builder.build();
		Root root = RestAssured.given().
						body(repoPojo).
					when().
						post("https://api.github.com/orgs/hnw2021/repos").
					then().
						log().all().
						statusCode(201).extract().as(Root.class);
		String repoName = root.getName();
		MatcherAssert.assertThat("NewPRepo14", Matchers.equalTo(repoName));
	}
}