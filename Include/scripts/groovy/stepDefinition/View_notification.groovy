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

public class View_notification {
	@When("User tap Notifikasi button")
	public void user_tap_Notifikasi_button() {
		Mobile.tap(findTestObject('Object Repository/notifikasi/btn_notifikasi_notification'), 0)
	}

	@When("User can see Berhasil diterbitkan")
	public void user_can_see_Berhasil_diterbitkan() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/img_gambar produk_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_nama produk_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_notifikasi_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_Berhasil diterbitkan_notification'), 0)
	}

	@When("User tap akun button")
	public void user_tap_akun_button() {
		Mobile.tap(findTestObject('Homepage/akun_new'), 0)
	}

	@Then("User tap logout button")
	public void user_tap_logout_button() {
		Mobile.tap(findTestObject('Object Repository/Akun Saya Page/btn_keluar_akunsaya'), 0)
	}

	@When("User can see Penawaran produk")
	public void user_can_see_Penawaran_produk() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/img_gambar produk_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_nama produk_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_notifikasi_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_Penawaran produk_notification'), 0)
	}

	@When("User can see Penawaran ditolak")
	public void user_can_see_Penawaran_ditolak() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/img_gambar produk_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_nama produk_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_notifikasi_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_Penawaran ditolak_notification'), 0)
	}

	@When("User can see Berhasil ditawar")
	public void user_can_see_Berhasil_ditawar() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/img_gambar produk_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_nama produk_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_notifikasi_notifikasi'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_Berhasil ditawar Rp80.000_notification'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/notifikasi/txt_Kamu akan segera dihubungi oleh penjual via whatsapp_notification'), 0)
	}
}
