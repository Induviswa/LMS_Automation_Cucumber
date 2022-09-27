package stepDefinition;



import LMS_Pages.LoginPage_Kalpana;
import LMS_Pages.ManageUserPage_Kalpana;
import LMS_Pages.Pagination_Kalpana;
import LMS_Pages.UserDetailsPage_Kalpana;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Utils;

public class StepDefinition_Kalpana extends BaseClass_Kalpana {

	
	@Given("User launch browser")
	public void user_launch_browser() {
 
	  System.setProperty("webdriver.chrome.driver", "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/main/resources/Browsers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new LoginPage_Kalpana(driver);
		mp= new ManageUserPage_Kalpana(driver);
		up= new UserDetailsPage_Kalpana(driver);
		page = new Pagination_Kalpana(driver);
		utils = new Utils(driver); 
		
	}

	@When("User opens URl {string}")
	public void user_opens_u_rl(String url) {
	  driver.get(url);
	}

	@And("User enter the username as {string} and password as {string}")
	public void user_enter_the_username_as_and_password_as(String username, String password) {
		
	  lp.setUserName(username);
	  lp.setPassword(password);
	 
	}

	@Then("Click on SignIN")
	public void click_on_sign_in() {
	   lp.clickLogin();
	}

	//**************Manage user page***************
	
	@Then("User is on any page after Login")
	public void user_is_on_any_page_after_login() {
		
		
	 mp = new ManageUserPage_Kalpana(driver);
//Assert.assertEquals("LMS", mp.getPageTitle());
//System.out.println(mp.getPageTitle());
	}

	@When("User clicks the Tab {string}")
	public void user_clicks_the_tab(String User) throws InterruptedException {
		Thread.sleep(3000);
		
		mp.clickOnUser();
		up.clickOnaddNewcustomer();
		// up.clickonCance();
	//	 up.clickOnaddNewcustomer();
		up.enterFirstName("David");
		up.enterLastName("Peter");
		up.emailId("davepet@gmail.com");
		
	//	up.batch("SDET78");
	//	up.skill("Java");
		up.clickonSubmit();
		System.out.println(User);
	
		
	}
	

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() throws InterruptedException {

		Thread.sleep(3000);
		
		String manage= driver.getTitle();
		System.out.println("name of the Manage user page:"+ manage );
//	System.out.println(mp.getTableRow());
//	System.out.println(mp.getTableCol());
	
	}
	
	@Then("Use should see the page heading as {string}")
	public void use_should_see_the_page_heading_as(String string) {
	  
	System.out.println(string);
	}
	// *********************User Page / pagination********************8
	// line 4
	@When("User is on the Manage use page after clicking User Tab")
	public void user_is_on_the_manage_use_page_after_clicking_user_tab() throws InterruptedException {
		System.out.println("User is on  the Manage user page:" );
	}

	@Then("User should see the pagination controls below data table")
	public void user_should_see_the_pagination_controls_below_data_table() {             //*****// important to see later
		System.out.println("User able to see the table ");
	//	String manageUser= driver.getTitle();
	//	System.out.println("of the Manage user page:" +  manageUser);
	}

	//*************************************
	// line 5
	@Given("User is on Manage user page")
	public void user_is_on_manage_user_page() {
	//	String manageUser= driver.getTitle();
		System.out.println("User is on the User mange page" );
	}

	@When("Manage user table has less less than or equal to {int} rows")
	public void manage_user_table_has_less_less_than_or_equal_to_rows(Integer rows) {
		System.out.println("User page display less than 5 or equal to 5 " + rows);
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
	    System.out.println("Yes, pagination control is displayed");
	}
//*******************************88
	// line 6
	@When("Manage user table has more than  rows")
	public void manage_user_table_has_more_than_5_rows() {
	    System.out.println("No, It is 5 or less than 5");
	}  

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
	    System.out.println("Yes it is enabled ");
	}
//**************line 8
	@Given("last page of User records are displayed")
	public void last_page_of_user_records_are_displayed() {
		
		  System.out.println("Yes the last page of user records are displayed ");                  
	}
		
	@When("Manage user table has more than rows")
	public void manage_user_table_has_more_than_rows() {
	   
	}
                                                
	  

	@When("Use cliks next link of pagination")
	public void use_cliks_next_link_of_pagination() {
	 //   page.leftArrow();
	    
	}

	@ Then("previous page should be dosplayed")
	public void previous_page_should_be_dosplayed() {
	                   // check later
	}
//***********line 9
	@Given("User table is disolayed in manage user page")
	public void user_table_is_disolayed_in_manage_user_page() {
		
		System.out.println("Yes the last page of user records are displayed "); 
	}
	
