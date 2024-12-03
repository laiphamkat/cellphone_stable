import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over item object.png')

"Step 3: Click on link Apple -> Navigate to page 'iphone cases category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link Apple - Navigate to page iphone cases category.png')

"Step 4: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button AddToCart.png')

"Step 5: Click on button cartAction (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_cartAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_cartAction', ['button_cartAction_class': button_cartAction_class, 'button_cartAction_internalHasText': button_cartAction_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button cartAction AddToCart2.png')

"Step 6: Click on button cartAction (BuyNow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_cartAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_cartAction', ['button_cartAction_class': button_cartAction_class_1, 'button_cartAction_internalHasText': button_cartAction_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button cartAction BuyNow.png')

"Step 7: Click on label productModel (iPhone15Plus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_productModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_productModel', ['label_productModel_for': label_productModel_for, 'label_productModel_internalText': label_productModel_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on label productModel iPhone15Plus.png')

"Step 8: Click on label productModel (Cypress)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_productModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/label_productModel', ['label_productModel_for': label_productModel_for_1, 'label_productModel_internalText': label_productModel_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on label productModel Cypress.png')

"Step 9: Click on button quantityAction (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_quantityAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_quantityAction', ['button_quantityAction_internalRoleButtonName': button_quantityAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button quantityAction IncreaseQuantity.png')

"Step 10: Click on button quantityAction (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_quantityAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_quantityAction', ['button_quantityAction_internalRoleButtonName': button_quantityAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button quantityAction IncreaseQuantity.png')

"Step 11: Click on button quantityAction (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_quantityAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_iphone_cases_category/button_quantityAction', ['button_quantityAction_internalRoleButtonName': button_quantityAction_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button quantityAction Buy.png')

"Step 12: Click on link PlaceOrder -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iphone_cases_category/link_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link PlaceOrder - Navigate to page cart pagecart.png')

"Step 13: Click on button cartQuantityAction (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction', ['button_cartQuantityAction_class': button_cartQuantityAction_class, 'button_cartQuantityAction_nthChild': button_cartQuantityAction_nthChild, 'button_cartQuantityAction_internalRoleButtonName': button_cartQuantityAction_internalRoleButtonName, 'button_cartQuantityAction_nth': button_cartQuantityAction_nth]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button cartQuantityAction IncreaseQuantity.png')

"Step 14: Click on button cartQuantityAction (IncreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction', ['button_cartQuantityAction_class': button_cartQuantityAction_class_1, 'button_cartQuantityAction_nthChild': button_cartQuantityAction_nthChild_1, 'button_cartQuantityAction_internalRoleButtonName': button_cartQuantityAction_internalRoleButtonName_1, 'button_cartQuantityAction_nth': button_cartQuantityAction_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button cartQuantityAction IncreaseQuantity.png')

"Step 15: Click on button cartQuantityAction (CartDecreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction', ['button_cartQuantityAction_class': button_cartQuantityAction_class_2, 'button_cartQuantityAction_nthChild': button_cartQuantityAction_nthChild_2, 'button_cartQuantityAction_internalRoleButtonName': button_cartQuantityAction_internalRoleButtonName_2, 'button_cartQuantityAction_nth': button_cartQuantityAction_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button cartQuantityAction CartDecreaseQuantity.png')

"Step 16: Click on button cartQuantityAction (CartDecreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction', ['button_cartQuantityAction_class': button_cartQuantityAction_class_3, 'button_cartQuantityAction_nthChild': button_cartQuantityAction_nthChild_3, 'button_cartQuantityAction_internalRoleButtonName': button_cartQuantityAction_internalRoleButtonName_3, 'button_cartQuantityAction_nth': button_cartQuantityAction_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on button cartQuantityAction CartDecreaseQuantity.png')

"Step 17: Click on button cartQuantityAction (DecreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_cartQuantityAction', ['button_cartQuantityAction_class': button_cartQuantityAction_class_4, 'button_cartQuantityAction_nthChild': button_cartQuantityAction_nthChild_4, 'button_cartQuantityAction_internalRoleButtonName': button_cartQuantityAction_internalRoleButtonName_4, 'button_cartQuantityAction_nth': button_cartQuantityAction_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button cartQuantityAction DecreaseQuantity.png')

"Step 18: Click on input Quantity -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/input_Quantity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input Quantity - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Test Add to Cart and Quantity Management for iPhone Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}