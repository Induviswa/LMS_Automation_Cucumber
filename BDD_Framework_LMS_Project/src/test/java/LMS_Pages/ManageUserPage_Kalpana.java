package LMS_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;



public class ManageUserPage_Kalpana {
	WebDriver ldriver;
	
	public ManageUserPage_Kalpana(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements (ldriver, this);
		this.ldriver= rdriver;
	
	}

By linkManage_menu =By.xpath( "/html/body/app-root/app-header/mat-toolbar/button[3]/span[1]");  //click User tab

//By txtManage_addnew=By.xpath("//*[@id=\"new\"]/span[2]");
////span[@class='p-button-label' and contains(text(),'Add New User')]
	
By getTablrRow = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr");

By getTableCol = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody");

//Action Methods
	
/*public String getPageTitle()
{
	return ldriver.getTitle();
	
}*/

	public void clickOnUser()
	{
		
		ldriver.findElement(linkManage_menu).click();
	}
	
	public void getTableRow()
	{
		ldriver.findElement(getTablrRow).getText();
		return ;
	}
	public void getTableCol()
	{
		ldriver.findElement(getTableCol).getText();
		return ;
		
	}
/*	public void clickOnaddNewcustomer()
	{
		ldriver.findElement(txtManage_addnew).click();

	}*/
	

}