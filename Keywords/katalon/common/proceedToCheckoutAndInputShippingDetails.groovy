package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class proceedToCheckoutAndInputShippingDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 2: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 3: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        
        "Step 4: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        
        "Step 5: Click on button inputShippingDetails (email)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel']]))
        
        "Step 6: Enter input value in button inputShippingDetails (continueToShipping)"
        
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails'), data['button_inputShippingDetails'])
        
        "Step 7: Click on button inputShippingDetails (shippingAddressFirstName)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_1']]))
        
        "Step 8: Enter input value in button inputShippingDetails (shippingAddressFirstName)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_2']]), data['button_inputShippingDetails'])
        
        "Step 9: Click on button inputShippingDetails (shippingAddressLastName)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_3']]))
        
        "Step 10: Enter input value in button inputShippingDetails (shippingAddressLastName)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_4']]), data['button_inputShippingDetails'])
        
        "Step 11: Click on button inputShippingDetails (shippingAddressLine1)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_5']]))
        
        "Step 12: Enter input value in button inputShippingDetails (shippingAddressLine1)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_6']]), data['button_inputShippingDetails'])
        
        "Step 13: Click on button inputShippingDetails (shippingAddressZip)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_7']]))
        
        "Step 14: Enter input value in button inputShippingDetails (shippingAddressZip)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_8']]), data['button_inputShippingDetails'])
        
        "Step 15: Click on button inputShippingDetails (shippingAddressCity)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_9']]))
        
        "Step 16: Enter input value in button inputShippingDetails (shippingAddressCity)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_10']]), data['button_inputShippingDetails'])
        
        "Step 17: Click on button inputShippingDetails (shippingAddressState)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_11']]))
        
        "Step 18: Enter input value in button inputShippingDetails (shippingAddressState)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_checkout_shipping_address/button_inputShippingDetails', ['button_inputShippingDetails_internalLabel': data['button_inputShippingDetails_internalLabel_12']]), data['button_inputShippingDetails'])
        
        "Step 19: Click on input shippingAddressPhone -> Navigate to page 'checkout/payment'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))
        
        "Step 20: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_continueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_inputShippingDetails'] = testData.getValue('button_inputShippingDetails', rowIndex)
        data['button_inputShippingDetails_1'] = testData.getValue('button_inputShippingDetails_1', rowIndex)
        data['button_inputShippingDetails_2'] = testData.getValue('button_inputShippingDetails_2', rowIndex)
        data['button_inputShippingDetails_3'] = testData.getValue('button_inputShippingDetails_3', rowIndex)
        data['button_inputShippingDetails_4'] = testData.getValue('button_inputShippingDetails_4', rowIndex)
        data['button_inputShippingDetails_5'] = testData.getValue('button_inputShippingDetails_5', rowIndex)
        data['button_inputShippingDetails_6'] = testData.getValue('button_inputShippingDetails_6', rowIndex)
        data['button_inputShippingDetails_internalLabel'] = testData.getValue('button_inputShippingDetails_internalLabel', rowIndex)
        data['button_inputShippingDetails_internalLabel_1'] = testData.getValue('button_inputShippingDetails_internalLabel_1', rowIndex)
        data['button_inputShippingDetails_internalLabel_10'] = testData.getValue('button_inputShippingDetails_internalLabel_10', rowIndex)
        data['button_inputShippingDetails_internalLabel_11'] = testData.getValue('button_inputShippingDetails_internalLabel_11', rowIndex)
        data['button_inputShippingDetails_internalLabel_12'] = testData.getValue('button_inputShippingDetails_internalLabel_12', rowIndex)
        data['button_inputShippingDetails_internalLabel_2'] = testData.getValue('button_inputShippingDetails_internalLabel_2', rowIndex)
        data['button_inputShippingDetails_internalLabel_3'] = testData.getValue('button_inputShippingDetails_internalLabel_3', rowIndex)
        data['button_inputShippingDetails_internalLabel_4'] = testData.getValue('button_inputShippingDetails_internalLabel_4', rowIndex)
        data['button_inputShippingDetails_internalLabel_5'] = testData.getValue('button_inputShippingDetails_internalLabel_5', rowIndex)
        data['button_inputShippingDetails_internalLabel_6'] = testData.getValue('button_inputShippingDetails_internalLabel_6', rowIndex)
        data['button_inputShippingDetails_internalLabel_7'] = testData.getValue('button_inputShippingDetails_internalLabel_7', rowIndex)
        data['button_inputShippingDetails_internalLabel_8'] = testData.getValue('button_inputShippingDetails_internalLabel_8', rowIndex)
        data['button_inputShippingDetails_internalLabel_9'] = testData.getValue('button_inputShippingDetails_internalLabel_9', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_inputShippingDetails'] = 'default_data'
        data['button_inputShippingDetails_1'] = 'default_data'
        data['button_inputShippingDetails_2'] = 'default_data'
        data['button_inputShippingDetails_3'] = 'default_data'
        data['button_inputShippingDetails_4'] = 'default_data'
        data['button_inputShippingDetails_5'] = 'default_data'
        data['button_inputShippingDetails_6'] = 'default_data'
        data['button_inputShippingDetails_internalLabel'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_1'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_10'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_11'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_12'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_2'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_3'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_4'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_5'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_6'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_7'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_8'] = 'default_data'
        data['button_inputShippingDetails_internalLabel_9'] = 'default_data'
        data['input_email'] = 'default_data'
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

