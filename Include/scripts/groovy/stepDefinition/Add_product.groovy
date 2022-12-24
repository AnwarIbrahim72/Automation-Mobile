package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class Add_product {
	@Given("User tap add product button")
	public void user_tap_add_product_button() {
		Mobile.tap(findTestObject('Homepage/btn_plus_homepage'), 0)
	}

	@When("User input nama produk {string}")
	public void user_input_nama_produk(String nama) {
		Mobile.setText(findTestObject('Add Product/input_namaproduk_addproduct'), nama, 0)
	}

	@When("User input harga produk {string}")
	public void user_input_harga_produk(String harga) {
		Mobile.setText(findTestObject('Add Product/input_hargaproduk_addproduct'), harga, 0)
	}

	@When("User tap dropdown list kategori")
	public void user_tap_dropdown_list_kategori() {
		Mobile.tap(findTestObject('Add Product/dropdownlist_pilihkategori_addproduct'), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User pick kategori produk")
	public void user_pick_kategori_produk() {
		Mobile.tap(findTestObject('Add Product/opsi_kategori_addproduct'), 0)
	}

	@When("User input lokasi produk {string}")
	public void user_input_lokasi_produk(String lokasi) {
		Mobile.setText(findTestObject('Add Product/input_lokasiproduk_addproduct'), lokasi, 0)
	}

	@When("User input deskripsi produk {string}")
	public void user_input_deskripsi_produk(String deskripsi) {
		Mobile.setText(findTestObject('Add Product/input_deskripsi_addproduct'), deskripsi, 0)
	}

	@When("User tap button upload image")
	public void user_tap_button_upload_produk() {
		Mobile.tap(findTestObject('Add Product/upload_image_addproduct'), 0)
	}

	@When("User tap galeri")
	public void user_tap_galeri() {
		Mobile.tap(findTestObject('Add Product/btn_galeri'), 0)
	}

	@When("User choose image in galeri")
	public void user_choose_image_in_galeri() {
		Mobile.tap(findTestObject('Object Repository/Add Product/img_leptop'), 0)
	}

	@When("User tap terbitkan button")
	public void user_tap_terbitkan_button() {
		Mobile.tap(findTestObject('Add Product/btn_terbitkan_addproduct'), 0)
	}

	@When("User tap preview button")
	public void user_tap_preview_button() {
		Mobile.tap(findTestObject('Add Product/btn_preview_addproduct'), 0)
	}

	@When("User failed to add product without fill name fields")
	public void user_failed_to_add_product_without_fill_name_fields() {
		Mobile.verifyElementVisible(findTestObject('Add Product/errormsg_namakosong_addproduct'), 0)
	}

	@When("User failed to add product without upload image")
	public void user_failed_to_add_product_without_upload_image() {
		Mobile.verifyElementVisible(findTestObject('Add Product/btn_terbitkan_addproduct'), 0)
	}

	@When("User successfully see preview product")
	public void user_successfully_see_preview_product() {
		Mobile.verifyElementVisible(findTestObject('Add Product/btn_kembalikehalamansebelumnya'), 0)
	}

	@When("User successfully to add new product")
	public void user_successfully_to_add_new_product() {
		Mobile.verifyElementVisible(findTestObject('Add Product/msg_berhasiladd'), 0)
	}

	@When("User tap back button in daftar jual saya page")
	public void user_tap_back_button_in_daftar_jual_saya_page() {
		Mobile.tap(findTestObject('Daftar jual saya/btn_back_daftarjualsaya'), 0)
	}

	@When("User tap kembali ke halaman sebelumnya")
	public void user_tap_kembali_ke_halaman_sebelumnya() {
		Mobile.tap(findTestObject('Add Product/btn_kembalikehalamansebelumnya'), 0)
	}

	@When("User failed to add new product when 5 product is uploaded")
	public void user_failed_to_add_new_product_when_5_product_is_uploaded() {
		Mobile.verifyElementVisible(findTestObject('Add Product/errormsg_limitedupload'), 0)
	}

	@When("User tap akun saya menu to logout")
	public void user_tap_akun_saya_menu_to_logout() {
		Mobile.tap(findTestObject('Homepage/akun_new'), 0)
	}

	@Then("User tap keluar button")
	public void user_tap_keluar_button() {
		Mobile.tap(findTestObject('Akun Saya Page/btn_keluar_new'), 0)
	}
}
