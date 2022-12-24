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

public class Login {
	@Given("User is in homepage")
	public void user_is_in_homepage() {
		Mobile.startApplication('Apk/app-release.apk', true)
		Mobile.verifyElementVisible(findTestObject('Homepage/btn_plus_homepage'), 0)
		Mobile.verifyElementVisible(findTestObject('Homepage/input_search bar_homepage'), 0)
	}

	@When("User tap akun saya menu")
	public void user_tap_akun_saya_menu() {
		Mobile.tap(findTestObject('Homepage/akun_new'), 0)
	}

	@When("User tap Masuk button")
	public void user_tap_Masuk_button() {
		Mobile.tap(findTestObject('Akun Saya Page/btn_masuk_akunsaya'), 0)
	}

	@When("User input email {string}")
	public void user_tap_email(String email) {
		Mobile.setText(findTestObject('Login Page/input_email_login'), email, 0)
	}

	@When("User input password {string}")
	public void user_input_password(String password) {
		Mobile.setText(findTestObject('Login Page/input_password_login'), password, 0)
	}

	@When("User tap Masuk")
	public void user_tap_Masuk() {
		Mobile.tap(findTestObject('Login Page/btn_masuk_login'), 0)
	}

	@Then("User successfully login")
	public void user_successfully_login() {
		Mobile.verifyElementVisible(findTestObject('Akun Saya Page/txt_akun saya_akunsaya'), 0)
	}

	@Then("User failed to login using wrong format email")
	public void user_failed_to_login_using_wrong_format_email() {
		Mobile.verifyElementVisible(findTestObject('Login Page/errormsg_formatemail_login'), 0)
	}

	@Then("User failed to login with input password less than 6 character")
	public void user_failed_to_login_with_input_password_less_than_6_character() {
		Mobile.verifyElementVisible(findTestObject('Login Page/errormsg_password_login'), 0)
	}
}

