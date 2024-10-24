import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.selectMobileDeviceAndAddToCart
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.fillShippingAddressAndContinueToPayment
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

"Step 2: Select mobile device and add it to the cart for purchase"

selectMobileDeviceAndAddToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button ProceedToCheckout -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 3-Click on button ProceedToCheckout - Navigate to page checkoutshipping-address.png')

"Step 4: Click on link BackToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/link_BackToCart'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 4-Click on link BackToCart - Navigate to page cart.png')

"Step 5: Click on button quantityAdjustment (Decrease)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_class': button_quantityAdjustment_class]))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 5-Click on button quantityAdjustment Decrease.png')

"Step 6: Click on button ProceedToCheckout -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 6-Click on button ProceedToCheckout - Navigate to page checkoutshipping-address.png')

"Step 7: Click on div PaymentMethod"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_PaymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 7-Click on div PaymentMethod.png')

"Step 8: Fill in shipping address details and proceed to payment"

fillShippingAddressAndContinueToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 9: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 9-Click on button ProceedToCheckout.png')

"Step 10: Fill in shipping address details and proceed to payment"

fillShippingAddressAndContinueToPayment.execute(data_path_2, Integer.valueOf(index_2))

"Step 11: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 11-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC44-Purchase Mobile Device with Quantity Adjustments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}