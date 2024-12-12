import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to product/*"

TrueTestScripts.navigate("product/${GlobalVariable.product_id}")

"Step 2: Click on buyButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/buyButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on buyButton.png')

"Step 3: Click on cartItemCount -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/cartItemCount'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on cartItemCount - Navigate to page cart pagecart.png')

"Step 4: Click on incrementButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/incrementButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on incrementButton.png')

"Step 5: Hover over link cart (Cart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Hover over link cart Cart.png')

"Step 6: Click on link cart (Cart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link cart Cart2.png')

"Step 7: Click on link cart (Cart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link cart Cart2.png')

"Step 8: Hover over link cart (Cart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Hover over link cart Cart.png')

"Step 9: Click on link cart (Cart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link cart Cart2.png')

"Step 10: Click on link cart (Cart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link cart Cart2.png')

"Step 11: Click on proceedToCheckoutButton -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/proceedToCheckoutButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on proceedToCheckoutButton - Navigate to page checkout infocheckoutinfo.png')

"Step 12: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Hover over div object.png')

"Step 13: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on emailInputField.png')

"Step 14: Enter input value in emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/emailInputField'), emailInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in emailInputField.png')

"Step 15: Click on continueToShippingButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/continueToShippingButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on continueToShippingButton.png')

"Step 16: Enter input value in emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/emailInputField'), emailInputField_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in emailInputField.png')

"Step 17: Click on continueToShippingButton -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/continueToShippingButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on continueToShippingButton - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Test Purchase Flow with Incrementing Cart Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}