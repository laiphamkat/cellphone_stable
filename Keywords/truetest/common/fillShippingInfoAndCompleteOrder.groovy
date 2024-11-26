package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingInfoAndCompleteOrder {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 2: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))
        
        "Step 3: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 4: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        
        "Step 5: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        
        "Step 6: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'))
        
        "Step 7: Click on input shippingAddressFirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'))
        
        "Step 8: Hover over div object2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object2'))
        
        "Step 9: Enter input value in input shippingAddressFirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressFirstName'), data['input_shippingAddressFirstName'])
        
        "Step 10: Click on input shippingAddressLastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLastName'))
        
        "Step 11: Hover over div object3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object3'))
        
        "Step 12: Enter input value in input shippingAddressLastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressLastName'), data['input_shippingAddressLastName'])
        
        "Step 13: Click on input shippingAddressAddressLine1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressAddressLine1'))
        
        "Step 14: Hover over div object4"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object4'))
        
        "Step 15: Enter input value in input shippingAddressAddressLine1"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressAddressLine1'), data['input_shippingAddressAddressLine1'])
        
        "Step 16: Click on input shippingAddressZip"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressZip'))
        
        "Step 17: Hover over div object5"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object5'))
        
        "Step 18: Click on input shippingAddressCity"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'))
        
        "Step 19: Enter input value in input shippingAddressZip"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressZip'), data['input_shippingAddressZip'])
        
        "Step 20: Hover over div object6"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object6'))
        
        "Step 21: Enter input value in input shippingAddressCity"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressCity'), data['input_shippingAddressCity'])
        
        "Step 22: Click on input shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'))
        
        "Step 23: Hover over div object7"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object7'))
        
        "Step 24: Enter input value in input shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressState'), data['input_shippingAddressState'])
        
        "Step 25: Click on input shippingAddressPhone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'))
        
        "Step 26: Enter input value in input shippingAddressPhone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_shippingAddressPhone'), data['input_shippingAddressPhone'])
        
        "Step 27: Click on button continueToPayment -> Navigate to page 'checkout/payment'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))
        
        "Step 28: Click on button completeOrder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_shippingAddressAddressLine1'] = testData.getValue('input_shippingAddressAddressLine1', rowIndex)
        data['input_shippingAddressCity'] = testData.getValue('input_shippingAddressCity', rowIndex)
        data['input_shippingAddressFirstName'] = testData.getValue('input_shippingAddressFirstName', rowIndex)
        data['input_shippingAddressLastName'] = testData.getValue('input_shippingAddressLastName', rowIndex)
        data['input_shippingAddressPhone'] = testData.getValue('input_shippingAddressPhone', rowIndex)
        data['input_shippingAddressState'] = testData.getValue('input_shippingAddressState', rowIndex)
        data['input_shippingAddressZip'] = testData.getValue('input_shippingAddressZip', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_email'] = 'default_data'
        data['input_shippingAddressAddressLine1'] = 'default_data'
        data['input_shippingAddressCity'] = 'default_data'
        data['input_shippingAddressFirstName'] = 'default_data'
        data['input_shippingAddressLastName'] = 'default_data'
        data['input_shippingAddressPhone'] = 'default_data'
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

