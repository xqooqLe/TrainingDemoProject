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

	@When("gir")
	def sa() {
		println when
	}

	@And("devam")
	def fa() {
		println and
	}

	@Then("bit")
	def aa() {
		println then
	}
}