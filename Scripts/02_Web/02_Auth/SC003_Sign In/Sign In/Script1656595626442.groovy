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

WebUI.openBrowser(GlobalVariable.url_website)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02_Web/02_Auth/SC003_Sign In/button_Login'))

for (int i = 1; i <= 5; i++) {
    WebUI.setText(findTestObject('02_Web/02_Auth/SC003_Sign In/input_email_email'), findTestData('signin_web').getValue(
            3, i))

    WebUI.setText(findTestObject('02_Web/02_Auth/SC003_Sign In/input_password_password'), findTestData('signin_web').getValue(
            4, i))

    WebUI.click(findTestObject('02_Web/02_Auth/SC003_Sign In/button_Login_submit'))

    if (((findTestData('signin_web').getValue(2, i) == 'negative') && (findTestData('signin_web').getValue(3, i) != '')) && 
    (findTestData('signin_web').getValue(5, i) == '')) {
        WebUI.verifyElementPresent(findTestObject('02_Web/02_Auth/SC003_Sign In/failed_login'), 0)

        WebUI.click(findTestObject('02_Web/02_Auth/SC003_Sign In/close_failed_msg'))
    } else if ((findTestData('signin_web').getValue(2, i) == 'negative') && (findTestData('signin_web').getValue(3, i) == 
    '')) {
        WebUI.verifyElementPresent(findTestObject('02_Web/02_Auth/SC003_Sign In/button_Login_submit'), 0)
    } else if ((findTestData('signin_web').getValue(2, i) == 'negative') && (findTestData('signin_web').getValue(5, i) != 
    '')) {
        WebUI.verifyElementPresent(findTestObject(findTestData('signin_web').getValue(5, i)), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('02_Web/02_Auth/SC003_Sign In/button_profile icon'), 0)
    }
}

WebUI.closeBrowser()

