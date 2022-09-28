package stepDefinition;

import BaseUtils.BrowserConfig;

import LMS_Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class Steps_Lavi extends BrowserConfig {
	
	//public WebDriver driver;
			public LMS_LoginPage_Lavi lp;
			public HeadingPage_Lavi homePage;
			public DeletPage_Lavi deletpage;
			public NameSearchPage_Lavi  nameSearchPage;
			public BatchDeletePage_Lavi BDeletePage;
			//public NameDeleteSteps DeleteSteps;
			public AssendingPage_Lavi assendingpage;
			public Descendingorder_Lavi descendingorder;
			public NameDeletePage_Lavi nameDeletePage;
			public AddBatchPage_Lavi addBatchPage;
			public PaginationPage_Lavi  paginationPage;
			public RecordsPage_Lavi recordsPage;
			public EditPage_Lavi editPage;

		@Given("User is on the Login Page")
		
		public void user_is_on_the_login_page() {
			 initialization();
		}
		
	@When("User entering valid username {string} and password {string}")
		public void user_entering_valid_username_and_password(String username, String password) {
		lp  = new LMS_LoginPage_Lavi();
			lp.setUsername(username);
		  lp.setPassword(password);
		
		    }

		@When("User clicks on Loginbutton")
		public void user_clicks_on_Login() {
		 lp.ClickonLogin();
		 
		}

	@Then("User should Land on Home Page")
		public void user_should_land_on_home_page() {
		   System.out.println("Print Home Page");
		}
	
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {

	
		 initialization();
		homePage = new HeadingPage_Lavi();
		homePage.login();
	}

	@When("User is on Batch page")
	public void user_is_on_batch_page() {
	//homePage.clickonBatchPage();
	   
	}

@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String ManageBatch) {
	    homePage.validateheadingManageBatch();
}

@Given("User is logged on to LMS website2")
public void user_is_logged_on_to_lms_websit1() {

 initialization();
	deletpage = new DeletPage_Lavi();
	
	deletpage.login();
}

@When("User is on Batch page2")
public void user_is_on_batch_page1() {
deletpage.clickonBatchPage();
 System.out.println("Print user is homepage");
}
@Then("Verify that the Delete button next to the search box is Disabled")
public void verify_that_the_delete_button_next_to_the_search_box_is_disabled() {
	deletpage.clickonDelete();
}
@Given("User is on Batch page3")
public void user_is_on_batch_page3() {
	initialization();
	nameSearchPage = new NameSearchPage_Lavi();
	nameSearchPage.login();
	nameSearchPage.clickonBatchPage();
   
}

@When("user clicks on search box with Batch Name entered in it")
public void user_clicks_on_search_box_with_batch_name_entered_in_it() {
	nameSearchPage.ClickOnSearch();
}

@Then("records of that  {string} are displayed")
public void records_of_that_are_displayed(String BatchName) {
	
	System.out.println("name of the BatchName :" +  BatchName);
}

@Given("User is logged on to LMS websitE")
public void user_is_logged_on_to_lms_websit_e() {
	 initialization();
	 recordsPage = new RecordsPage_Lavi();
	 recordsPage .login();
	 recordsPage.clickonBatchPage1();
}

@When("User is on Batch pagE")
public void user_is_on_batch_pag_e() {
	recordsPage.RowsinTable();
    
}

@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	   int rowsNumber= recordsPage.RowsinTable();
        //int rowsNum=driver.findElement(By.xpath("//div/mat-card/mat-card-content")).size();
        System.out.println("no of rows are :+rowsNumber");
}
@Given("User is on Batch page6")
public void user_is_on_batch_page6() {
	 initialization();
	 BDeletePage= new BatchDeletePage_Lavi();
	BDeletePage.login();
	BDeletePage.clickonBatchPage1();
}

@When("selects more than one Batch using checkbox")
public void selects_more_than_one_batch_using_checkbox() {
	BDeletePage.selectCheckbox();
}

@Then("User verifies that the details are correctly updated.{int}")
public void user_verifies_that_the_details_are_correctly_updated(Integer int1) {
  System.out.println("Multipul batchNames Should be Selected");
}

