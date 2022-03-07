package stepdefinitions;

import org.hamcrest.Matchers;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import basepackage.BaseUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import pojo.CreateGitRepoPojo;
import utils.GithubHelper;

public class StepDefinitions {

	private BaseUtils baseUtils;
	
	//constructor based dependency Injection
	public StepDefinitions(BaseUtils baseUtils) {
		this.baseUtils = baseUtils;
	}

	@Given("I have header with key {string} and value {string}")
	public void iHaveHeaderWithKeyAndValue(String key, String value) {
		//RestAssured.baseURI = "https://api.github.com"; ----this will be set in Test Runner, to read from property file
		baseUtils.reqSpec = RestAssured.given().log().body().header(key, value);
	}

	@When("I do a {string} request with path {string}")
	public void iDoARequestWithPath(String requestType, String path) {
		if (requestType.equals("GET")) {
			baseUtils.response = baseUtils.reqSpec.when().get(path);
		} else if (requestType.equals("POST")) {
			baseUtils.response = baseUtils.reqSpec.when().post(path);
		}
	}

	@Then("verify status code is {int}")
	public void verifyStatusCodeIs(Integer expectedStatusCode) {
		baseUtils.response.then().log().all().statusCode(expectedStatusCode);// .extract().jsonPath();
		// int id = result.get("[0].id");
		System.out.println("============================================");
		// System.out.println(id);
	}

	// step 2 getting Query Param

	@Given("query param {string} with value {string}")
	public void queryParamWithValue(String type, String queryParam) {
		baseUtils.reqSpec = baseUtils.reqSpec.queryParam(type, queryParam);
	}

	// PerPage Count

	@Then("Verify count is {int}")
	public void verifyRepoCount(Integer repoCount) {
		baseUtils.response.then().body("size()", Matchers.equalTo(repoCount));
	}

	// Post request

	@Given("valid json input for {string} repo")//why in lower case
	public void validJsonInputForRepo(String repotype) {
		CreateGitRepoPojo repoPojo = null;
		double randomNumber = Math.random();
		/*
		 * repoPojo.setName("Repo_"+randomNumber); repoPojo.setDescription("test");
		 * 
		 * switch(repotype) { case "private": repoPojo.setMyPrivate(true); break; case
		 * "public": repoPojo.setMyPrivate(false); break; default :
		 * repoPojo.setMyPrivate(false); }
		 */
		
		/*
		 * if (repotype.equals("private")) { repoPojo.setMyPrivate(true); }else{
		 * repoPojo.setMyPrivate(false); }
		 */
		
		switch(repotype) 
		{ 
			case "private": repoPojo = GithubHelper.createRepo("Repo_"+randomNumber, "Test", true);
						  break; 
			case "public": repoPojo = GithubHelper.createRepo("Repo_"+randomNumber, "Test", false);
		  				  break; 
			default :System.out.println("printing default");
		}
		ExtentCucumberAdapter.addTestStepLog("Payload = "+repoPojo);
		baseUtils.reqSpec.body(repoPojo);
	}
	
	//Moving below code to CreateRepoStepDefinitions
	/*
	 * @Given("valid input for {string}, {string}, {string}") public void
	 * validInputFor(String isPrivate, String reponame, String description) {
	 * CreateGitRepoPojo repoPojo = null;
	 * 
	 * repoPojo = GithubHelper.createRepo(reponame, description,
	 * Boolean.valueOf(isPrivate)); reqSpec.body(repoPojo); }
	 * 
	 * @Then("verify response values {string},{string}") public void
	 * verifyStatusCodeIs(String reponame, String description ) { //json body match
	 * response.then().body("name", Matchers.equalTo(reponame)) .body("description",
	 * Matchers.equalTo(description));
	 * 
	 * //DeSerialization Root deserialization =
	 * response.then().extract().as(Root.class); String repo_Nm =
	 * deserialization.getName(); MatcherAssert.assertThat(repo_Nm,
	 * Matchers.equalTo(reponame)); }
	 */
}