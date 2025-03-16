#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: BookCart Home page

  Scenario: User is able to search a product
    Given User launches BookCart application and login in successfully
    When User searches a book
    Then the book should display

  Scenario: User is able to add a product in the cart
    Given User launches BookCart application and login in successfully
    When User searches a book
    And clicks on Add cart button
    Then the book should be added in the cart list

  Scenario: User is able to clear all the products added in the cart
    Given User launches BookCart application and login in successfully
    When User searches a book
    And clicks on Add cart button
    Then Click on Cart Icon
    And clicks on Clear Cart button
    Then "Your shopping cart is empty." message should display

  Scenario: User is able to delete a product added in the cart when only one product added
    Given User launches BookCart application and login in successfully
    When User searches a book
    And clicks on Add cart button
    Then Click on Cart Icon
    And clicks on delete button against a prodcut
    Then "Your shopping cart is empty." message should display

  Scenario: User is able to delete a product added in the cart when only multiple product added
    Given User launches BookCart application and login in successfully
    When User searches a book
    And clicks on Add cart button
    Then Click on Cart Icon
    And clicks on delete button against a product
    Then the book should be deleted

  Scenario: User is able to checkout the products added in the cart
    Given User launches BookCart application and login in successfully
    When User searches a book
    And clicks on Add cart button
    Then Click on Cart Icon
    And stores the title of the added book
    And clicks on Checkout button
    Then "Your shopping cart is empty." message should display
    And enters Name, Address1, Address2, pincode, state
    And clicks on Place order button
    Then the order should be placed
