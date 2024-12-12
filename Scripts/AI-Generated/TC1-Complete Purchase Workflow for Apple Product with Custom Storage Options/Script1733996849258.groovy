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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over item object.png')

"Step 3: Click on appleMenuItem -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/appleMenuItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on appleMenuItem - Navigate to page category pagecategory.png')

"Step 4: Click on button addToCart (addToCartButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button addToCart addToCartButton.png')

"Step 5: Click on label storageOption256GB (storageOption256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageOption256GB"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageOption256GB', ['label_storageOption256GB_for': label_storageOption256GB_for, 'label_storageOption256GB_internalText': label_storageOption256GB_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on label storageOption256GB storageOption256GB.png')

"Step 6: Click on label storageOption256GB (storageOption256GB2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageOption256GB"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageOption256GB', ['label_storageOption256GB_for': label_storageOption256GB_for_1, 'label_storageOption256GB_internalText': label_storageOption256GB_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on label storageOption256GB storageOption256GB2.png')

"Step 7: Click on button increaseQuantity (increaseButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity', ['button_increaseQuantity_internalRoleButtonName': button_increaseQuantity_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button increaseQuantity increaseButton.png')

"Step 8: Click on button increaseQuantity (increaseButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity', ['button_increaseQuantity_internalRoleButtonName': button_increaseQuantity_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button increaseQuantity increaseButton.png')

"Step 9: Click on button increaseQuantity (increaseButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity', ['button_increaseQuantity_internalRoleButtonName': button_increaseQuantity_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button increaseQuantity increaseButton2.png')

"Step 10: Click on button addToCart (addToCartButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class_1, 'button_addToCart_internalHasText': button_addToCart_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button addToCart addToCartButton2.png')

"Step 11: Click on label storageOption256GB (storageOption256GB3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageOption256GB"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageOption256GB', ['label_storageOption256GB_for': label_storageOption256GB_for_2, 'label_storageOption256GB_internalText': label_storageOption256GB_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on label storageOption256GB storageOption256GB3.png')

"Step 12: Click on label storageOption256GB (storageOption256GB4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageOption256GB"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageOption256GB', ['label_storageOption256GB_for': label_storageOption256GB_for_3, 'label_storageOption256GB_internalText': label_storageOption256GB_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on label storageOption256GB storageOption256GB4.png')

"Step 13: Click on button increaseQuantity (increaseButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity', ['button_increaseQuantity_internalRoleButtonName': button_increaseQuantity_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button increaseQuantity increaseButton.png')

"Step 14: Click on button increaseQuantity (increaseButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_increaseQuantity', ['button_increaseQuantity_internalRoleButtonName': button_increaseQuantity_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button increaseQuantity increaseButton2.png')

"Step 15: Click on placeOrderButton -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/placeOrderButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on placeOrderButton - Navigate to page cart pagecart.png')

"Step 16: Click on button incrementQuantity (incrementButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_incrementQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_incrementQuantity', ['button_incrementQuantity_class': button_incrementQuantity_class, 'button_incrementQuantity_nth': button_incrementQuantity_nth]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on button incrementQuantity incrementButton.png')

"Step 17: Click on button incrementQuantity (incrementButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_incrementQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_incrementQuantity', ['button_incrementQuantity_class': button_incrementQuantity_class_1, 'button_incrementQuantity_nth': button_incrementQuantity_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button incrementQuantity incrementButton2.png')

"Step 18: Click on proceedToCheckoutButton -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/proceedToCheckoutButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on proceedToCheckoutButton - Navigate to page checkout infocheckoutinfo.png')

"Step 19: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Hover over div object.png')

"Step 20: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on emailInputField.png')

"Step 21: Enter input value in emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/emailInputField'), emailInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Enter input value in emailInputField.png')

"Step 22: Click on continueToShippingButton -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/continueToShippingButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on continueToShippingButton - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 23: Hover over div CheckoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Hover over div CheckoutInfo.png')

"Step 24: Click on firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/firstNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on firstNameInput.png')

"Step 25: Hover over div CheckoutInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Hover over div CheckoutInfo2.png')

"Step 26: Enter input value in firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/firstNameInput'), firstNameInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Enter input value in firstNameInput.png')

"Step 27: Click on lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/lastNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on lastNameInput.png')

"Step 28: Hover over div CheckoutInfo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Hover over div CheckoutInfo3.png')

"Step 29: Enter input value in lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/lastNameInput'), lastNameInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Enter input value in lastNameInput.png')

"Step 30: Click on addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/addressInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on addressInputField.png')

"Step 31: Hover over div CheckoutInfo4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo4'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Hover over div CheckoutInfo4.png')

"Step 32: Enter input value in addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/addressInputField'), addressInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Enter input value in addressInputField.png')

"Step 33: Click on zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/zipCodeInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on zipCodeInput.png')

"Step 34: Hover over div CheckoutInfo5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo5'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Hover over div CheckoutInfo5.png')

"Step 35: Enter input value in zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/zipCodeInput'), zipCodeInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Enter input value in zipCodeInput.png')

"Step 36: Click on cityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/cityInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on cityInput.png')

"Step 37: Hover over div CheckoutInfo6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo6'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Hover over div CheckoutInfo6.png')

"Step 38: Enter input value in cityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/cityInput'), cityInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Enter input value in cityInput.png')

"Step 39: Click on stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/stateInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on stateInputField.png')

"Step 40: Hover over div CheckoutInfo7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo7'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Hover over div CheckoutInfo7.png')

"Step 41: Enter input value in stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/stateInputField'), stateInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Enter input value in stateInputField.png')

"Step 42: Click on userPhoneInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/userPhoneInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on userPhoneInput.png')

"Step 43: Enter input value in userPhoneInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/userPhoneInput'), userPhoneInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Enter input value in userPhoneInput.png')

"Step 44: Click on continueToPaymentButton -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/continueToPaymentButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on continueToPaymentButton - Navigate to page checkout pagecheckoutpayment.png')

"Step 45: Click on completeOrderButton -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/completeOrderButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on completeOrderButton - Navigate to page thank you pagethank-you.png')

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase Workflow for Apple Product with Custom Storage Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}