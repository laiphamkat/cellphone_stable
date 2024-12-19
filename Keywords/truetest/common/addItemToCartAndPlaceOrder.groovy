package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class addItemToCartAndPlaceOrder {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button add to cart"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_add_to_cart'))
        
        "Step 2: Click on label storageColorOption (512GB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColorOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColorOption', ['label_storageColorOption_for': data['label_storageColorOption_for'], 'label_storageColorOption_internalText': data['label_storageColorOption_internalText']]))
        
        "Step 3: Click on label storageColorOption (Yellow)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_storageColorOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_storageColorOption', ['label_storageColorOption_for': data['label_storageColorOption_for_1'], 'label_storageColorOption_internalText': data['label_storageColorOption_internalText_1']]))
        
        "Step 4: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))
        
        "Step 5: Click on action place order"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/action_place_order'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['label_storageColorOption_for'] = testData.getValue('label_storageColorOption_for', rowIndex)
        data['label_storageColorOption_for_1'] = testData.getValue('label_storageColorOption_for_1', rowIndex)
        data['label_storageColorOption_internalText'] = testData.getValue('label_storageColorOption_internalText', rowIndex)
        data['label_storageColorOption_internalText_1'] = testData.getValue('label_storageColorOption_internalText_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['label_storageColorOption_for'] = 'default_data'
        data['label_storageColorOption_for_1'] = 'default_data'
        data['label_storageColorOption_internalText'] = 'default_data'
        data['label_storageColorOption_internalText_1'] = 'default_data'
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

