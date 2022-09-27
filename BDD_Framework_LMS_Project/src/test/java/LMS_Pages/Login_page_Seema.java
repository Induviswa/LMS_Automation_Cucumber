package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_Seema extends BrowserConfig {
	// public WebDriver driver;

	public Login_page_Seema() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement txtUsername;
	@FindBy(id = "password")
	WebElement txtPswd;
	@FindBy(id = "login")
	WebElement Login;

	public void Username(String stepUsername) {
		txtUsername.clear();
		txtUsername.sendKeys(stepUsername);
	}

	public void Password(String stepPassword) {
		txtPswd.clear();
		txtPswd.sendKeys(stepPassword);
	}

	public void Cklogin() {
		Login.click();
	}

	public void gethomepagetitle() {
		String title = driver.getTitle();
		System.out.println("Home page title is " + title);

	}

	/*
	 * public void clickonassign() { driver.findElement(By.xpath(
	 * "/html/body/app-root/app-header/mat-toolbar/button[4]")).click();
	 * System.out.println("user clicked on assignment"); }
	 * 
	 * public void validateheadingassignment() { String titleofassignmentpage =
	 * driver.getTitle(); System.out.println("Title of the assignment page is " +
	 * titleofassignmentpage);
	 * 
	 * String text = driver .findElement(By.xpath(
	 * "/html/body/app-root/app-assignment/div/mat-card/mat-card-title/div[1]"))
	 * .getText();
	 * 
	 * System.out.println("capturing the text of the web element is " + text);
	 * Assert.assertEquals(text, "Manage Assignment", "Manage Assignment,matched");
	 * }
	 */
}
