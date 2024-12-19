import internal.GlobalVariable
import truetest.common.addItemToCartAndPerformAction
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.completeOrderAfterShippingDetails
import truetest.common.navigateToCategoryAndAddItemToCart
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Navigate to category and add item to cart"

navigateToCategoryAndAddItemToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button action (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_action"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_action', ['button_action_internalRoleButtonName': button_action_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on button action Buy.png')

"Step 4: Add item to cart and perform action"

addItemToCartAndPerformAction.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Click on link goToCart (GoToCart2) -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_goToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_goToCart', ['link_goToCart_class': link_goToCart_class, 'link_goToCart_internalRoleLinkName': link_goToCart_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link goToCart GoToCart2 - Navigate to page cart pagecart.png')

"Step 6: Click on incrementButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/incrementButton'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on incrementButton.png')

"Step 7: Click on button proceed to checkout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button proceed to checkout - Navigate to page checkout infocheckoutinfo.png')

"Step 8: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on emailInputField.png')

"Step 9: Enter input value in emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/emailInputField'), emailInputField)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Enter input value in emailInputField.png')

"Step 10: Click on continueToShippingButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/continueToShippingButton'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on continueToShippingButton.png')

"Step 11: Complete order after filling shipping details"

completeOrderAfterShippingDetails.execute(data_path_2, Integer.valueOf(index_2))

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Add Item to Cart and Proceed with Email Input_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}