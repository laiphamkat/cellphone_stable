import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.proceedToCheckoutAndInputEmail
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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Hover over item object.png')

"Step 3: Click on link brandCategories (SamsungCategory) -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandCategories', ['link_brandCategories_nthChild': link_brandCategories_nthChild, 'link_brandCategories_internalRoleLinkName': link_brandCategories_internalRoleLinkName, 'category_page_category_id': category_page_category_id]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Click on link brandCategories SamsungCategory - Navigate to page category pagecategory.png')

"Step 4: Click on link samsungModels (SamsungGalaxyZFold4) -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_samsungModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_samsungModels', ['link_samsungModels_class': link_samsungModels_class, 'link_samsungModels_internalRoleHeadingName': link_samsungModels_internalRoleHeadingName, 'product_page_product_id': product_page_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Click on link samsungModels SamsungGalaxyZFold4 - Navigate to page product pageproduct.png')

"Step 5: Click on button purchaseOptions (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on button purchaseOptions Buy2.png')

"Step 6: Click on button purchaseOptions (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on button purchaseOptions Buy2.png')

"Step 7: Click on button purchaseOptions (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on button purchaseOptions Buy2.png')

"Step 8: Click on cartItemCount -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/cartItemCount'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on cartItemCount - Navigate to page cart pagecart.png')

"Step 9: Click on button quantityAdjustment (IncreaseQuantity2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on button quantityAdjustment IncreaseQuantity2.png')

"Step 10: Hover over link GoToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/link_GoToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10-Hover over link GoToCart2.png')

"Step 11: Click on link cart header"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_cart_header'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11-Click on link cart header.png')

"Step 12: Click on link cart header"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_cart_header'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12-Click on link cart header.png')

"Step 13: Hover over link GoToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/link_GoToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 13-Hover over link GoToCart2.png')

"Step 14: Click on link cart header"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_cart_header'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 14-Click on link cart header.png')

"Step 15: Click on link cart header"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_cart_header'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 15-Click on link cart header.png')

"Step 16: Proceed to checkout and input email for shipping"

proceedToCheckoutAndInputEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Checkout Process with Email Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}