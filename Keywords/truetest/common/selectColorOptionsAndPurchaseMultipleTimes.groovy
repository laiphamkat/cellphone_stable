package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class selectColorOptionsAndPurchaseMultipleTimes {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on label colorStorageOption (Storage256GB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption', ['label_colorStorageOption_for': data['label_colorStorageOption_for'], 'label_colorStorageOption_internalText': data['label_colorStorageOption_internalText']]))
        
        "Step 2: Click on label colorStorageOption (ColorYellow)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOption', ['label_colorStorageOption_for': data['label_colorStorageOption_for_1'], 'label_colorStorageOption_internalText': data['label_colorStorageOption_internalText_1']]))
        
        "Step 3: Click on button purchaseAction (Increased)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseAction"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': data['button_purchaseAction_internalRoleButtonName']]))
        
        "Step 4: Click on button purchaseAction (Increased)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseAction"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': data['button_purchaseAction_internalRoleButtonName_1']]))
        
        "Step 5: Click on button purchaseAction (Buy)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseAction"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseAction', ['button_purchaseAction_internalRoleButtonName': data['button_purchaseAction_internalRoleButtonName_2']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_purchaseAction_internalRoleButtonName'] = testData.getValue('button_purchaseAction_internalRoleButtonName', rowIndex)
        data['button_purchaseAction_internalRoleButtonName_1'] = testData.getValue('button_purchaseAction_internalRoleButtonName_1', rowIndex)
        data['button_purchaseAction_internalRoleButtonName_2'] = testData.getValue('button_purchaseAction_internalRoleButtonName_2', rowIndex)
        data['label_colorStorageOption_for'] = testData.getValue('label_colorStorageOption_for', rowIndex)
        data['label_colorStorageOption_for_1'] = testData.getValue('label_colorStorageOption_for_1', rowIndex)
        data['label_colorStorageOption_internalText'] = testData.getValue('label_colorStorageOption_internalText', rowIndex)
        data['label_colorStorageOption_internalText_1'] = testData.getValue('label_colorStorageOption_internalText_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_purchaseAction_internalRoleButtonName'] = 'default_data'
        data['button_purchaseAction_internalRoleButtonName_1'] = 'default_data'
        data['button_purchaseAction_internalRoleButtonName_2'] = 'default_data'
        data['label_colorStorageOption_for'] = 'default_data'
        data['label_colorStorageOption_for_1'] = 'default_data'
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