@When("User clicks on Delete button")
public void user_clicks_on_delete_button() {
	 BDeletePage= new BatchDeletePage_Lavi();
	BDeletePage.clickondeletebutton();
}

@Given("user is on Batch Confirm Deletion page")
public void user_is_on_batch_confirm_deletion_page() {
	 BDeletePage= new BatchDeletePage_Lavi();
	System.out.println("User lands on Confirm Deletion page");
}

@When("User clicks Yes button")
public void user_clicks_yes_button() {
	BDeletePage.clickonYes();
}

@Then("User can see {string} message")
public void user_can_see_message(String SuccessfulBatchDeleted) {
System.out.println("User should see SuccessfulBatchDeleted message");
System.out.println(SuccessfulBatchDeleted);
}

@When("User Searches for {string}")
public void user_searches_for(String DeletedBatchnames) {
	BDeletePage= new BatchDeletePage_Lavi();
	BDeletePage.enterbatchName();
}

@Then("There should be zero results.")
public void there_should_be_zero_results() {
	//System.out.println("User cannot see deletedbatchName");
}

@Given("User is on Batch Confirm Deletion Page6")
public void user_is_on_batch_confirm_deletion_page6() {
	BDeletePage= new BatchDeletePage_Lavi();
}

@When("User clicks No button")
public void user_clicks_no_button() throws InterruptedException {
	 BDeletePage= new BatchDeletePage_Lavi();
	 Thread.sleep(200);
	 //BDeletePage.selectCheckbox1();
	// BDeletePage.clickondeletebutton2();
//BDeletePage.clickonNo();
}

@Then("User can see Batch is not deleted.")
public void user_can_see_batch_is_not_deleted() {
	System.out.println("User clicks No textbox should disappear");
}

@Given("user is on Batch page")
public void user_is_on_batch_page7() {
	initialization();
	 nameDeletePage = new NameDeletePage_Lavi();
	 nameDeletePage.login();
	 nameDeletePage.clickonBatchPage2();
}

@When("user clicks delete  button for any batch")
public void user_clicks_delete_button_for_any_batch() {
	nameDeletePage.selectBatchName();
}

@Then("user will get confirm deletion popup")
public void user_will_get_confirm_deletion_popup() {
	nameDeletePage.clickondeletebutton1();

}

@Given("user is on Batch Confirm Deletion page7")
public void user_is_on_batch_confirm_deletion_page8() {
	 nameDeletePage = new NameDeletePage_Lavi();
	System.out.println("Select BatchName");
}

@When("User clicks Yes button7")
public void user_clicks_yes_button7() throws InterruptedException {
	Thread.sleep(200);
	nameDeletePage.clickonYes1();
}

@Then("User can see {string} message7")
public void user_can_see_message7(String SuccessfulBatchDeleted ) {
	System.out.println("User should see SuccessfulBatchDeleted message");
}
@Given("user is on Batch page8")
public void user_is_on_batch_page8() {
	System.out.println("User should see BatchPage");
}
@When("User Searches for \"Deleted Batch name\"{int}")
public void user_searches_for_deleted_batch_name(Integer int1) {
	 nameDeletePage = new NameDeletePage_Lavi();
	nameDeletePage.enterbatchName();
}

@Then("There should be zero results.{int}")
public void there_should_be_zero_results(Integer int1) {
	System.out.println("User cannot see deletedbatchName");
}

@Given("User is on Batch Confirm Deletion Page {int}")
public void user_is_on_batch_confirm_deletion_page(Integer int1) {
	 nameDeletePage = new NameDeletePage_Lavi();
}

@When("User clicks No button7")
public void user_clicks_no_button7() throws InterruptedException {
	Thread.sleep(200);
	nameDeletePage.selectBatchName1();
	nameDeletePage.clickondeletebutton2();
	nameDeletePage.clickonNo2();
}

@Then("User can see Batch is not deleted7")
public void user_can_see_batch_is_not_deleted7() {
	System.out.println("User clicks No textbox should disappear");
}

