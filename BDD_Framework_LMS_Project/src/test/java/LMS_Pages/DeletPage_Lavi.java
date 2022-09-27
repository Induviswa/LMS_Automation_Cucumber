package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DeletPage_Lavi extends BrowserConfig {
	//WebDriver driver;
		public DeletPage_Lavi() {
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
	public void clickonDelete() {
		driver.findElement(By.xpath("//div/mat-card/mat-card-title/div[2]/div[1]/button/span[1]")).click();
	}
	
	
	public void validateheadingManageBatch() {
		String titleManageBatch = driver.getTitle();
		System.out.println("Title of the BatchPage is "+ titleManageBatch);
	
	String text = driver.findElement(By.xpath("/html/body/app-root/app-home/app-program/div/mat-card/mat-card-title")).getText();
	
	
	
	}
	
	
	}