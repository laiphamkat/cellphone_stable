package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class addMultipleColorOptionsToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link brandCategories (AppleCategory) -> Navigate to page 'category page#category/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_brandCategories"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_brandCategories', ['link_brandCategories_nthChild': data['link_brandCategories_nthChild'], 'link_brandCategories_internalRoleLinkName': data['link_brandCategories_internalRoleLinkName'], 'category_page_category_id': data['category_page_category_id']]))
        
        "Step 2: Click on button addToCart (AddToCart2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': data['button_addToCart_class'], 'button_addToCart_internalHasText': data['button_addToCart_internalHasText']]))
        
        "Step 3: Click on label storageColorOptions (256GB2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText']]))
        
        "Step 4: Click on label storageColorOptions (Green)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for_1'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText_1']]))
        
        "Step 5: Click on label storageColorOptions (1TB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_for': data['label_storageColorOptions_for_2'], 'label_storageColorOptions_internalText': data['label_storageColorOptions_internalText_2']]))
        
        "Step 6: Click on button purchaseOptions (Buy)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': data['button_purchaseOptions_internalRoleButtonName']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_addToCart_class'] = testData.getValue('button_addToCart_class', rowIndex)
        data['button_addToCart_internalHasText'] = testData.getValue('button_addToCart_internalHasText', rowIndex)
        data['button_purchaseOptions_internalRoleButtonName'] = testData.getValue('button_purchaseOptions_internalRoleButtonName', rowIndex)
        data['category_page_category_id'] = testData.getValue('category_page_category_id', rowIndex)
        data['label_storageColorOptions_for'] = testData.getValue('label_storageColorOptions_for', rowIndex)
        data['label_storageColorOptions_for_1'] = testData.getValue('label_storageColorOptions_for_1', rowIndex)
        data['label_storageColorOptions_for_2'] = testData.getValue('label_storageColorOptions_for_2', rowIndex)
        data['label_storageColorOptions_internalText'] = testData.getValue('label_storageColorOptions_internalText', rowIndex)
        data['label_storageColorOptions_internalText_1'] = testData.getValue('label_storageColorOptions_internalText_1', rowIndex)
        data['label_storageColorOptions_internalText_2'] = testData.getValue('label_storageColorOptions_internalText_2', rowIndex)
        data['link_brandCategories_internalRoleLinkName'] = testData.getValue('link_brandCategories_internalRoleLinkName', rowIndex)
        data['link_brandCategories_nthChild'] = testData.getValue('link_brandCategories_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_addToCart_class'] = 'default_data'
        data['button_addToCart_internalHasText'] = 'default_data'
        data['button_purchaseOptions_internalRoleButtonName'] = 'default_data'
        data['category_page_category_id'] = 'default_data'
        data['label_storageColorOptions_for'] = 'default_data'
        data['label_storageColorOptions_for_1'] = 'default_data'
        data['label_storageColorOptions_for_2'] = 'default_data'
        data['label_storageColorOptions_internalText'] = 'default_data'
        data['label_storageColorOptions_internalText_1'] = 'default_data'
        data['label_storageColorOptions_internalText_2'] = 'default_data'
        data['link_brandCategories_internalRoleLinkName'] = 'default_data'
        data['link_brandCategories_nthChild'] = 'default_data'
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

