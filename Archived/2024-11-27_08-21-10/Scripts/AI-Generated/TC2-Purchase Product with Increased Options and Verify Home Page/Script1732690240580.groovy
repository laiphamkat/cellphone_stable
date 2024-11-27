import truetest.common.fillShippingInformationAndCompleteOrder
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.proceedToCheckoutAndEnterEmail
import truetest.custom.TrueTestScripts
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

"Step 3: Click on link brandNames (Samsung) -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_nthChild': link_brandNames_nthChild, 'link_brandNames_internalRoleLinkName': link_brandNames_internalRoleLinkName, 'category_id': category_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link brandNames Samsung - Navigate to page category.png')

"Step 4: Click on link productModels (SamsungGalaxyS23UltraSmartviewCases) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_productModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_productModels', ['link_productModels_class': link_productModels_class, 'link_productModels_internalRoleHeadingName': link_productModels_internalRoleHeadingName, 'product_id': product_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link productModels SamsungGalaxyS23UltraSmartviewCases - Navigate to page product.png')

"Step 5: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button Increased.png')

"Step 6: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button purchaseOptions Buy.png')

"Step 7: Click on link GoToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link GoToCart - Navigate to page cart.png')

"Step 8: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 9: Proceed to checkout and enter email for shipping"

proceedToCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Fill out shipping information and complete order"

fillShippingInformationAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Purchase Product with Increased Options and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}