@Given("User is on New Batch page")
public void user_is_on_new_batch_page() {
	 initialization();
	 addBatchPage = new AddBatchPage_Lavi();
	 addBatchPage.login();
	 addBatchPage.clickonBatchPage1();
}

@When("User clicks A New Batch button")
public void user_clicks_a_new_batch_button() {
	addBatchPage.clickonnewBatch();
}

@Then("user can see Batch details form")
public void user_can_see_batch_details_form() {
    System.out.println("User can see text box");
}

@Given("User is on Batch details page")
public void user_is_on_batch_details_page() {
	addBatchPage = new AddBatchPage_Lavi();
	System.out.println("User can see text box");
}

@When("User clicks Save a button without entering data")
public void user_clicks_save_button_without_entering_data() {
	addBatchPage.clickonSave3();
}

@Then("User gets a message {string}")
public void user_gets_message(String nameisrequired) {
	System.out.println("User can name is required");
}

@When("User clicks a Cancel button")
public void user_clicks_cancel_button() {
	addBatchPage = new AddBatchPage_Lavi();
	addBatchPage.clickonCancel3();
}

@Then("User can see Batch Details form disappears")
public void user_can_see_batch_details_form_disappears() {
	System.out.println("User can see batchPage");
	addBatchPage.clickonnewBatch();
}

@When("user enters name in text box")
public void user_enters_name_in_text_box() {
	addBatchPage = new AddBatchPage_Lavi();
	addBatchPage.EnterBatchName();
}

@Then("User can see a {string} entered")
public void user_can_see_entered(String BatchName) {
	System.out.println("User can see batchName");
}

@When("User enters Description in text box")
public void user_enters_description_in_text_box() {
	addBatchPage = new AddBatchPage_Lavi();
	addBatchPage.EnterDescription();
}

@When("User selects Program name")
public void user_selects_program_name() {
	addBatchPage = new AddBatchPage_Lavi();
	addBatchPage.SelectProgram();
}

@Then("User can see {string} selected")
public void user_can_see_selected(String ProgramName) {
	addBatchPage.SelectProgramName();
}

@When("User selects Status using radiobutton")
public void user_selects_status_using_radiobutton() {
	addBatchPage = new AddBatchPage_Lavi();
	System.out.println("User can see status");
}

@Then("User can see {string} status selected")
public void user_can_see_status_selected(String Active) {
	addBatchPage.clickonActive();
}

@When("User clicks a Save button")
public void user_clicks_save_button() {
	addBatchPage.clickonSave3();
}

@Given("Verify Added Batch is created")
public void verify_added_batch_is_created() {
	addBatchPage = new AddBatchPage_Lavi();
	System.out.println("User can see batchName");

}

@When("User searches with newly created {string}")
public void user_searches_with_newly_created(String string) {
	System.out.println("User can see batchName");
}

@Then("records of the newly created  {string} is displayed")
public void records_of_the_newly_created_is_displayed(String string) {
	System.out.println("User can see batchName");
}


@Given("User is logged on to LMS website9")
public void user_is_logged_on_to_lms_website9() {
	 initialization();
	 paginationPage = new PaginationPage_Lavi();
	 paginationPage.login();
	 paginationPage.clickonBatchPage1();
}

@When("User is on first page of Manage Batch")
public void user_is_on_first_page_of_manage_batch() {
//paginationPage.clickonPage();

}

@Then("Verify that the previous link is disabled")
public void verify_that_previous_link_is_disabled() {
	System.out.println("User is on 1st page of BatchName");
}

@Given("User is on the page number {string}")
public void user_is_on_the_page_number(String string) {
	paginationPage = new PaginationPage_Lavi();
	System.out.println("User is on 1st page of BatchName");
}

@When("User clicks on navigate > button")
public void user_clicks_navigate_button() {
paginationPage.clickonPage2();
}

@Then("User navigated to page number {string}")
public void user_navigated_to_page_number(String string) {
	System.out.println("User is on 2nd page of BatchName");
}

@Given("User is on page number {string}")
public void user_is_on_page_number(String PageTwo) {
//	paginationPage = new PaginationPage();
	
}

