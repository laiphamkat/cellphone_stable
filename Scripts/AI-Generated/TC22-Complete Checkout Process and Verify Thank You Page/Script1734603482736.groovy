import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /about"

TrueTestScripts.navigate("/about")

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_about/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Hover over item object.png')

"Step 3: Click on link horizontal-menu  element -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_about/link_horizontal-menu__element'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Click on link horizontal-menu  element - Navigate to page category pagecategory.png')

"Step 4: Click on link sort by title"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_sort_by_title'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on link sort by title.png')

"Step 5: Click on link accessories -> Navigate to page 'accessories category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on link accessories - Navigate to page accessories category.png')

"Step 6: Click on form PriceFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_accessories_category/form_PriceFilter'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on form PriceFilter.png')

"Step 7: Click on div Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_accessories_category/div_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on div Slider.png')

"Step 8: Click on link contact phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_accessories_category/link_contact_phone'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on link contact phone.png')

"Step 9: Click on link products image -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_accessories_category/link_products_image'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on link products image - Navigate to page product pageproduct.png')

"Step 10: Click on button purchaseOptions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on button purchaseOptions Increased.png')

"Step 11: Click on button purchaseOptions (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on button purchaseOptions Buy2.png')

"Step 12: Click on link cartNavigation (GoToCart2) -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on link cartNavigation GoToCart2 - Navigate to page cart pagecart.png')

"Step 13: Click on button proceed to checkout -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on button proceed to checkout - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 14: Hover over div CheckoutInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Hover over div CheckoutInfo.png')

"Step 15: Click on firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/firstNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on firstNameInput.png')

"Step 16: Enter input value in firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/firstNameInput'), firstNameInput)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Enter input value in firstNameInput.png')

"Step 17: Hover over div CheckoutInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Hover over div CheckoutInfo2.png')

"Step 18: Enter input value in lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/lastNameInput'), lastNameInput)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Enter input value in lastNameInput.png')

"Step 19: Click on addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/addressInputField'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on addressInputField.png')

"Step 20: Hover over div CheckoutInfo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo3'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Hover over div CheckoutInfo3.png')

"Step 21: Enter input value in addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/addressInputField'), addressInputField)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 21-Enter input value in addressInputField.png')

"Step 22: Click on zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/zipCodeInput'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 22-Click on zipCodeInput.png')

"Step 23: Hover over div CheckoutInfo4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo4'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 23-Hover over div CheckoutInfo4.png')

"Step 24: Enter input value in zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/zipCodeInput'), zipCodeInput)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 24-Enter input value in zipCodeInput.png')

"Step 25: Click on cityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/cityInput'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 25-Click on cityInput.png')

"Step 26: Hover over div CheckoutInfo5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo5'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 26-Hover over div CheckoutInfo5.png')

"Step 27: Enter input value in cityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/cityInput'), cityInput)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 27-Enter input value in cityInput.png')

"Step 28: Click on stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/stateInputField'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 28-Click on stateInputField.png')

"Step 29: Hover over div CheckoutInfo6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo6'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 29-Hover over div CheckoutInfo6.png')

"Step 30: Enter input value in stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/stateInputField'), stateInputField)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 30-Enter input value in stateInputField.png')

"Step 31: Click on userPhoneInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/userPhoneInput'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 31-Click on userPhoneInput.png')

"Step 32: Enter input value in userPhoneInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/userPhoneInput'), userPhoneInput)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 32-Enter input value in userPhoneInput.png')

"Step 33: Click on continueToPaymentButton -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/continueToPaymentButton'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 33-Click on continueToPaymentButton - Navigate to page checkout pagecheckoutpayment.png')

"Step 34: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 34-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Complete Checkout Process and Verify Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}