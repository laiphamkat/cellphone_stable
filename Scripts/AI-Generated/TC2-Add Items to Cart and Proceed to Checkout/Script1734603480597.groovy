import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.proceedToCheckoutAndInputEmailAgain
import com.kms.katalon.core.configuration.RunConfiguration
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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over item object.png')

"Step 3: Click on link horizontal-menu  element apple -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_horizontal-menu__element_apple'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link horizontal-menu  element apple - Navigate to page iphone cases category.png')

"Step 4: Click on spinbutton from"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/spinbutton_from'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on spinbutton from.png')

"Step 5: Click on checkbox stock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/checkbox_stock'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on checkbox stock.png')

"Step 6: Click on button clear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/button_clear'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button clear.png')

"Step 7: Click on link sortOptions (ByTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link sortOptions ByTitle.png')

"Step 8: Click on link sortOptions (ByPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild_1, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link sortOptions ByPrice.png')

"Step 9: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on button addToCart AddToCart.png')

"Step 10: Click on action place order -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/action_place_order'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on action place order - Navigate to page cart pagecart.png')

"Step 11: Click on link cartNavigation (GoToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link cartNavigation GoToCart.png')

"Step 12: Proceed to checkout and input email for shipping again"

proceedToCheckoutAndInputEmailAgain.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on backToCartLink -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/backToCartLink'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on backToCartLink - Navigate to page cart pagecart.png')

"Step 14: Hover over item CartItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_CartItem'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Hover over item CartItem.png')

"Step 15: Click on link horizontal-menu  element -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_horizontal-menu__element'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on link horizontal-menu  element - Navigate to page iphone cases category.png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Add Items to Cart and Proceed to Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}