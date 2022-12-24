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

public class View_transaction {
	@When("User tap Transaksi button")
	public void user_tap_Transaksi_button() {
		Mobile.tap(findTestObject('Object Repository/notifikasi/btn_transaksi_notification'), 0)
	}

	@When("User can see Selesai")
	public void user_can_see_Selesai() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_transaksi tittle_ transaksi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_penawaran produk_transaksi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_tanggal transaksi_transaksi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_nama produk_transaksi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_status transaksi selesai_transaksi'), 0)
	}

	@When("User can see Dibatalkan")
	public void user_can_see_Dibatalkan() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_transaksi tittle_ transaksi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_penawaran produk_transaksi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_tanggal transaksi_transaksi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_nama produk_transaksi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/txt_status transaksi dibatalkan_transaksi'), 0)
	}
}
