import truetest.custom.TrueTestScripts
import truetest.common.completeShippingInformationForCheckout
import truetest.common.proceedToCheckoutAndInputEmailAgain
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.selectPurchaseOptionsMultipleTimes

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

"Step 3: Click on link PlaceAnOrder -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 3-Click on link PlaceAnOrder - Navigate to page cart pagecart.png')

"Step 4: Click on link cartNavigation (GoToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on link cartNavigation GoToCart3.png')

"Step 5: Click on link cartNavigation (GoToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class_1, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on link cartNavigation GoToCart3.png')

"Step 6: Click on link cartNavigation (GoToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class_2, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on link cartNavigation GoToCart3.png')

"Step 7: Click on link cartNavigation (GoToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class_3, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on link cartNavigation GoToCart3.png')

"Step 8: Click on link cartNavigation (GoToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class_4, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Click on link cartNavigation GoToCart3.png')

"Step 9: Hover over link cartNavigation (GoToCart4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/link_cartNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 9-Hover over link cartNavigation GoToCart4.png')

"Step 10: Click on link cartNavigation (GoToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class_5, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on link cartNavigation GoToCart3.png')

"Step 11: Proceed to checkout and input email for shipping again"

proceedToCheckoutAndInputEmailAgain.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Complete all shipping information before proceeding to payment"

completeShippingInformationForCheckout.execute(data_path_2, Integer.valueOf(index_2))

"Step 13: Click on button CompleteOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 13-Click on button CompleteOrder - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Select Material Options and Complete Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}