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
@Login
Feature: Login Feature
  
  As a user, I want to login to website
  so that I can order the products.

  @Valid
  Scenario Outline: Login with a valid credential
    Given I navigate to Yourlogo homepage
    When I click Sign In button
    And I enter username <username> and password <password>
    And I click Sign in button
    Then I should be able to login successfully

    Examples: 
      | username             | password  |
      | miancloud1@gmail.com | 123456789 |

  @InValid
  Scenario Outline: Login with an invalid credential
    Given I navigate to Yourlogo homepage
    When I click Sign In button
    And I enter an invalid username <username> and password <password>
    And I click Sign in button
    Then I should NOT be able to login successfully

    Examples: 
      | username            | password |
      | miancloud@gmail.com |  1234578 |
