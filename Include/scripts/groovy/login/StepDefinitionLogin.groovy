package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class StepDefinitionLogin {
	@Given("I navigate to Yourlogo homepage")
	def  I_navigate_to_Yourlogo_homepage() {

		WebUI.openBrowser("")
		WebUI.navigateToUrl('http://automationpractice.com/index.php')
	}

	@When("I click Sign In button")
	def I_click_Sign_In_button() {

		WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))
	}

	@And("I enter username (.*) and password (.*)")
	def I_enter_valid_username_password(String username, String password) {

		WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), username)

		WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), password)
	}

	@And("I click Sign in button")
	def I_click_Sign_in_button() {

		WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in'))
	}

	@Then("I should be able to login successfully")
	def I_login_successfully() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My account - My Store/myAccount'),10);
		WebUI.closeBrowser()
	}

	@And("I enter an invalid username (.*) and password (.*)")
	def I_enter_invalid_username_password(String username, String password) {

		WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), username)

		WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), password)
	}


	@Then("I should NOT be able to login successfully")
	def I_login_unsuccessfully() {
		WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)
		WebUI.closeBrowser()
	}
}
