package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Base;

public class NdosiTest extends Base {

    @Test
    public void loginPageTest() throws InterruptedException {

        loginPage.clickLoginMainButton();
        loginPage.enterLoginUsername("gcmakofane@gmail.com");
        loginPage.enterLoginPassword("Ndosi_TestSite1");
        loginPage.clickLoginButton();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "loginPageTest")
    public void loginLandingPageTest()  {
        landingPage.validateLoginPage();
        landingPage.clickLearnButton();
        landingPage.clickLearningMaterialsButton();

    }
    @Test (dependsOnMethods = "loginLandingPageTest")
    public void webAutomationAdvancedTest () throws InterruptedException {
        webAutomationAdvanced.clickWebAutomationAdvanced();
        webAutomationAdvanced.validateInventoryFormSuccessfully();
        webAutomationAdvanced.selectDeviceTypeFromDropdown();
        webAutomationAdvanced.selectDeviceBrand();
        webAutomationAdvanced.selectDeviceStorage();
        webAutomationAdvanced.validateDeviceUnitPrice();
        webAutomationAdvanced.selectDeviceColor();
        webAutomationAdvanced.enterDeviceQty();
        webAutomationAdvanced.validateSubTotal();
        webAutomationAdvanced.enterAddress();
        webAutomationAdvanced.clickNextButton();
        webAutomationAdvanced.validateOrderPreview();
        webAutomationAdvanced.selectExpressShipping();
        webAutomationAdvanced.expressCharges();
        webAutomationAdvanced.selectWarranty();
        webAutomationAdvanced.discountCode();
        webAutomationAdvanced.applyDiscountCode();
        webAutomationAdvanced.validateSAVE10discount();
        webAutomationAdvanced.confirmPurchase();
        webAutomationAdvanced.viewInvoice();
        webAutomationAdvanced.viewInvoiceDetails();
    }
    @AfterClass
    public void tearDown(){
        driver.quit(); //close all open instance browsers
    }

}
