Feature: feature to test google search functionality

@search
  Scenario: Validate google search is working
    Given browser  open
    And user is on google page
    When user enter a text in search box
    And hits enter
    Then user is navigated to search results
