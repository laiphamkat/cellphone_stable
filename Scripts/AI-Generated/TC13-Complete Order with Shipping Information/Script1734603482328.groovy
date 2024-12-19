import truetest.custom.TrueTestScripts
import truetest.common.completeShippingInformationForCheckout
import truetest.common.proceedToCheckoutAndInputEmailAgain
import internal.GlobalVariable
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

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Hover over item object2.png')

"Step 3: Browse brand categories and add item to cart"

browseCategoriesAndAddToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on link PlaceAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on link PlaceAnOrder.png')

"Step 5: Proceed to checkout and input email for shipping again"

proceedToCheckoutAndInputEmailAgain.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Complete all shipping information before proceeding to payment"

completeShippingInformationForCheckout.execute(data_path_2, Integer.valueOf(index_2))

"Step 7: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Complete Order with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}