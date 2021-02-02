package shop

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	@Keyword
	def static void loginIntoApplication(){

		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://automationpractice.com/index.php')
		WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))
		WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), "miancloud1@gmail.com")
		WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), "123456789")
		WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in'))
	}

	@Keyword
	def static void loginIntoApplicationWithGlobalVariable(){
		loginIntoApplication()
	}
}
