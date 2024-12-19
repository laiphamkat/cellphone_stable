package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectPurchaseOptionsMultipleTimes {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button purchaseOptions (HotNewBestChoice)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions', ['button_purchaseOptions_class': data['button_purchaseOptions_class'], 'button_purchaseOptions_internalHasText': data['button_purchaseOptions_internalHasText']]))
        
        "Step 2: Click on label materialStorageOptions (512GB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_materialStorageOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_materialStorageOptions', ['label_materialStorageOptions_for': data['label_materialStorageOptions_for'], 'label_materialStorageOptions_internalText': data['label_materialStorageOptions_internalText']]))
        
        "Step 3: Click on label materialStorageOptions (NaturalTitanium)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_materialStorageOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_materialStorageOptions', ['label_materialStorageOptions_for': data['label_materialStorageOptions_for_1'], 'label_materialStorageOptions_internalText': data['label_materialStorageOptions_internalText_1']]))
        
        "Step 4: Click on button purchaseOptions (Increased)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions_1', ['button_purchaseOptions_internalRoleButtonName': data['button_purchaseOptions_internalRoleButtonName']]))
        
        "Step 5: Click on button purchaseOptions (Buy)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_purchaseOptions_1', ['button_purchaseOptions_internalRoleButtonName': data['button_purchaseOptions_internalRoleButtonName_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_purchaseOptions_class'] = testData.getValue('button_purchaseOptions_class', rowIndex)
        data['button_purchaseOptions_internalHasText'] = testData.getValue('button_purchaseOptions_internalHasText', rowIndex)
        data['button_purchaseOptions_internalRoleButtonName'] = testData.getValue('button_purchaseOptions_internalRoleButtonName', rowIndex)
        data['button_purchaseOptions_internalRoleButtonName_1'] = testData.getValue('button_purchaseOptions_internalRoleButtonName_1', rowIndex)
        data['label_materialStorageOptions_for'] = testData.getValue('label_materialStorageOptions_for', rowIndex)
        data['label_materialStorageOptions_for_1'] = testData.getValue('label_materialStorageOptions_for_1', rowIndex)
        data['label_materialStorageOptions_internalText'] = testData.getValue('label_materialStorageOptions_internalText', rowIndex)
        data['label_materialStorageOptions_internalText_1'] = testData.getValue('label_materialStorageOptions_internalText_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_purchaseOptions_class'] = 'default_data'
        data['button_purchaseOptions_internalHasText'] = 'default_data'
        data['button_purchaseOptions_internalRoleButtonName'] = 'default_data'
        data['button_purchaseOptions_internalRoleButtonName_1'] = 'default_data'
        data['label_materialStorageOptions_for'] = 'default_data'
        data['label_materialStorageOptions_for_1'] = 'default_data'
        data['label_materialStorageOptions_internalText'] = 'default_data'
        data['label_materialStorageOptions_internalText_1'] = 'default_data'
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

