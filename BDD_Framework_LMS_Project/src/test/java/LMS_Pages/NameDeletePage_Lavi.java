package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NameDeletePage_Lavi  extends BrowserConfig {
	public  NameDeletePage_Lavi() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement BatchPage2;
	
	@FindBy(xpath="//div/div[1]/table/tbody/tr[2]/td[1]/p-tablecheckbox/div/div[2]")
	WebElement BatchName;
	
	@FindBy(xpath = "//div[2]/div[1]/button")
	WebElement Delete1;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	WebElement Yes1;
	

	@FindBy(xpath="//div[2]/div[2]/span/input")
	WebElement Search1;
	
	@FindBy(xpath = "//span[@class='p-button-label' and contains(text(),'No')]")
	WebElement No2;
	
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();

	}
	public void clickonBatchPage2() {
		BatchPage2.click();	}
	
	public void selectBatchName() {
		BatchName.click();	}
		
	public void clickondeletebutton1() {
		 Delete1.click();
		}
	public void clickonYes1() {
		Yes1.click();
	}
	public void selectBatchName1() {
		BatchName.click();	}
	
	public void clickondeletebutton2() {
		 Delete1.click();
		}
	
	public void clickonNo2() {
		No2.click();
	}
	public void enterbatchName() {
		Search1.sendKeys("SDET1");
	//	Search1.clear();
	}
	
	
	
	}
	
	

