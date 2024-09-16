package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingInfoAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 2: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 3: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        
        "Step 4: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        
        "Step 5: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_email'))
        
        "Step 6: Enter input value in button continueToShipping"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToShipping'), data['button_continueToShipping'])
        
        "Step 7: Click on input shippingAddressFirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'))
        
        "Step 8: Enter input value in input shippingAddressFirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'), data['input_shippingAddressFirstName'])
        
        "Step 9: Click on input shippingAddressLastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLastName'))
        
        "Step 10: Enter input value in input shippingAddressLastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLastName'), data['input_shippingAddressLastName'])
        
        "Step 11: Click on input shippingAddressLine1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLine1'))
        
        "Step 12: Enter input value in input shippingAddressLine1"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLine1'), data['input_shippingAddressLine1'])
        
        "Step 13: Click on input shippingAddressZip"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressZip'))
        
        "Step 14: Enter input value in input shippingAddressZip"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressZip'), data['input_shippingAddressZip'])
        
        "Step 15: Click on input shippingAddressCity"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'))
        
        "Step 16: Enter input value in input shippingAddressCity"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'), data['input_shippingAddressCity'])
        
        "Step 17: Click on input shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'))
        
        "Step 18: Enter input value in input shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'), data['input_shippingAddressState'])
        
        "Step 19: Click on input shippingAddressPhone -> Navigate to page 'checkout/payment'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))
        
        "Step 20: Click on button continueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_continueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_continueToShipping'] = testData.getValue('button_continueToShipping', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_shippingAddressCity'] = testData.getValue('input_shippingAddressCity', rowIndex)
        data['input_shippingAddressFirstName'] = testData.getValue('input_shippingAddressFirstName', rowIndex)
        data['input_shippingAddressLastName'] = testData.getValue('input_shippingAddressLastName', rowIndex)
        data['input_shippingAddressLine1'] = testData.getValue('input_shippingAddressLine1', rowIndex)
        data['input_shippingAddressState'] = testData.getValue('input_shippingAddressState', rowIndex)
        data['input_shippingAddressZip'] = testData.getValue('input_shippingAddressZip', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_continueToShipping'] = 'default_data'
        data['input_email'] = 'default_data'
        data['input_shippingAddressCity'] = 'default_data'
        data['input_shippingAddressFirstName'] = 'default_data'
        data['input_shippingAddressLastName'] = 'default_data'
        data['input_shippingAddressLine1'] = 'default_data'
        data['input_shippingAddressState'] = 'default_data'
        data['input_shippingAddressZip'] = 'default_data'
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

