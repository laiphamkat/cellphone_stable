import truetest.common.browseCategoriesAndAddToCart
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.common.fillShippingInformationAndCompleteOrder
import truetest.custom.TrueTestScripts
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

"Step 2: Browse brand categories and add item to cart"

browseCategoriesAndAddToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button purchaseOptions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 3-Click on button purchaseOptions Increased.png')

"Step 4: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 4-Click on button purchaseOptions Buy.png')

"Step 5: Click on link cartNavigation (GoToCart2) -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 5-Click on link cartNavigation GoToCart2 - Navigate to page cart pagecart.png')

"Step 6: Click on button proceed to checkout -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 6-Click on button proceed to checkout - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 7: Click on firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/firstNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 7-Click on firstNameInput.png')

"Step 8: Enter input value in firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/firstNameInput'), firstNameInput)

WebUI.takeScreenshot(reportLocation + '/TC31/Step 8-Enter input value in firstNameInput.png')

"Step 9: Click on lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/lastNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 9-Click on lastNameInput.png')

"Step 10: Click on button ContactInfo -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_ContactInfo'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 10-Click on button ContactInfo - Navigate to page checkout infocheckoutinfo.png')

"Step 11: Click on button ContinueToShipping2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 11-Click on button ContinueToShipping2.png')

"Step 12: Fill in shipping details and complete the order process"

fillShippingInformationAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-Complete Order with Shipping Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}