import truetest.common.proceedToCheckoutAndInputEmail
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
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

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Hover over item object.png')

"Step 3: Click on link mobileBrands (GooglePixel) -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link mobileBrands GooglePixel - Navigate to page category pagecategory.png')

"Step 4: Click on link googleModels (GooglePixel7Pro) -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/link_googleModels'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link googleModels GooglePixel7Pro - Navigate to page product pageproduct.png')

"Step 5: Click on button purchaseOptions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on button purchaseOptions Increased.png')

"Step 6: Click on button Increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/button_Increased2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on button Increased2.png')

"Step 7: Click on link Phone -> Navigate to page 'product category pages#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/link_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on link Phone - Navigate to page product category pages.png')

"Step 8: Click on link ByPrice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_category_pages/link_ByPrice'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on link ByPrice.png')

"Step 9: Click on link GooglePixel8 -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_category_pages/link_GooglePixel8'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on link GooglePixel8 - Navigate to page product pageproduct.png')

"Step 10: Click on label storageColorOptions (Storage512GB2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on label storageColorOptions Storage512GB2.png')

"Step 11: Click on label storageColorOptions (ColorBlack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_1, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on label storageColorOptions ColorBlack.png')

"Step 12: Click on button purchaseOptions (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on button purchaseOptions Buy2.png')

"Step 13: Hover over div ProductDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product_page/div_ProductDetails'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Hover over div ProductDetails.png')

"Step 14: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on button AddToCart.png')

"Step 15: Click on label colorStorageOptions (Storage512GBDialog)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on label colorStorageOptions Storage512GBDialog.png')

"Step 16: Click on label colorStorageOptions (ColorBlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/label_colorStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/label_colorStorageOptions', ['label_colorStorageOptions_for': label_colorStorageOptions_for_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on label colorStorageOptions ColorBlueTitanium.png')

"Step 17: Click on button BuyDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/button_BuyDialog'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on button BuyDialog.png')

"Step 18: Click on link cartNavigation (GoToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on link cartNavigation GoToCart2.png')

"Step 19: Proceed to checkout and input email for shipping"

proceedToCheckoutAndInputEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 20: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Hover over div object.png')

"Step 21: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on input FirstName.png')

"Step 22: Hover over div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Hover over div object2.png')

"Step 23: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Enter input value in input FirstName.png')

"Step 24: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Click on input LastName.png')

"Step 25: Hover over div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 25-Hover over div object3.png')

"Step 26: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Enter input value in input LastName.png')

"Step 27: Click on input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Address'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 27-Click on input Address.png')

"Step 28: Hover over div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 28-Hover over div object4.png')

"Step 29: Enter input value in input Address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Address'), input_Address)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 29-Enter input value in input Address.png')

"Step 30: Click on input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 30-Click on input ZipCode.png')

"Step 31: Hover over div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 31-Hover over div object5.png')

"Step 32: Enter input value in input ZipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode'), input_ZipCode)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 32-Enter input value in input ZipCode.png')

"Step 33: Click on input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_City'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 33-Click on input City.png')

"Step 34: Hover over div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 34-Hover over div object6.png')

"Step 35: Enter input value in input City"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_City'), input_City)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 35-Enter input value in input City.png')

"Step 36: Click on input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_State'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 36-Click on input State.png')

"Step 37: Hover over div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 37-Hover over div object7.png')

"Step 38: Enter input value in input State"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_State'), input_State)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 38-Enter input value in input State.png')

"Step 39: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 39-Click on input Phone.png')

"Step 40: Click on button ContinueToPayment -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_ContinueToPayment'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 40-Click on button ContinueToPayment - Navigate to page checkout pagecheckoutpayment.png')

"Step 41: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 41-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 42: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Complete Order for Google Pixel with Detailed Shipping_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}