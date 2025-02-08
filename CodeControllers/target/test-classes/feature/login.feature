Feature: Login and Checkout process

  Scenario: Successful Login and Checkout
    Given I open the PayPal login page
    When I login with email "vasanthakumarg1212@gmail.com" and password "vasa1212"
    When I select a wine product and add it to the cart
    When I proceed to checkout
    Then I should see the checkout page
