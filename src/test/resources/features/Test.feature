@notest
Feature: This feature is to test cucumber regex
  Background: This background keyword will be a preconditions
    Scenario Outline: This scenario is to test cucumber regex
      Given 1 user is on login page
      Then 1.1 user is on login page
      And user enters "UserName"
      And user enters below credentials
      |admin|admin|
      And user enters below credentials too
      |UserName|Password|
        |admin|admin|
      And USer register with "<FName>" and "<LName>"
      Examples:
      |FName|LName|
      |FName1|LName1|
      |FName2|LName2|