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

WebUI.click(findTestObject('Object Repository/Object Repository/TC_Contact_06/Page_Automation Exercise/a_Contact us'))

WebUI.setText(findTestObject('Object Repository/Object Repository/TC_Contact_06/Page_Automation Exercise - Contact Us/input_Get In Touch_name'), 
    'Trương Tấn Đạt')

WebUI.setText(findTestObject('Object Repository/Object Repository/TC_Contact_06/Page_Automation Exercise - Contact Us/input_Get In Touch_email'), 
    '22130037@st.hcmuaf.edu.vn')

WebUI.setText(findTestObject('Object Repository/Object Repository/TC_Contact_06/Page_Automation Exercise - Contact Us/input_Get In Touch_subject'), 
    'Kiểm tra contact us')

WebUI.setText(findTestObject('Object Repository/Object Repository/TC_Contact_06/Page_Automation Exercise - Contact Us/textarea_Get In Touch_message'), 
    'Dear\nhello\ntôi đang gặp vấn đề này\n..\n..\nthanks')

WebUI.click(findTestObject('Object Repository/Object Repository/TC_Contact_06/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Object Repository/TC_Contact_06/Page_Automation Exercise - Contact Us/div_Success Your details have been submitte_fc584e'))

