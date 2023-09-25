
@Tutorial
Feature: feature to test login functionality

  @Tutorial1
  Scenario:Login the page with valid informations
    Given tutoriyanninja page is open
    And login page is displayed
    When enter userid "<userid>" and password "<password>"
    And click on login button
    Then display home page
    And the product list page displays
    When user select the product
    And clicks on add to cart button
    Then cart button displays item added to cart
   
  Examples: 
  |userid | password|
  |anu122@gmail.com | anu123|