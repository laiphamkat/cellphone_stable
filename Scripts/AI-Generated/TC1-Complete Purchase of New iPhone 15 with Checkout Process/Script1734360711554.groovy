import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
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

"Step 2: Click on link Apple -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link Apple - Navigate to page category pagecategory.png')

"Step 3: Click on button HotNewiPhone15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_HotNewiPhone15'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on button HotNewiPhone15.png')

"Step 4: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on label storageColorOptions 512GB.png')

"Step 5: Click on label storageColorOptions (Green)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_1, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on label storageColorOptions Green.png')

"Step 6: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button Buy.png')

"Step 7: Click on span Link3 -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_Link3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on span Link3 - Navigate to page cart pagecart.png')

"Step 8: Click on button ProceedToCheckout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button ProceedToCheckout - Navigate to page checkout infocheckoutinfo.png')

"Step 9: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input Email.png')

"Step 10: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in input Email.png')

"Step 11: Click on button ContinueToShipping -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button ContinueToShipping - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 12: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on input FirstName.png')

"Step 13: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Enter input value in input FirstName.png')

"Step 14: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on input LastName.png')

"Step 15: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in input LastName.png')

"Step 16: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on input Address.png')

"Step 17: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Enter input value in input Address.png')

"Step 18: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input ZipCode.png')

"Step 19: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Enter input value in input ZipCode.png')

"Step 20: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on input City.png')

"Step 21: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Enter input value in input City.png')

"Step 22: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on input State.png')

"Step 23: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Enter input value in input State.png')

"Step 24: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on input Phone.png')

"Step 25: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Enter input value in input Phone.png')

"Step 26: Click on button ContinueToPayment -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on button ContinueToPayment - Navigate to page checkout pagecheckoutpayment.png')

"Step 27: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase of New iPhone 15 with Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}