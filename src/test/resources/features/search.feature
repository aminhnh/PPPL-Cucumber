Feature: user search
  Scenario: Validate user can search a valid query
    Given user is on the search page
    When user search a valid query
    Then user should be redirected to the result page
    #And user can see list of result