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

Mobile.startExistingApplication(GlobalVariable.id_mobile_apk, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('03_Mobile/02_Auth/SC002_Sign In/field_email'), 0)

Mobile.setText(findTestObject('03_Mobile/02_Auth/SC002_Sign In/field_email'), 'sal@gmail.com', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('03_Mobile/02_Auth/SC002_Sign In/field_password'), 0)

Mobile.setText(findTestObject('03_Mobile/02_Auth/SC002_Sign In/field_password'), 'Salsa123!', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('03_Mobile/02_Auth/SC002_Sign In/button_signin'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('03_Mobile/02_Auth/SC002_Sign In/profile_view'), 0)
