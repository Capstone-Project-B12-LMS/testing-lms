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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication('com.example.capstone_project_lms', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Object Repository/03_Mobile/04_My Class/SC016_View Detail Content Material/class_object'), 
    0, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('03_Mobile/04_My Class/SC016_View Detail Content Material/menu_contents'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Object Repository/03_Mobile/04_My Class/SC016_View Detail Content Material/choose_materi1'), 
    0, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/03_Mobile/04_My Class/SC016_View Detail Content Material/title_materi1'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/03_Mobile/04_My Class/SC016_View Detail Content Material/menu_desc'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/03_Mobile/04_My Class/SC016_View Detail Content Material/desc_materi1'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

driver.terminateApp('com.example.capstone_project_lms')