@When("User clicks on navigate < button")
public void user_clicks_navigate_button4() {
	//paginationPage.clickonPage4();
	//System.out.println("User is on last page of BatchName");
}

@When("User is on last page of Manage Batch")
public void user_is_on_last_page_of_manage_batch() {
	paginationPage = new PaginationPage_Lavi();
	System.out.println("User is on last page of BatchName");
}

@Then("Verify that the next link is disabled")
public void verify_that_next_link_is_disabled() {
	paginationPage.clickonPage2();
}

@Given("User is on Batch page4")
public void user_is_on_batch_page4() {
	 initialization();
	 editPage = new EditPage_Lavi();
	 editPage.login();
	 editPage.clickonBatchPage1();
}

@When("User clicks on Edit button")
public void user_clicks_on_edit_button() {
	editPage.clickonEditBatch();
}

@Then("User lands on Batch Details form.")
public void user_lands_on_batch_details_form() {
   System.out.println("User should get TextBox");
}

@Given("User is on Batch details page1")
public void user_is_on_batch_details_page1() {
	editPage = new EditPage_Lavi();
}

@When("User edits Name")
public void user_edits_name() {
	editPage.clickonBatchName();
}

@Then("User can see edited Name")
public void user_can_see_edited_name() {
	 System.out.println("User can see Name");
}

@When("user edits description")
public void user_edits_description() {
	editPage = new EditPage_Lavi();
	editPage.clickonDescription();
}

@Then("User can see edited descricption")
public void user_can_see_edited_descricption() {
	System.out.println("User can see descricption");
}

@When("user edits program name")
public void user_edits_program_name() {
	editPage = new EditPage_Lavi();
	editPage.Program();
}

@Then("user can see edited program name")
public void user_can_see_edited_program_name() {
	System.out.println("User can see program name"); 
}

@When("user changes status")
public void user_changes_status() {
	editPage = new EditPage_Lavi();
	editPage .Status();
	System.out.println("User can see status");
}

@Then("User can see an updated Status")
public void user_can_see_updated_status() {
	//editPage.Active();
	System.out.println("User can see status");
}

@When("user edits No of classes")
public void user_edits_no_of_classes() {
//	editPage.NoClasses();
}

@Then("user can see updated No of classes")
public void user_can_see_updated_no_of_classes() {
	System.out.println("User can see  updated No of classes");
}

@When("user clicks cancel button")
public void user_clicks_cancel_button2() {
//	editPage.CancelBtn();
}

@Then("User can see Batch Details are not updated")
public void user_can_see_batch_details_are_not_updated() {
	System.out.println("User can see  not updated ");
}

@When("user clicks a save button")
public void user_clicks_save_button1() {
	editPage = new EditPage_Lavi();
	editPage.SaveBtn();
}

@Then("User can see {string} alert")
public void user_can_see_alert(String string) {
	System.out.println("User can see  pop message updated ");
}

@When("User searches with newly updated {string}")
public void user_searches_with_newly_updated(String string) {
	editPage = new EditPage_Lavi();
	editPage.SearchBtn();
}

@Then("User verifies that the details are correctly updated.")
public void user_verifies_that_the_details_are_correctly_updated() {
	System.out.println("User can see  new updated ");
	}


@Given("User is on Batch page1")
public void user_is_on_batch_pagE1() {
	 initialization();
	 assendingpage = new AssendingPage_Lavi();
	 assendingpage.login();
	 assendingpage.clickonBatchPage1();
	 
}

@When("User clicks on the Ascending arrow \\(down ) near to the Batch name")
public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_name() throws InterruptedException {
	Thread.sleep(200);
	assendingpage.clickonNameAscendingorder();
}

@Then("User can see the results in Ascending order of Batch name")
public void user_can_see_the_results_in_ascending_order_of_batch_name() {
System.out.println("User can see Batch Name AscendingOrder");
}

@When("User clicks on the Ascending arrow \\(down ) near to the Batch Description")
public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_description() throws InterruptedException {
	assendingpage = new AssendingPage_Lavi();
	Thread.sleep(200);
	assendingpage.clickonDescriptionAscendingorder();
}

