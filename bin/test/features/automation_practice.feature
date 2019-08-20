#Author: ju.eslogi@hotmail.com
@LoggeoAndBuyDress
Feature: buy the most expensive dress
  As a registered user, I want to buy the most expensive dress

  Background: Esteban log in automationPractice page and make the puchase
    Given Esteban goes to the web
    When he clicks in the login button
    And enter the credentials
      | email                 | pass     |
      | ju.eslogi@hotmail.com | 12345678 |
    Then he should see his user on the page

  @BuyDress
  Scenario: Buy dress and send the proof of payment
    Given esteban clicks the dresses button
    When find the most expensive dress
    And make the purchase process
    Then send the proof of payment   