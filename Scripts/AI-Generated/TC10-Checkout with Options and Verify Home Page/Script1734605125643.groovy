import truetest.common.fillShippingInformationForCheckout
import internal.GlobalVariable
import truetest.common.goToCartAndProceedToCheckout
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.addItemToCartFromCategoryWithOptions
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

"Step 2: Add item to cart from category with options"

addItemToCartFromCategoryWithOptions.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on link GoToCart4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart4'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on link GoToCart4.png')

"Step 4: Go to cart and proceed to checkout"

goToCartAndProceedToCheckout.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Fill in shipping information for checkout"

fillShippingInformationForCheckout.execute(data_path_2, Integer.valueOf(index_2))

"Step 6: Click on body CheckoutBack -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/body_CheckoutBack'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on body CheckoutBack - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Checkout with Options and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}