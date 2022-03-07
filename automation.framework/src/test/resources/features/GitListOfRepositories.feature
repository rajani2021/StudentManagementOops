 Feature: List all repositories and verify status code
 
  Scenario: List all repositories and verify status code
  	Given I have header with key "Authorization" and value "Bearer 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"
		When I do a "GET" request with path "orgs/hnw2021/repos"
		Then verify status code is 200