import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over item object.png')

"Step 3: Click on link Apple -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link Apple - Navigate to page iphone cases category.png')

"Step 4: Click on button BuyNow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/button_BuyNow'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button BuyNow.png')

"Step 5: Click on label caseModels (iPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels', ['label_caseModels_for': label_caseModels_for, 'label_caseModels_internalText': label_caseModels_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on label caseModels iPhone15Plus.png')

"Step 6: Click on label caseModels (Cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels', ['label_caseModels_for': label_caseModels_for_1, 'label_caseModels_internalText': label_caseModels_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on label caseModels Cypress.png')

"Step 7: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button Buy.png')

"Step 8: Click on link PlaceAnOrder -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link PlaceAnOrder - Navigate to page cart pagecart.png')

"Step 9: Click on button cartAction (Add)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartAction', ['button_cartAction_nthChild': button_cartAction_nthChild, 'button_cartAction_internalRoleButtonName': button_cartAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button cartAction Add.png')

"Step 10: Click on button cartAction (Remove)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartAction', ['button_cartAction_nthChild': button_cartAction_nthChild_1, 'button_cartAction_internalRoleButtonName': button_cartAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button cartAction Remove.png')

"Step 11: Hover over item CartItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_CartItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Hover over item CartItem.png')

"Step 12: Click on link Apple -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link Apple - Navigate to page iphone cases category.png')

"Step 13: Click on button BuyNow2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/button_BuyNow2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button BuyNow2.png')

"Step 14: Click on label caseModels (Cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels', ['label_caseModels_for': label_caseModels_for_2, 'label_caseModels_internalText': label_caseModels_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on label caseModels Cypress.png')

"Step 15: Click on label caseModels (iPhone15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels', ['label_caseModels_for': label_caseModels_for_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on label caseModels iPhone15.png')

"Step 16: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on button Buy.png')

"Step 17: Click on link PlaceAnOrder -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on link PlaceAnOrder - Navigate to page cart pagecart.png')

"Step 18: Click on button ProceedToCheckout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on button ProceedToCheckout - Navigate to page checkout infocheckoutinfo.png')

"Step 19: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Hover over div object.png')

"Step 20: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on input Email.png')

"Step 21: Enter input value in input Email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email2'), input_Email2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Enter input value in input Email2.png')

"Step 22: Click on button ContinueToShipping -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on button ContinueToShipping - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 23: Hover over div CheckoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Hover over div CheckoutInfo.png')

"Step 24: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on input FirstName.png')

"Step 25: Hover over div CheckoutInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Hover over div CheckoutInfo2.png')

"Step 26: Enter input value in input FirstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_FirstName2'), input_FirstName2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Enter input value in input FirstName2.png')

"Step 27: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on input LastName.png')

"Step 28: Hover over div CheckoutInfo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Hover over div CheckoutInfo3.png')

"Step 29: Enter input value in input LastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_LastName2'), input_LastName2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Enter input value in input LastName2.png')

"Step 30: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on input Address.png')

"Step 31: Hover over div CheckoutInfo4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo4'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Hover over div CheckoutInfo4.png')

"Step 32: Enter input value in input Address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Address2'), input_Address2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Enter input value in input Address2.png')

"Step 33: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on input ZipCode.png')

"Step 34: Hover over div CheckoutInfo5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo5'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Hover over div CheckoutInfo5.png')

"Step 35: Enter input value in input ZipCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ZipCode2'), input_ZipCode2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Enter input value in input ZipCode2.png')

"Step 36: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on input City.png')

"Step 37: Hover over div CheckoutInfo6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo6'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Hover over div CheckoutInfo6.png')

"Step 38: Enter input value in input City2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_City2'), input_City2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Enter input value in input City2.png')

"Step 39: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on input State.png')

"Step 40: Hover over div CheckoutInfo7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo7'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Hover over div CheckoutInfo7.png')

"Step 41: Enter input value in input State2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_State2'), input_State2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Enter input value in input State2.png')

"Step 42: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on input Phone.png')

"Step 43: Enter input value in input Phone2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Phone2'), input_Phone2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Enter input value in input Phone2.png')

"Step 44: Click on button ContinueToPayment -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on button ContinueToPayment - Navigate to page checkout pagecheckoutpayment.png')

"Step 45: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on button CompleteOrder - Navigate to page .png')

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase Flow for iPhone Cases with User Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}