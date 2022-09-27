package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2Pages_Hyma extends BrowserConfig {
    //public WebDriver ldriver;


    @FindBy(id = "username")
    WebElement txtusername;

    @FindBy(id = "password")
    WebElement txtPswd;

    @FindBy(id = "login")
    WebElement Login;

    @FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-invalid']/p")
    WebElement txtHeading;

    @FindBy(id = "errormessage")
    WebElement Message;


    public LoginPage2Pages_Hyma() {
        //ldriver = rdriver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String user) {
        txtusername.clear();
        txtusername.sendKeys(user);
    }

    public void setPassword(String password) {
        txtPswd.clear();
        txtPswd.sendKeys(password);
    }

    public void ClickonLogin() {
        Login.click();
    }

    public void getHeading() {
        txtHeading.isDisplayed();

    }

    public void setInvaliduser() {
        txtusername.clear();
        txtusername.sendKeys("Test");
        Login.click();
    }

    public void setInvalidpwd() {
        txtPswd.clear();
        txtPswd.sendKeys("Module");
        Login.click();
    }

    public void getMsg() {
        Message.getText();

    }
}