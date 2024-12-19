import truetest.common.addItemToCartAndPlaceOrder
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Add item to cart and place an order"

addItemToCartAndPlaceOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Hover over item CartItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_CartItem'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Hover over item CartItem.png')

"Step 4: Click on link horizontal-menu  element -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_horizontal-menu__element'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link horizontal-menu  element - Navigate to page iphone cases category.png')

"Step 5: Click on button add to cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/button_add_to_cart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on button add to cart.png')

"Step 6: Click on label iphoneCaseModelColor (iPhone15Pro)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_iphoneCaseModelColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_iphoneCaseModelColor', ['label_iphoneCaseModelColor_for': label_iphoneCaseModelColor_for, 'label_iphoneCaseModelColor_internalText': label_iphoneCaseModelColor_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on label iphoneCaseModelColor iPhone15Pro.png')

"Step 7: Click on label iphoneCaseModelColor (WinterBlue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_iphoneCaseModelColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_iphoneCaseModelColor', ['label_iphoneCaseModelColor_for': label_iphoneCaseModelColor_for_1, 'label_iphoneCaseModelColor_internalText': label_iphoneCaseModelColor_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on label iphoneCaseModelColor WinterBlue.png')

"Step 8: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button buy.png')

"Step 9: Click on div ProductAddedToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/div_ProductAddedToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on div ProductAddedToCart.png')

"Step 10: Click on div ProductAddedToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/div_ProductAddedToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on div ProductAddedToCart - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Add iPhone Cases to Cart and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}