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

WebUI.click(findTestObject('02_Web/03_Home/SC005_Create Class/button_Create Class'))

for (int i = 1; i <= 3; i++) {
    WebUI.setText(findTestObject('02_Web/03_Home/SC005_Create Class/input_class'), findTestData('create_class').getValue(
            3, i))

    WebUI.setText(findTestObject('02_Web/03_Home/SC005_Create Class/input_room'), findTestData('create_class').getValue(
            4, i))

    WebUI.click(findTestObject('02_Web/03_Home/SC005_Create Class/button_Create'))

    if (findTestData('create_class').getValue(2, i) == 'negative') {
        WebUI.verifyElementPresent(findTestObject('02_Web/03_Home/SC005_Create Class/button_Create'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('02_Web/03_Home/SC005_Create Class/a_description'), 0)
    }
}

WebUI.closeBrowser()

