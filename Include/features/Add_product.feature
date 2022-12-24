@add_product
Feature: Add Product

  Background: User login to app
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "chairunisadwinanda@gmail.com"
    And User input password "123456"
    And User tap Masuk

  @negative_case001
  Scenario: User add new product without fill name fields
    Given User tap add product button
    When User input harga produk "10000"
    And User tap dropdown list kategori
    And User pick kategori produk
    And User input lokasi produk "Bandung"
    And User input deskripsi produk "laptop bagus"
    And User tap button upload image
    And User tap galeri
    And User choose image in galeri
    And User tap terbitkan button
    And User failed to add product without fill name fields
    And User tap back button
    And User tap akun saya menu to logout
    Then User tap keluar button

  @negative_case002
  Scenario: User add new product without upload image
    Given User tap add product button
    When User input nama produk "Macbook Pro M2"
    And User input harga produk "20000"
    And User tap dropdown list kategori
    And User pick kategori produk
    And User input lokasi produk "Bandung"
    And User input deskripsi produk "laptop bagus"
    And User tap terbitkan button
    And User failed to add product without upload image
    And User tap back button
    And User tap akun saya menu to logout
    Then User tap keluar button

  @negative_case003
  Scenario: User can see preview product
    Given User tap add product button
    When User input nama produk "Macbook Pro M2"
    And User input harga produk "30000"
    And User tap dropdown list kategori
    And User pick kategori produk
    And User input lokasi produk "Bandung"
    And User input deskripsi produk "laptop bagus"
    And User tap button upload image
    And User tap galeri
    And User choose image in galeri
    And User tap preview button
    And User successfully see preview product
    And User tap kembali ke halaman sebelumnya
    And User tap back button
    And User tap akun saya menu to logout
    Then User tap keluar button

  @positive_case004
  Scenario: User add new product with valid data
    Given User tap add product button
    When User input nama produk "Macbook Pro M2"
    And User input harga produk "123456"
    And User tap dropdown list kategori
    And User pick kategori produk
    And User input lokasi produk "Bandung"
    And User input deskripsi produk "laptop bagus"
    And User tap button upload image
    And User tap galeri
    And User choose image in galeri
    And User tap terbitkan button
    And User successfully to add new product
    And User tap back button in daftar jual saya page
    And User tap akun saya menu to logout
    Then User tap keluar button

  @negative_case005
  Scenario: User add new product when 5 product is uploaded
    Given User tap add product button
    When User input nama produk "Macbook Pro M2"
    And User input harga produk "123456"
    And User tap dropdown list kategori
    And User pick kategori produk
    And User input lokasi produk "Bandung"
    And User input deskripsi produk "laptop bagus"
    And User tap button upload image
    And User tap galeri
    And User choose image in galeri
    And User tap terbitkan button
    And User failed to add new product when 5 product is uploaded
    And User tap back button
    And User tap akun saya menu to logout
    Then User tap keluar button
