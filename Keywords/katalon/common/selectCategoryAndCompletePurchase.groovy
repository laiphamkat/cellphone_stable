package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectCategoryAndCompletePurchase {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link categoryApple (categoryApple) -> Navigate to page 'category/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_categoryApple"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_categoryApple', ['link_categoryApple_internalRoleLinkName': data['link_categoryApple_internalRoleLinkName'], 'link_categoryApple_category_id': data['link_categoryApple_category_id']]))
        
        "Step 2: Click on button addToCart (addToCart)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_internalHasText': data['button_addToCart_internalHasText']]))
        
        "Step 3: Click on label colorStorageOption (256Gb)"
        
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
        data['button_addToCart_internalHasText'] = testData.getValue('button_addToCart_internalHasText', rowIndex)
        data['label_colorStorageOption_internalText'] = testData.getValue('label_colorStorageOption_internalText', rowIndex)
        data['label_colorStorageOption_internalText_1'] = testData.getValue('label_colorStorageOption_internalText_1', rowIndex)
        data['link_categoryApple_category_id'] = testData.getValue('link_categoryApple_category_id', rowIndex)
        data['link_categoryApple_internalRoleLinkName'] = testData.getValue('link_categoryApple_internalRoleLinkName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_addToCart_internalHasText'] = 'default_data'
        data['label_colorStorageOption_internalText'] = 'default_data'
        data['label_colorStorageOption_internalText_1'] = 'default_data'
        data['link_categoryApple_category_id'] = 'default_data'
        data['link_categoryApple_internalRoleLinkName'] = 'default_data'
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

