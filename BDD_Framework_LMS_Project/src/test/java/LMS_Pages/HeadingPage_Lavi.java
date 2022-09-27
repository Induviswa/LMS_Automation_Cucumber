package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadingPage_Lavi extends BrowserConfig {
	
	//WebDriver driver;
	public HeadingPage_Lavi() {
		//this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();
System.out.println("HomePage");
	}
	public void clickonBatchPage() {
		driver.findElement(By.xpath("//html/body/app-root/app-header/mat-toolbar/button[2]")).click();
		System.out.println("User is land on BatchPage");
	}
	public void validateheadingManageBatch() {
		String titleManageBatch = driver.getTitle();
		System.out.println("Title of the BatchPage is "+ titleManageBatch);
	
	String text = driver.findElement(By.xpath("/html/body/app-root/app-home/app-program/div/mat-card/mat-card-title")).getText();
	
	
	}

	
	
	
	
	
	
	

	}

