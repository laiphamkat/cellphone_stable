import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import truetest.common.fillUserDetailsAndContinueToPayment
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 2-Hover over item object2.png')

"Step 3: Click on link Apple2 -> Navigate to page 'category page#category/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 3-Click on link Apple2 - Navigate to page category pagecategory.png')

"Step 4: Click on link iPhone15FineWovenCaseWithMagSafeTaupe -> Navigate to page 'product page#product/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/link_iPhone15FineWovenCaseWithMagSafeTaupe'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 4-Click on link iPhone15FineWovenCaseWithMagSafeTaupe - Navigate to page product pageproduct.png')

"Step 5: Click on label iPhone15Plus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/label_iPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 5-Click on label iPhone15Plus.png')

"Step 6: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 6-Click on button Buy.png')

"Step 7: Click on link PlaceAnOrder -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 7-Click on link PlaceAnOrder - Navigate to page cart pagecart.png')

"Step 8: Click on button ProceedToCheckout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 8-Click on button ProceedToCheckout - Navigate to page checkout infocheckoutinfo.png')

"Step 9: Hover over div CheckoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_CheckoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 9-Hover over div CheckoutInfo.png')

"Step 10: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 10-Click on input Email.png')

"Step 11: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC31/Step 11-Enter input value in input Email.png')

"Step 12: Click on div ContactInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/div_ContactInformation'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 12-Click on div ContactInformation.png')

"Step 13: Click on button ContinueToShipping -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 13-Click on button ContinueToShipping - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 14: Click on link BackToTheCart -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/link_BackToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 14-Click on link BackToTheCart - Navigate to page cart pagecart.png')

"Step 15: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart_page/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart_page/button_quantityAdjustment', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_class': button_quantityAdjustment_class]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 15-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 16: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart_page/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart_page/button_quantityAdjustment', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_1, 'button_quantityAdjustment_class': button_quantityAdjustment_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 16-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 17: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 17-Click on button ProceedToCheckout.png')

"Step 18: Enter user details and proceed to payment section"

fillUserDetailsAndContinueToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 19: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 19-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-Complete Purchase of iPhone Case with Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}