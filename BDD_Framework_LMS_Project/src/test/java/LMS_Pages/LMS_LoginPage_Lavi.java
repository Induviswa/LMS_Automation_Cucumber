package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LMS_LoginPage_Lavi extends BrowserConfig {
	
	//public WebDriver driver;
	
	public LMS_LoginPage_Lavi() {
	//	driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtPswd;
	
	@FindBy(id="login")
	WebElement Login;
	
	@FindBy(xpath = "//html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement Batch;
	
	public void  setUsername (String user) {
		 txtusername.clear();
		 txtusername.sendKeys(user);
	}
	public void  setPassword (String password) {
		txtPswd.clear();
		txtPswd.sendKeys(password);
	}
	public void  ClickonLogin () {
		 Login.click();
	
	}
	

	
	
	

}
