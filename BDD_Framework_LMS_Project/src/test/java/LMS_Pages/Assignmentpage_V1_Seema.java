package LMS_Pages;

import BaseUtils.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Assignmentpage_V1_Seema extends BrowserConfig {

	public Assignmentpage_V1_Seema() {
		PageFactory.initElements(driver, this);
	}

	public void clickonassign() {
		driver.findElement(By.xpath("/html/body/app-root/app-header/mat-toolbar/button[4]")).click();
		System.out.println("user clicked on assignment");
	}

	public void validateheadingassignment() {
		String titleofassignmentpage = driver.getTitle();
		System.out.println("Title of the assignment page is " + titleofassignmentpage);

		String text = driver
				.findElement(By.xpath("/html/body/app-root/app-assignment/div/mat-card/mat-card-title/div[1]"))
				.getText();

		System.out.println("capturing the text of the web element is " + text);
		Assert.assertEquals(text, "Manage Assignment", "Manage Assignment,matched");
	}

	public void see1to3text(String text1to3) {
		text1to3 = driver.findElement(By.xpath(
				"/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/p-paginator/div/span[1]"))
				.getText();
		System.out.println("user can see " + text1to3);

	}

	public void seefooteras(String footerasintotal) {
		footerasintotal = driver
				.findElement(By.xpath(
						"html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[2]/div"))
				.getText();
		System.out.println("user can see " + footerasintotal);
	}

	// SEARCH ASSIGNMENT
	public void searchtextbox(String textsearch) {

		String searchboxtext = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("placeholder");
		System.out.println(searchboxtext);
		Assert.assertEquals(searchboxtext, "Search...");
	}

	public void clicksearch() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Assign");
	}

	public void gettextinsearchbox() {
		String foundtext = driver.findElement(By.xpath("//input[@type='text']")).getText();
		System.out.println("The text captured in the search box is " + foundtext);
	}

	public void clickoncheckboxassignment() {
		driver.findElement(By.xpath(
				"/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr[1]/td[1]/p-tablecheckbox/div/div[2]"))
				.click();
	}

	public void seecheckbox() {
		driver.findElement(By.xpath(
				"/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div/div[2]/span"))
				.click();
		System.out.println("user can see all boxed are selected");
	}

	public void clickonedit() {
		driver.findElement(By.xpath(
				"/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr[1]/td[6]/div/span[1]/button/span[1]"))
				.click();
	}

	public void validateform() {

		String valformheading = driver
				.findElement(By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[2]/div[1]/label"))
				.getText();
		System.out.println("VALue found by user is " + valformheading);
		// Assert.assertEquals(valformheading, "Assignment Name");
	}

	public void editname() {

		driver.findElement(By.xpath("//*[@id=\"assignment\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"assignment\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"assignment\"]")).sendKeys("New assignment name");

	}

	public void getupdatedname() {
		String updatedname = driver.findElement(By.xpath("//*[@id=\"assignment\"]")).getText();
		System.out.println("USER updated  name as " + updatedname);
	}

	public void editdescription() {
		driver.findElement(By.id("assignmentDescription")).click();
		driver.findElement(By.id("assignmentDescription")).clear();
		driver.findElement(By.id("assignmentDescription")).sendKeys("SQL Practise paper");

	}

	public void getupdateddescription() {
		String updatedname = driver.findElement(By.id("assignmentDescription")).getText();
		System.out.println("USER updated description  as " + updatedname);
	}

	public void editgrade() {
		driver.findElement(By.xpath("//*[@id=\"assignmentGraderId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"assignmentGraderId\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"assignmentGraderId\"]")).sendKeys("4");

	}

	public void getupdategrade() {
		String updatedname = driver.findElement(By.xpath("//*[@id=\"assignmentGraderId\"]")).getText();
		System.out.println("USER updated grade  as " + updatedname);
	}

	public void editduedate() {
		driver.findElement(By.xpath("//*[@id=\"icon\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"icon\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"icon\"]")).sendKeys("23/05/2022");

	}

	public void getupdaduedate() {
		String updatedname = driver.findElement(By.xpath("//*[@id=\"icon\"]")).getText();
		System.out.println("USER updated due date   as " + updatedname);
	}

	public void clickcancel() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='p-button-label' and contains(text(),'Cancel')]"))
				.click();
		// Thread.sleep(1000);

	}

	public void disappearofform() {
		driver.findElement(By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[1]/div/button/span"))
				.click();
	}

	public void saveform() {
		driver.findElement(By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[3]/button[2]")).click();
	}

	public void successmessage() {
		WebElement ele = driver.findElement(By.xpath("//div[@role='alert' and @aria-atomic='true']"));
	}

	public void deleteclick() {
		driver.findElement(By.xpath(
				"/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr[1]/td[6]/div/span[2]/button"))
				.click();
	}

	public void clickyes() {
		driver.findElement(By.xpath("//span[@class='p-button-label' and contains(text(),'Yes')]"))
				.click();
	}

	public void clickno() {
		driver.findElement(By.xpath("//span[@class='p-button-label' and contains(text(),'No')]"))
				.click();
	}

	public void clickonmultiplecheckbox() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div/div[2]"))
				.click();
	}

	public void clickdeleteonleft() {
		System.out.println("Click Delete button");
		driver.findElement(
				By.xpath("//tbody[@class='p-datatable-tbody']//tr[1]//span[@class='p-button-icon pi pi-trash']"))
				.click();
	}

	public void addnewassignmentbtn() {
		driver.findElement(By.xpath("//*[@id=\"new\"]/span[2]")).click();
	}

	public void capturetext1() {
		String onnewpage = driver
				.findElement(By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[2]/div[1]/label"))
				.getText();
		System.out.println(onnewpage);
	}

	public void clickonsave_without_anydata() {
		driver.findElement(By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[3]/button[2]")).click();

	}

	public void name_is_reqmessage(String namerequiredsms) {
		namerequiredsms = driver
				.findElement(By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[2]/div[1]/small"))
				.getText();
		System.out.println(namerequiredsms);
	}

	public void entered_new_assignmentname() {
		driver.findElement(By.xpath("//*[@id=\"assignment\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"assignment\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"assignment\"]")).sendKeys("DSALGO Assignment");
	}

	public void entered_new_desc() {
		driver.findElement(By.id("assignmentDescription")).click();
		driver.findElement(By.id("assignmentDescription")).clear();
		driver.findElement(By.id("assignmentDescription")).sendKeys("E-learning platform");
	}

	public void entered_new_grade() {
		driver.findElement(By.id("assignmentGraderId")).click();
		driver.findElement(By.id("assignmentGraderId")).clear();
		driver.findElement(By.id("assignmentGraderId")).sendKeys("6");
	}

	public void entered_new_date() {
		driver.findElement(
				By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[2]/div[4]/p-calendar/span")).click();
		driver.findElement(
				By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[2]/div[4]/p-calendar/span")).clear();

	}

	public void clickonsavebtn2() {
		driver.findElement(By.xpath("/html/body/app-root/app-assignment/p-dialog/div/div/div[3]/button[2]/span[2]"))
				.click();
	}

	public void clickarrow_assin_name() {
		driver.findElement(By.xpath(
				"/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[2]/p-sorticon/i"))
				.click();
	}

	public void clickarrow_assin_description() {
		driver.findElement(By.xpath(
				"/html/body/app-root/app-assignment/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[3]/p-sorticon/i"))
				.click();
	}
}
