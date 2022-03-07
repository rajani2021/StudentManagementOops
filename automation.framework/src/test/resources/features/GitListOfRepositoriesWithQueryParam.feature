Feature: List all repositories and verify status code with Query Param

  Scenario: List all repositories and verify status code with Query Param
    Given I have header with key "Authorization" and value "Bearer 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"
    And query param "type" with value "private"
    And query param "per_page" with value "1"
    When I do a "GET" request with path "orgs/hnw2021/repos"
    Then verify status code is 200

  Scenario Outline: List all repositories and verify status code with Query Param 5 Scenarios
    Given I have header with key "Authorization" and value "<token>"
    And query param "type" with value "<rtype>"
    And query param "per_page" with value "<per_page>"
    When I do a "GET" request with path "orgs/hnw2021/repos"
    Then verify status code is <statusCode>

    Examples: 
      | token                                           | rtype   | statusCode |
      | Bearer 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 | public  |        200 |
      | Bearer ghp_IdCCrNrE3uiAFt3x7MZVax8xd05u3ti      | public  |        401 |
      | Bearer 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 | public  |        200 |
      | Bearer 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 | private |        200 |
      | Bearer ghp_IdCCrNrE3uiAFt3x7MZVax8xd05u3ti      | private |        401 |
      | Bearer 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 | private |        200 |

  Scenario Outline: List all repositories and verify status code with per_page
    Given I have header with key "Authorization" and value "<token>"
    And query param "type" with value "<rtype>"
    And query param "per_page" with value "<per_page>"
    When I do a "GET" request with path "orgs/hnw2021/repos"
    Then verify status code is <statusCode>
    And Verify count is <per_page>

    Examples: 
      | token                                           | rtype   | statusCode | per_page |
      | Bearer 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 | public  |        200 |        2 |
      | Bearer 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 | private |        200 |        2 |
