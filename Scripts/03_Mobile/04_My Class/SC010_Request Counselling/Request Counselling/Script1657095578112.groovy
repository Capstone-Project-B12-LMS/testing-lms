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

Mobile.tapAndHold(findTestObject('03_Mobile/05_Class/Request Counselling/active_class_class'), 0, 0)

Mobile.tap(findTestObject('Object Repository/03_Mobile/05_Class/Request Counselling/btn_reqcounselling'), 0)

for (int i = 1; i <= 2; i++) {
    Mobile.tapAndHold(findTestObject('03_Mobile/05_Class/Request Counselling/txt_Topic'), 0, 0)

    Mobile.setText(findTestObject('Object Repository/03_Mobile/05_Class/Request Counselling/txt_Topic'), findTestData('req_counselling').getValue(
            3, i), 0)

    Mobile.tapAndHold(findTestObject('03_Mobile/05_Class/Request Counselling/txt_Content'), 0, 0)

    Mobile.setText(findTestObject('Object Repository/03_Mobile/05_Class/Request Counselling/txt_Content'), findTestData(
            'req_counselling').getValue(4, i), 0)

    Mobile.tap(findTestObject('Object Repository/03_Mobile/05_Class/Request Counselling/btn_submit'), 0)

    if (findTestData('req_counselling').getValue(2, i) == 'negative') {
        Mobile.verifyElementExist(findTestObject('03_Mobile/05_Class/Request Counselling/topic_alert'), 0)

        Mobile.verifyElementExist(findTestObject('03_Mobile/05_Class/Request Counselling/content_alert'), 0)
    } else {
        Mobile.getText(findTestObject('Object Repository/03_Mobile/05_Class/Request Counselling/success_msg'), 0)

        Mobile.tap(findTestObject('Object Repository/03_Mobile/05_Class/Request Counselling/btn_ok'), 0)
    }
}

Mobile.closeApplication()

