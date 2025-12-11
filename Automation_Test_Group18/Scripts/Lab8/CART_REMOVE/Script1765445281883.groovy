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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import java.util.Arrays
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import java.util.Arrays
import org.openqa.selenium.interactions.Actions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import org.openqa.selenium.WebElement
import java.util.Arrays

def timeout = 15

// Đối tượng cho thao tác Add to Cart 
def hoverTriggerObject = findTestObject('Object Repository/CART_REMOVE/Page_Automation Exercise/Product_1_Hover_Trigger')
def addToCartObject = findTestObject('Object Repository/CART_REMOVE/Page_Automation Exercise/a_Add to cart')

// Đối tượng Kiểm tra
def deleteCartLink = findTestObject('Object Repository/CART_REMOVE/Page_Automation Exercise - Checkout/a_Blue Top_cart_quantity_delete')
def productRowObject = findTestObject('Object Repository/CART_REMOVE/Page_Automation Exercise - Checkout/Product_Blue_Top_Row') 
def emptyCartMessageObject = findTestObject('Object Repository/CART_REMOVE/Page_Automation Exercise - Checkout/Empty_Cart_Message')


WebUI.openBrowser('')
WebUI.navigateToUrl('https://automationexercise.com/')
WebUI.maximizeWindow()
WebUI.waitForPageLoad(timeout)

WebUI.mouseOver(hoverTriggerObject)
WebUI.waitForElementVisible(addToCartObject, 5)

WebElement addToCartElement = WebUI.findWebElement(addToCartObject)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(addToCartElement))

WebUI.click(findTestObject('Object Repository/CART_REMOVE/Page_Automation Exercise/u_View Cart'))
WebUI.comment('Đã thêm sản phẩm và chuyển đến giỏ hàng.')

// Xóa sản phẩm khỏi giỏ hàng
WebUI.click(deleteCartLink)
WebUI.comment('Đã click nút xóa sản phẩm.')

WebUI.comment('BẮT ĐẦU KIỂM TRA XÁC NHẬN')

// Xác nhận sản phẩm không còn hiển thị
WebUI.verifyElementNotPresent(productRowObject, 5, FailureHandling.STOP_ON_FAILURE)
WebUI.comment('Xác nhận thành công: Sản phẩm (Blue Top) không còn tồn tại trong DOM.')


// Xác nhận Giỏ hàng hiển thị thông báo "Giỏ hàng trống"
WebUI.verifyElementText(emptyCartMessageObject, 'Cart is empty! Click here to buy products.', FailureHandling.STOP_ON_FAILURE)
WebUI.comment('Xác nhận thành công: Thông báo "Cart is empty! Click here to buy products" đã hiển thị.')

WebUI.comment('KẾT THÚC KIỂM TRA XÁC NHẬN')
WebUI.closeBrowser()
