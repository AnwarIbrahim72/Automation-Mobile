@editprofile
Feature: Edit Profile

  Background: User can login using valid data
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "melindafitriani81@gmail.com"
    And User input password "Melinda170199"
    And User tap Masuk
    Then User successfully login

  @EPROF001
  Scenario: User Edit Info Profile Using Valid Data
    Given User tap icon edit profile
    When User tap field nama
    And User input valid nama "Melinda Fitriani"
    And User tap button simpan nama
    And Show success notification nama
    And User tap field No HP
    And User input valid No HP "08837366521"
    And User tap button simpan No HP
    And Show success notification No HP
    And User tap field kota
    And User input valid Kota "Sukabumi"
    And User tap button simpan kota
    And Show success notification Kota
    And User tap field alamat
    And User input valid alamat "kp. cikembang"
    And User tap button simpan alamat
    Then Show success notification alamat

  @EPROF002
  Scenario: User not filling field email
    Given User tap icon edit profile
    When User tap field email
    And User delete value email
    And User tap button simpan email
    Then Show error message email

  @EPROF003
  Scenario: User input email with invalid format
    Given User tap icon edit profile
    And User tap field email
    And User input email with invalid format "melinda"
    And User tap button simpan email
    Then Show notification error email

  @EPROF003
  Scenario: User input email with invalid format
    Given User tap icon edit profile
    And User tap field email
    And User input email with invalid format "melinda"
    And User tap button simpan email