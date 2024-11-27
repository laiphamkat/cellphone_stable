import truetest.common.proceedToCheckoutAndEnterEmail
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over item object2.png')

"Step 3: Click on link brandNames (Apple) -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link brandNames Apple - Navigate to page category pagecategory.png')

"Step 4: Click on button newProduct (NewIPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_newProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_newProduct', ['button_newProduct_class': button_newProduct_class, 'button_newProduct_internalHasText': button_newProduct_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button newProduct NewIPhone15Plus.png')

"Step 5: Click on label colorStorageOptions (Storage256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on label colorStorageOptions Storage256GB.png')

"Step 6: Click on label colorStorageOptions (ColorGreen)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_1, 'label_colorStorageOptions_internalText': label_colorStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on label colorStorageOptions ColorGreen.png')

"Step 7: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button Buy.png')

"Step 8: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link PlaceAnOrder.png')

"Step 9: Proceed to checkout and enter email for shipping"

proceedToCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Hover over div object.png')

"Step 11: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on input FirstName.png')

"Step 12: Hover over div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Hover over div object2.png')

"Step 13: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Enter input value in input FirstName.png')

"Step 14: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on input LastName.png')

"Step 15: Hover over div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Hover over div object3.png')

"Step 16: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Enter input value in input LastName.png')

"Step 17: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on input Address.png')

"Step 18: Hover over div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Hover over div object4.png')

"Step 19: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Enter input value in input Address.png')

"Step 20: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on input ZipCode.png')

"Step 21: Hover over div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Hover over div object5.png')

"Step 22: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on input City.png')

"Step 23: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Enter input value in input ZipCode.png')

"Step 24: Hover over div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Hover over div object6.png')

"Step 25: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Enter input value in input City.png')

"Step 26: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Click on input State.png')

"Step 27: Hover over div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Hover over div object7.png')

"Step 28: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Enter input value in input State.png')

"Step 29: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on input Phone.png')

"Step 30: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Enter input value in input Phone.png')

"Step 31: Click on button ContinueToPayment -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Click on button ContinueToPayment - Navigate to page checkout pagecheckoutpayment.png')

"Step 32: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Complete Order for New Product with Custom Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}