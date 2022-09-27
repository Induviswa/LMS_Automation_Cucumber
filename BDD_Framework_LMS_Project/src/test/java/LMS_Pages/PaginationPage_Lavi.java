package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginationPage_Lavi extends BrowserConfig {
	

	public PaginationPage_Lavi() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement BatchPage3;
	
	@FindBy(xpath="//div/p-paginator/div/button[2]")
	WebElement  button1;
	//div/span[2]/button[1]
	
	@FindBy(xpath="	//div/span[2]/button[1]")
	WebElement  button2;
	
	@FindBy(xpath="//div/p-paginator/div/button[4]")
	WebElement  button4;
	
	
	@FindBy(xpath="//div/button[1]")
	WebElement  button3;
		
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();

	}
	
	public void clickonBatchPage1() {
		BatchPage3.click();
		}
	
	public void clickonPage() {
		 button1.click();	
		}
	
	public void clickonPage2() {
		button2.click();	
		}
	
	public void clickonPage4() {
		button4.click();	
		}
	
	public void clickonPage3() {
		button3.click();	
		}
	
	
	
	
	
	
	
	
	
	
	
}
