@EditProduct
Feature: Edit Product

  @EDPROD001
  Scenario: User as seller can edit their products using valid data
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "tester03@czsder.online"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Daftar Jual Saya
    And User tap one of the product
    And User tap and empty product name field
    And User type new product name "ssdua"
    And User tap and empty product price field
    And User type new product price "10000"
    And User delete existing kategory
    And User select new category from category dropdown
    And User tap and empty product location field
    And User type new product location "kudus"
    And User tap and empty product description field
    And User type new product description "buku dua"
    And User change product photo
    And User pick new product photo
    And User tap Perbarui Produk button
    And User can see message Product Berhasil Diperbarui
    And User tap akun button
    Then User tap logout button

  @EDPROD002
  Scenario: User as seller cannot edit their products using empty data
    Given User is in homepage
    When User tap akun saya menu
    And User tap Masuk button
    And User input email "tester03@czsder.online"
    And User input password "123456789"
    And User tap Masuk
    And User successfully login
    And User tap Daftar Jual Saya
    And User tap one of the product
    And User tap and empty product name field
    And User can see message Nama produk tidak boleh kosong
    And User tap and empty product price field
    And User can see message Harga tidak boleh kosong
    And User tap and empty product location field
    And User can see message Lokasi tidak boleh kosong
    And User tap and empty product description field
    And User can see message Deskripsi produk tidak boleh kosong
    And User tap back button
    And User tap akun button
    Then User tap logout button
