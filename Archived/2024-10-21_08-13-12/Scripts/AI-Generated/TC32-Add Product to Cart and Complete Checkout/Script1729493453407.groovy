import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.fillUserDetailsAndContinueToPayment
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 2-Hover over item object2.png')

"Step 3: Click on link Apple2 -> Navigate to page 'category page#category/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple2'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 3-Click on link Apple2 - Navigate to page category pagecategory.png')

"Step 4: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 4-Click on button AddToCart.png')

"Step 5: Click on label productName (iPhone15Pro)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_productName"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_productName', ['label_productName_for': label_productName_for, 'label_productName_internalText': label_productName_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 5-Click on label productName iPhone15Pro.png')

"Step 6: Click on label productName (iPhone15ProMax)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_productName"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_productName', ['label_productName_for': label_productName_for_1]))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 6-Click on label productName iPhone15ProMax.png')

"Step 7: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 7-Click on button Buy.png')

"Step 8: Click on link GoToCart -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 8-Click on link GoToCart - Navigate to page cart pagecart.png')

"Step 9: Click on button ProceedToCheckout -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 9-Click on button ProceedToCheckout - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 10: Click on link BackToTheCart -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/link_BackToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 10-Click on link BackToTheCart - Navigate to page cart pagecart.png')

"Step 11: Click on button quantityAdjustment (DecreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart_page/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart_page/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 11-Click on button quantityAdjustment DecreaseQuantity.png')

"Step 12: Click on button ProceedToCheckout -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 12-Click on button ProceedToCheckout - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 13: Click on div PaymentMethod"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/div_PaymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 13-Click on div PaymentMethod.png')

"Step 14: Enter user details and proceed to payment section"

fillUserDetailsAndContinueToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 15-Click on button ProceedToCheckout.png')

"Step 16: Enter user details and proceed to payment section"

fillUserDetailsAndContinueToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 17: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 17-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Add Product to Cart and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}