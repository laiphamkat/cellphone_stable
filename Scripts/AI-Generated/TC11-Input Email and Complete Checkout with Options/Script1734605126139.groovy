import truetest.common.fillShippingInformationForCheckout
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.addItemToCartFromCategoryWithOptions
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Add item to cart from category with options"

addItemToCartFromCategoryWithOptions.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on link GoToCart4 -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart4'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on link GoToCart4 - Navigate to page cart pagecart.png')

"Step 4: Click on button proceed to checkout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on button proceed to checkout - Navigate to page checkout infocheckoutinfo.png')

"Step 5: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on emailInputField.png')

"Step 6: Enter input value in emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/emailInputField'), emailInputField)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Enter input value in emailInputField.png')

"Step 7: Click on continueToShippingButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/continueToShippingButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on continueToShippingButton.png')

"Step 8: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on emailInputField.png')

"Step 9: Enter input value in emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/emailInputField'), emailInputField_1)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Enter input value in emailInputField.png')

"Step 10: Click on continueToShippingButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/continueToShippingButton'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on continueToShippingButton.png')

"Step 11: Fill in shipping information for checkout"

fillShippingInformationForCheckout.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Click on progressbar loadingLine -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/progressbar_loadingLine'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on progressbar loadingLine - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Input Email and Complete Checkout with Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}