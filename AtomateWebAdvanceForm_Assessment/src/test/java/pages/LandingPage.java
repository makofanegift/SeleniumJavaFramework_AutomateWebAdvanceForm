package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;

    By validateLoginPage_xpath = By.xpath("//div[@class = 'dashboard-welcome']/div/h2/span[contains(text(), 'Welcome')]");
    By learnButton_xpath = By.xpath("//button[@class = 'nav-dropdown-trigger  ']/span[contains(text(), 'Learn')]");
    By learningMaterialDropdownButton = By.xpath("//div[@class = 'nav-dropdown open']/button/span[contains(text(), 'Learning Materials')]");


    public LandingPage (WebDriver driver){
        this.driver = driver;
    }
    public void validateLoginPage (){
        driver.findElement(validateLoginPage_xpath).isDisplayed();
    }
    public void clickLearnButton (){
        driver.findElement(learnButton_xpath).click();

    }
    public void clickLearningMaterialsButton (){
        driver.findElement(learningMaterialDropdownButton).click();

    }

}
