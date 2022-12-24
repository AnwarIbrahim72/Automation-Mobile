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

Mobile.tap(findTestObject('Homepage/btn_plus_homepage'), 0)

Mobile.setText(findTestObject('Add Product/input_namaproduk_addproduct'), 'leptop', 0)

Mobile.setText(findTestObject('Add Product/input_hargaproduk_addproduct'), '12345', 0)

Mobile.tap(findTestObject('Add Product/dropdownlist_pilihkategori_addproduct'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add Product/opsi_kategori_addproduct'), 0)

Mobile.setText(findTestObject('Add Product/input_lokasiproduk_addproduct'), 'bandung', 0)

Mobile.setText(findTestObject('Add Product/input_deskripsi_addproduct'), 'desccc', 0)

Mobile.tap(findTestObject('Add Product/upload_image_addproduct'), 0)

Mobile.tap(findTestObject('Add Product/btn_galeri'), 0)

Mobile.tap(findTestObject('Add Product/img_leptop'), 0)

Mobile.tap(findTestObject('Add Product/btn_terbitkan_addproduct'), 0)

