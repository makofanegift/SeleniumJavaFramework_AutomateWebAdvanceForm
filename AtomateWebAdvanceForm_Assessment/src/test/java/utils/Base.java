package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LandingPage;
import pages.LoginPage;
import pages.WebAutomationAdvancedPage;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    public final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver,LandingPage.class);
    public WebAutomationAdvancedPage webAutomationAdvanced = PageFactory.initElements(driver, WebAutomationAdvancedPage.class);


}
