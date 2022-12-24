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

public class Change_order_status {
	@When("User tap Daftar Jual Saya button")
	public void user_tap_Daftar_Jual_Saya_button() {
		Mobile.tap(findTestObject('Object Repository/Akun Saya Page/btn_daftar jual saya_akun saya'), 0)
	}

	@When("User tap Diminati")
	public void user_tap_Diminati() {
		Mobile.tap(findTestObject('Object Repository/Diminati/btn_diminati_diminati'), 0)
	}

	@When("User tap one of Diminati product")
	public void user_tap_one_of_Diminati_product() {
		Mobile.tap(findTestObject('Object Repository/Diminati/txt_product name_diminati'), 0)
	}

	@When("User tap Tolak button")
	public void user_tap_Tolak_button() {
		Mobile.tap(findTestObject('Object Repository/Diminati/btn_tolak_diminati_penawar'), 0)
	}

	@When("User can see message Status Produk Berhasil Diperbarui")
	public void user_can_see_message_Status_Produk_Berhasil_Diperbarui() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Diminati/msg_Status produk berhasil diperbarui_diminati_penawar'), 0)
	}

	@When("User tap Terima button")
	public void user_tap_Terima_button() {
		Mobile.tap(findTestObject('Object Repository/Diminati/btn_terima_diminati_penawar'), 0)
		Mobile.pressBack()
	}

	@When("User tap Status button")
	public void user_tap_Status_button() {
		Mobile.tap(findTestObject('Object Repository/Diminati/btn_Status_status'), 0)
	}

	@When("User choose Batalkan transaksi")
	public void user_choose_Batalkan_transaksi() {
		Mobile.tap(findTestObject('Object Repository/Diminati/RadioButton_Batalkan transaksi_diminati_order'), 0)
	}

	@When("User tap Simpan button")
	public void user_tap_Simpan_button() {
		Mobile.tap(findTestObject('Object Repository/Diminati/btn_simpan_diminati_order'), 0)
	}

	@When("User can see message Status Produk Berhasil Diperbarui terima")
	public void user_can_see_message_Status_Produk_Berhasil_Diperbarui_terima() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Diminati/msg_Status produk berhasil diperbarui_diminati_penawar'), 0)
	}
}