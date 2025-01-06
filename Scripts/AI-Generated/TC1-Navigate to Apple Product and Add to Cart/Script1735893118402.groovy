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

"Step 2: Click on link Apple -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link Apple - Navigate to page category pagecategory.png')

"Step 3: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_storageColorOptions', ['label_storageColorOptions_for': label_storageColorOptions_for, 'label_storageColorOptions_internalText': label_storageColorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on label storageColorOptions 512GB.png')

"Step 4: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button Increased.png')

"Step 5: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button Close.png')

"Step 6: Click on link iPhone15Plus -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_page/link_iPhone15Plus'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link iPhone15Plus - Navigate to page productproduct.png')

"Step 7: Click on label colorAndVariant (Variant512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_colorAndVariant_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_colorAndVariant_1', ['label_colorAndVariant_for': label_colorAndVariant_for, 'label_colorAndVariant_internalText': label_colorAndVariant_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on label colorAndVariant Variant512GB.png')

"Step 8: Click on button Decreased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Decreased'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button Decreased.png')

"Step 9: Click on link ProductPhone -> Navigate to page 'phone category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductPhone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link ProductPhone - Navigate to page phone category.png')

"Step 10: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_phone_category/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button AddToCart.png')

"Step 11: Click on label 512GB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_phone_category/label_512GB'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on label 512GB.png')

"Step 12: Click on button Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_phone_category/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button Close - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate to Apple Product and Add to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}