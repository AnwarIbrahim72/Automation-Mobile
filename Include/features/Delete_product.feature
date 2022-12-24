@delete
Feature: Delete Product

  Background: User login to app
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "chairunisadwinanda@gmail.com"
    And User input password "123456"
    And User tap Masuk

  Scenario: User can delete the product
    Given User tap akun saya menu for delete product
    When User tap Daftar jual saya menu
    When User tap Hapus button at product will be deleted
    Then User tap Hapus
