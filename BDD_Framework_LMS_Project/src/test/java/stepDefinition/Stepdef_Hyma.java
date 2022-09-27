package stepDefinition;

import BaseUtils.BrowserConfig;
import LMS_Pages.HomePage3Pages_Hyma;
import LMS_Pages.LoginPage2Pages_Hyma;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdef_Hyma extends BrowserConfig
{

    public LoginPage2Pages_Hyma lp;
    public HomePage3Pages_Hyma hp;
    @Given("User is on the the Login Page")
    public void user_is_on_the_login_page() {
        initialization();
    }
    @When("User entering the valid username {string} and password {string}")
    public void user_entering_valid_username_and_password(String username, String password) {
        lp  = new LoginPage2Pages_Hyma();
        lp.setUsername(username);
        lp.setPassword(password);

    }

    @When("User clicks on the Login button")
    public void user_clicks_on_Login() {
        lp  = new LoginPage2Pages_Hyma();
        lp.ClickonLogin();

    }
    @Then("User should Land on the Home Page")
    public void user_should_land_on_home_page() {
        System.out.println("Print Home Page");
    }
    //Homepage1
    @When("User landed on the Home page after logging into the LMS website{string}")
    public void user_landed_on_the_home_page_after_logging_into_the_lms_website(String actualheading)
    {
        //String heading = homepage.getHeading();
        System.out.println("homepage heading is : +heading");
        //Assert.assertTrue(contains(actualheading));
    }
    @Then("verify that title of the page is {string}")
    public void verify_that_title_of_the_page_is(String string)
    {
        System.out.println("print homepage title is: +LMS");
    }

    //Homepage3
    @Then("User should see a button with text {string} on the menu bar")
    public void user_should_see_a_button_with_text_on_the_menu_bar(String Program)
    {
        hp=new HomePage3Pages_Hyma();
        hp.Program();
        hp.Batch();;
        hp.User();
        hp.Assignment();
        hp.Attendance();
        hp.Logout();
    }
    @Then("User should see the Login page\"Please login to LMS application\"")
    public void user_should_see_the_login_page_please_login_to_lms_application() {
        lp  = new LoginPage2Pages_Hyma();
        lp.getHeading();
        System.out.println("Please login to LMS application");
    }
    @When("User clicks the Login button after entering invalid password\"Test\"")
    public void user_clicks_the_login_button_after_entering_invalid_password_test() {
        lp  = new LoginPage2Pages_Hyma();
        lp.setInvaliduser();
    }
    @Then("User should receive the message {string}")
    public void user_should_receive_the_message(String string) {
        //lp  = new LoginPage2Pages_Hyma();
        //lp.getMsg();
        System.out.println("Invalid username and password Please try again");
    }
    @When("User clicks the Login button after entering invalid username\"Module\"")
    public void user_clicks_the_login_button_after_entering_invalid_username_module() {
        lp  = new LoginPage2Pages_Hyma();
        lp.setInvalidpwd();
    }
}
