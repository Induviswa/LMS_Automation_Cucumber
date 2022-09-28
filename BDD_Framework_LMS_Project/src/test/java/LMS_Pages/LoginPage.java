package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BrowserConfig {
    private static Logger logger = LogManager.getLogger(LoginPage.class);

    @FindBy(id = "username")
    WebElement txtUsername;
    @FindBy(id="password")
    WebElement txtPswd;
    @FindBy(id="login")
    WebElement Login;
    @FindBy(xpath = "//div[contains(text(),'Manage Program')]")
    WebElement valHeading;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void Username(String stepUsername){
        logger.info("Enter Username");
        txtUsername.clear();
        txtUsername.sendKeys(stepUsername);
    }
    public void Password(String stepPassword){
        logger.info("Enter Password");
        txtPswd.clear();
        txtPswd.sendKeys(stepPassword);}

    public void Cklogin()
    {
        logger.info("Login button clicked successfully");
        Login.click();
    }

    public String valHeading() throws InterruptedException {
        Thread.sleep(1000);
        logger.info("Validate home page");
        System.out.println(valHeading.getText());
        return valHeading.getText();
    }

    public String valPageTitle(){
        String LMSPageTitle = driver.getTitle();
        return LMSPageTitle;
    }

}
