package stepdefinitions;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import basepackage.BaseUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojo.CreateGitRepoPojo;
import pojo.Root;
import utils.GithubHelper;

public class CreateRepoStepDefinitions {
	private BaseUtils baseUtils;
	
	public CreateRepoStepDefinitions(BaseUtils baseUtils) {
		this.baseUtils = baseUtils;
	}
	
	@Given("valid input for {string}, {string}, {string}")
	public void validInputFor(String isPrivate, String reponame, String description) {
		CreateGitRepoPojo repoPojo = null;
		repoPojo = GithubHelper.createRepo(reponame, description, Boolean.valueOf(isPrivate));
		baseUtils.reqSpec.body(repoPojo);
	}
	
	@Then("verify response values {string},{string}")
	public void verifyStatusCodeIs(String reponame, String description ) {
		//json body match
		baseUtils.response.then().body("name", Matchers.equalTo(reponame))
		.body("description", Matchers.equalTo(description));
		
		//DeSerialization
		Root deserialization = baseUtils.response.then().extract().as(Root.class);
		String repo_Nm = deserialization.getName();
		MatcherAssert.assertThat(repo_Nm, Matchers.equalTo(reponame));
	}
}
