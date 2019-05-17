@search
Feature: search

  As a end user
  I want to search for a product
  then is should view all the relevant products

    Scenario Outline: search functionality

      Given I am on the home page
      When  i have search for a "<product>"
      Then i should view all the relevant products

      Examples:
      | product |
      | shirt |
      | paints |
      | mirror |
      | hand bags |
