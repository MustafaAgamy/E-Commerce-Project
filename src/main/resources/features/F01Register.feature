@smoke
Feature: Register | users could register with new accounts


  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When  user select gender type
    And user enter first name "agamy" and last name "mustafa"
    And user enter date of birth
    And user enter email field
    And user fills Password fields "Must@fa" "Must@fa"
    And user clicks on register button
    Then success message is displayed