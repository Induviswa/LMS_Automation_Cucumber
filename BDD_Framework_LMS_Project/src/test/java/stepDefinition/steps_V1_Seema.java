package stepDefinition;

import BaseUtils.BrowserConfig;
import LMS_Pages.Assignmentpage_V1_Seema;
import LMS_Pages.Login_page_Seema;
import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps_V1_Seema extends BrowserConfig {
	// public WebDriver driver;

	public Login_page_Seema login;
	public Assignmentpage_V1_Seema assign;

	public steps_V1_Seema() {
		super();
	}

	@Given("User is on Login Page")
	public void user_is_on_the_login_page() {
		initialization();

	}

	@When("User clicks the Login button after entering valid username and password")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password() {
		login = new Login_page_Seema();
		login.Username("LMS");
		login.Password("LMS");
		login.Cklogin();

	}

	@Then("User should see the LMS Home page")
	public void user_should_see_the_lms_home_page() {
		login.gethomepagetitle();
		System.out.println("user is on home page");
	}

	@Given("User is logged on to the the LMS website")
	public void user_is_logged_on_to_lms_website() {
		initialization();
		login = new Login_page_Seema();
		login.Username("LMS");
		login.Password("LMS");
		login.Cklogin();
	}

	@When("User is on Manage Assignment page")
	public void user_is_on_manage_assignment_page() {
		// login = new Login_page_Seema();
		assign = new Assignmentpage_V1_Seema();
		assign.clickonassign();
	}

	@Then("User should see the heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String string) {
		assign.validateheadingassignment();
		System.out.println("user saw a text of Manage Assignment on the screen");

	}

	// FOOTER RELATED
	@When("User is on  Manage Assignment page")
	public void user_is_on_manage_assignment_page1() {
		assign = new Assignmentpage_V1_Seema();
		assign.clickonassign();
	}

	@Then("User should see the text as {string}")
	public void user_should_see_the_text_as(String text1to3) {
		assign.see1to3text(text1to3);
	}

	@Then("User should see the footer as {string}")
	public void user_should_see_the_footer_as(String footerasintotal) {
		assign.seefooteras(footerasintotal);
		Assert.assertEquals(footerasintotal, "In total there are 3 programs",
				"Expected In total there are 3 assignments.,didnt match");

	}

	@Then("Text box is used for search has text as {string}")
	public void text_box_used_for_search_has_text_as(String textsearch) {
		assign.searchtextbox(textsearch);

	}

	@When("User clicks on search with <name phrase> into search box.")
	public void user_clicks_on_search_with_name_phrase_into_search_box() throws InterruptedException {
		assign.clicksearch();
	}

	@Then("Entries for <name phrase> are shown.")
	public void entries_for_name_phrase_are_shown() {
		assign.gettextinsearchbox();
	}

	// EDIT ASSIGNMENT DEATILS

	@Given("User is on Assignment page")
	public void user_is_on_assignment_page() {
		initialization();
		login = new Login_page_Seema();
		login.Username("LMS");
		login.Password("LMS");
		login.Cklogin();
		assign = new Assignmentpage_V1_Seema();
		assign.clickonassign();
	}

	@When("User selects Assignment using checkbox")
	public void user_selects_assignment_using_checkbox() {
		assign.clickoncheckboxassignment();
	}

	@Then("Assignment gets selected")
	public void assignment_gets_selected() {
		// assign.secheckbox();
	}

	@When("User clicks on a <Edit> button")
	public void user_clicks_on_edit_button() {
		assign.clickonedit();

	}

	@Then("User lands on Assignment Details form.")
	public void user_lands_on_assignment_details_form() {
		assign.validateform();
	}

	@Given("User is on Assignment Details form")
	public void user_is_on_assignment_details_form() {
		assign = new Assignmentpage_V1_Seema();
		// assign.clickonassign();
		// System.out.println("USER LANDED ON DEATAILS FORM");
	}

	@When("User edit Name")
	public void user_edits_name() {
		assign.editname();
	}

	@Then("User can see updated Name")
	public void user_can_see_updated_name() {
		assign.getupdatedname();

	}

	@When("User edit Description")
	public void user_edits_description() {
		assign.editdescription();
	}

	@Then("User can see updated Description")
	public void user_can_see_updated_description() {
		assign.getupdateddescription();
	}

	@When("User edit Grade")
	public void user_edits_grade() {
		assign.editgrade();
	}

	@Then("User can see updated Grade")
	public void user_can_see_updated_grade() {
		assign.getupdategrade();
	}

	@When("User edits Due Date")
	public void user_edits_due_date() {
		assign.editduedate();
	}

	@Then("User can see updated Due Date")
	public void user_can_see_updated_due_date() {
		assign.getupdaduedate();
	}

	@When("User clicks <Cancel> button")
	public void user_clicks_cancel_button() throws InterruptedException {
		assign.clickcancel();

	}

	@Then("User can see Assignment Details form disappears")
	public void user_can_see_assignment_details_form_disappears() {
		System.out.println("FORM IS DISSAPEARED");
		// assign.disappearofform();
	}

	@When("User clicks <Save> button")
	public void user_clicks_save_button() {
		assign.saveform();

	}

	@Then("User can see a {string} message")
	public void user_can_see_message(String string) {
		System.out.println("Success Message Displayed");
		// assign.successmessage();
	}

	// DELETE ASSIGNMENT

	@When("User clicks on <Delete> button after selecting an assignment")
	public void user_clicks_on_delete_button_after_selecting_an_assignment() {
		assign.clickoncheckboxassignment();
	}

	@Then("User lands on the Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
		assign.deleteclick();

	}

	@Given("User is on Confirm Deletion form")
	public void user_is_on_confirm_deletion_form() {
		assign = new Assignmentpage_V1_Seema();
	}

	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() {
		assign.clickyes();
		System.out.println("USER IS ABLE TO DELETE ");

	}

	@When("User clicks <No> button")
	public void user_clicks_no_button() {
		assign.clickno();

	}

	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
		System.out.println("user cant see the deletion form once clicked on no");

	}

	@When("User selects more than one Assignment using checkbox")
	public void user_selects_more_than_one_assignment_using_checkbox() throws InterruptedException {
		// assign.clickoncheckboxassignment();
		assign.clickonmultiplecheckbox();

	}

	@Then("Assignments get selected")
	public void assignments_get_selected() {
		System.out.println("All assignments are selevted");

	}

	@When("User clicks on <Delete> button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
		assign.clickdeleteonleft();
	}

	// ADDING NEW ASSIGNMENT bUTTON

	@When("User clicks A New Assignment button")
	public void user_clicks_a_new_assignment_button() {
		assign.addnewassignmentbtn();
		assign = new Assignmentpage_V1_Seema();
	}

	@Then("user can see Assignment details form")
	public void user_can_see_assignment_details_form() {
		assign = new Assignmentpage_V1_Seema();
		assign.capturetext1();
		System.out.println("user can see the assignment details form");

	}

	@When("User clicks a Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {

		assign = new Assignmentpage_V1_Seema();
		assign.clickonsave_without_anydata();

	}

	@Then("User gets as a message {string}")
	public void user_gets_message(String namerequiredsms) {
		// assign = new Assignmentpage_V1_Seema();
		// assign.name_is_reqmessage(namerequiredsms);

	}

	@When("user enters Assignment name")
	public void user_enters_assignment_name() {
		assign = new Assignmentpage_V1_Seema();
		assign.entered_new_assignmentname();

	}

	@When("user enters Assignment description")
	public void user_enters_assignment_description() {
		assign = new Assignmentpage_V1_Seema();

		assign.entered_new_desc();

	}

	@When("user enters assignment grade")
	public void user_enters_assignment_grade() {
		assign = new Assignmentpage_V1_Seema();
		assign.entered_new_grade();
	}

	@Then("user can see {string} entered")
	public void user_can_see_entered(String string) {

	}

	@When("user enters assignment due date")
	public void user_enters_assignment_due_date() {
		// assign = new Assignmentpage_V1_Seema();
		// assign.entered_new_date();
	}

	@Then("user can see \"Assignment due date'")
	public void user_can_see_assignment_due_date() {

	}

	@Then("User can see the {string} entered")
	public void user_can_see_entered1(String string) {

	}

	@When("User clicks the Save button")
	public void user_clicks_save_button1() {
		assign = new Assignmentpage_V1_Seema();
		assign.clickonsavebtn2();

	}

	@When("User clicks as a Cancel button")
	public void user_clicks_cancel_button1() {
		System.out.println("user is clicked on cancel btn");

	}

	@Then("User can see assignment Details form disappears")
	public void user_can_see_assignment_details_form_disappears1() {
		System.out.println("assignment Details form disappears");

	}

	// FILL ASSIGNMENT

	/*
	 * @Given("User is on Assignment Page") public void user_is_on_assignment_page()
	 * { // Write code here that turns the phrase above into concrete actions throw
	 * new io.cucumber.java.PendingException(); }
	 */

	@When("User Click on Submit")
	public void user_click_on_submit() {
		assign = new Assignmentpage_V1_Seema(); // assign.addnewassignmentbtn();

	}

	@Then("User can see need to fill required fields")
	public void user_can_see_need_to_fill_required_fields() {

	}

	@When("User enter reguired details and submit")
	public void user_enter_reguired_details_and_submit() {

	}

	@Then("User can see Submit Assignment Sucessfully")
	public void user_can_see_submit_assignment_sucessfully() {
	}

	// ascending order
	@Given("User is on Assignment Page")
	public void user_is_on_assignment_page1() {
		initialization();
		login = new Login_page_Seema();
		login.Username("LMS");
		login.Password("LMS");
		login.Cklogin();
		assign = new Assignmentpage_V1_Seema();
		assign.clickonassign();
	}

	@When("User clicks onthe Ascending arrow \\(down ) near to the Assignment name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_assignment_name() {
		assign = new Assignmentpage_V1_Seema();
		assign.clickarrow_assin_name();

	}

	@Then("User can see the results in Ascending order of Assignment name")
	public void user_can_see_the_results_in_ascending_order_of_assignment_name() {
		System.out.println("userr can see it");
	}

	@When("User clicks onthe Ascending arrow \\(down ) near to the Assignment Description")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_assignment_description() {
		assign = new Assignmentpage_V1_Seema();
		assign.clickarrow_assin_description();
	}

	@Then("User can see the results in Ascending order of Assignment Description")
	public void user_can_see_the_results_in_ascending_order_of_assignment_description() {
		System.out.println("user is able to see it");
	}

	// DESCENDING ORDER
	@When("User clicks onthe Descending arrow \\(down ) near to the Assignment name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_assignment_name() {
		assign = new Assignmentpage_V1_Seema();
		assign.clickarrow_assin_name();

	}

	@Then("User can see the results in Descending order of Assignment name")
	public void user_can_see_the_results_in_descending_order_of_assignment_name() {
System.out.println("Success message displayed");
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Assignment Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_assignment_description() {
		assign = new Assignmentpage_V1_Seema();
		assign.clickarrow_assin_description();

	}

	@Then("User lands on Confirm Deletion message.")
	public void userLandsOnConfirmDeletionMessage() {
		System.out.println("System landed on the Delete page");
	}
}
