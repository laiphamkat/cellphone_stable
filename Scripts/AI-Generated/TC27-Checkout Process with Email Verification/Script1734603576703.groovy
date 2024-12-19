import truetest.common.completeShippingInformationForCheckout
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.common.selectPurchaseOptionsMultipleTimes
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.proceedToCheckoutAndInputEmail

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Select material storage options and purchase multiple times"

selectPurchaseOptionsMultipleTimes.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Select material storage options and purchase multiple times"

selectPurchaseOptionsMultipleTimes.execute(data_path_1, Integer.valueOf(index_1))

"Step 4: Hover over link GoToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/link_GoToCart'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4-Hover over link GoToCart.png')

"Step 5: Click on link Unknown -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 5-Click on link Unknown - Navigate to page cart pagecart.png')

"Step 6: Click on link cartNavigation (GoToCart5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6-Click on link cartNavigation GoToCart5.png')

"Step 7: Proceed to checkout and input email for shipping"

proceedToCheckoutAndInputEmail.execute(data_path_2, Integer.valueOf(index_2))

"Step 8: Complete all shipping information before proceeding to payment"

completeShippingInformationForCheckout.execute(data_path_3, Integer.valueOf(index_3))

"Step 9: Click on button CompleteOrder -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9-Click on button CompleteOrder - Navigate to page thank you pagethank-you.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Checkout Process with Email Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}