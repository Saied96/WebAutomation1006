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
Feature: Google Footer links Checkup
As a Google Lover,
I want to learn about the legal policies and terms of service of Google and Gmail.

Background:
    Given I launch the Google home page url
    And I scroll down to the end of the page

Scenario Outline: Selecting different footer links and checking the corresponding page
    When I select "<footerLink_text>" link in the Google footer
    Then I verified the selected Google page by the existence of the "<linkedPage_text>" text

    Examples:
      	|footerLink_text|linkedPage_text|
	      |Privacy|Welcome to the Google Privacy Policy|
	      |Terms|Google Terms of Service|
	      |Settings|Google Settings| 

