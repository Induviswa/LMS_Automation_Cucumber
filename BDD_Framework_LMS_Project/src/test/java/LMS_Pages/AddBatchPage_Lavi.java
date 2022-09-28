package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddBatchPage_Lavi extends BrowserConfig {
	private static Logger logger = LogManager.getLogger(AddBatchPage_Lavi.class);
	
	public AddBatchPage_Lavi() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement BatchPage3;
	
	@FindBy(xpath = "	//*[@id='new']")
	WebElement AddNewBatch;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	WebElement  Save3;
	
	@FindBy(xpath = "//div/div/div[3]/button[1]")
	WebElement  Cancel3;
	
	@FindBy(xpath = "//*[@id='batchName']")
  WebElement BatchName;
	
	@FindBy(xpath = "//*[@id='batchDescription']")
	  WebElement Description;

	@FindBy(xpath = "//div/div/div[2]/div[3]/p-dropdown/div/div[2]")
	WebElement ProgramName;
	
	@FindBy(xpath = "//div/div/div[2]/div[3]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]/li")
	WebElement SelectProgramName;
	
	@FindBy(xpath = "//div/div/div[2]/div[4]/div[2]/p-radiobutton/div/div[2]")
	WebElement Active;
	
	@FindBy(xpath = "//*[@id='batchNoOfClasses']")
	  WebElement batchNoOfClasses;

	
	
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();

	}
	
	public void clickonBatchPage1() {
		BatchPage3.click();	}
	
	public void clickonnewBatch() {
		AddNewBatch.click();
	}
	
	public void clickonSave3() {
Save3.click();
	}
	
	public void clickonCancel3() {
		Cancel3.click();
			}
	
	public void clickonnewBatch1() {
		AddNewBatch.click();
	}
	
	public void EnterBatchName() {
		BatchName.sendKeys("SDET666");
		
	}
	public void EnterDescription() {
		Description.sendKeys("Testing");
	}
	public void SelectProgram() {
		ProgramName.click();
	}
	public void SelectProgramName() {
		SelectProgramName.click();
	}
	public void clickonActive() {
		Active.click();
	}
	public void batchNoOfClasses() {
		batchNoOfClasses.sendKeys("66");
		
	}
	public void clickonSave4() {
		Save3.click();
			}
}
