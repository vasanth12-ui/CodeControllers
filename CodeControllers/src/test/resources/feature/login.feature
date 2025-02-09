Feature: PayPal Login and Checkout

  Scenario: User logs in and completes a purchase
    Given the user is on the PayPal login page
    When the user logs in with valid credentials
    Then the user should be redirected to the home page

  Scenario: User selects a product, adds it to the cart, and completes the checkout process
    Given the user is logged in
    When the user selects a product and adds it to the cart
    Then the cart page should show the product added
    When the user proceeds to checkout
    Then the user should enter shipping details
    When the user selects a payment method and places an order
    Then the order should be confirmed
