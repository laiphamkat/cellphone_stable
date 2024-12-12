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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over item object.png')

"Step 3: Click on appleMenuItem -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/appleMenuItem'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on appleMenuItem - Navigate to page category pagecategory.png')

"Step 4: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button addToCart AddToCart.png')

"Step 5: Click on button purchaseAction (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button purchaseAction Increased.png')

"Step 6: Click on button purchaseAction (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': button_purchaseAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button purchaseAction Buy.png')

"Step 7: Select color options and perform multiple purchase actions"

selectColorOptionsAndPurchaseMultipleTimes.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on cartItemCount -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/cartItemCount'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on cartItemCount - Navigate to page cart pagecart.png')

"Step 9: Click on link cartNavigation (GoToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link cartNavigation GoToCart.png')

"Step 10: Hover over link cartNavigation (GoToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/link_cartNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Hover over link cartNavigation GoToCart2.png')

"Step 11: Click on link cartNavigation (GoToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link cartNavigation GoToCart.png')

"Step 12: Click on button quantityAdjustment (Increased3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on button quantityAdjustment Increased3.png')

"Step 13: Click on button quantityAdjustment (Decreased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class_1, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_1, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on button quantityAdjustment Decreased.png')

"Step 14: Click on proceedToCheckoutButton -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/proceedToCheckoutButton'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on proceedToCheckoutButton - Navigate to page checkout infocheckoutinfo.png')

"Step 15: Click on backToCartLink -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/backToCartLink'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on backToCartLink - Navigate to page cart pagecart.png')

"Step 16: Click on quantityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/quantityInput'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on quantityInput.png')

"Step 17: Click on quantityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/quantityInput'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on quantityInput.png')

"Step 18: Click on button quantityAdjustment (Increased3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class_2, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_2, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on button quantityAdjustment Increased3 - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Add Items to Cart and Verify Cart Navigation and Quantity Adjustments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}