	@When("User cliks previous link of pagination")
	public void user_cliks_previous_link_of_pagination() {
	 
//		page.rightArrow();
	    
	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {
	   
		System.out.println("Yes, page moved to the previous page and displayed the users table ");
	}
//*********10
	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {
		System.out.println("Yes,  displayed the first page of the users table ");
	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {
		System.out.println("Yes,  It is disabled ");
		
	}
//**********************line 11
	@Given("ser table is displayed in manage user page")
	public void ser_table_is_displayed_in_manage_user_page() {
		System.out.println("Yes,  displayed the Manage user page ");
	}

	@When("User clicks << icon in pagination")
	public void user_clicks_icon_in_pagination() {
//	    page.leftDoubleArrow();
	}

	@Then("User should see the First page of the table")
	public void user_should_see_the_first_page_of_the_table() {
		System.out.println("Yes,  able to see the first page ");
	}
//*****************  line 12
	@Given("User table is displayed in manage user page")
	public void user_table_is_displayed_in_manage_user_page() {
		System.out.println("Yes,  displayed the Manage user page ");
	}

	@When("User clicks >> icon in pagination")
	public void user_clicks_icon_in_pagination1() {
	//    page.rightDoubleArrow();
		
	}

	//**************LIne 10 
	@Then("User should see the last page of the table")
	public void user_should_see_the_last_page_of_the_table() {
		System.out.println("Yes,  able to see the last page ");
	}
//*************  line13
	@Given("User is logged on to the LMS website")
	public void user_is_logged_on_to_the_lms_website() {
	   
	}

	@When("User lands on Manage User page")
	public void user_lands_on_manage_user_page() {
	    
	}

	@Then("User should see the text  {string} beow the user table.")
	public void user_should_see_the_text_beow_the_user_table(String content) {
	   System.out.println(content);
	}

	
	//*****************Footer**********
	@Then("User should see the table footer as {string}.")
	public void user_should_see_the_table_footer_as(String string) {
	    System.out.println("Yes the user able to see the footer" + string);
	}
	
	//**********************Add New User***************
	
/*	@When("User clicks Add New User button")
	public void user_clicks_add_new_user_button() {
		up.clickOnaddNewcustomer();
	}

	@Then("User should see the {string} dialog box")
	public void user_should_see_the_dialog_box(String string) {
	System.out.println(string);
	}*/
	
	
	
	///*******************************Table Header *******************
	
	@When("User is on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() {
	    System.out.println("Ys user is on the manage user page");
	    
	}

	@Then("User should see the table header")
	public void user_should_see_the_table_header_as_empty_checkbox_icon_id_with_sorticon_name_with_sorticon_email_address_with_sort_icon_contact_number_with_sort_icon_batch_with_sort_icon_skill_with_sort_icon_edit_delete_as_column_names() {
	    System.out.println("yes, able to see all theheaders");
	}

	@When("User clicks sort icon in table header")
	public void user_clicks_sort_icon_in_table_header() {
	   System.out.println("Yes able to click"); 
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
	   System.out.println("No, it is not sorting, it is moving only top and bottom row");
	}

	@When("User checks empty checkbox in header")
	public void user_checks_empty_checkbox_in_header() {
		 System.out.println("Yes able to check");
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
		 System.out.println("Yes able to check");
	}

	@When("User unchecks checkbox in header")
	public void user_unchecks_checkbox_in_header() {
		 System.out.println("Yes able to uncheck");
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
		 System.out.println("Yes all the rows should ne uncheck");
	}

	//***************************Delete icon
	
	@Then("User should see the delete icon at the top left corner of the user table")
	public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
	   System.out.println("Yes, User should see the delete icon at the top left corner of the user table");
	}

	@When("no rows is checked")
	public void no_rows_is_checked() {
	   System.out.println("Yes, no rows are checked");
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
	 System.out.println("Yes it is disaabled");
	}

/*	@When("User checks the rows in user table")
	public void user_checks_the_rows_in_user_table() {
	    System.out.println("Yes user able to check the rows ");
	}   */

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
	   System.out.println("Yes once check the row,it is enabled");
	}

	@Given("User checks the rows in user table")
	public void user_checks_the_rows_in_user_table1() {
		System.out.println("Yes User able to check the row in the table");
	}

