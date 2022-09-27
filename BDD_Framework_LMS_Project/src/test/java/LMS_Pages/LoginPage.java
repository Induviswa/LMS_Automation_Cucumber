package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BrowserConfig {

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
        txtUsername.clear();
        txtUsername.sendKeys(stepUsername);
    }
    public void Password(String stepPassword){
        txtPswd.clear();
        txtPswd.sendKeys(stepPassword);}

    public void Cklogin()
    {
        Login.click();
    }

    public String valHeading() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(valHeading.getText());
        return valHeading.getText();
    }

    public String valPageTitle(){
        String LMSPageTitle = driver.getTitle();
        return LMSPageTitle;
    }

}
