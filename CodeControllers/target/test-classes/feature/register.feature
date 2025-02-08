Feature: User Registration

  Scenario: User successfully creates an account
    Given User navigates to the register page
    When User enters username "vasanthakumar", email "vasanthakumarg1212@gmail.com", password "vasa1212" and selects role "User"
    And User clicks the Register button
    Then User should see the account creation success message

     Scenario: User successfully creates an account
    Given User navigates to the register page
    When User enters username "vasanthakumar", email "vasanthakumarg1212@gmail.com", password "vasa@1212" and selects role "User"
    And User clicks the Register button
    Then User should see the account creation success message
    
     Scenario: User successfully creates an account
    Given User navigates to the register page
    When User enters username "vasanthakumar", email "vasanthakumrg1212@gmail.com", password "vasa1212" and selects role "User"
    And User clicks the Register button
    Then User should see the account creation success message