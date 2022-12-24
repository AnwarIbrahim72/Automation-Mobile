@SearchProduct
Feature: Search product

  Background: User can login using valid data
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "melindafitriani81@gmail.com"
    And User input password "Melinda170199"
    And User tap Masuk
    Then User successfully login

  @ESRC001
  Scenario: User Search Product based on name product on search bar
    Given User tap icon beranda
    When user tap menu search bar
    And user input name product "baju"
    Then User can see the product based on name product baju

  @ESRC002
  Scenario: User Search Product based on category elektronik
    Given User tap icon beranda
    When user tap menu button category elektronik
    Then User can see the product based on category elektronik

  @ESRC003
  Scenario: User Search Product based on category komputer dan aksesoris
    Given User tap icon beranda
    When user tap menu button category komputer dan aksesoris
    Then User can see the product based on komputer dan aksesoris
