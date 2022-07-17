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

WebUI.callTestCase(findTestCase('02_Web/signin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('02_Web/06_Settings/button_profile'))

WebUI.click(findTestObject('02_Web/06_Settings/menu_my account'))

WebUI.click(findTestObject('02_Web/06_Settings/input_name_name'))

WebUI.click(findTestObject('02_Web/06_Settings/SC025_Edit Profile/change_name_ico'))

WebUI.setText(findTestObject('02_Web/06_Settings/input_name_name'), 'Archen A')

WebUI.click(findTestObject('02_Web/06_Settings/SC025_Edit Profile/change_name_ico'))

WebUI.click(findTestObject('02_Web/06_Settings/SC025_Edit Profile/change_email_ico'))

WebUI.setText(findTestObject('02_Web/06_Settings/input_email_email'), 'archens@gmail.com')

WebUI.click(findTestObject('02_Web/06_Settings/SC025_Edit Profile/change_email_ico'))

WebUI.click(findTestObject('02_Web/06_Settings/SC025_Edit Profile/change_telp_ico'))

WebUI.setText(findTestObject('02_Web/06_Settings/input_telepon_telepon'), '08123456789')

WebUI.click(findTestObject('02_Web/06_Settings/SC025_Edit Profile/change_telp_ico'))

WebUI.click(findTestObject('02_Web/06_Settings/button_Change'))

WebUI.click(findTestObject('02_Web/06_Settings/button_Yes'))

WebUI.verifyElementPresent(findTestObject('02_Web/06_Settings/SC025_Edit Profile/success_msg'), 0)

WebUI.click(findTestObject('02_Web/06_Settings/button_OK'))

WebUI.closeBrowser()

