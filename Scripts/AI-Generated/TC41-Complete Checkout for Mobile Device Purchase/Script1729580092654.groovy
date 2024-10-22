import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import truetest.common.enterEmailAndContinueToShipping
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.selectMobileDeviceAndAddToCart
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.fillShippingAddressAndContinueToPayment
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

"Step 2: Select mobile device and add it to the cart for purchase"

selectMobileDeviceAndAddToCart.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Input email on checkout info page and continue to shipping"

enterEmailAndContinueToShipping.execute(data_path_1, Integer.valueOf(index_1))

"Step 4: Fill in shipping address details and proceed to payment"

fillShippingAddressAndContinueToPayment.execute(data_path_2, Integer.valueOf(index_2))

"Step 5: Click on button CompleteOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 5-Click on button CompleteOrder - Navigate to page thank-you.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC41-Complete Checkout for Mobile Device Purchase_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}