package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class enterEmailAndProceedToShipping {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button ProceedToCheckout -> Navigate to page 'checkout info#checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_page/button_ProceedToCheckout'))
        
        "Step 2: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))
        
        "Step 3: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))
        
        "Step 4: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), data['input_Email'])
        
        "Step 5: Click on button ContinueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Email'] = testData.getValue('input_Email', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Email'] = 'default_data'
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

