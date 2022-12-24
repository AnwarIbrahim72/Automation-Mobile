@Transaction
Feature: View Transaction

  @TRAN001
  Scenario: User as buyer can see on transaction page when transaction is completed "Selesai"
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "aldera1212@gmail.com"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Transaksi button
    And User can see Selesai
    And User tap akun button
    Then User tap logout button

  @TRAN002
  Scenario: User as buyer can see on transaction page when transaction is cancelled "Dibatalkan"
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "aldera1212@gmail.com"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Transaksi button
    And User can see Dibatalkan
    And User tap akun button
    Then User tap logout button
