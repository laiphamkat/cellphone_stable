package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectMobileDeviceAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object_1'))
        
        "Step 2: Click on link mobileDevice (GooglePixel) -> Navigate to page 'category page#category/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileDevice"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileDevice', ['link_mobileDevice_nthChild': data['link_mobileDevice_nthChild']]))
        
        "Step 3: Click on button addToCart (AddToCart2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': data['button_addToCart_class'], 'button_addToCart_internalHasText': data['button_addToCart_internalHasText']]))
        
        "Step 4: Click on label colorStorageOption (512GB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption', ['label_colorStorageOption_for': data['label_colorStorageOption_for'], 'label_colorStorageOption_internalText': data['label_colorStorageOption_internalText']]))
        
        "Step 5: Click on label colorStorageOption (Black)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption', ['label_colorStorageOption_for': data['label_colorStorageOption_for_1'], 'label_colorStorageOption_internalText': data['label_colorStorageOption_internalText_1']]))
        
        "Step 6: Click on button purchaseOption (Buy)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOption', ['button_purchaseOption_internalRoleButtonName': data['button_purchaseOption_internalRoleButtonName']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_addToCart_class'] = testData.getValue('button_addToCart_class', rowIndex)
        data['button_addToCart_internalHasText'] = testData.getValue('button_addToCart_internalHasText', rowIndex)
        data['button_purchaseOption_internalRoleButtonName'] = testData.getValue('button_purchaseOption_internalRoleButtonName', rowIndex)
        data['label_colorStorageOption_for'] = testData.getValue('label_colorStorageOption_for', rowIndex)
        data['label_colorStorageOption_for_1'] = testData.getValue('label_colorStorageOption_for_1', rowIndex)
        data['label_colorStorageOption_internalText'] = testData.getValue('label_colorStorageOption_internalText', rowIndex)
        data['label_colorStorageOption_internalText_1'] = testData.getValue('label_colorStorageOption_internalText_1', rowIndex)
        data['link_mobileDevice_nthChild'] = testData.getValue('link_mobileDevice_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_addToCart_class'] = 'default_data'
        data['button_addToCart_internalHasText'] = 'default_data'
        data['button_purchaseOption_internalRoleButtonName'] = 'default_data'
        data['label_colorStorageOption_for'] = 'default_data'
        data['label_colorStorageOption_for_1'] = 'default_data'
        data['label_colorStorageOption_internalText'] = 'default_data'
        data['label_colorStorageOption_internalText_1'] = 'default_data'
        data['link_mobileDevice_nthChild'] = 'default_data'
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

