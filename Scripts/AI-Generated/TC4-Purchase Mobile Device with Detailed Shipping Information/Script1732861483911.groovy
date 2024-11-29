import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Hover over item object.png')

"Step 3: Click on link mobileDevice (Apple2) -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileDevice"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileDevice', ['link_mobileDevice_nthChild': link_mobileDevice_nthChild, 'link_mobileDevice_internalRoleLinkName': link_mobileDevice_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link mobileDevice Apple2 - Navigate to page category pagecategory.png')

"Step 4: Click on button CategoryAddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_CategoryAddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button CategoryAddToCart.png')

"Step 5: Click on label storageColorOption (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOption', ['label_storageColorOption_for': label_storageColorOption_for, 'label_storageColorOption_internalText': label_storageColorOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on label storageColorOption 256GB.png')

"Step 6: Click on label storageColorOption (Green)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOption', ['label_storageColorOption_for': label_storageColorOption_for_1, 'label_storageColorOption_internalText': label_storageColorOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on label storageColorOption Green.png')

"Step 7: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button Buy.png')

"Step 8: Click on link GoToCart -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link GoToCart - Navigate to page cart pagecart.png')

"Step 9: Click on button ProceedToCheckout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button ProceedToCheckout - Navigate to page checkout infocheckoutinfo.png')

"Step 10: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Hover over div object.png')

"Step 11: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on input Email.png')

"Step 12: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Enter input value in input Email.png')

"Step 13: Click on button ContinueToShipping -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on button ContinueToShipping - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 14: Hover over div CheckoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Hover over div CheckoutInfo.png')

"Step 15: Click on input FirstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_FirstName2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on input FirstName2.png')

"Step 16: Hover over div CheckoutInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Hover over div CheckoutInfo2.png')

"Step 17: Enter input value in input FirstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_FirstName2'), input_FirstName2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Enter input value in input FirstName2.png')

"Step 18: Click on input LastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_LastName2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on input LastName2.png')

"Step 19: Hover over div CheckoutInfo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Hover over div CheckoutInfo3.png')

"Step 20: Enter input value in input LastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_LastName2'), input_LastName2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Enter input value in input LastName2.png')

"Step 21: Click on input Address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Address2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Click on input Address2.png')

"Step 22: Hover over div CheckoutInfo4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Hover over div CheckoutInfo4.png')

"Step 23: Enter input value in input Address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Address2'), input_Address2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Enter input value in input Address2.png')

"Step 24: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Click on input ZipCode.png')

"Step 25: Hover over div CheckoutInfo5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25-Hover over div CheckoutInfo5.png')

"Step 26: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Enter input value in input ZipCode.png')

"Step 27: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 27-Click on input City.png')

"Step 28: Hover over div CheckoutInfo6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo6'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 28-Hover over div CheckoutInfo6.png')

"Step 29: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 29-Click on input State.png')

"Step 30: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 30-Enter input value in input City.png')

"Step 31: Hover over div CheckoutInfo7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo7'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 31-Hover over div CheckoutInfo7.png')

"Step 32: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 32-Enter input value in input State.png')

"Step 33: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 33-Click on input Phone.png')

"Step 34: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 34-Enter input value in input Phone.png')

"Step 35: Click on button ContinueToPayment -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 35-Click on button ContinueToPayment - Navigate to page checkout pagecheckoutpayment.png')

"Step 36: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 36-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Purchase Mobile Device with Detailed Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}