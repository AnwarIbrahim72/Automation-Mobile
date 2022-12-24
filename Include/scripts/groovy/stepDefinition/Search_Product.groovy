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

public class Search_Product {
	@Given("User tap icon beranda")
	public void user_tap_icon_beranda() {
		Mobile.tap(findTestObject('Object Repository/Homepage/btn_beranda3_homepage'), 0)
	}

	@When("user tap menu search bar")
	public void user_tap_menu_search_bar() {
		Mobile.tap(findTestObject('Object Repository/Homepage/input_search bar7_homepage'), 0)
	}

	@When("user input name product {string}")
	public void user_input_name_product(String kategori) {
		Mobile.sendKeys(findTestObject('Object Repository/Product Detail and Bid/input_Cari di Second Chance_bid'), kategori)
	}

	@Then("User can see the product based on name product baju")
	public void user_can_see_the_product_based_on_name_product_baju() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Product Detail and Bid/box_product detail_productasbuyer'), 0)
	}

	@When("user tap menu button category elektronik")
	public void user_tap_menu_button_category_elektronik() {
		Mobile.tap(findTestObject('Object Repository/Homepage/txt_kategori elektronik_homepage'), 0)
	}

	@Then("User can see the product based on category elektronik")
	public void user_can_see_the_product_based_on_category_elektronik() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Homepage/txt_elektronik_homepage'), 0)
	}

	@When("user tap menu button category komputer dan aksesoris")
	public void user_tap_menu_button_category_komputer_dan_aksesoris() {
		Mobile.tap(findTestObject('Object Repository/Homepage/txt_kategori komputer dan aksesoris_homepage'), 0)
	}

	@Then("User can see the product based on komputer dan aksesoris")
	public void user_can_see_the_product_based_on_komputer_dan_aksesoris() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Homepage/txt_product komputer dan aksesoris_homepage'), 0)
	}
}
