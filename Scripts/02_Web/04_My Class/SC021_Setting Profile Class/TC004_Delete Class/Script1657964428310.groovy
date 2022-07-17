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

WebUI.click(findTestObject('02_Web/04_My Class/SC022_Setting Profile Class/menu_ico'))

WebUI.click(findTestObject('02_Web/04_My Class/SC022_Setting Profile Class/menu_my class'))

WebUI.click(findTestObject('02_Web/04_My Class/SC022_Setting Profile Class/a_Class Teacher'))

WebUI.click(findTestObject('02_Web/04_My Class/SC022_Setting Profile Class/class_object'))

WebUI.click(findTestObject('02_Web/04_My Class/SC022_Setting Profile Class/a_settings'))

WebUI.click(findTestObject('02_Web/04_My Class/SC022_Setting Profile Class/a_profile'))

WebUI.click(findTestObject('02_Web/04_My Class/SC022_Setting Profile Class/button_delete'))

WebUI.click(findTestObject('02_Web/04_My Class/SC022_Setting Profile Class/button_Yes'))

WebUI.verifyElementPresent(findTestObject('02_Web/04_My Class/SC023_Leave Class/active_class'), 0)

WebUI.closeBrowser()

