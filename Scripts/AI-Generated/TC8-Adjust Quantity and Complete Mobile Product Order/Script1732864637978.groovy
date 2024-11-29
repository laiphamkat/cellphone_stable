import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.fillShippingDetailsAndCompleteOrder
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.proceedToCheckoutAndEnterEmail
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

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Hover over item object2.png')

"Step 3: Click on link mobileBrands (Samsung) -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on link mobileBrands Samsung - Navigate to page category pagecategory.png')

"Step 4: Click on link caseModels (SamsungGalaxyS23UltraSmartviewCases) -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_caseModels', ['link_caseModels_class': link_caseModels_class, 'link_caseModels_internalRoleHeadingName': link_caseModels_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link caseModels SamsungGalaxyS23UltraSmartviewCases - Navigate to page product pageproduct.png')

"Step 5: Click on button Increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Increased2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on button Increased2.png')

"Step 6: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button purchaseOptions Buy.png')

"Step 7: Click on link cartNavigation (GoToCart) -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on link cartNavigation GoToCart - Navigate to page cart pagecart.png')

"Step 8: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment_1', ['button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 9: Proceed to checkout and enter email for shipping"

proceedToCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Fill in shipping details and complete the order"

fillShippingDetailsAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Adjust Quantity and Complete Mobile Product Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}