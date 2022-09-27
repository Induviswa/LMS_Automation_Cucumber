package stepDefinition;

import LMS_Pages.LoginPage2Pages_Hyma;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
public class Stepdef_Hyma
{
    WebDriver driver;
    public LoginPage2Pages_Hyma lp;
    @When("User fills the First Name in Alphabets only")
    public void user_fills_the_first_name_in_alphabets_only()
    {
        driver.findElement(By.id("FirstName")).sendKeys("Guna");
    }
    @Then("The First Name will be displayed")
    public void the_first_name_will_be_displayed() {
        System.out.println("print First Name is: +FirstName");
    }
    @When("User fills the Last Name in Alphabets only")
    public void user_fills_the_last_name_in_alphabets_only() {
        driver.findElement(By.id("LastName ")).sendKeys("Xyz");
    }
    @Then("The Last Name will be displayed")
    public void the_last_name_will_be_displayed() {
        System.out.println("print Last Name is: +LastName");
    }
    @When("User fills the Address in Alphabets only")
    public void user_fills_the_address_in_alphabets_only() {
        driver.findElement(By.id("Address")).sendKeys("SW Feather st");
    }
    @Then("The Address will be displayed")
    public void the_address_will_be_displayed() {
        System.out.println("print Address is: +Address");
    }
    @When("User fills the Street name Field using Alpha Numerics and or Symbols")
    public void user_fills_the_street_name_field_using_alpha_numerics_and_or_symbols() {
        driver.findElement(By.id("StreetName")).sendKeys("EmilyLn");
    }
    @Then("The Street Name will be displayed")
    public void the_street_name_will_be_displayed() {
        System.out.println("print Street Name is: +Steet Name");
    }
    @When("User fills the House Number Field using Alpha Numerics and or Symbols")
    public void user_fills_the_house_number_field_using_alpha_numerics_and_or_symbols() {
        driver.findElement(By.id("HouseNumber")).sendKeys("A278");
    }
    @Then("The House Number will be displayed")
    public void the_house_number_will_be_displayed() {
        System.out.println("print House Number is: +House number");
    }
    @When("User fills the {int} digit Zip code using Numbers only")
    public void user_fills_the_digit_zip_code_using_numbers_only(Integer int1) {
        driver.findElement(By.id("Zip")).sendKeys("72719");
    }
    @Then("The Zip code will be displayed")
    public void the_zip_code_will_be_displayed() {
        System.out.println("print Zipcode is: +Zipcode");
    }
    @When("User fills the City Name in Alphabets only")
    public void user_fills_the_city_name_in_alphabets_only() {
        driver.findElement(By.id("CityName")).sendKeys("Bent");
    }
    @Then("The City Name will be displayed")
    public void the_city_name_will_be_displayed() {
        System.out.println("print City name is: +CityName");
    }
    @When("User selects the respective State Name from the DropBox")
    public void user_selects_the_respective_state_name_from_the_drop_box() {
        driver.findElement(By.id("StateName")).click();
    }
    @Then("The State Name will be displayed")
    public void the_state_name_will_be_displayed() {
        System.out.println("print State Name is: +StateName");
    }
    @When("User fills the valid {int} digit Mobile number in Numerics")
    public void user_fills_the_valid_digit_mobile_number_in_numerics(Integer int1) {
        driver.findElement(By.id("MobileNum")).sendKeys("9876543210");
    }
    @Then("The Mobile Number will be displayed")
    public void the_mobile_number_will_be_displayed() {
        System.out.println("print MobileNo is: +MobileNo");
    }
    @When("User Selects the Date of Birth from the Calender")
    public void user_selects_the_date_of_birth_from_the_calender() {
        driver.findElement(By.id("DateofBirth")).click();
    }
    @Then("Birth Date will be Displayed")
    public void birth_date_will_be_displayed() {
        System.out.println("print Birth Date is: +Birth date");
    }
    @When("User fills the valid unique UserName")
    public void user_fills_the_valid_unique_user_name() {
        driver.findElement(By.id("Udername")).sendKeys("username");
    }
    @Then("UserName will be displayed")
    public void user_name_will_be_displayed() {
        System.out.println("print UserName is: +UseName");
    }
    @When("User fills the valid Password with {int} Upper case, {int} Numeric and {int} special charecter and {int} charecters")
    public void user_fills_the_valid_password_with_upper_case_numeric_and_special_charecter_and_charecters(Integer int1, Integer int2, Integer int3, Integer int4) {
        driver.findElement(By.id("Password")).sendKeys("Passwd@5");
    }
    @Then("User Password will be displayed")
    public void user_password_will_be_displayed() {
        System.out.println("print password is: +Password");
    }
    @When("User enters submit button with all fields empty")
    public void user_enters_submit_button_with_all_fields_empty() {
        driver.findElement(By.id("submit")).click();
    }
    @Then("User should get a message\"Please fill all fields above\"")
    public void user_should_get_a_message_please_fill_all_fields_above() {
        driver.findElement(By.id("errormessage")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid First Name")
    public void user_clicks_sign_up_button_with_invalid_first_name() {
        driver.findElement(By.id("FirstName")).sendKeys("xyz");
    }
    @Then("User should get a message\"Please fill valid First Name \"")
    public void user_should_get_a_message_please_fill_valid_first_name() {
        driver.findElement(By.id("errormessage1")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid Last Name")
    public void user_clicks_sign_up_button_with_invalid_last_name() {
        driver.findElement(By.id("LastName")).sendKeys("pqr");
    }
    @Then("User should get a message\"Please fill valid Last Name \"")
    public void user_should_get_a_message_please_fill_valid_last_name() {
        driver.findElement(By.id("errormessage2")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid Address")
    public void user_clicks_sign_up_button_with_invalid_address() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please fill valid Address \"")
    public void user_should_get_a_message_please_fill_valid_address() {
        driver.findElement(By.id("errormessage3")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid Street Name")
    public void user_clicks_sign_up_button_with_invalid_street_name() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please fill valid Street Name \"")
    public void user_should_get_a_message_please_fill_valid_street_name() {
        driver.findElement(By.id("errormessage4")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid House Number")
    public void user_clicks_sign_up_button_with_invalid_house_number() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please fill valid House Number \"")
    public void user_should_get_a_message_please_fill_valid_house_number() {
        driver.findElement(By.id("errormessage5")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid Zip")
    public void user_clicks_sign_up_button_with_invalid_zip() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please fill valid Zip\"")
    public void user_should_get_a_message_please_fill_valid_zip() {
        driver.findElement(By.id("errormessage6")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid City")
    public void user_clicks_sign_up_button_with_invalid_city() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please fill valid City\"")
    public void user_should_get_a_message_please_fill_valid_city() {
        driver.findElement(By.id("errormessage7")).isDisplayed();
    }
    @When("User clicks Sign Up button without selecting  State")
    public void user_clicks_sign_up_button_without_selecting_state() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should get a message\"Please select State \"")
    public void user_should_get_a_message_please_select_state() {
        driver.findElement(By.id("errormessage7")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid Phone Number")
    public void user_clicks_sign_up_button_with_invalid_phone_number() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please fill valid Phone Number \"")
    public void user_should_get_a_message_please_fill_valid_phone_number() {
        driver.findElement(By.id("errormessage8")).isDisplayed();
    }
    @When("User clicks Sign Up button without selecting BirthDate")
    public void user_clicks_sign_up_button_without_selecting_birth_date() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please select BirthDate \"")
    public void user_should_get_a_message_please_select_birth_date() {
        driver.findElement(By.id("errormessage9")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid UserName")
    public void user_clicks_sign_up_button_with_invalid_user_name() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please fill valid UserName \"")
    public void user_should_get_a_message_please_fill_valid_user_name() {
        driver.findElement(By.id("errormessage10")).isDisplayed();
    }
    @When("User clicks Sign Up button with invalid Password")
    public void user_clicks_sign_up_button_with_invalid_password() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Please fill valid Password \"")
    public void user_should_get_a_message_please_fill_valid_password() {
        driver.findElement(By.id("errormessage11")).isDisplayed();
    }
    @When("User USer clicks Sign Up button with existing User name")
    public void user_u_ser_clicks_sign_up_button_with_existing_user_name() {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should see the message {string}")
    public void user_should_see_the_message(String string) {
        driver.findElement(By.id("message")).isDisplayed();
    }
    @When("User User enters all Field value and click {string} button.")
    public void user_user_enters_all_field_value_and_click_button(String string)
    {
        driver.findElement(By.id("Signup")).click();
    }
    @Then("User should get a message\"Registeration successful\"")
    public void user_should_get_a_message_registeration_successful() {
        driver.findElement(By.id("Succesmessage")).isDisplayed();
        System.out.println("print Registration successful");
    }

    @Given("User is on the Registeration Page")
    public void userIsOnTheRegisterationPage() {
        System.out.println("print title");
    }
    @Given("User is on LMS website")
    public void user_is_on_lms_website()
    {
        driver.get("https://lms-frontend-phase2.herokuapp.com/login");
    }
    @When("User lands on Registration page")
    public void user_lands_on_registration_page()
    {
        System.out.println("print title");
    }
    @Then("User sees the heading on the form as {string}")
    public void user_sees_the_heading_on_the_form_as(String string) {
        System.out.println("print heading is: +Registration Form");
    }
    @Then("User sees a button with text {string} on the form")
    public void user_sees_a_button_with_text_on_the_form(String string) {
        System.out.println("print text :+Log in");
    }
    @Given("User is on the Registeration Page")
    public void user_is_on_the_registeration_page() {
        System.out.println("registrtion page title is : +title");
    }
    @When("User selects the Log in button")
    public void user_selects_the_log_in_button() {
        driver.findElement(By.id("Login")).click();
    }
    @Then("User lands on Log in page")
    public void user_lands_on_log_in_page(String expectedTitle) {
        String title = driver.getTitle();
        System.out.println("login page title is : +title");
        Assert.assertTrue(title.contains(expectedTitle));
    }
    @Then("User should see the Login page\"Please login to LMS application\"")
    public void user_should_see_the_login_page_please_login_to_lms_application() {
        lp = new LoginPage2Pages_Hyma();
        lp.getHeading();
        System.out.println("Please login to LMS application");
    }
    @When("User clicks the Login button after entering invalid password\"Test\"")
    public void user_clicks_the_login_button_after_entering_invalid_password_test() {
        lp = new LoginPage2Pages_Hyma();
        lp.setInvaliduser();
    }
    @Then("User should receive the message {string}")
    public void user_should_receive_the_message(String string) {
        lp = new LoginPage2Pages_Hyma();
        lp.getMsg();
        System.out.println("Invalid username and password Please try again");
    }
    @When("User clicks the Login button after entering invalid username\"Module\"")
    public void user_clicks_the_login_button_after_entering_invalid_username_module() {
        lp = new LoginPage2Pages_Hyma();
        lp.setInvalidpwd();
    }
}