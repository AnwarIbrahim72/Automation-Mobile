import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:/Users/DELL/Downloads/app-release.apk', false)

Mobile.verifyElementVisible(findTestObject('Homepage/btn_plus_homepage'), 0)

Mobile.verifyElementVisible(findTestObject('Homepage/input_search bar_homepage'), 0)

Mobile.tap(findTestObject('Homepage/akun_new'), 0)

Mobile.tap(findTestObject('Akun Saya Page/btn_masuk_akunsaya'), 0)

Mobile.setText(findTestObject('Login Page/input_email_login'), 'chairunisadwinanda@gmail.com', 0)

Mobile.setText(findTestObject('Login Page/input_password_login'), '123456', 0)

Mobile.tap(findTestObject('Login Page/btn_masuk_login'), 0)

Mobile.tap(findTestObject('Homepage/akun_new'), 0)

Mobile.tap(findTestObject('Akun Saya Page/btn_daftar jual saya_akun saya'), 0)

Mobile.verifyElementVisible(findTestObject('Daftar jual saya/card_product_daftarjualsaya'), 0)

Mobile.verifyElementVisible(findTestObject('Daftar jual saya/tab_diminati'), 0)

Mobile.verifyElementVisible(findTestObject('Daftar jual saya/tab_terjual'), 0)

Mobile.tap(findTestObject('Daftar jual saya/trash'), 0)

Mobile.tap(findTestObject('Daftar jual saya/btn_hapus_daftarjualsaya'), 0)

