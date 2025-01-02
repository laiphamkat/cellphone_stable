import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over item object.png')

"Step 3: Click on link Apple -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link Apple - Navigate to page category pagecategory.png')

"Step 4: Click on label storageColorOptions (StorageOption1TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on label storageColorOptions StorageOption1TB.png')

"Step 5: Click on label storageColorOptions (Color)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_1, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on label storageColorOptions Color.png')

"Step 6: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on button Buy.png')

"Step 7: Click on button addToCart (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_addToCart', ['button_addToCart_class': button_addToCart_class, 'button_addToCart_internalHasText': button_addToCart_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button addToCart AddToCart.png')

"Step 8: Click on label storageColorOptions (Storage256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_2, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on label storageColorOptions Storage256GB.png')

"Step 9: Click on label storageColorOptions (Green)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_3, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on label storageColorOptions Green.png')

"Step 10: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button Buy.png')

"Step 11: Click on button ProductAdded"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_ProductAdded'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button ProductAdded.png')

"Step 12: Click on link sortOptions (ByPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/link_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/link_sortOptions', ['link_sortOptions_nthChild': link_sortOptions_nthChild, 'link_sortOptions_internalRoleLinkName': link_sortOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on link sortOptions ByPrice.png')

"Step 13: Click on button addToCart (AddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_addToCart', ['button_addToCart_class': button_addToCart_class_1, 'button_addToCart_internalHasText': button_addToCart_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on button addToCart AddToCart2.png')

"Step 14: Click on label storageColorOptions (Storage512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_4, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on label storageColorOptions Storage512GB.png')

"Step 15: Click on label storageColorOptions (ColorBlueTitanium)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for_5, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on label storageColorOptions ColorBlueTitanium.png')

"Step 16: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on button Buy.png')

"Step 17: Hover over link CartCount3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_category_page/link_CartCount3'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Hover over link CartCount3.png')

"Step 18: Click on link cartCount (CartCount3Dynamic) -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/link_cartCount"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/link_cartCount', ['link_cartCount_internalRoleLinkName': link_cartCount_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on link cartCount CartCount3Dynamic - Navigate to page cart pagecart.png')

"Step 19: Click on button RemoveItem -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_RemoveItem'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on button RemoveItem - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Add and Remove Multiple Items from Shopping Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}