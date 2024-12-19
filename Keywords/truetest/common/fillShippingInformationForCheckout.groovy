package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class fillShippingInformationForCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on firstNameInput"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/firstNameInput'))
        
        "Step 2: Enter input value in firstNameInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/firstNameInput'), data['firstNameInput'])
        
        "Step 3: Click on lastNameInput"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/lastNameInput'))
        
        "Step 4: Enter input value in lastNameInput"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/lastNameInput'), data['lastNameInput'])
        
        "Step 5: Click on input Address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Address'))
        
        "Step 6: Enter input value in input Address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Address'), data['input_Address'])
        
        "Step 7: Click on input ZipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_ZipCode'))
        
        "Step 8: Enter input value in input ZipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ZipCode'), data['input_ZipCode'])
        
        "Step 9: Click on input City"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_City'))
        
        "Step 10: Enter input value in input City"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_City'), data['input_City'])
        
        "Step 11: Click on input State"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_State'))
        
        "Step 12: Enter input value in input State"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_State'), data['input_State'])
        
        "Step 13: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_Phone'))
        
        "Step 14: Enter input value in input Phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Phone'), data['input_Phone'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['firstNameInput'] = testData.getValue('firstNameInput', rowIndex)
        data['input_Address'] = testData.getValue('input_Address', rowIndex)
        data['input_City'] = testData.getValue('input_City', rowIndex)
        data['input_Phone'] = testData.getValue('input_Phone', rowIndex)
        data['input_State'] = testData.getValue('input_State', rowIndex)
        data['input_ZipCode'] = testData.getValue('input_ZipCode', rowIndex)
        data['lastNameInput'] = testData.getValue('lastNameInput', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['firstNameInput'] = 'default_data'
        data['input_Address'] = 'default_data'
        data['input_City'] = 'default_data'
        data['input_Phone'] = 'default_data'
        data['input_State'] = 'default_data'
        data['input_ZipCode'] = 'default_data'
        data['lastNameInput'] = 'default_data'
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

