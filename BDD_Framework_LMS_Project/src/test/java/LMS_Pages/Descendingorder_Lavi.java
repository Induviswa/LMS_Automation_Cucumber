package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Descendingorder_Lavi extends BrowserConfig {
	public Descendingorder_Lavi() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement BatchPage3;
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[2]")
	WebElement NameDescendingorder;
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[3]")
	WebElement DescriptionDescendingorder;
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[4]")
	WebElement StatusDescendingorder;
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[5]")
	WebElement  NoOfClassDescendingorder;
	
	
	@FindBy(xpath = "//div/div[1]/table/thead/tr/th[6]")
	WebElement ProgramNameDescendingorder;
	
	
	
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();

	}
	
	public void clickonBatchPage1() {
		BatchPage3.click();	}
	
	public void clickonNameDescendingorder() {
		NameDescendingorder.click();	}
	
	public void clickonDescriptionDescendingorder() {
		DescriptionDescendingorder.click();	}
	
	public void clickonStatusDescendingorder() {
		 StatusDescendingorder.click();	}
	

public void clcikonNoOfClassDescendingorder() {
	NoOfClassDescendingorder.click();	}


public void clickonProgramNameDescendingorder() {
	ProgramNameDescendingorder.click();	}


}
