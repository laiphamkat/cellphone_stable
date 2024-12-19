package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class goToCartAndProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link GoToCart4 -> Navigate to page 'cart page#cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_GoToCart4'))
        
        "Step 2: Click on button proceed to checkout -> Navigate to page 'checkout info#checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))
        
        "Step 3: Click on emailInputField"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/emailInputField'))
        
        "Step 4: Enter input value in emailInputField"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/emailInputField'), data['emailInputField'])
        
        "Step 5: Click on continueToShippingButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/continueToShippingButton'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['emailInputField'] = testData.getValue('emailInputField', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['emailInputField'] = 'default_data'
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

