import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Click on button purchaseOptions (iPhone15PlusBuy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_class': button_purchaseOptions_class, 'button_purchaseOptions_internalHasText': button_purchaseOptions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 2-Click on button purchaseOptions iPhone15PlusBuy.png')

"Step 3: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Click on button Close.png')

"Step 4: Click on button purchaseOptions (iPhone15FineWovenCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_class': button_purchaseOptions_class_1, 'button_purchaseOptions_internalHasText': button_purchaseOptions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on button purchaseOptions iPhone15FineWovenCase.png')

"Step 5: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on button Close.png')

"Step 6: Click on button purchaseOptions (SaleMagSafeCharger)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_class': button_purchaseOptions_class_2, 'button_purchaseOptions_internalHasText': button_purchaseOptions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Click on button purchaseOptions SaleMagSafeCharger.png')

"Step 7: Click on button purchaseOptions (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_class': button_purchaseOptions_class_3, 'button_purchaseOptions_internalHasText': button_purchaseOptions_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on button purchaseOptions AddToCart.png')

"Step 8: Click on link PlaceAnOrder -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_PlaceAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on link PlaceAnOrder - Navigate to page cart pagecart.png')

"Step 9: Click on button proceed to checkout -> Navigate to page 'checkout info#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on button proceed to checkout - Navigate to page checkout infocheckoutinfo.png')

"Step 10: Click on link BackToCart -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/link_BackToCart'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Click on link BackToCart - Navigate to page cart pagecart.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Navigate to Cart and Verify Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}