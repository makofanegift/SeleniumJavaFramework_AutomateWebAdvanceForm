package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By loginMainButton_xpath = By.xpath("//div[@class = 'nav-user-section']/button/span[contains(text(), 'Login')]");
    By loginEnterUsernameField_id = By.id("login-email");
    By loginEnterPasswordField_id = By.id("login-password");
    By clickLoginButton_id = By.id("login-submit");

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

    public void clickLoginMainButton(){

        driver.findElement(loginMainButton_xpath).click();
    }
    public void enterLoginUsername(String username){
        driver.findElement(loginEnterUsernameField_id).clear();
        driver.findElement(loginEnterUsernameField_id).sendKeys(username);
    }
    public void enterLoginPassword(String password){
        driver.findElement(loginEnterPasswordField_id).clear();
        driver.findElement(loginEnterPasswordField_id).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(clickLoginButton_id).click();

    }

}
