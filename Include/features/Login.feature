@login
Feature: Login

  @LOG002
  Scenario: User login with wrong format email
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "chairunisa.gmail.com"
    And User input password "12345678"
    And User tap Masuk
    Then User failed to login using wrong format email

  @LOG003
  Scenario: User login with input password less than 6 character
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "chairunisadwinanda@gmail.com"
    And User input password "123"
    And User tap Masuk
    Then User failed to login with input password less than 6 character

  @LOG001
  Scenario: User can login using valid data
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "chairunisadwinanda@gmail.com"
    And User input password "123456"
    And User tap Masuk
    And User successfully login
    Then User tap keluar button
