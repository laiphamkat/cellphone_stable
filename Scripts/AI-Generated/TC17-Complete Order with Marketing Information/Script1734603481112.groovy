import truetest.custom.TrueTestScripts
import truetest.common.completeShippingInformationForCheckout
import truetest.common.addToCartAndSelectStorageColor
import internal.GlobalVariable
import truetest.common.proceedToCheckoutWithMarketingInfo
import truetest.common.browseCategoriesAndAddToCart
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

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

WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Hover over item object2.png')

"Step 3: Browse brand categories and add item to cart"

browseCategoriesAndAddToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on button purchaseOptions Buy.png')

"Step 5: Add item to cart and select storage color options"

addToCartAndSelectStorageColor.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on link PlaceAnOrder -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on link PlaceAnOrder - Navigate to page cart pagecart.png')

"Step 7: Click on button removeItem (Remove)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_removeItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem', ['button_removeItem_class': button_removeItem_class, 'button_removeItem_nth': button_removeItem_nth]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on button removeItem Remove.png')

"Step 8: Proceed to checkout while opting for marketing information"

proceedToCheckoutWithMarketingInfo.execute(data_path_2, Integer.valueOf(index_2))

"Step 9: Complete all shipping information before proceeding to payment"

completeShippingInformationForCheckout.execute(data_path_3, Integer.valueOf(index_3))

"Step 10: Click on span CashOnDelivery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/span_CashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 10-Click on span CashOnDelivery.png')

"Step 11: Click on input CashOnDelivery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_CashOnDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 11-Click on input CashOnDelivery.png')

"Step 12: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 12-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Complete Order with Marketing Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}