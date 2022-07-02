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

Mobile.tap(findTestObject('03_Mobile/SC003_Sign Up/a_signup'), 0, FailureHandling.CONTINUE_ON_FAILURE)

for (int i = 1; i <= 8; i++) {
    Mobile.tap(findTestObject('03_Mobile/SC003_Sign Up/field_fullname'), 0)

    Mobile.setText(findTestObject('03_Mobile/SC003_Sign Up/field_fullname'), findTestData('signup').getValue(3, i), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('03_Mobile/SC003_Sign Up/field_email'), 0)

    Mobile.setText(findTestObject('03_Mobile/SC003_Sign Up/field_email'), findTestData('signup').getValue(4, i), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('03_Mobile/SC003_Sign Up/field_password'), 0)

    Mobile.setText(findTestObject('03_Mobile/SC003_Sign Up/field_password'), findTestData('signup').getValue(5, i), 0)

    // Mobile.setText(findTestObject('03_Mobile/SC003_Sign Up/field_password'), findTestData('signup').getValue(5, 
    //        i), 0, FailureHandling.STOP_ON_FAILURE)
    Mobile.tap(findTestObject('03_Mobile/SC003_Sign Up/button_signup'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    if (findTestData('signup').getValue(2, i) == 'negative') {
        Mobile.verifyElementExist(findTestObject('03_Mobile/SC003_Sign Up/create_acc'), 0 // verify
            )
    } else {
        Mobile.verifyElementExist(findTestObject('03_Mobile/SC002_Sign In/welcome_back'), 0)
    }
}

