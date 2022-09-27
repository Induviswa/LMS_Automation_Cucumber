package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AssendingPage_Lavi  extends BrowserConfig {
	public AssendingPage_Lavi() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement BatchPage3;
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[2]")
	WebElement NameAscendingorder;
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[3]")
	WebElement DescriptionAscendingorder;
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[4]")
	WebElement StatusAscendingorder;
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[5]")
	WebElement  NoOfClassAscendingorder;
	
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[6]")
	WebElement ProgramNameAscendingorder;
	
	
	
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();

	}
	
	public void clickonBatchPage1() {
		BatchPage3.click();	}
	
	public void clickonNameAscendingorder() {
		NameAscendingorder.click();	}
	
	public void clickonDescriptionAscendingorder() {
		DescriptionAscendingorder.click();	}
	
	public void clickonStatusAscendingorder() {
		 StatusAscendingorder.click();	}
	

public void clcikonNoOfClassAscendingorder() {
	NoOfClassAscendingorder.click();	}


public void clickonProgramNameAscendingorder() {
	ProgramNameAscendingorder.click();	}
















}
























