package LMS_Pages;



import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage_Lavi extends BrowserConfig {
	
public  EditPage_Lavi() {
		//this.driver = driver;
	PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//html/body/app-root/app-header/mat-toolbar/button[2]")
WebElement BatchPage;


	@FindBy(xpath="//div/div[1]/table/tbody/tr[1]/td[7]/div/span[1]/button")
	WebElement EditBatch;
	
	
	
	@FindBy(xpath="//*[@id=\"pr_id_8-label\"]")
	WebElement BatchDetails;
	
	@FindBy(xpath="//*[@id='batchName']")
	WebElement BatchName;
	
	//@FindBy(id="batchName")
	//WebElement Name;
	
	@FindBy(id="batchDescription")
	WebElement Description;
	
	@FindBy(xpath="//div[@class='p-field ng-star-inserted']/p-dropdown/div/input")
	WebElement Program;
	
	@FindBy(xpath="//div[3]/p-dropdown/div/div[2]/span")
	WebElement Dropdown;
	
	@FindBy(xpath="//div[1]/table/tbody/tr/td[6]")
	WebElement updatedName;
	
	@FindBy(xpath="/html/body/app-root/app-batch/p-dialog/div/div/div[2]/div[4]/div[2]")
	WebElement Status ;
	
	@FindBy(xpath="//div[1]/table/tbody/tr/td[4]")
	WebElement Active;
	
	@FindBy(id="batchNoOfClasses")
	WebElement Classes;
	
	@FindBy(xpath="//div/button/span[@class='p-button-label' and contains(text(),'Cancel')]")
	WebElement CancelBtn;
	
	@FindBy(xpath="//div/button[2]/span[@class='p-button-label' and contains(text(),'Save')]")
	WebElement SaveBtn;
	
	
	@FindBy(xpath="//div/span/input")
	WebElement Search;
	
	public void login() {
		driver.findElement(By.id("username")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();

	}
	
	public void clickonBatchPage1() {
		BatchPage.click();	
		}
	public void clickonEditBatch()
	{
		 EditBatch.click();
	}
	public void clickonBatchName()
	{
		BatchName.sendKeys("SDET69");
	}
	public void clickonBatchDetails()
	{
		BatchDetails.isDisplayed();
	}
	/*public void Name()
	{
		BatchName.sendKeys("SDET69");
	}*/
	public void clickonDescription()
	{
		Description.sendKeys("Test");
	}
	public void Program()
	{
		Program.click();
	}
	public void dropdown()
	{
		Dropdown.click();
	}
	public void updatedName()
	{
		updatedName.isDisplayed();
	}
	public void Status()
	{
		Status.isDisplayed();
	}
	public void Active()
	{
		Active.click();
	}
	public void NoClasses()
	{
	    int myInt = 10;
		Classes.sendKeys(String.valueOf(myInt));
	}
	public void CancelBtn()
	{
		CancelBtn.click();
	}
	public void SaveBtn()
	{
		SaveBtn.click();
	}
	public void SearchBtn()
	{
		Search.sendKeys("SDET69");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

