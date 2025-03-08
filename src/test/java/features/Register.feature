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

Feature: BookCart Registration page

  Scenario: User is able to register successfully
    Given User launches BookCart application
    And Clicks on Login button and then clicks on Register button
    When User enters FirstName, LastName, UserName, Password, ConfirmPwd, selects Gender
    And clicks on Register button
    Then Login page should display
