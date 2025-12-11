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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'thanhtriu203')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    'triu2k3@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_New User Signup_btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Mr_id_gender1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__password'), 'TRDZ88Rb/1342dAz+GkOQQ==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Date of Birth_days'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Date of Birth_months'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Date of Birth_years'), 
    '2003', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__first_name'), 'thanh')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__last_name'), 'triu')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Company_company'), 'Nlu')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    '23 thu duc')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Address 2_address2'), 'linh trung')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select__country'), 'Singapore', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__state'), 'new')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__city'), 'hcm')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__zipcode'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__mobile_number'), '19002233')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button__btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Account Created_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_1'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Account Created_btn btn-primary'))

WebUI.closeBrowser()

