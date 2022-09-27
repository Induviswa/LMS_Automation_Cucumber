package LMS_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class UserDetailsPage_Kalpana extends Base{
WebDriver ldriver;
	
	public UserDetailsPage_Kalpana(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements (ldriver, this);
		this.ldriver= rdriver;
	
	}
	
	
	
	By txtManage_addnew=By.xpath("//*[@id=\"new\"]/span[2]");

	//By txtManage_addnew=By.xpath("//span[@class='p-button-label' and contains(text(),'Add New User')");

	By cancel =By.xpath("/html/body/app-root/app-user/div/p-dialog[1]/div/div/div[2]/form/mat-card/mat-card-actions/button[1]/span[1]");
	
By canceX = By.xpath("/html/body/app-root/app-user/div/p-dialog[1]/div/div/div[1]/div/button/span");
	
By txtFirstName=By.xpath("//*[@id=\"mat-input-2\"]");
	By txtLastName=By.xpath("//*[@id=\"mat-input-4\"]");
	By txtMiddelName= By.xpath("//*[@id=\"mat-input-3\"]");
	By txtEmailId=By.xpath("//*[@id=\"mat-input-5\"]");
	By txtPhoneNumber = By.xpath("//*[@id=\"mat-input-6\"]");
	By txtAddress=By.xpath("//*[@id=\"mat-input-7\"]");
    By txtCity= By.xpath("//*[@id=\"mat-input-28\"]");
    By txtProgram= By.xpath("//*[@id=\"mat-input-30\"]");
    By txtUGProgram= By.xpath("//*[@id=\"mat-input-31\"]");
    By txtBatch=By.xpath("//input[@id='mat-input-92']");
    By txtSkill=By.xpath("//input[@id='mat-input-89']");
    By submit =By.xpath("/html/body/app-root/app-user/div/p-dialog[1]/div/div/div[2]/form/mat-card/mat-card-actions/button[2]/span[1]");	

    
    public void clickOnaddNewcustomer()
	{
 ldriver.findElement(txtManage_addnew).click();

	}
    
    public void clickonCancel()
    {
    	ldriver.findElement(cancel).click();
    }
    
    public void clickX()
    {
    	ldriver.findElement(canceX).click();
    }
    
	public void enterFirstName(String firstName)
	{
		ldriver.findElement(txtFirstName).sendKeys(firstName);;
	}
	public void enterLastName(String lastName)
	{
		ldriver.findElement(txtLastName).sendKeys(lastName);;
	}
	public void middleName(String middleName)
	{
		ldriver.findElement(txtMiddelName).sendKeys(middleName);
	}
	public void emailId(String emial)
	{
		ldriver.findElement(txtEmailId).sendKeys(emial);
	}
	
	public void skill(String content)
	{
		ldriver.findElement(txtSkill).sendKeys(content);
	}
	public void batch(String content)
	{
	ldriver.findElement(txtBatch).sendKeys(content);
	}
	
	public void clickonSubmit()
	{
		ldriver.findElement(submit).click();
	}
	
    
}
