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

def timeout = 15

def womenDressHeading = findTestObject('Object Repository/CATEGORY_REVIEW/Page_Automation Exercise - Dress Products/h2_Women - Dress Products')

def menTshirtsHeading = findTestObject('Object Repository/CATEGORY_REVIEW/Page_Automation Exercise - Tshirts Products/h2_Men - Tshirts Products')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

// Mở Category Women
WebUI.click(findTestObject('Object Repository/CATEGORY_REVIEW/Page_Automation Exercise/h4_Women'))

// Click icon +
WebUI.click(findTestObject('Object Repository/CATEGORY_REVIEW/Page_Automation Exercise/i_Women_fa fa-plus'))

// Click vào link Dress
WebUI.click(findTestObject('Object Repository/CATEGORY_REVIEW/Page_Automation Exercise/a_Dress'))

WebUI.comment('*** Bắt đầu kiểm tra trang Women - Dress ***')

// KIỂM TRA TIÊU ĐỀ TRANG 
WebUI.verifyMatch(WebUI.getWindowTitle(), 'Automation Exercise - Dress Products', false, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Validation thành công: Tiêu đề trang là "Automation Exercise - Dress Products".')

// KIỂM TRA TIÊU ĐỀ NỘI DUNG
WebUI.verifyElementText(womenDressHeading, 'WOMEN - DRESS PRODUCTS', FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Validation thành công: Tiêu đề nội dung là "WOMEN - DRESS PRODUCTS".')

WebUI.click(womenDressHeading)

// Mở Category Men
WebUI.click(findTestObject('Object Repository/CATEGORY_REVIEW/Page_Automation Exercise - Dress Products/h4_Men'))

// Click icon +
WebUI.click(findTestObject('Object Repository/CATEGORY_REVIEW/Page_Automation Exercise - Dress Products/span_Men_badge pull-right'))

// Click vào link Tshirts
WebUI.click(findTestObject('Object Repository/CATEGORY_REVIEW/Page_Automation Exercise - Dress Products/a_Tshirts'))

WebUI.comment('*** Bắt đầu kiểm tra trang Men - T-shirts ***')

// a) KIỂM TRA TIÊU ĐỀ TRANG
WebUI.verifyMatch(WebUI.getWindowTitle(), 'Automation Exercise - Tshirts Products', false, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Validation thành công: Tiêu đề trang là "Automation Exercise - Tshirts Products".')

// b) KIỂM TRA TIÊU ĐỀ NỘI DUNG
WebUI.verifyElementText(menTshirtsHeading, 'MEN - TSHIRTS PRODUCTS', FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Validation thành công: Tiêu đề nội dung là "MEN - TSHIRTS PRODUCTS".')

WebUI.click(menTshirtsHeading)

WebUI.closeBrowser()

