@login @regression
Feature: I want to use test login feature so  that ican test login functionality.

  @tag1
  Scenario: valid Login
    Given user open the application
    When I enter valid userName and Password
    Then I successfuly login
  