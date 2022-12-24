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

public class Submit_bid_price {
	@When("User tap Beranda button")
	public void user_tap_Beranda_button() {
		Mobile.tap(findTestObject('Object Repository/notifikasi/btn_beranda_notification'), 0)
	}

	@When("User tap search bar")
	public void user_tap_search_bar() {
		Mobile.tap(findTestObject('Object Repository/Product Detail and Bid/searchbar_productasbuyer'), 0)
	}

	@When("User search the product the wanted to buy {string}")
	public void user_search_the_product_the_wanted_to_buy(String namaproduk) {
		Mobile.sendKeys(findTestObject('Object Repository/Product Detail and Bid/input_Cari di Second Chance_bid'), namaproduk)
	}

	@When("User tap the product")
	public void user_tap_the_product() {
		Mobile.tap(findTestObject('Object Repository/Product Detail and Bid/box_product detail_productasbuyer'), 0)
	}

	@When("User tap Saya Tertarik dan Ingin Nego button")
	public void user_tap_Saya_Tertarik_dan_Ingin_Nego_button() {
		Mobile.tap(findTestObject('Object Repository/Product Detail and Bid/btn_saya tertarik nego_productdetail'), 0)
	}

	@When("User tap Harga Tawar field")
	public void user_tap_Harga_Tawar_field() {
		Mobile.tap(findTestObject('Object Repository/Product Detail and Bid/input_harga tawar_bid'), 0)
	}

	@When("User input price {string} to bid")
	public void user_input_price_to_bid(String bidprice) {
		Mobile.setText(findTestObject('Object Repository/Product Detail and Bid/input_harga tawar_bid'), bidprice, 0)
		Mobile.pressBack()
	}

	@When("User tap Kirim button")
	public void user_tap_Kirim_button() {
		Mobile.tap(findTestObject('Object Repository/Product Detail and Bid/btn_kirim_bid'), 0)
	}

	@When("User see message Harga tawarmu berhasil dikirim")
	public void user_see_message_Harga_tawarmu_berhasil_dikirim() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Product Detail and Bid/msg_Harga tawarmu berhasil dikirim ke penjual_bid'), 0)
		Mobile.pressBack()
		Mobile.pressBack()
	}

	@When("User see message Harga tawar tidak boleh kosong")
	public void user_see_message_Harga_tawar_tidak_boleh_kosong() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Product Detail and Bid/txt_Harga tawar tidak boleh kosong_bid'), 0)
		Mobile.pressBack()
		Mobile.pressBack()
		Mobile.pressBack()
	}
}
