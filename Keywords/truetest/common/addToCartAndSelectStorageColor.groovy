package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class addToCartAndSelectStorageColor {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button addToCart (AddToCart)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': data['button_addToCart_class'], 'button_addToCart_internalHasText': data['button_addToCart_internalHasText']]))
        
        "Step 2: Click on label storageColorOptions (GB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText']]))
        
        "Step 3: Click on label storageColorOptions (BlackTitanium)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for_1'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText_1']]))
        
        "Step 4: Click on button purchaseOptions (Increased)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': data['button_purchaseOptions_internalRoleButtonName']]))
        
        "Step 5: Click on button purchaseOptions (Buy)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': data['button_purchaseOptions_internalRoleButtonName_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_addToCart_class'] = testData.getValue('button_addToCart_class', rowIndex)
        data['button_addToCart_internalHasText'] = testData.getValue('button_addToCart_internalHasText', rowIndex)
        data['button_purchaseOptions_internalRoleButtonName'] = testData.getValue('button_purchaseOptions_internalRoleButtonName', rowIndex)
        data['button_purchaseOptions_internalRoleButtonName_1'] = testData.getValue('button_purchaseOptions_internalRoleButtonName_1', rowIndex)
        data['label_storageColorOptions_for'] = testData.getValue('label_storageColorOptions_for', rowIndex)
        data['label_storageColorOptions_for_1'] = testData.getValue('label_storageColorOptions_for_1', rowIndex)
        data['label_storageColorOptions_internalText'] = testData.getValue('label_storageColorOptions_internalText', rowIndex)
        data['label_storageColorOptions_internalText_1'] = testData.getValue('label_storageColorOptions_internalText_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_addToCart_class'] = 'default_data'
        data['button_addToCart_internalHasText'] = 'default_data'
        data['button_purchaseOptions_internalRoleButtonName'] = 'default_data'
        data['button_purchaseOptions_internalRoleButtonName_1'] = 'default_data'
        data['label_storageColorOptions_for'] = 'default_data'
        data['label_storageColorOptions_for_1'] = 'default_data'
        data['label_storageColorOptions_internalText'] = 'default_data'
        data['label_storageColorOptions_internalText_1'] = 'default_data'
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

