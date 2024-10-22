package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class selectMobileDeviceAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))
        
        "Step 2: Click on link mobileDevices (Apple) -> Navigate to page 'category/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_mobileDevices"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_mobileDevices', ['link_mobileDevices_nthChild': data['link_mobileDevices_nthChild'], 'link_mobileDevices_internalRoleLinkName': data['link_mobileDevices_internalRoleLinkName'], 'link_mobileDevices_category_id': data['link_mobileDevices_category_id']]))
        
        "Step 3: Click on button addToCart (AddToCart)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/button_addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/button_addToCart', ['button_addToCart_class': data['button_addToCart_class'], 'button_addToCart_internalHasText': data['button_addToCart_internalHasText']]))
        
        "Step 4: Click on label storageColorOption (Storage256GB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOption', ['label_storageColorOption_for': data['label_storageColorOption_for']]))
        
        "Step 5: Click on label storageColorOption (ColorGreen)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOption', ['label_storageColorOption_for': data['label_storageColorOption_for_1']]))
        
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
        data['label_storageColorOption_for'] = testData.getValue('label_storageColorOption_for', rowIndex)
        data['label_storageColorOption_for_1'] = testData.getValue('label_storageColorOption_for_1', rowIndex)
        data['link_cartNavigation_internalRoleLinkName'] = testData.getValue('link_cartNavigation_internalRoleLinkName', rowIndex)
        data['link_mobileDevices_category_id'] = testData.getValue('link_mobileDevices_category_id', rowIndex)
        data['link_mobileDevices_internalRoleLinkName'] = testData.getValue('link_mobileDevices_internalRoleLinkName', rowIndex)
        data['link_mobileDevices_nthChild'] = testData.getValue('link_mobileDevices_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_addToCart_class'] = 'default_data'
        data['button_addToCart_internalHasText'] = 'default_data'
        data['label_storageColorOption_for'] = 'default_data'
        data['label_storageColorOption_for_1'] = 'default_data'
        data['link_cartNavigation_internalRoleLinkName'] = 'default_data'
        data['link_mobileDevices_category_id'] = 'default_data'
        data['link_mobileDevices_internalRoleLinkName'] = 'default_data'
        data['link_mobileDevices_nthChild'] = 'default_data'
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

