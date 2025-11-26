import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')
WebUI.navigateToUrl('https://automationexercise.com')

WebUI.click(findTestObject('TC_Search/btn_Products'))


WebUI.setText(findTestObject('TC_Search/input_Search'), 'Dress')
WebUI.click(findTestObject('TC_Search/btn_Search'))


WebUI.click(findTestObject('TC_Search/btn_AddToCart_FirstProduct'))
WebUI.click(findTestObject('TC_Search/btn_ContinueShopping'))

WebUI.click(findTestObject('TC_Search/btn_Cart'))

WebUI.verifyElementPresent(findTestObject('TC_Search/cart_Product'), 10)

WebUI.click(findTestObject('TC_Search/btn_Login'))

WebUI.setText(findTestObject('TC_Search/input_LoginEmail'), 'nnthanh1209@gmail.com')
WebUI.setText(findTestObject('TC_Search/input_LoginPassword'), 'thanh12092003')
WebUI.click(findTestObject('TC_Search/btn_LoginSubmit'))

WebUI.click(findTestObject('TC_Search/btn_Cart'))

WebUI.verifyElementPresent(findTestObject('TC_Search/cart_Product'), 10)

WebUI.closeBrowser()
