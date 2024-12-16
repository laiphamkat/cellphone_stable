import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to category/*"

TrueTestScripts.navigate("category/${GlobalVariable.category_id}")

"Step 2: Click on addToCartButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/addToCartButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on addToCartButton.png')

"Step 3: Click on label productAttributes (StorageCapacity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productAttributes', ['label_productAttributes_for': label_productAttributes_for, 'label_productAttributes_internalText': label_productAttributes_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on label productAttributes StorageCapacity.png')

"Step 4: Click on label productAttributes (Color)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_productAttributes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_productAttributes', ['label_productAttributes_for': label_productAttributes_for_1, 'label_productAttributes_internalText': label_productAttributes_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on label productAttributes Color.png')

"Step 5: Click on button purchaseActions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button purchaseActions Increased.png')

"Step 6: Click on button purchaseActions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseActions', ['button_purchaseActions_internalRoleButtonName': button_purchaseActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button purchaseActions Buy.png')

"Step 7: Click on cartItemCount -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/cartItemCount'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on cartItemCount - Navigate to page cart pagecart.png')

"Step 8: Click on proceedToCheckoutButton -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/proceedToCheckoutButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on proceedToCheckoutButton - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 9: Click on firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/firstNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on firstNameInput.png')

"Step 10: Enter input value in firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/firstNameInput'), firstNameInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in firstNameInput.png')

"Step 11: Click on lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/lastNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on lastNameInput.png')

"Step 12: Enter input value in lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/lastNameInput'), lastNameInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Enter input value in lastNameInput.png')

"Step 13: Click on addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/addressInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on addressInputField.png')

"Step 14: Enter input value in addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/addressInputField'), addressInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in addressInputField.png')

"Step 15: Click on zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/zipCodeInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on zipCodeInput.png')

"Step 16: Enter input value in zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/zipCodeInput'), zipCodeInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in zipCodeInput.png')

"Step 17: Click on cityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/cityInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on cityInput.png')

"Step 18: Enter input value in cityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/cityInput'), cityInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Enter input value in cityInput.png')

"Step 19: Click on stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/stateInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on stateInputField.png')

"Step 20: Enter input value in stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/stateInputField'), stateInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Enter input value in stateInputField.png')

"Step 21: Click on userPhoneInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/userPhoneInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on userPhoneInput.png')

"Step 22: Enter input value in userPhoneInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/userPhoneInput'), userPhoneInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Enter input value in userPhoneInput.png')

"Step 23: Click on continueToPaymentButton -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/continueToPaymentButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on continueToPaymentButton - Navigate to page checkout pagecheckoutpayment.png')

"Step 24: Click on completeOrderButton -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/completeOrderButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on completeOrderButton - Navigate to page thank you pagethank-you.png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase Process from Category to Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}