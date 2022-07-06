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

Mobile.startExistingApplication('com.example.capstone_project_lms')

for (int i = 1; i <= 3; i++) {
    Mobile.tap(findTestObject('03_Mobile/03_Home/SC006_Join Class/btn_joinclass'), 0)

    Mobile.tapAndHold(findTestObject('03_Mobile/03_Home/SC006_Join Class/txt_codeclass'), 0, 0)

    Mobile.setText(findTestObject('03_Mobile/03_Home/SC006_Join Class/txt_codeclass'), findTestData('join_class').getValue(
            3, i), 0)

    Mobile.tap(findTestObject('03_Mobile/03_Home/SC006_Join Class/btn_join'), 0)

    if (findTestData('join_class').getValue(2, i) == 'negative') {
        Mobile.verifyElementExist(findTestObject('03_Mobile/03_Home/SC006_Join Class/failed_message'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        Mobile.verifyElementExist(findTestObject('03_Mobile/03_Home/SC006_Join Class/success'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    }
}

Mobile.closeApplication()

