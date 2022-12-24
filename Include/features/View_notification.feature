@Notification
Feature: View Notification

  @NOT001
  Scenario: User as seller can see notification when seller successfully add product "Berhasil diterbitkan"
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "anwar.ibrahim0072@gmail.com"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Notifikasi button
    And User can see Berhasil diterbitkan
    And User tap akun button
    Then User tap logout button

  @NOT002
  Scenario: User as buyer can see notification when buyer order product "Penawaran produk"
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "anwar.ibrahim0072@gmail.com"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Notifikasi button
    And User can see Penawaran produk
    And User tap akun button
    Then User tap logout button

  @NOT003
  Scenario: User as buyer can see notification when buyer order rejected  "Penawaran ditolak"
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "aldera1212@gmail.com"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Notifikasi button
    And User can see Penawaran ditolak
    And User tap akun button
    Then User tap logout button

  @NOT004
  Scenario: User as buyer can see notification when buyer order accepted  "Kamu akan segera dihubungi olah penjual via whatsapp"
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "anwar.ibrahim0072@gmail.com"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Notifikasi button
    And User can see Berhasil ditawar
    And User tap akun button
    Then User tap logout button
