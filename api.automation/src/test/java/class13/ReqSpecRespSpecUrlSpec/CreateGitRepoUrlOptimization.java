package class13.ReqSpecRespSpecUrlSpec;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class CreateGitRepoUrlOptimization {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://api.github.com";
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.addHeader("Authorization", "Bearer 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");
		builder.addHeader("Content-Type", "application/json; charset=utf-8");
		
		ResponseSpecBuilder builder1 = new ResponseSpecBuilder();
		builder1.expectHeader("Server", Matchers.equalToIgnoringCase("Github.com"));
		builder1.expectHeader("Content-Type", Matchers.equalTo("application/json; charset=utf-8"));
		
		Root repoPojo = new Root();
		repoPojo.setName("NewPRepo16");
		repoPojo.setDescription("NewPrivateRepo description");
		RestAssured.requestSpecification = builder.build();
		RestAssured.responseSpecification = builder1.build();

		Root root = RestAssured.given().
						body(repoPojo).
					when().
						post("/orgs/hnw2021/repos").
					then().
						log().all().
						statusCode(201).extract().as(Root.class);
		String repoName = root.getName();
		MatcherAssert.assertThat("NewPRepo16", Matchers.equalTo(repoName));
	}
}   