import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.fillShippingInformationAndCompleteOrder
import truetest.common.browseCategoriesSelectAndPurchaseItem
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

"Step 2: Browse categories, select item, and purchase it"

browseCategoriesSelectAndPurchaseItem.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button ProceedToCheckout -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on button ProceedToCheckout - Navigate to page checkoutshipping-address.png')

"Step 4: Click on link CheckoutBackToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/link_CheckoutBackToCart'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on link CheckoutBackToCart - Navigate to page cart.png')

"Step 5: Click on button quantityAdjustment (CartDecreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_class': button_quantityAdjustment_class]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on button quantityAdjustment CartDecreaseQuantity.png')

"Step 6: Click on button ProceedToCheckout -> Navigate to page 'checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on button ProceedToCheckout - Navigate to page checkoutshipping-address.png')

"Step 7: Click on div CheckoutPaymentMethod"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_CheckoutPaymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on div CheckoutPaymentMethod.png')

"Step 8: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Hover over div object.png')

"Step 9: Click on input CheckoutFirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_CheckoutFirstName'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on input CheckoutFirstName.png')

"Step 10: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Hover over div object.png')

"Step 11: Click on input CheckoutFirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_CheckoutFirstName'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on input CheckoutFirstName.png')

"Step 12: Hover over div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Hover over div object2.png')

"Step 13: Enter input value in input CheckoutFirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_CheckoutFirstName'), input_CheckoutFirstName)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Enter input value in input CheckoutFirstName.png')

"Step 14: Click on input CheckoutLastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_CheckoutLastName'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on input CheckoutLastName.png')

"Step 15: Hover over div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Hover over div object3.png')

"Step 16: Enter input value in input CheckoutLastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_CheckoutLastName'), input_CheckoutLastName)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Enter input value in input CheckoutLastName.png')

"Step 17: Click on input CheckoutAddress -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_CheckoutAddress'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on input CheckoutAddress - Navigate to page cart.png')

"Step 18: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on button ProceedToCheckout.png')

"Step 19: Fill out shipping information and complete order"

fillShippingInformationAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Checkout with Quantity Adjustment and Shipping_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}