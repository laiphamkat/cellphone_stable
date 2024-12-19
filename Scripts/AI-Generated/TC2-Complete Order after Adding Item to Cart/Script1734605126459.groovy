import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.goToCartAndProceedToCheckout
import truetest.common.completeOrderAfterShippingDetails
import truetest.custom.TrueTestScripts
import truetest.common.navigateToCategoryAndAddItemToCart


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

"Step 3: Go to cart and proceed to checkout"

goToCartAndProceedToCheckout.execute(data_path_1, Integer.valueOf(index_1))

"Step 4: Complete order after filling shipping details"

completeOrderAfterShippingDetails.execute(data_path_2, Integer.valueOf(index_2))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Complete Order after Adding Item to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}