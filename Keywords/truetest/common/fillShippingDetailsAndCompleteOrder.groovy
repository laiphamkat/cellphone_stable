package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingDetailsAndCompleteOrder {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div CheckoutInfo"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo'))
        
        "Step 2: Click on input FirstName2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_FirstName2'))
        
        "Step 3: Hover over div CheckoutInfo2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo2'))
        
        "Step 4: Enter input value in input FirstName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_FirstName2'), data['input_FirstName2'])
        
        "Step 5: Click on input LastName2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_LastName2'))
        
        "Step 6: Hover over div CheckoutInfo3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo3'))
        
        "Step 7: Enter input value in input LastName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_LastName2'), data['input_LastName2'])
        
        "Step 8: Click on input Address2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Address2'))
        
        "Step 9: Hover over div CheckoutInfo4"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo4'))
        
        "Step 10: Enter input value in input Address2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Address2'), data['input_Address2'])
        
        "Step 11: Click on input ZipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_ZipCode'))
        
        "Step 12: Hover over div CheckoutInfo5"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo5'))
        
        "Step 13: Enter input value in input ZipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ZipCode'), data['input_ZipCode'])
        
        "Step 14: Click on input City"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_City'))
        
        "Step 15: Hover over div CheckoutInfo6"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo6'))
        
        "Step 16: Enter input value in input City"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_City'), data['input_City'])
        
        "Step 17: Click on input State"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_State'))
        
        "Step 18: Hover over div CheckoutInfo7"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout/div_CheckoutInfo7'))
        
        "Step 19: Enter input value in input State"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_State'), data['input_State'])
        
        "Step 20: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Phone'))
        
        "Step 21: Enter input value in input Phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Phone'), data['input_Phone'])
        
        "Step 22: Click on button ContinueToPayment -> Navigate to page 'checkout page#checkout/payment'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_ContinueToPayment'))
        
        "Step 23: Click on button CompleteOrder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_CompleteOrder'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Address2'] = testData.getValue('input_Address2', rowIndex)
        data['input_City'] = testData.getValue('input_City', rowIndex)
        data['input_FirstName2'] = testData.getValue('input_FirstName2', rowIndex)
        data['input_LastName2'] = testData.getValue('input_LastName2', rowIndex)
        data['input_Phone'] = testData.getValue('input_Phone', rowIndex)
        data['input_State'] = testData.getValue('input_State', rowIndex)
        data['input_ZipCode'] = testData.getValue('input_ZipCode', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Address2'] = 'default_data'
        data['input_City'] = 'default_data'
        data['input_FirstName2'] = 'default_data'
        data['input_LastName2'] = 'default_data'
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

