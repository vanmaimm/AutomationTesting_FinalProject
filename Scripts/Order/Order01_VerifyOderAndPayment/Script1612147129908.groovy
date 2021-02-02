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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

CustomKeywords.'shop.Login.loginIntoApplicationWithGlobalVariable'()

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/img_Call us now_logo img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_Continue shopping'))

WebUI.click(findTestObject('Object Repository/Page_My Store/b_Cart'))

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=order')

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/Proceed_Ckeckout_Address'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/input_2.00_cgv'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout_1'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/a_Pay by check (order processing will be longer)'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_I confirm my order'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Order - My Store/order_successfully'), 10)) {
    KeywordUtil.markPassed('Order successfully')
    WebUI.closeBrowser()
} else {
    KeywordUtil.markPassed('Order unsuccessfully!')

    WebUI.closeBrowser()
}

WebUI.closeBrowser()

