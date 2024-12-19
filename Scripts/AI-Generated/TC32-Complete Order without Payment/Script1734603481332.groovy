import truetest.common.fillShippingInformationWithoutPayment
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import truetest.common.addMultipleColorOptionsToCart
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 3: Click on link GoToCart3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart3'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 3-Click on link GoToCart3.png')

"Step 4: Click on link GoToCart3 -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart3'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 4-Click on link GoToCart3 - Navigate to page cart pagecart.png')

"Step 5: Click on button proceed to checkout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 5-Click on button proceed to checkout - Navigate to page checkout infocheckoutinfo.png')

"Step 6: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 6-Click on input Email.png')

"Step 7: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC32/Step 7-Enter input value in input Email.png')

"Step 8: Click on button ContinueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 8-Click on button ContinueToShipping.png')

"Step 9: Fill in shipping information without proceeding to payment"

fillShippingInformationWithoutPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Click on body CheckoutBack -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/body_CheckoutBack'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 10-Click on body CheckoutBack - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Complete Order without Payment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}