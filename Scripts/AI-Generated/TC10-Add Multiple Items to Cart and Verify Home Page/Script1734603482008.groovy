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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Hover over item object.png')

"Step 3: Click on link horizontal-menu  element apple -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_horizontal-menu__element_apple'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on link horizontal-menu  element apple - Navigate to page iphone cases category.png')

"Step 4: Click on button addToCart (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on button addToCart AddToCart2.png')

"Step 5: Click on button addToCart (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart', ['button_addToCart_class': button_addToCart_class_1, 'button_addToCart_internalHasText': button_addToCart_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on button addToCart AddToCart2.png')

"Step 6: Click on button addToCart (AddToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_addToCart', ['button_addToCart_class': button_addToCart_class_2, 'button_addToCart_internalHasText': button_addToCart_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on button addToCart AddToCart3.png')

"Step 7: Click on label caseModels (iPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels', ['label_caseModels_for': label_caseModels_for, 'label_caseModels_internalText': label_caseModels_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on label caseModels iPhone15Plus.png')

"Step 8: Click on label caseModels (Cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_caseModels', ['label_caseModels_for': label_caseModels_for_1, 'label_caseModels_internalText': label_caseModels_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on label caseModels Cypress.png')

"Step 9: Click on button purchaseOptions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on button purchaseOptions IncreaseQuantity.png')

"Step 10: Click on button purchaseOptions (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on button purchaseOptions IncreaseQuantity.png')

"Step 11: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on button purchaseOptions Buy.png')

"Step 12: Click on action place order -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/action_place_order'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on action place order - Navigate to page cart pagecart.png')

"Step 13: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 14: Click on button quantityAdjustment (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class_1, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_1, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth_1, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on button quantityAdjustment IncreaseQuantity.png')

"Step 15: Click on button quantityAdjustment (CartDecreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class_2, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_2, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth_2, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on button quantityAdjustment CartDecreaseQuantity.png')

"Step 16: Click on button quantityAdjustment (CartDecreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class_3, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_3, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth_3, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on button quantityAdjustment CartDecreaseQuantity.png')

"Step 17: Click on button quantityAdjustment (DecreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_quantityAdjustment', ['button_quantityAdjustment_class': button_quantityAdjustment_class_4, 'button_quantityAdjustment_nthChild': button_quantityAdjustment_nthChild_4, 'button_quantityAdjustment_nth': button_quantityAdjustment_nth_4, 'button_quantityAdjustment_internalRoleButtonName': button_quantityAdjustment_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on button quantityAdjustment DecreaseQuantity.png')

"Step 18: Click on input quantityFields (Quantity) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/input_quantityFields'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on input quantityFields Quantity - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Add Multiple Items to Cart and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}