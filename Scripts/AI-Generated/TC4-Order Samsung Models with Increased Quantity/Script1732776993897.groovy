import truetest.common.completeShippingInformation
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

"Step 2: Hover over item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Hover over item object2.png')

"Step 3: Click on link mobileBrands (Samsung) -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileBrands', ['link_mobileBrands_nthChild': link_mobileBrands_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link mobileBrands Samsung - Navigate to page category pagecategory.png')

"Step 4: Click on link samsungModels (SamsungGalaxyS23UltraSmartviewCases) -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/link_samsungModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/link_samsungModels', ['link_samsungModels_class': link_samsungModels_class, 'link_samsungModels_internalRoleHeadingName': link_samsungModels_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link samsungModels SamsungGalaxyS23UltraSmartviewCases - Navigate to page product pageproduct.png')

"Step 5: Click on button Increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/button_Increased2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on button Increased2.png')

"Step 6: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on button purchaseOptions Buy.png')

"Step 7: Click on link cartNavigation (GoToCart) -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_page/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_page/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on link cartNavigation GoToCart - Navigate to page cart pagecart.png')

"Step 8: Click on button increaseQuantity (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart_page/button_increaseQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart_page/button_increaseQuantity', ['button_increaseQuantity_nthChild': button_increaseQuantity_nthChild, 'button_increaseQuantity_internalRoleButtonName': button_increaseQuantity_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button increaseQuantity Increased.png')

"Step 9: Proceed to checkout and input email for shipping"

proceedToCheckoutAndInputEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Fill in shipping details and complete the order process"

completeShippingInformation.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Order Samsung Models with Increased Quantity_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}