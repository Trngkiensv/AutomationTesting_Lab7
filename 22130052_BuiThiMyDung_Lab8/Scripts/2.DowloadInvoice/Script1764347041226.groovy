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

WebUI.click(findTestObject('Object Repository/1.VerifyAddress/Page_Automation Exercise/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/1.VerifyAddress/Page_Automation Exercise - Signup  Login/input_Login to your account_email'), 
    'dungbui19304@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1.VerifyAddress/Page_Automation Exercise - Signup  Login/input_Login to your account_password'), 
    'M/qzdo4wFHA=')

WebUI.click(findTestObject('Object Repository/1.VerifyAddress/Page_Automation Exercise - Signup  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/1.VerifyAddress/Page_Automation Exercise/a_Products'))

WebUI.click(findTestObject('Object Repository/1.VerifyAddress/Page_Automation Exercise - All Products/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/1.VerifyAddress/Page_Automation Exercise - All Products/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/1.VerifyAddress/Page_Automation Exercise - All Products/a_Cart'))

WebUI.click(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.click(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Checkout/a_Place Order'))

WebUI.setText(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), '1234')

WebUI.setText(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_Card Number_card_number'), '123')

WebUI.setText(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_CVC_cvc'), '')

WebUI.click(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_CVC_cvc'))

WebUI.setText(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 'dung')

WebUI.setText(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_Card Number_card_number'), '1234')

WebUI.setText(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_CVC_cvc'), '123')

WebUI.setText(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_Expiration_expiry_month'), '12')

WebUI.setText(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/input_Expiration_expiry_year'), '2004')

WebUI.click(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Payment/button_Pay and Confirm Order'))

WebUI.click(findTestObject('Object Repository/2.DowloadInvoice/Page_Automation Exercise - Order Placed/a_Download Invoice'))
WebUI.closeBrowser()

