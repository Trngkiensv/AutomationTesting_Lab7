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

WebUI.openBrowser('https://automationexercise.com')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_Home'), 'Home')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_Products'), ' Products')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_ContactUs'), 'Contact us')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_SignupLogin'), 'Cart')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_Cart'), 'Cart')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_TestCase'), 'Test Cases')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_APITesting'), 'API Testing')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_VideoTutorials'), 'Video Tutorials')

WebUI.click(findTestObject('Lab6/Page_Automation Exercise/a'))

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_label_login'), 'Login to your account')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_label_signup'), 'New User Signup!')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_login'), 'Login')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_signup'), 'Signup')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_label_signup'), 'New User Signup!')

WebUI.setText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_input_signup_name'), 'admin@123')

WebUI.setText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_input_signup_email'), 'admin@123')

WebUI.click(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_signup'))

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_verify_login_EmailOrPwdIncorrect'),
	'Email Address already exist!')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_signup'), 'Signup')

WebUI.closeBrowser()
