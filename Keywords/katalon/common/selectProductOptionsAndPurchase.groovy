package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class selectProductOptionsAndPurchase {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link apple -> Navigate to page 'category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))
        
        "Step 2: Click on button newProduct (hotNewIphone15)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_newProduct"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_newProduct', ['button_newProduct_internalHasText': data['button_newProduct_internalHasText']]))
        
        "Step 3: Click on label colorStorageOption (512Gb)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption', ['label_colorStorageOption_internalText': data['label_colorStorageOption_internalText']]))
        
        "Step 4: Click on label colorStorageOption (yellow)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption', ['label_colorStorageOption_internalText': data['label_colorStorageOption_internalText_1']]))
        
        "Step 5: Click on button buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_newProduct_internalHasText'] = testData.getValue('button_newProduct_internalHasText', rowIndex)
        data['label_colorStorageOption_internalText'] = testData.getValue('label_colorStorageOption_internalText', rowIndex)
        data['label_colorStorageOption_internalText_1'] = testData.getValue('label_colorStorageOption_internalText_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_newProduct_internalHasText'] = 'default_data'
        data['label_colorStorageOption_internalText'] = 'default_data'
        data['label_colorStorageOption_internalText_1'] = 'default_data'
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

