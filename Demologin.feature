Feature: feature to test login functionality

  @login1
  Scenario Outline: Check login is sucessfull with valid details
    Given browser is open
    And user is on on login page
    When user enter "<sheetName>" and Password "<rowNumber>"
    And clicks on login button
    Then user is navigated to home page

   Examples: 

      | SheetName | Rownumber | 

      | Test Data |   0   |