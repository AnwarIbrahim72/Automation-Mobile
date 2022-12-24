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
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
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

public class Edit_product {
	@When("User tap Daftar Jual Saya")
	public void user_tap_Daftar_Jual_Saya() {
		Mobile.tap(findTestObject('Object Repository/Akun Saya Page/btn_daftar jual saya_akun saya'), 0)
		Mobile.delay(15)
	}

	@When("User tap one of the product")
	public void user_tap_one_of_the_product() {
		Mobile.tap(findTestObject('Object Repository/Edit Product/img_choose product_editproduct'), 0)
	}

	@When("User tap and empty product name field")
	public void user_tap_and_empty_product_name_field() {
		Mobile.tap(findTestObject('Object Repository/Edit Product/input_product name_editproduct'), 0)
		Mobile.clearText(findTestObject('Object Repository/Edit Product/input_product name_editproduct'), 0)
	}

	@When("User type new product name {string}")
	public void user_type_new_product_name(String name) {
		Mobile.setText(findTestObject('Object Repository/Edit Product/input_product name_editproduct'), name, 0)
	}

	@When("User tap and empty product price field")
	public void user_tap_and_empty_product_price_field() {
		Mobile.tap(findTestObject('Object Repository/Edit Product/input_product price_editproduct'), 0)
		Mobile.clearText(findTestObject('Object Repository/Edit Product/input_product price_editproduct'), 0)
	}

	@When("User type new product price {string}")
	public void user_type_new_product_price(String price) {
		Mobile.setText(findTestObject('Object Repository/Edit Product/input_product price_editproduct'), price, 0)
	}

	@When("User delete existing kategory")
	public void user_delete_existing_kategory() {
		Mobile.tap(findTestObject('Object Repository/Edit Product/button_delete category_editproduct'), 0)
	}

	@When("User select new category from category dropdown")
	public void user_select_new_category_from_category_dropdown() {
		Mobile.tap(findTestObject('Object Repository/Edit Product/dropdown_product category_editproduct'), 0)
		Mobile.tap(findTestObject('Object Repository/Edit Product/kategori_elektronik'), 0)
	}

	@When("User tap and empty product location field")
	public void user_tap_and_empty_product_location_field() {
		Mobile.scrollToText('Lokasi', FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Edit Product/input_location_editproduct'), 0)
		Mobile.clearText(findTestObject('Object Repository/Edit Product/input_location_editproduct'), 0)
	}

	@When("User type new product location {string}")
	public void user_type_new_product_location(String location) {
		Mobile.setText(findTestObject('Object Repository/Edit Product/input_location_editproduct'), location, 0)
	}

	@When("User tap and empty product description field")
	public void user_tap_and_empty_product_description_field() {
		Mobile.scrollToText('Deskripsi', FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Edit Product/input_description_editproduct'), 0)
		Mobile.clearText(findTestObject('Object Repository/Edit Product/input_description_editproduct'), 0)
	}

	@When("User type new product description {string}")
	public void user_type_new_product_description(String description) {
		Mobile.setText(findTestObject('Object Repository/Edit Product/input_description_editproduct'), description, 0)
	}

	@When("User change product photo")
	public void user_change_product_photo() {
		Mobile.scrollToText('Foto Produk', FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Edit Product/android.widget.ImageView2_editproduk'), 0)
		Mobile.tap(findTestObject('Object Repository/Edit Product/btn_add img gallery_editproduct'), 0)
	}

	@When("User pick new product photo")
	public void user_pick_new_product_photo() {
		Mobile.tap(findTestObject('Object Repository/Edit Product/img_pick edit image_editproduct'), 0)
	}

	@When("User tap Perbarui Produk button")
	public void user_tap_Perbarui_Produk_button() {
		Mobile.tap(findTestObject('Object Repository/Edit Product/btn_perbarui produk_editproduct'), 0)
	}

	@When("User can see message Product Berhasil Diperbarui")
	public void user_can_see_message_Product_Berhasil_Diperbarui() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Edit Product/txt_Produk berhasil diperbarui_editproduct'), 0)
		Mobile.pressBack()
	}

	@When("User can see message Nama produk tidak boleh kosong")
	public void user_can_see_message_Nama_produk_tidak_boleh_kosong() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Edit Product/msg_Nama produk tidak boleh kosong_editproduct'), 0)
	}

	@When("User can see message Harga tidak boleh kosong")
	public void user_can_see_message_Harga_tidak_boleh_kosong() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Edit Product/msg_harga tidak boleh kosong_editproduct'), 0)
	}

	@When("User can see message Lokasi tidak boleh kosong")
	public void user_can_see_message_Lokasi_tidak_boleh_kosong() {
		Mobile.scrollToText('Lokasi tidak boleh kosong', FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Edit Product/msg_Lokasi tidak boleh kosong_editproduct'), 0)
		Mobile.pressBack()
	}

	@When("User can see message Deskripsi produk tidak boleh kosong")
	public void user_can_see_message_Deskripsi_produk_tidak_boleh_kosong() {
		Mobile.scrollToText('Deskripsi produk tidak boleh kosong', FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Edit Product/msg_Deskripsi produk tidak boleh kosong_editproduct'), 0)
		Mobile.pressBack()
	}

	@When("User tap back button")
	public void user_tap_back_button() {
		Mobile.tap(findTestObject('Object Repository/Diminati/btn_back to akun saya_diminati'), 0)
		Mobile.pressBack()
	}
}
