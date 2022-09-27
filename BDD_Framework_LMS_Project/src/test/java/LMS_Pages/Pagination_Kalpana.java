package LMS_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class Pagination_Kalpana extends Base{
WebDriver ldriver;
	
	public Pagination_Kalpana(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements (ldriver, this);
		this.ldriver= rdriver;
	
	}

	
	By leftArrow = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[3]/span");
	By rightArrow = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[2]/span");
	By leftDoubleArrow=By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[1]/span");
	By rightDoubleArrow = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[4]/span ");
	
	
	
	public void leftArrow()
	{
		ldriver.findElement(leftArrow).click();
	}
	
	
	public void rightArrow() {
		ldriver.findElement(rightArrow).click();
		}
	
	public void leftDoubleArrow()
	{
		ldriver.findElement(leftDoubleArrow).click();
	}
	
	public void rightDoubleArrow()
	{
		ldriver.findElement(rightDoubleArrow).click();
	}
	
	
	
	
	
	
}
