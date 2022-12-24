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

public class Delete_product {
	@When("User tap akun saya menu for delete product")
	public void user_tap_akun_saya_menu_for_delete_product() {
		Mobile.tap(findTestObject('Homepage/akun_new'), 0)
	}

	@When("User tap Daftar jual saya menu")
	public void user_tap_Daftar_jual_saya_menu() {
		Mobile.tap(findTestObject('Akun Saya Page/btn_daftar jual saya_akun saya'), 0)
		Mobile.verifyElementVisible(findTestObject('Daftar jual saya/card_product_daftarjualsaya'), 0)
		Mobile.verifyElementVisible(findTestObject('Daftar jual saya/tab_diminati'), 0)
		Mobile.verifyElementVisible(findTestObject('Daftar jual saya/tab_terjual'), 0)
	}

	@When("User tap Hapus button at product will be deleted")
	public void user_tap_Hapus_button_at_product_will_be_deleted() {
		Mobile.tap(findTestObject('Daftar jual saya/trash'), 0)
	}

	@Then("User tap Hapus")
	public void user_tap_Hapus() {
		Mobile.tap(findTestObject('Daftar jual saya/btn_hapus_daftarjualsaya'), 0)
	}
}
