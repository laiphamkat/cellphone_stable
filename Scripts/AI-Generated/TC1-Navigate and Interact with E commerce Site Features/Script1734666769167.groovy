import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
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

"Step 2: Click on link swiper-slider  next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_swiper-slider__next'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link swiper-slider  next.png')

"Step 3: Click on link horizontal-menu  element apple -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_horizontal-menu__element_apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link horizontal-menu  element apple - Navigate to page iphone cases category.png')

"Step 4: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on html object.png')

"Step 5: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_iphone_cases_category/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Hover over item object.png')

"Step 6: Click on link horizontal-menu  element samsung -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/link_horizontal-menu__element_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link horizontal-menu  element samsung - Navigate to page category pagecategory.png')

"Step 7: Click on div WelcomeMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_WelcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on div WelcomeMessage.png')

"Step 8: Click on div WelcomeMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_WelcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on div WelcomeMessage.png')

"Step 9: Click on div WelcomeMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_WelcomeMessage2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on div WelcomeMessage2.png')

"Step 10: Hover over link CartLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category/link_CartLink'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Hover over link CartLink.png')

"Step 11: Click on link cart header -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_cart_header'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link cart header - Navigate to page cart pagecart.png')

"Step 12: Click on link cart header"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_cart_header'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link cart header.png')

"Step 13: Click on link logo -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link logo - Navigate to page .png')

"Step 14: Click on button add to cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_add_to_cart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button add to cart.png')

"Step 15: Click on label colorAndStorageOptions (storageCapacity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on label colorAndStorageOptions storageCapacity.png')

"Step 16: Click on label colorAndStorageOptions (colorOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorAndStorageOptions', ['label_colorAndStorageOptions_for': label_colorAndStorageOptions_for_1, 'label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on label colorAndStorageOptions colorOption.png')

"Step 17: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button buy.png')

"Step 18: Click on link place order -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_place_order'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on link place order - Navigate to page cart pagecart.png')

"Step 19: Click on spinbutton form control"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/spinbutton_form_control'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on spinbutton form control.png')

"Step 20: Enter input value in spinbutton form control"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_cart/spinbutton_form_control'), spinbutton_form_control)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Enter input value in spinbutton form control.png')

"Step 21: Click on div ProductDetails -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_ProductDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on div ProductDetails - Navigate to page .png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Interact with E commerce Site Features_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}