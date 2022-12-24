@SubmitBidPrice
Feature: Submit Bid Price

  @BID002
  Scenario: User as seller can see notification when seller successfully add product "Berhasil diterbitkan"
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "tester04@baswer.space"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Beranda button
    And User tap search bar
    And User search the product the wanted to buy "aaalima"
    And User tap the product
    And User tap Saya Tertarik dan Ingin Nego button
    And User tap Kirim button
    And User see message Harga tawar tidak boleh kosong
    And User tap akun button
    Then User tap logout button

  @BID001
  Scenario: User as seller can see notification when seller successfully add product "Berhasil diterbitkan"
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "tester04@baswer.space"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Beranda button
    And User tap search bar
    And User search the product the wanted to buy "ssstiga"
    And User tap the product
    And User tap Saya Tertarik dan Ingin Nego button
    And User tap Harga Tawar field
    And User input price "40000" to bid
    And User tap Kirim button
    And User see message Harga tawarmu berhasil dikirim
    And User tap akun button
    Then User tap logout button
