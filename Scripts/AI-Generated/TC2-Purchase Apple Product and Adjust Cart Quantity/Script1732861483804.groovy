import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import truetest.common.fillOutCheckoutFormWithAddressDetails
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over item object2.png')

"Step 3: Click on link Apple -> Navigate to page 'product category pages#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link Apple - Navigate to page product category pages.png')

"Step 4: Click on link iPhone15FineWovenCase -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_category_pages/link_iPhone15FineWovenCase'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link iPhone15FineWovenCase - Navigate to page product pageproduct.png')

"Step 5: Click on label productName (ProductIPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_productName"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_productName', ['label_productName_for': label_productName_for, 'label_productName_internalText': label_productName_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on label productName ProductIPhone15Plus.png')

"Step 6: Click on button purchaseAction (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button purchaseAction Buy2.png')

"Step 7: Click on link PlaceAnOrder -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link PlaceAnOrder - Navigate to page cart pagecart.png')

"Step 8: Click on button ProceedToCheckout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button ProceedToCheckout - Navigate to page checkout infocheckoutinfo.png')

"Step 9: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Hover over div object.png')

"Step 10: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on input Email.png')

"Step 11: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Enter input value in input Email.png')

"Step 12: Click on div checkoutInformation (CheckoutContactInformation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_info/div_checkoutInformation'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on div checkoutInformation CheckoutContactInformation.png')

"Step 13: Click on button ContinueToShipping -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on button ContinueToShipping - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 14: Click on link BackToTheCart -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_BackToTheCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link BackToTheCart - Navigate to page cart pagecart.png')

"Step 15: Click on button cartQuantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAdjustment', ['button_cartQuantityAdjustment_class': button_cartQuantityAdjustment_class, 'button_cartQuantityAdjustment_nthChild': button_cartQuantityAdjustment_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on button cartQuantityAdjustment IncreaseQuantity.png')

"Step 16: Click on button cartQuantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAdjustment', ['button_cartQuantityAdjustment_class': button_cartQuantityAdjustment_class_1, 'button_cartQuantityAdjustment_nthChild': button_cartQuantityAdjustment_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on button cartQuantityAdjustment IncreaseQuantity.png')

"Step 17: Click on button ProceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on button ProceedToCheckout.png')

"Step 18: Fill out checkout form with personal and address details"

fillOutCheckoutFormWithAddressDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Purchase Apple Product and Adjust Cart Quantity_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}