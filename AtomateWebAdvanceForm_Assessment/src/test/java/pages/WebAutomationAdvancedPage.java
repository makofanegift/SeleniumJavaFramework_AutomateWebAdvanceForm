package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebAutomationAdvancedPage {

    WebDriver driver;

    By webAutomationAdvanced_xpath = By.xpath("//div[@class = 'tabs-group']/button/span[contains(text(), 'Web Automation Advance')]");
    By validateInventoryForm_xpath = By.xpath("//h3[@class = 'inventory-title']");
    By selectDeviceType_id = By.id("deviceType");
    By selectDeviceBrand_id = By.id("brand");
    By deviceStorage_id = By.id("storage-128GB");
    By deviceColor_id = By.id("color");
    By deviceUnitPrice_xpath = By.xpath("//span[@id = 'unit-price-value']");
    By deviceQuantity_id = By.id("quantity");
    By validateSubTotal_id = By.id("subtotal-value");
    By addressField_id = By.id("address");
    By nextButton_id = By.id("inventory-next-btn");
    By validateOrderPreview_id = By.id("review-section-title");
    By expressShipping_id = By.id("shipping-option-express");
    By expressTotalCharges_id = By.id("breakdown-total-value");
    By warranty_id = By.id("warranty-option-1yr");
    By discountCode_id = By.id("discount-code");
    By applyDiscountCode_id = By.xpath("//button[@id = 'apply-discount-btn']");
    By validateSAVE10discount_id = By.id("breakdown-total-value");
    By confirmPurchaseButton_id = By.id("purchase-device-btn");
    By viewInvoice_id = By.id("view-history-btn");
    By nearViewButton_id = By.id("invoices-list");

    public WebAutomationAdvancedPage(WebDriver driver){
        this.driver = driver;

    }

    public void clickWebAutomationAdvanced(){
        driver.findElement(webAutomationAdvanced_xpath).click();

    }
    public void validateInventoryFormSuccessfully(){
        driver.findElement(validateInventoryForm_xpath).isDisplayed();

    }
    public void selectDeviceTypeFromDropdown(){
        WebElement deviceType = driver.findElement(selectDeviceType_id);
        Select deviceTypeDropdown = new Select(deviceType);
        deviceTypeDropdown.selectByValue("phone");
    }
    public void selectDeviceBrand(){
        WebElement deviceBrand = driver.findElement(selectDeviceBrand_id);
        Select brandDropdown = new Select(deviceBrand);
        brandDropdown.selectByValue("apple");
    }
    public void selectDeviceStorage(){
        driver.findElement(deviceStorage_id).click();
    }
    public void validateDeviceUnitPrice(){
        String getDeviceUnitPrice = driver.findElement(deviceUnitPrice_xpath).getText();
        Assert.assertEquals(getDeviceUnitPrice, "R480.00", "Device unit Price mismatch!");

    }

    public void selectDeviceColor(){
        WebElement deviceColor = driver.findElement(deviceColor_id);
        Select brandDropdown = new Select(deviceColor);
        brandDropdown.selectByValue("blue");
    }
    public void enterDeviceQty (){
        driver.findElement(deviceQuantity_id).clear();
        driver.findElement(deviceQuantity_id).sendKeys("2");
    }
    public void validateSubTotal (){
        String deviceSubTotal = driver.findElement(validateSubTotal_id).getText();
        Assert.assertEquals(deviceSubTotal, "R960.00", "Subtotal amount Mismatch!");

    }
    public void enterAddress (){
        driver.findElement(addressField_id).sendKeys("&quot;123 Test Street&quot");
    }
    public void clickNextButton(){
        driver.findElement(nextButton_id).click();

    }
    public void validateOrderPreview(){
        driver.findElement(validateOrderPreview_id).isDisplayed();

    }
    public void selectExpressShipping(){
        driver.findElement(expressShipping_id).click();

    }
    public void expressCharges(){
        String expressTotCharges = driver.findElement(expressTotalCharges_id).getText();
        Assert.assertEquals(expressTotCharges, "R985.00", "Subtotal mismatch for Express Shipping");

    }
    public void selectWarranty (){
        driver.findElement(warranty_id).click();

    }
    public void discountCode(){
        driver.findElement(discountCode_id).sendKeys("SAVE10");
    }
    public void applyDiscountCode (){
        driver.findElement(applyDiscountCode_id).click();

    }
    public void validateSAVE10discount (){
        String save10Discount = driver.findElement(validateSAVE10discount_id).getText();
        double tenPercentDiscount = 1034.00 - (1034.00 * 0.1);

        String discount = "R"+Double.toString(tenPercentDiscount)+"0";
        Assert.assertEquals(discount, save10Discount, "SAVE10 value mismatch!");

    }
    public void confirmPurchase () throws InterruptedException {
        driver.findElement(confirmPurchaseButton_id).click();
        Thread.sleep(2000);

    }
    public void viewInvoice () throws InterruptedException {
        driver.findElement(viewInvoice_id).click();
        Thread.sleep(2000);

    }
    public void viewInvoiceDetails (){
        WebElement path1 = driver.findElement(nearViewButton_id);
        WebElement view1 = driver.findElement(with(By.tagName("button")).near(path1));
        view1.click();

    }

}
