Feature: feature to test shopping cart functions 

  @Addtocart
  Scenario: Check the functionality of checkout 
    Given user is on shopping cart page
    And user clicks the checkout button
    When user enter the billing details
    And clicks on continue button
    When user enter delivery details
    And clicks on continue button
    When user enter payment method
    And Clicks on continue button 
    When User is clicks on confirm order 
    Then displays order is placed message.

   
