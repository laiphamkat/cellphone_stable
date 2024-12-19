import truetest.custom.TrueTestScripts
import truetest.common.completeShippingInformationForCheckout
import truetest.common.proceedToCheckoutAndInputEmailAgain
import internal.GlobalVariable
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

"Step 1: Navigate to */*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}")

"Step 2: Click on div HomePhoneFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_phone_category/div_HomePhoneFilters'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on div HomePhoneFilters.png')

"Step 3: Click on link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_phone_category/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link GoToCart.png')

"Step 4: Proceed to checkout and input email for shipping again"

proceedToCheckoutAndInputEmailAgain.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Complete all shipping information before proceeding to payment"

completeShippingInformationForCheckout.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Complete Order with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}