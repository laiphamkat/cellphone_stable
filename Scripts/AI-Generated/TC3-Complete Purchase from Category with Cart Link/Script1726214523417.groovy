import katalon.common.fillShippingInfoAndProceedToPayment
import internal.GlobalVariable
import katalon.common.selectCategoryAndCompletePurchase
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Select category, add product to cart, and complete purchase"

selectCategoryAndCompletePurchase.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on link cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link cart.png')

"Step 4: Fill in shipping information and proceed to payment"

fillShippingInfoAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Complete Purchase from Category with Cart Link_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}