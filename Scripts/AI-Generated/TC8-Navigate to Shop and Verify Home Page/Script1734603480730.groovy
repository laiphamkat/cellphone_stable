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

"Step 1: Navigate to shop"

TrueTestScripts.navigate("shop")

"Step 2: Click on header object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce/header_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on header object.png')

"Step 3: Click on header object -> Navigate to page 'checkout process#checkout/step2'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce/header_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on header object - Navigate to page checkout processcheckoutstep2.png')

"Step 4: Enter input value in input FullName -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_process/input_FullName'), input_FullName)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Enter input value in input FullName - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Navigate to Shop and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}