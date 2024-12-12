import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.selectColorOptionsAndPurchaseMultipleTimes
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

"Step 3: Click on appleMenuItem -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/appleMenuItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on appleMenuItem - Navigate to page category pagecategory.png')

"Step 4: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button addToCart AddToCart.png')

"Step 5: Select color options and perform multiple purchase actions"

selectColorOptionsAndPurchaseMultipleTimes.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on button addToCart (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class_1, 'button_addToCart_internalHasText': button_addToCart_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button addToCart AddToCart2.png')

"Step 7: Click on label colorStorageOption (Storage512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on label colorStorageOption Storage512GB.png')

"Step 8: Click on label colorStorageOption (ColorPink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption', ['label_colorStorageOption_for': label_colorStorageOption_for_1, 'label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on label colorStorageOption ColorPink.png')

"Step 9: Click on button purchaseAction (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button purchaseAction Increased.png')

"Step 10: Click on button purchaseAction (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button purchaseAction Buy.png')

"Step 11: Click on placeOrderButton -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/placeOrderButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on placeOrderButton - Navigate to page cart pagecart.png')

"Step 12: Click on button quantityAdjustment (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button quantityAdjustment Increased.png')

"Step 13: Click on button quantityAdjustment (Increased2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class_1, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_1, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button quantityAdjustment Increased2.png')

"Step 14: Click on proceedToCheckoutButton -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/proceedToCheckoutButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on proceedToCheckoutButton - Navigate to page checkout infocheckoutinfo.png')

"Step 15: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Hover over div object.png')

"Step 16: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on emailInputField.png')

"Step 17: Enter input value in emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/emailInputField'), emailInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Enter input value in emailInputField.png')

"Step 18: Click on continueToShippingButton -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/continueToShippingButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on continueToShippingButton - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 19: Hover over div CheckoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Hover over div CheckoutInfo.png')

"Step 20: Click on firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/firstNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on firstNameInput.png')

"Step 21: Hover over div CheckoutInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Hover over div CheckoutInfo2.png')

"Step 22: Enter input value in firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/firstNameInput'), firstNameInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Enter input value in firstNameInput.png')

"Step 23: Click on lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/lastNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on lastNameInput.png')

"Step 24: Hover over div CheckoutInfo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Hover over div CheckoutInfo3.png')

"Step 25: Enter input value in lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/lastNameInput'), lastNameInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Enter input value in lastNameInput.png')

"Step 26: Click on addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/addressInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on addressInputField.png')

"Step 27: Hover over div CheckoutInfo4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo4'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Hover over div CheckoutInfo4.png')

"Step 28: Enter input value in addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/addressInputField'), addressInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Enter input value in addressInputField.png')

"Step 29: Click on zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/zipCodeInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on zipCodeInput.png')

"Step 30: Hover over div CheckoutInfo5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo5'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Hover over div CheckoutInfo5.png')

"Step 31: Enter input value in zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/zipCodeInput'), zipCodeInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Enter input value in zipCodeInput.png')

"Step 32: Click on cityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/cityInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on cityInput.png')

"Step 33: Hover over div CheckoutInfo6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo6'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Hover over div CheckoutInfo6.png')

"Step 34: Enter input value in cityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/cityInput'), cityInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Enter input value in cityInput.png')

"Step 35: Click on stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/stateInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on stateInputField.png')

"Step 36: Hover over div CheckoutInfo7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo7'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Hover over div CheckoutInfo7.png')

"Step 37: Enter input value in stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/stateInputField'), stateInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Enter input value in stateInputField.png')

"Step 38: Click on userPhoneInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/userPhoneInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on userPhoneInput.png')

"Step 39: Enter input value in userPhoneInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/userPhoneInput'), userPhoneInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Enter input value in userPhoneInput.png')

"Step 40: Click on continueToPaymentButton -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/continueToPaymentButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on continueToPaymentButton - Navigate to page checkout pagecheckoutpayment.png')

"Step 41: Click on completeOrderButton -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/completeOrderButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on completeOrderButton - Navigate to page thank you pagethank-you.png')

"Step 42: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Order with Multiple Color Options and Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}