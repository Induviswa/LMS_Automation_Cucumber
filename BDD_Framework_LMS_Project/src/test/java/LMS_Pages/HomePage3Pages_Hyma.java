package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage3Pages_Hyma extends BrowserConfig
{

    public HomePage3Pages_Hyma() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//button/span[@class='mat-button-wrapper' and contains(text(),'Program')]")
    WebElement Program;

    @FindBy(xpath="//button/span[@class='mat-button-wrapper' and contains(text(),'Batch')]")
    WebElement Batch;

    @FindBy(xpath="//button/span[@class='mat-button-wrapper' and contains(text(),'User')]")
    WebElement User;

    @FindBy(xpath="//button/span[@class='mat-button-wrapper' and contains(text(),'Assignment')]")
    WebElement Assignment;

    @FindBy(xpath="//button/span[@class='mat-button-wrapper' and contains(text(),'Attendance')]")
    WebElement Attendance;

    @FindBy(xpath="//button/span[@class='mat-button-wrapper' and contains(text(),'Logout')]")
    WebElement Logout;


    public void Program()
    {
        Program.isDisplayed();
    }
    public void Batch()
    {
        Batch.isDisplayed();
    }
    public void User()
    {
        User.isDisplayed();
    }
    public void Assignment()
    {
        Assignment.isDisplayed();
    }
    public void Attendance()
    {
        Attendance.isDisplayed();
    }
    public void Logout()
    {
        Logout.isDisplayed();
    }


}