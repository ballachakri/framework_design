@login
Feature: Login
  As a end user
  i enter user my username and password
  then i should  land in my home page

  Scenario Outline: Login functionality
    Given i am on the home page
    When i click on the login button
    Then i should redirect to login page
    When i enter my "<username>" and "<password>"
    Then i should be able to see my account details
    Examples:
    |username|password|
    |ballachakri@yahoo.com|Khalifa123.|