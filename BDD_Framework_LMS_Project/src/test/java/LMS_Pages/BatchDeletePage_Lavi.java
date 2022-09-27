package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchDeletePage_Lavi  extends BrowserConfig {
	
	public BatchDeletePage_Lavi() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement BatchPage1;
	
	@FindBy(xpath="//div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div/div[2]")
	WebElement Checkbox;
	
	@FindBy(xpath = "//html/body/app-root/app-batch/div/mat-card/mat-card-title/div[2]/div[1]/button")
	WebElement deletebutton;
	
	@FindBy(xpath="//div/div/div[3]/button[2]")
	WebElement Yes;
	
	@FindBy(xpath="//div[2]/div[2]/span/input")
	WebElement Search;
	
	@FindBy(xpath = "//div/div/div[3]/button[1]")
	WebElement No;
	
	
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();

	}
	
	public void clickonBatchPage1() {
		BatchPage1.click();	}
	
	public void selectCheckbox() {
		Checkbox.click();
	}
	
public void clickondeletebutton() {
	deletebutton.click();
	}
	
public void clickonYes() {
	Yes.click();
}
public void selectCheckbox1() {
	Checkbox.click();
}
public void clickondeletebutton2() {
	deletebutton.click();
	}
public void clickonNo() {
	No.click();

}
public void enterbatchName() {
	Search.sendKeys("SDET");
	Search.clear();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
