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

WebUI.callTestCase(findTestCase('02_Web/signin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02_Web/04_My Class/Create Material/menu_ico'))

WebUI.click(findTestObject('02_Web/04_My Class/Create Material/menu_myclass'))

WebUI.click(findTestObject('02_Web/04_My Class/Create Material/menu_classteacher'))

WebUI.click(findTestObject('02_Web/04_My Class/Create Material/class_object'))

WebUI.click(findTestObject('02_Web/04_My Class/Create Material/input_announce'))

WebUI.setText(findTestObject('02_Web/04_My Class/Create Material/input_title'), 'Material ')

WebUI.sendKeys(findTestObject('02_Web/04_My Class/Create Material/input_desc'), '<p style="">This is description of a material</p>')

WebUI.click(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/button_Upload PPT'))

WebUI.setText(findTestObject('02_Web/04_My Class/Create Material/input_Add Link PPT'), 'https://docs.google.com/presentation/d/1NjM5yM68CHO1LbGGbV8PdvPvrRaYXXJO6c07FBpZBMQ/edit?usp=sharing')

WebUI.click(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/button_ADD'))

WebUI.click(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/button_Upload Video'))

WebUI.setText(findTestObject('02_Web/04_My Class/Create Material/input_Add Link Video'), 'https://youtu.be/8Wmo4Fjatoo')

WebUI.click(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/button_ADD'))

WebUI.click(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/button_Posting'))

WebUI.click(findTestObject('02_Web/04_My Class/Create Material/menu_content'))

WebUI.click(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/button_Material'))

WebUI.verifyElementPresent(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/h1_Material'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/button_Material_lty-playbtn'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/02_Web/04_My Class/SC011_Request Counselling/Page_React App/p_This is description of a material'), 
    0)

