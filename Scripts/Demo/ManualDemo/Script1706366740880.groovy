import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

'OPENSOURCEURL'
WebUI.navigateToUrl(GlobalVariable.URL)

'OPENSOURCE USERNAME\r\n'
WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), GlobalVariable.USERNAME)

'OPENSOURCE PASSWORD'
WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password_password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))

WebUI.verifyTextPresent('Time at Work1', false, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

