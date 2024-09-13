import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on button addToCart.png')

"Step 3: Click on label storageColorOption (512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColorOption', ['label_storageColorOption_internalText': label_storageColorOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on label storageColorOption 512Gb.png')

"Step 4: Click on label storageColorOption (white)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColorOption', ['label_storageColorOption_internalText': label_storageColorOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on label storageColorOption white.png')

"Step 5: Click on label storageColorOption (black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColorOption', ['label_storageColorOption_internalText': label_storageColorOption_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on label storageColorOption black.png')

"Step 6: Click on button increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_increased'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button increased.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button buy.png')

"Step 8: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on link goToCart - Navigate to page cart.png')

"Step 9: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 10: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on input email.png')

"Step 11: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Enter input value in input email.png')

"Step 12: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 13: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on input email.png')

"Step 14: Enter input value in button continueToShipping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToShipping'), button_continueToShipping)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Enter input value in button continueToShipping.png')

"Step 15: Click on input shippingAddressFirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on input shippingAddressFirstName.png')

"Step 16: Enter input value in input shippingAddressFirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'), input_shippingAddressFirstName)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Enter input value in input shippingAddressFirstName.png')

"Step 17: Click on input shippingAddressLastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLastName'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on input shippingAddressLastName.png')

"Step 18: Enter input value in input shippingAddressLastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLastName'), input_shippingAddressLastName)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Enter input value in input shippingAddressLastName.png')

"Step 19: Click on input shippingAddressLine1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLine1'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on input shippingAddressLine1.png')

"Step 20: Enter input value in input shippingAddressLine1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLine1'), input_shippingAddressLine1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Enter input value in input shippingAddressLine1.png')

"Step 21: Click on input shippingAddressZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressZip'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on input shippingAddressZip.png')

"Step 22: Enter input value in input shippingAddressZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressZip'), input_shippingAddressZip)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Enter input value in input shippingAddressZip.png')

"Step 23: Click on input shippingAddressCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on input shippingAddressCity.png')

"Step 24: Enter input value in input shippingAddressCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'), input_shippingAddressCity)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Enter input value in input shippingAddressCity.png')

"Step 25: Click on input shippingAddressState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on input shippingAddressState.png')

"Step 26: Enter input value in input shippingAddressState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'), input_shippingAddressState)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Enter input value in input shippingAddressState.png')

"Step 27: Click on input shippingAddressPhone -> Navigate to page 'checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on input shippingAddressPhone - Navigate to page checkoutpayment.png')

"Step 28: Click on button continueToShipping -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_continueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on button continueToShipping - Navigate to page thank-you.png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Complete Purchase with Customizable Storage Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}