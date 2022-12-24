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

public class Edit_Profile {
	@Given("User tap icon edit profile")
	public void user_tap_icon_edit_profile() {
		Mobile.tap(findTestObject('Object Repository/Akun Saya Page/btn_edit profile_akunsaya'), 0)
	}

	@When("User tap field nama")
	public void user_tap_field_nama() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/field_nama_lengkapiinfoakun'), 0)
	}

	@When("User input valid nama {string}")
	public void user_input_valid_nama(String nama) {
		Mobile.clearText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_nama_lengkapiinfoakun'), 0)
		Mobile.setText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_nama_lengkapiinfoakun'), nama, 0)
	}

	@When("User tap button simpan nama")
	public void user_tap_button_simpan_nama() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/btn_simpan edit profile_lengkapiinfoakun'), 0)
	}

	@When("Show success notification nama")
	public void show_success_notification_nama() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Lengkapi Info Akun Page/txt_notif succses_lengkapiinfoakun'), 0)
	}

	@When("User tap field No HP")
	public void user_tap_field_No_HP() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/field_no hp2_lengkapiinfoakun'), 0)
	}

	@When("User input valid No HP {string}")
	public void user_input_valid_No_HP(String nohp) {
		Mobile.clearText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_no hp_lengkapiinfoakun'), 0)
		Mobile.setText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_no hp_lengkapiinfoakun'), nohp, 0)
	}

	@When("User tap button simpan No HP")
	public void user_tap_button_simpan_No_HP() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/btn_simpan edit profile_lengkapiinfoakun'), 0)
	}

	@When("Show success notification No HP")
	public void show_success_notification_No_HP() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Lengkapi Info Akun Page/txt_notif succses_lengkapiinfoakun'), 0)
	}

	@When("User tap field kota")
	public void user_tap_field_kota() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/field_kota2_lengkapiinfoakun'), 0)
	}

	@When("User input valid Kota {string}")
	public void user_input_valid_Kota(String kota) {
		Mobile.clearText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_kota_lengkapiinfoakun'), 0)
		Mobile.setText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_kota_lengkapiinfoakun'), kota, 0)
	}

	@When("User tap button simpan kota")
	public void user_tap_button_simpan_kota() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/btn_simpan edit profile_lengkapiinfoakun'), 0)
	}

	@When("Show success notification Kota")
	public void show_success_notification_Kota() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Lengkapi Info Akun Page/txt_notif succses_lengkapiinfoakun'), 0)
	}

	@When("User tap field alamat")
	public void user_tap_field_alamat() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/field_alamat_lengkapiinfoakun'), 0)
	}

	@When("User input valid alamat {string}")
	public void user_input_valid_alamat(String alamat) {
		Mobile.clearText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_alamat_lengkapiinfoakun'), 0)
		Mobile.setText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_alamat_lengkapiinfoakun'), alamat, 0)
	}

	@When("User tap button simpan alamat")
	public void user_tap_button_simpan_alamat() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/btn_simpan edit profile_lengkapiinfoakun'), 0)
	}

	@Then("Show success notification alamat")
	public void show_success_notification_alamat() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Lengkapi Info Akun Page/txt_notif succses_lengkapiinfoakun'), 0)
	}

	@When("User tap field email")
	public void user_tap_field_email() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/field_email2_lengkapiinfoakun'), 0)
	}

	@When("User delete value email")
	public void user_delete_value_email() {
		Mobile.clearText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_email_lengkapiinfoakun'), 0)
	}

	@When("User tap button simpan email")
	public void user_tap_button_simpan_email() {
		Mobile.tap(findTestObject('Object Repository/Lengkapi Info Akun Page/btn_simpan edit profile_lengkapiinfoakun'), 0)
	}

	@Then("Show error message email")
	public void show_error_message_email() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Lengkapi Info Akun Page/txt_error msg edit profile_lengkalipinfakun'), 0)
	}


	@Given("User input email with invalid format {string}")
	public void user_input_email_with_invalid_format(String email)  {
		Mobile.clearText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_email_lengkapiinfoakun'), 0)
		Mobile.setText(findTestObject('Object Repository/Lengkapi Info Akun Page/input_email_lengkapiinfoakun'), email, 0)
	}
	
	@Then("Show notification error email")
	public void show_notification_error_email() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Lengkapi Info Akun Page/txt_error message email_lengkapiinfoakun'), 0)
	}

}
