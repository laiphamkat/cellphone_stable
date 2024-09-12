import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
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

"Step 2: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link apple - Navigate to page category.png')

"Step 3: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on button addToCart.png')

"Step 4: Click on label storageColorOption (512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOption'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on label storageColorOption 512Gb.png')

"Step 5: Click on label storageColorOption (yellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOption'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on label storageColorOption yellow.png')

"Step 6: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on button buy.png')

"Step 7: Click on link cart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link cart - Navigate to page cart.png')

"Step 8: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 9: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on input email.png')

"Step 10: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Enter input value in input email.png')

"Step 11: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 12: Click on input shippingAddressDetails (email)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on input shippingAddressDetails email.png')

"Step 13: Enter input value in input shippingAddressDetails (continueToShipping)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails'), input_shippingAddressDetails)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Enter input value in input shippingAddressDetails continueToShipping.png')

"Step 14: Click on input shippingAddressDetails (shippingAddressFirstName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on input shippingAddressDetails shippingAddressFirstName.png')

"Step 15: Enter input value in input shippingAddressDetails (shippingAddressFirstName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_2]), input_shippingAddressDetails)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Enter input value in input shippingAddressDetails shippingAddressFirstName.png')

"Step 16: Click on input shippingAddressDetails (shippingAddressLastName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on input shippingAddressDetails shippingAddressLastName.png')

"Step 17: Enter input value in input shippingAddressDetails (shippingAddressLastName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_4]), input_shippingAddressDetails)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Enter input value in input shippingAddressDetails shippingAddressLastName.png')

"Step 18: Click on input shippingAddressDetails (shippingAddressLine1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on input shippingAddressDetails shippingAddressLine1.png')

"Step 19: Enter input value in input shippingAddressDetails (shippingAddressLine1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_6]), input_shippingAddressDetails)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Enter input value in input shippingAddressDetails shippingAddressLine1.png')

"Step 20: Click on input shippingAddressDetails (shippingAddressZip)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on input shippingAddressDetails shippingAddressZip.png')

"Step 21: Enter input value in input shippingAddressDetails (shippingAddressZip)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_8]), input_shippingAddressDetails)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Enter input value in input shippingAddressDetails shippingAddressZip.png')

"Step 22: Click on input shippingAddressDetails (shippingAddressCity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_9]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Click on input shippingAddressDetails shippingAddressCity.png')

"Step 23: Enter input value in input shippingAddressDetails (shippingAddressCity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_10]), input_shippingAddressDetails)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Enter input value in input shippingAddressDetails shippingAddressCity.png')

"Step 24: Click on input shippingAddressDetails (shippingAddressState)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_11]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 24-Click on input shippingAddressDetails shippingAddressState.png')

"Step 25: Enter input value in input shippingAddressDetails (shippingAddressState)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/input_shippingAddressDetails', ['input_shippingAddressDetails_internalLabel': input_shippingAddressDetails_internalLabel_12]), input_shippingAddressDetails)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 25-Enter input value in input shippingAddressDetails shippingAddressState.png')

"Step 26: Click on input shippingAddressPhone -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 26-Click on input shippingAddressPhone - Navigate to page checkoutpayment.png')

"Step 27: Click on button continueToShipping -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 27-Click on button continueToShipping - Navigate to page thank-you.png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Complete Purchase with Detailed Shipping Information for Apple Product_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}