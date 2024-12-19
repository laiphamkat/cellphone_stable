import truetest.common.addMultipleColorOptionsToCart
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInformationWithoutPayment
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Add multiple color options to cart from brand categories"

addMultipleColorOptionsToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on link GoToCart3 -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart3'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 3-Click on link GoToCart3 - Navigate to page cart pagecart.png')

"Step 4: Click on button proceed to checkout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 4-Click on button proceed to checkout - Navigate to page checkout infocheckoutinfo.png')

"Step 5: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 5-Click on input Email.png')

"Step 6: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 6-Enter input value in input Email.png')

"Step 7: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 7-Click on button ContinueToShipping.png')

"Step 8: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 8-Click on input Email.png')

"Step 9: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email_1)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 9-Enter input value in input Email.png')

"Step 10: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 10-Click on button ContinueToShipping.png')

"Step 11: Fill in shipping information without proceeding to payment"

fillShippingInformationWithoutPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Click on progressbar loadingLine -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/progressbar_loadingLine'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 12-Click on progressbar loadingLine - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC33-Complete Checkout Process with Multiple Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}