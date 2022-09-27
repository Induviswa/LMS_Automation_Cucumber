package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NameSearchPage_Lavi extends BrowserConfig {
	
	
	public NameSearchPage_Lavi() {
		PageFactory.initElements(driver,this);
	}
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();
System.out.println("BatchPage");
	}
	
	public void clickonBatchPage() {
		driver.findElement(By.xpath("//html/body/app-root/app-header/mat-toolbar/button[2]")).click();
		System.out.println("User is land on BatchPage");
	}
	public void ClickOnSearch() {

	driver.findElement(By.xpath("//div/mat-card/mat-card-title/div[2]/div[2]/span/input")).sendKeys("SDET50");
	
	String BatchName = driver.getTitle();

	System.out.println("name of the BatchName :" +  BatchName);

}
	
	public void validateBatchName() {
		String BatchName= driver.getTitle();
		
	}
	

}
