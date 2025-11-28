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

//Testcase AUTH-TC04-01
WebUI.openBrowser('https://automationexercise.com')

WebUI.click(findTestObject('Lab6/Page_Automation Exercise/a'))

WebUI.setText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_input_login_email'), 'admin@admin')

WebUI.setText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_input_login_pwd'), 'admin')

WebUI.click(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_login'))

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/Page_Automation Exercise/home_label_feature'), 'FEATURES ITEMS')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_btn_logout'), 'Logout')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/header_username'), 'Logged in as admin')

WebUI.click(findTestObject('Lab6/Page_Automation Exercise/header_btn_logout'))

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_label_login'), 'Login to your account')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_label_signup'), 'New User Signup!')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_login'), 'Login')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_signup'), 'Signup')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise/a'), 'Signup / Login')

//Testcase AUTH-TC04-02

WebUI.click(findTestObject('Lab6/Page_Automation Exercise/header_Home'))

WebUI.click(findTestObject('Lab6/Page_Automation Exercise/Home_btn_product0_ViewProduct'))

WebUI.click(findTestObject('Lab6/Page_Automation Exercise - Product Details/product_btn_addToCart_main'))

WebUI.click(findTestObject('Lab6/Page_Automation Exercise - Product Details/product_btn_popup_ViewCart'))

WebUI.click(findTestObject('Lab6/Page_Automation Exercise - Checkout/cart_btn_ProceedToCheckout'))

WebUI.click(findTestObject('Lab6/Page_Automation Exercise - Checkout/cart_btn_popup_RegisterLogin'))

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_label_login'), 'Login to your account')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_label_signup'), 'New User Signup!')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_login'), 'Login')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_btn_signup'), 'Signup')

WebUI.verifyElementText(findTestObject('Lab6/Page_Automation Exercise - Signup  Login/login_label_login'), 'Login to your account')

WebUI.closeBrowser()

