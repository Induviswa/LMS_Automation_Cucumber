package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecordsPage_Lavi extends BrowserConfig {

	public RecordsPage_Lavi() {
	PageFactory.initElements(driver,this);
}

	@FindBy(xpath="//html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement BatchPage3;


	@FindBy(xpath="//div/mat-card/mat-card-content")
	WebElement TableRows;


	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();
	}

public void clickonBatchPage1() {
	BatchPage3.click();	}

public int RowsinTable()
{
	TableRows.getSize();
	return 0;
}


	}















