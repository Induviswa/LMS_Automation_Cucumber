package LMS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utils;

public class LoginPage_Kalpana {
	public WebDriver driver;
	Utils utils;
	public LoginPage_Kalpana(WebDriver driver)
	{
		driver =driver;
		PageFactory.initElements (driver, this);
		this.driver=driver;
	}
	@FindBy(xpath= "//input[@id='username']")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(xpath= "//input[@id='password']")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath= "//*[@id=\"login\"]/span[1]")
	@CacheLookup
	WebElement btnSignIn;
	


public void setUserName(String uname)
{
	txtusername.sendKeys(uname);
}
public void setPassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}
public void clickLogin() {
	btnSignIn.click();
}

}
