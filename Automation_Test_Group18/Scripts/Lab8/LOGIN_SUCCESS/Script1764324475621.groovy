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

//Testcase AUTH-TC02-01
WebUI.openBrowser('https://automationexercise.com')

WebUI.click(findTestObject('Lab6/Page_Automation Exercise/a'))

WebUI.setText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_input_login_email'), 'admin@admin')

WebUI.setText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_input_login_pwd'), 'admin')

WebUI.click(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_login'))

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/Page_Automation Exercise/home_label_feature'), 'FEATURES ITEMS')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_btn_logout'), 'Logout')

//Testcase AUTH-TC02-02
WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_username'), 'Logged in as admin')

WebUI.closeBrowser()