	@When("User clicks the delete icon at the top left corner of user table")
	public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
	   System.out.println("Yes able to delete ");
	}

	@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string}  and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon(String text, String click, String click1) {
	  //  System.out.println( string, string2,string3);
	    System.out.println("it is displaying " );
	    System.out.println(text);
	    System.out.println(click);
	    System.out.println(click1);
	}

	@Given("User is in confirm dialog box after clicking delete icon")
	public void user_is_in_confirm_dialog_box_after_clicking_delete_icon() {
		System.out.println("Yes ");
	}

	@When("User clicks button with text {string}")
	public void user_clicks_button_with_text(String string) {
		System.out.println(string);
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
		System.out.println("Yes ");
	}

	@Then("Selected rows should be deleted and popup should be shown with success message {string}")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String string) {
		System.out.println(string);
	}

	@When("User clicks the close\\(x) icon")
	public void user_clicks_the_close_x_icon() {
		System.out.println("Yes ");
	}

	@Then("Confirm dialog box should be closed#Author: your.email@your.domain.com")
	public void confirm_dialog_box_should_be_closed_author_your_email_your_domain_com() {
		System.out.println("Yes ");
	}
	
	
	//******************************************Edit/ delete
	@Then("User should see the buttons with edit delete icon in each row of Edit Delete coulmn")
	public void user_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {
	   System.out.println("Yes able to see ");
	}

	@When("User clicks delete button")
	public void user_clicks_delete_button() {
		System.out.println("Yes User able to click ");
	}

	@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon1(String string, String string2, String string3) {
	    System.out.println(string);
	    System.out.println(string2);
	    System.out.println(string3);
	}

	@When("User clicks Edit button")
	public void user_clicks_edit_button() {
	    System.out.println("Yes, User able to click on edit button ");
	}

	@Then("{string} dialog box should be displayed for editing")
	public void dialog_box_should_be_displayed_for_editing(String string) {
	    System.out.println("Yes displayed");
	}
//******************Search
	
	@Then("User should see the Search input field after the delete icon")
	public void user_should_see_the_search_input_field_after_the_delete_icon() {
	   System.out.println("Yes able to see it");
	}

	@Then("User should see the search input field with search icon and text as {string}")
	public void user_should_see_the_search_input_field_with_search_icon_and_text_as(String string) {
		  System.out.println(string);
	}
	

	@When("User types Name to search")
	public void user_types_name_to_search() {
	    
	}

	@Then("Rows with the name should be displayed")
	public void rows_with_the_name_should_be_displayed() {
		  System.out.println("Yes it's displayed");
	}

	@When("User types random text in search field which has no matching entry")
	public void user_types_random_text_in_search_field_which_has_no_matching_entry() {
		  System.out.println("Entered random");
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
		  System.out.println("No rows displayed");
	}

//******************UserID
	
	@When("User clicks ID in any row")
	public void user_clicks_id_in_any_row() {
		up = new UserDetailsPage_Kalpana(driver);
	
	    System.out.println("Yes able to click");
	}

	@Then("User details dialog box displayed with user information")
	public void user_details_dialog_box_displayed_with_user_information() {
	  System.out.println("Yes");
	}

	//**********************Click adD NEW USER
	
	@When("User clicks A Add new user button")
	public void user_clicks_a_add_new_user_button() {
	
		up = new UserDetailsPage_Kalpana(driver);
	
//	up.clickOnaddNewcustomer();
	}

	@Then("User should see User details window with heading {string}")
	public void user_should_see_user_details_window_with_heading(String string) {
//up.clickOnaddNewcustomer();
		System.out.println(string);
	}
	
	//*************************Cancel button
	@Then("User should see a button with text Cancel in user details window")
	public void user_should_see_a_button_with_text_cancel_in_user_details_window() {
	   System.out.println("yes user able to see it");
	}
	
	@Given("User is on User details window")
	public void user_is_on_user_details_window() {
	   System.out.println("Yes uesr is on the user details window");
	   up = new UserDetailsPage_Kalpana(driver);
	//  up.clickOnaddNewcustomer();
	//   up.clickonCancel();
	}  

	@When("User clicks A cancel button")
	public void user_clicks_a_cancel_button() {
		up = new UserDetailsPage_Kalpana(driver);
	//	 up.clickonCancel();
	
	}

	@Then("User details window should be closed")
	public void user_details_window_should_be_closed() {
	    System.out.println("It is closed");
	}

	//***************CAnce X
	
	@Then("User should see a cancel\\(x) in user details window")
	public void user_should_see_a_cancel_x_in_user_details_window() {
	//  up.clickX();
	}

	@When("User clicks A cancel\\(X) icon")
	public void user_clicks_a_cancel_x_icon() {
	    System.out.println("User details Window closed");
	}
	
	//************8
	@Then("User should see a button with text Submit in user details window")
	public void user_should_see_a_button_with_text_submit_in_user_details_window() {
	  //  up.clickonSubmit();
	}
	
	//****************
	
	@Then("User should see the placeholders with Text As {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"User Role\",Visa status\",{string},{string}")
	public void user_should_see_the_placeholders_with_text_as_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_user_role_visa_status(String string, String string2, String string3, String string4) {
	  
		System.out.println(string);
		System.out.println(string3);
		System.out.println(string3);
		System.out.println(string4);
		
	}
}


	
	