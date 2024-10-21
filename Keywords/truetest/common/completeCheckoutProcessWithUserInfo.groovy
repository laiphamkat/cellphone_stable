package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class completeCheckoutProcessWithUserInfo {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button ProceedToCheckout -> Navigate to page 'checkout info#checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_ProceedToCheckout'))
        
        "Step 2: Hover over div CheckoutInfo"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_CheckoutInfo'))
        
        "Step 3: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))
        
        "Step 4: Hover over div CheckoutInfo"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_CheckoutInfo'))
        
        "Step 5: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))
        
        "Step 6: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), data['input_Email'])
        
        "Step 7: Click on button ContinueToShipping -> Navigate to page 'checkout page#checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))
        
        "Step 8: Hover over div Object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_Object'))
        
        "Step 9: Click on input FirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_FirstName'))
        
        "Step 10: Hover over div Object2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_Object2'))
        
        "Step 11: Enter input value in input FirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_FirstName'), data['input_FirstName'])
        
        "Step 12: Click on input LastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_LastName'))
        
        "Step 13: Hover over div Object3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_Object3'))
        
        "Step 14: Enter input value in input LastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_LastName'), data['input_LastName'])
        
        "Step 15: Click on input Address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Address'))
        
        "Step 16: Hover over div Object4"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_Object4'))
        
        "Step 17: Enter input value in input Address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Address'), data['input_Address'])
        
        "Step 18: Click on input ZipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode'))
        
        "Step 19: Hover over div Object5"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_Object5'))
        
        "Step 20: Enter input value in input ZipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode'), data['input_ZipCode'])
        
        "Step 21: Click on input City"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_City'))
        
        "Step 22: Hover over div Object6"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_Object6'))
        
        "Step 23: Click on input State"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_State'))
        
        "Step 24: Enter input value in input City"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_City'), data['input_City'])
        
        "Step 25: Hover over div Object7"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_Object7'))
        
        "Step 26: Enter input value in input State"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_State'), data['input_State'])
        
        "Step 27: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Phone'))
        
        "Step 28: Enter input value in input Phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Phone'), data['input_Phone'])
        
        "Step 29: Click on button ContinueToPayment -> Navigate to page 'checkout page#checkout/payment'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_ContinueToPayment'))
        
        "Step 30: Click on button CompleteOrder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Address'] = testData.getValue('input_Address', rowIndex)
        data['input_City'] = testData.getValue('input_City', rowIndex)
        data['input_Email'] = testData.getValue('input_Email', rowIndex)
        data['input_FirstName'] = testData.getValue('input_FirstName', rowIndex)
        data['input_LastName'] = testData.getValue('input_LastName', rowIndex)
        data['input_Phone'] = testData.getValue('input_Phone', rowIndex)
        data['input_State'] = testData.getValue('input_State', rowIndex)
        data['input_ZipCode'] = testData.getValue('input_ZipCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Address'] = 'default_data'
        data['input_City'] = 'default_data'
        data['input_Email'] = 'default_data'
        data['input_FirstName'] = 'default_data'
        data['input_LastName'] = 'default_data'
        data['input_Phone'] = 'default_data'
        data['input_State'] = 'default_data'
        data['input_ZipCode'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

