package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class browseCategoriesSelectAndPurchaseItem {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))
        
        "Step 2: Click on link productCategories (Apple) -> Navigate to page 'category/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productCategories"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productCategories', ['link_productCategories_nthChild': data['link_productCategories_nthChild'], 'link_productCategories_internalRoleLinkName': data['link_productCategories_internalRoleLinkName'], 'category_id': data['category_id']]))
        
        "Step 3: Click on button addToCart (CategoryAddToCart)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': data['button_addToCart_class'], 'button_addToCart_internalHasText': data['button_addToCart_internalHasText']]))
        
        "Step 4: Click on label colorStorageOptions (256GB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOptions', ['label_colorStorageOptions_for': data['label_colorStorageOptions_for'], 'label_colorStorageOptions_internalText': data['label_colorStorageOptions_internalText']]))
        
        "Step 5: Click on label colorStorageOptions (Green)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_colorStorageOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_colorStorageOptions', ['label_colorStorageOptions_for': data['label_colorStorageOptions_for_1'], 'label_colorStorageOptions_internalText': data['label_colorStorageOptions_internalText_1']]))
        
        "Step 6: Click on button Buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))
        
        "Step 7: Click on link cartNavigation (GoToCart)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_cartNavigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_cartNavigation', ['link_cartNavigation_internalRoleLinkName': data['link_cartNavigation_internalRoleLinkName']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_addToCart_class'] = testData.getValue('button_addToCart_class', rowIndex)
        data['button_addToCart_internalHasText'] = testData.getValue('button_addToCart_internalHasText', rowIndex)
        data['category_id'] = testData.getValue('category_id', rowIndex)
        data['label_colorStorageOptions_for'] = testData.getValue('label_colorStorageOptions_for', rowIndex)
        data['label_colorStorageOptions_for_1'] = testData.getValue('label_colorStorageOptions_for_1', rowIndex)
        data['label_colorStorageOptions_internalText'] = testData.getValue('label_colorStorageOptions_internalText', rowIndex)
        data['label_colorStorageOptions_internalText_1'] = testData.getValue('label_colorStorageOptions_internalText_1', rowIndex)
        data['link_cartNavigation_internalRoleLinkName'] = testData.getValue('link_cartNavigation_internalRoleLinkName', rowIndex)
        data['link_productCategories_internalRoleLinkName'] = testData.getValue('link_productCategories_internalRoleLinkName', rowIndex)
        data['link_productCategories_nthChild'] = testData.getValue('link_productCategories_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_addToCart_class'] = 'default_data'
        data['button_addToCart_internalHasText'] = 'default_data'
        data['category_id'] = 'default_data'
        data['label_colorStorageOptions_for'] = 'default_data'
        data['label_colorStorageOptions_for_1'] = 'default_data'
        data['label_colorStorageOptions_internalText'] = 'default_data'
        data['label_colorStorageOptions_internalText_1'] = 'default_data'
        data['link_cartNavigation_internalRoleLinkName'] = 'default_data'
        data['link_productCategories_internalRoleLinkName'] = 'default_data'
        data['link_productCategories_nthChild'] = 'default_data'
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

