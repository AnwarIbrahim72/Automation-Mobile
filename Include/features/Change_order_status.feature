@ChangeOrderStatus
Feature: Change Order Status

  @COSTAT001
  Scenario: User as seller can change the status of Diminati product to Tolak
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "tester05@obgsdf.site"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Daftar Jual Saya button
    And User tap Diminati
    And User tap one of Diminati product
    And User tap Tolak button
    And User can see message Status Produk Berhasil Diperbarui
    And User tap back button
    And User tap akun button
    Then User tap logout button
