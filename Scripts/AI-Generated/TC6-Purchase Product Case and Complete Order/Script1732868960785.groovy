import truetest.common.fillShippingDetailsAndCompleteOrder
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.initiateCheckoutAndEnterEmail
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
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

"Step 2: Click on link productCase (SamsungGalaxyS23UltraSmartviewCases) -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productCase'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link productCase SamsungGalaxyS23UltraSmartviewCases - Navigate to page product pageproduct.png')

"Step 3: Click on button purchaseOptions (Increased)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on button purchaseOptions Increased.png')

"Step 4: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button purchaseOptions Buy.png')

"Step 5: Click on link cartNavigation (GoToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_cartNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': link_cartNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link cartNavigation GoToCart.png')

"Step 6: Initiate checkout and enter email for shipping"

initiateCheckoutAndEnterEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Fill in shipping details and complete the order"

fillShippingDetailsAndCompleteOrder.execute(data_path_1, Integer.valueOf(index_1))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Purchase Product Case and Complete Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}