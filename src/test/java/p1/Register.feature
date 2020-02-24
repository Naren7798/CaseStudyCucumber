  
Feature: TestMeApp Registration

  Scenario: Successul Registration
    Given User clicks on signup button
    And enters username as "naren4567"
    And enters first name as "naren"
    And enters last name as "dran"
    And enters password as "naren123"
    And enters confirm password as "naren123"
    And clicks on gender male radio button
    And enters email as "tsri@gmail.com"
    And enters mobile number as {12345678}
    And enters dob as "1-2-2022"
    And enters address as "coimbatore"
    And selects security question clicks
    And enters answer as "blue"
    When click on register button
    Then welcome page is displayed