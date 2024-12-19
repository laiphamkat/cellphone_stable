import truetest.common.selectMaterialOptionsAndPlaceOrder
import truetest.custom.TrueTestScripts
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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Select material options and proceed to place the order"

selectMaterialOptionsAndPlaceOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Hover over item CartItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_cart/item_CartItem'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Hover over item CartItem.png')

"Step 4: Click on link horizontal-menu  element -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_horizontal-menu__element'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link horizontal-menu  element - Navigate to page iphone cases category.png')

"Step 5: Click on button addToCart (AddToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on button addToCart AddToCart3.png')

"Step 6: Click on label caseModels (iPhone15Pro)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels', ['label_caseModels_for': label_caseModels_for, 'label_caseModels_internalText': label_caseModels_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on label caseModels iPhone15Pro.png')

"Step 7: Click on label caseModels (ColorWinterBlue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels', ['label_caseModels_for': label_caseModels_for_1, 'label_caseModels_internalText': label_caseModels_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on label caseModels ColorWinterBlue.png')

"Step 8: Click on button purchaseOptions (Buy2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on button purchaseOptions Buy2.png')

"Step 9: Click on div ProductAddedToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/div_ProductAddedToCart'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on div ProductAddedToCart.png')

"Step 10: Click on div ProductAddedToCart -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/div_ProductAddedToCart'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on div ProductAddedToCart - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Select Material Options and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}