@Then("User can see the results in Ascending order of Batch Description")
public void user_can_see_the_results_in_ascending_order_of_batch_description() {
	System.out.println("User can see Batch Description AscendingOrder");
}

@When("User clicks on the Ascending arrow \\(down ) near to the Batch Status")
public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_status() throws InterruptedException {
	assendingpage = new AssendingPage_Lavi();
	Thread.sleep(200);
	assendingpage.clickonStatusAscendingorder();
}

@Then("User can see the results in Ascending order of Batch Status")
public void user_can_see_the_results_in_ascending_order_of_batch_status() {
	System.out.println("User can see Batch Status AscendingOrder");
}

@When("User clicks on the Ascending arrow \\(down ) near to the No Of Classes")
public void user_clicks_on_the_ascending_arrow_down_near_to_the_no_of_classes() throws InterruptedException {
	assendingpage = new AssendingPage_Lavi();
	Thread.sleep(200);
	assendingpage.clcikonNoOfClassAscendingorder();
}

@Then("User can see the results in Ascending order of No of Classes")
public void user_can_see_the_results_in_ascending_order_of_no_of_classes() {
	System.out.println("User can see order of No of Classes AscendingOrder");
}

@When("User clicks on the Ascending arrow \\(down ) near to the Program Name")
public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_name() throws InterruptedException {
	assendingpage = new AssendingPage_Lavi();
	Thread.sleep(200);
	assendingpage.clickonProgramNameAscendingorder();
}

@Then("User can see the results in Ascending order of Program Name")
public void user_can_see_the_results_in_ascending_order_of_program_name() {
	System.out.println("User can see order Program NameAscendingOrder");
}

@When("User clicks onthe Descending arrow \\(down ) near to the Batch name")
public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_name() {
	initialization();
	descendingorder = new Descendingorder_Lavi();
	descendingorder.login();
	descendingorder.clickonBatchPage1();
}

@Then("User can see the results in Descending order of Batch name")
public void user_can_see_the_results_in_descending_order_of_batch_name() {

	descendingorder.clickonNameDescendingorder();
}

@When("User clicks onthe Descending arrow \\(down ) near to the Batch Description")
public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_description() {
	descendingorder = new Descendingorder_Lavi();
	descendingorder.clickonDescriptionDescendingorder();
	System.out.println("User can see  Batch Descriptio descendingOrder");
}

@When("User clicks onthe Descending arrow \\(down ) near to the Batch Status")
public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_status() throws InterruptedException {
	descendingorder = new Descendingorder_Lavi();
	Thread.sleep(200);
	descendingorder.clickonStatusDescendingorder();
}

@Then("User can see the results in Descending order of Batch Status")
public void user_can_see_the_results_in_descending_order_of_batch_status() {
	System.out.println("User can see  Batch Status descendingOrder");
}

@When("User clicks on the Descending arrow \\(down ) near to the No Of Classes")
public void user_clicks_on_the_descending_arrow_down_near_to_the_no_of_classes() throws InterruptedException {
	descendingorder = new Descendingorder_Lavi();
	Thread.sleep(200);
	descendingorder.clcikonNoOfClassDescendingorder();
}

@Then("User can see the results in Descending order of No of Classes")
public void user_can_see_the_results_in_descending_order_of_no_of_classes() {
	System.out.println("User can see  No of Classes descendingOrder");
}

@When("Verify that the results are displayed in Descending order of Program Name")
public void verify_that_the_results_are_displayed_in_descending_order_of_program_name() throws InterruptedException {
	descendingorder = new Descendingorder_Lavi();
	Thread.sleep(200);
	descendingorder.clickonProgramNameDescendingorder();
}



@Then("User can see the results in Descending order of Program Name")
public void user_can_see_the_results_in_descending_order_of_program_name() {
	System.out.println("User can see order Program Name descendingOrder");
}

	@Then("User lands on a Confirm Deletion form.")
	public void userLandsOnAConfirmDeletionForm() {
		System.out.println("User lands on Confirm Deletion form");
	}

	@Then("User gets message {string}")
	public void userGetsMessageSuccessfulBatchCreated() {
			System.out.println("User able to see Successfull batch created");
	}
}
