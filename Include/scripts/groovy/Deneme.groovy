import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
/*
class NewTestListener {
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		CucumberKW.GLUE = ['package1', 'package2']
	}
}*/
/*
class delirdim	{
	@BeforeTestCase
	def beforeTestCase(TestCaseContext context) {
		CucumberGlueGenerator.addDefaultPackages();
	}
}*/

class Deneme {

	@Given("basla")
	def da() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

	}

	@When("gir (.*) ve (.*)")
	def sa(String usr, String pass) {
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'),usr)
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Password_password'),pass)
	}

	@And("devam")
	def fa() {
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
	}

	@Then("bit")
	def aa() {
		println then
		WebUI.verifyTextPresent('Time at Work', false)
		
		WebUI.closeBrowser()
	}
}