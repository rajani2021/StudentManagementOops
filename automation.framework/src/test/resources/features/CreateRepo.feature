 @POST
 Feature: Create repositories and verify status code
 	Scenarios to create repo using POST Request
 
  Scenario Outline: Create repositories and verify status code
  	Given I have header with key "Authorization" and value "<token>"
  	And valid json input for "<repotype>" repo
		When I do a "POST" request with path "orgs/<orgName>/repos"
		Then verify status code is <statusCode>
		
		#	Positive public, private, Negative - Expired token, invalid Org
		Examples: 
		|token|repotype|orgName|statusCode|
		|Bearer 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|public|hnw2021|201|
		|Bearer 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|private|hnw2021|201|
		|Bearer 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|public|hnwhnwww2021|404|
		|Bearer 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|public|hnw2021|401|
		
		
@P2
  Scenario Outline: Create repositories and verify status code, input taken from Examples
  	Given I have header with key "Authorization" and value "<token>"
  	And valid input for "<repotype>", "<reponame>", "<description>"
		When I do a "POST" request with path "orgs/<orgName>/repos"
		Then verify status code is <statusCode>
		And verify response values "<reponame>","<description>"
	Examples: 
		|token|repotype|orgName|statusCode|reponame|description|isPrivate|
		|Bearer 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|public|hnw2021|201|repo_input_21|taking input from Examples|false|
		|Bearer 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|private|hnw2021|201|repo_input_22|taking input from Examples|true|
		