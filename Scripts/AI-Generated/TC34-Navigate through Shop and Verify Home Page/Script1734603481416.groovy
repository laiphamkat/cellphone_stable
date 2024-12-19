import truetest.common.selectMaterialOptionsAndPlaceOrder
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

"Step 2: Click on link swiper-slider  next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_swiper-slider__next'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 2-Click on link swiper-slider  next.png')

"Step 3: Click on link horizontal-menu  element apple -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_horizontal-menu__element_apple'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 3-Click on link horizontal-menu  element apple - Navigate to page iphone cases category.png')

"Step 4: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 4-Click on html object.png')

"Step 5: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_iphone_cases_category/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 5-Hover over item object.png')

"Step 6: Click on link horizontal-menu  element samsung -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/link_horizontal-menu__element_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 6-Click on link horizontal-menu  element samsung - Navigate to page category pagecategory.png')

"Step 7: Click on div WelcomeMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_WelcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 7-Click on div WelcomeMessage.png')

"Step 8: Click on div WelcomeMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_WelcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 8-Click on div WelcomeMessage.png')

"Step 9: Click on div WelcomeMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_WelcomeMessage2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 9-Click on div WelcomeMessage2.png')

"Step 10: Hover over link CartLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/link_CartLink'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 10-Hover over link CartLink.png')

"Step 11: Click on link cartNavigation (CartLink2) -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 11-Click on link cartNavigation CartLink2 - Navigate to page cart pagecart.png')

"Step 12: Click on link cartNavigation (CartLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/link_cartNavigation', ['link_cartNavigation_class': link_cartNavigation_class_1, 'link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 12-Click on link cartNavigation CartLink.png')

"Step 13: Click on link logo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 13-Click on link logo.png')

"Step 14: Select material options and proceed to place the order"

selectMaterialOptionsAndPlaceOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on input quantityFields (QuantityInput)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/input_quantityFields'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 15-Click on input quantityFields QuantityInput.png')

"Step 16: Enter input value in input quantityFields (QuantityInput)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_cart/input_quantityFields'), input_quantityFields)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 16-Enter input value in input quantityFields QuantityInput.png')

"Step 17: Click on div ProductDetails -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_ProductDetails'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 17-Click on div ProductDetails - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Navigate through Shop and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}