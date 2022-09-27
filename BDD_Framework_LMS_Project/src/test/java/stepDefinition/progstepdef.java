package stepDefinition;

import BaseUtils.BrowserConfig;
import LMS_Pages.LoginPage;
import LMS_Pages.ProgramPageFooter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.junit.*;

import java.io.ByteArrayInputStream;

public class progstepdef extends BrowserConfig {
    public LoginPage loginpage;
    public ProgramPageFooter progfooter;
    public progstepdef() {
        super();
        String deletebtnclick;
    }
    @Given("User is logged with valid {string} and {string} on to LMS website")
    public void userIsLoggedWithValidAndOnToLMSWebsite(String username, String password) {
        initialization();
        loginpage = new LoginPage();
        loginpage.Username(username);
        loginpage.Password(password);
        loginpage.Cklogin();
    }

    @When("User is on Program page")
    public WebDriver userIsOnProgramPage() {
        loginpage = new LoginPage();
        loginpage.valPageTitle();
        return driver;
    }

    @And("Close Browser")
    public void closeBrowser() {
        closebrowser();
    }

    @Then("User should see the text as noofpages below the table")
    public void userShouldSeeTheTextAsBelowTheTable() {
        progfooter = new ProgramPageFooter();
    }

    @Then("User should see the footer as totalpages programs")
    public void userShouldSeeTheFooterAsTotalpagesPrograms() {
        progfooter = new ProgramPageFooter();
        String gettotalprogram = progfooter.gettotalprogramcount();
    }

    @Then("User should see the Delete button on the top left hand side as Disabled")
    public void userShouldSeeTheDeleteButtonOnTheTopLeftHandSideAsDisabled() {
        progfooter = new ProgramPageFooter();
        String IsDelButDisabled = progfooter.DsabledDelIcon();
        if (IsDelButDisabled=="true") {
            Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
            org.junit.Assert.assertTrue(true);
        }
        else if (IsDelButDisabled=="false"){
            Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
            org.junit.Assert.assertTrue(false);
        }
    }

    @Then("Text box used for search has text as {string}")
    public void textBoxUsedForSearchHasTextAsSearch(String Search) {
        progfooter = new ProgramPageFooter();
        System.out.println(Search);
        String SrchIsVisible = progfooter.Searchbar();
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(Search,SrchIsVisible);
    }

    @When("User enters {string} into search box.")
    public void userEntersIntoSearchBox(String namephrase) {
        progfooter = new ProgramPageFooter();
        progfooter.SendNamePharse(namephrase);
    }

    @Then("Entries for status count are shown.")
    public WebDriver entriesForNoofcountAreShown() throws InterruptedException {
        loginpage = new LoginPage();
        progfooter = new ProgramPageFooter();
        String totalprogentries = progfooter.EntriesRow();
        return driver;
    }
    @Then("Verify that number of records \\(rows of data in the table) displayed on the page.")
    public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page() throws InterruptedException {
        progfooter = new ProgramPageFooter();
        progfooter.countOfGrid();
    }

    @When("User is on first page of Manage Program")
    public void userIsOnFirstPageOfManageProgram() {

    }

    @When("User selects Program using checkbox")
    public void userSelectsProgramUsingCheckbox() {
        progfooter = new ProgramPageFooter();
        progfooter.clickfirstcheckbox();
    }

    @Then("Program gets selected")
    public void programGetsSelected() {
        progfooter = new ProgramPageFooter();
       String CheckboxVal= progfooter.ChkboxAbledorDis();
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
       Assert.assertEquals(CheckboxVal,"true");
    }

    @When("User clicks on <Edit> button")
    public void userClicksOnEditButton() {
        progfooter = new ProgramPageFooter();
        progfooter.Clkeditbutton();
    }

    @Then("User lands on {string} form.")
    public void userLandsOnForm(String editpageheading) throws InterruptedException {
        progfooter = new ProgramPageFooter();
        String valeditheadingpage = progfooter.valeditpagetitle();
        Thread.sleep(1000);
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(valeditheadingpage,editpageheading);
    }

    @When("User edits {string} and selects the Save button")
    public void userEditsNewnameAndSelectsTheSaveButton(String newname) {
        progfooter = new ProgramPageFooter();
        progfooter.editpgmname(newname);
    }

    @Then("User can see {string} Name")
    public void userCanSeeEditnameName(String newname) {
        progfooter = new ProgramPageFooter();
        progfooter.valeditedpgmname(newname);
    }

    @When("User edits description {string} and selects the Save button")
    public void userEditsDescriptionEditdescriptionAndSelectsTheSaveButton(String newdescription) {
        progfooter = new ProgramPageFooter();
        progfooter.editpgmdesc(newdescription);
    }

    @Then("User can see {string} description")
    public void userCanSeeEditdescriptionDescription(String newdescription) {
        progfooter = new ProgramPageFooter();
        progfooter.valeditedpgmdesc(newdescription);
    }

    @When("User changes status and selects the Save button")
    public void userChangesStatusAndSelectsTheSaveButton() {
        progfooter = new ProgramPageFooter();
        progfooter.changeradio();
    }

    @Then("User can see updated Status")
    public void userCanSeeUpdatedStatus() {
        progfooter = new ProgramPageFooter();
        progfooter.valpgmstatus();
    }

    @When("User clicks Cancel button")
    public void userClicksCancelButton() {
        progfooter = new ProgramPageFooter();
        progfooter.clickcancelbtn();
    }

    @Then("User can see {string} form disappears")
    public void userCanSeeFormDisappears(String screenvalid) throws InterruptedException {
        progfooter = new ProgramPageFooter();
        progfooter.valProgEditPopupClosed();
    }

    @When("User clicks on {string} button")
    public void userClicksOnButton(String Delete) {
        progfooter = new ProgramPageFooter();
        progfooter.FirstDeleteClick();
    }

    @Then("User lands on Confirm Deletion form.")
    public void userLandsOnConfirmDeletionForm() throws InterruptedException {
        progfooter = new ProgramPageFooter();
        progfooter.ConfirmationDelPage();
    }

    @When("Click Yes")
    public void clickYes() {
        progfooter = new ProgramPageFooter();
        progfooter.ClicKDelYes();

    }

    @When("Click No")
    public void clickNo() throws InterruptedException {
        progfooter = new ProgramPageFooter();
        progfooter.ClicKDelNo();
    }

    @Then("User can see Successful Program Deleted message")
    public void userCanSeeSuccessfulProgramDeletedMessage() {
        progfooter = new ProgramPageFooter();
        progfooter.valDeleteSuccessMessage();
    }

    @And("User clicks A New Program button")
    public void userClicksANewProgramButton() {
        progfooter = new ProgramPageFooter();
        progfooter.clickAddNewProgBtn();
    }

    @Given("Empty form submission")
    public void emptyFormSubmission() {
        progfooter = new ProgramPageFooter();
        progfooter.emptyprogdetails();
    }

    @When("User clicks Save button without entering data")
    public void userClicksSaveButtonWithoutEnteringData() {
        progfooter = new ProgramPageFooter();
        progfooter.btnSave();
    }

    @Then("User gets message Name is required")
    public void userGetsMessageNameIsRequired() {
        progfooter = new ProgramPageFooter();
        progfooter.valErrMsgDisplayed();
    }

    @Given("User enters {string} in Program name text box")
    public void userEntersNameInProgramNameTextBox(String newProgName) {
        progfooter = new ProgramPageFooter();
        progfooter. NewNameInPrgm(newProgName);
    }

    @And("User enters {string} in Program Description in text box")
    public void userEntersDescriptionInProgramDescriptionInTextBox(String newProgDesc) {
        progfooter = new ProgramPageFooter();
        progfooter.NewDescriptionInPrgm(newProgDesc);
    }

    @When("User clicks Save button")
    public void userClicksSaveButton() {
        progfooter = new ProgramPageFooter();
        progfooter.btnSave();
    }

    @And("User selects {string} using radiobutton")
    public void userSelectsStatusUsingRadiobutton(String activeInactive) {
        progfooter = new ProgramPageFooter();
        progfooter.chooseActiveinactive(activeInactive);
    }

    @And("User selects more than one Program using checkbox")
    public void userSelectsMoreThanOneProgramUsingCheckbox() {
        progfooter = new ProgramPageFooter();
        progfooter.chooseMultiplePgmCheckbox();
    }

    @Then("User should see the Delete button on the top left hand side as Enabled")
    public void userShouldSeeTheDeleteButtonOnTheTopLeftHandSideAsEnabled() {
        progfooter = new ProgramPageFooter();
        String IsDelButDisabled = progfooter.EnableDelIcon();
        if (IsDelButDisabled=="false") {
            org.junit.Assert.assertTrue(true);
        }
        else if (IsDelButDisabled=="true"){
            org.junit.Assert.assertTrue(false);
        }
    }

    @Given("User clicks on Multiple delete button")
    public void userClicksOnMultipleDeleteButton() {
        progfooter = new ProgramPageFooter();
        progfooter.clkMultipledeletebtn();
    }

    @Then("Verify that previous link is disabled")
    public void verifyThatPreviousLinkIsDisabled() {
        progfooter = new ProgramPageFooter();
        boolean VerifyLink1= progfooter.VerifyLink1();
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(VerifyLink1,true);
    }

    @Given("User is on the first page number")
    public void userIsOnThePageNumber() {
        progfooter = new ProgramPageFooter();
        progfooter.valPageNumber();
    }

    @When("User clicks navigate > button")
    public void userClicksNextPageButton() {
        progfooter = new ProgramPageFooter();
        progfooter.clicknextpagebtn();
    }

    @Then("User navigated to second page number")
    public void userNavigatedToSecondPageNumber() {
        progfooter = new ProgramPageFooter();
        progfooter.valsecondPageNumber();
    }

    @Given("User is on second page")
    public void userIsOnSecondPage() {
        progfooter = new ProgramPageFooter();
        progfooter.valsecondPageNumber();
    }

    @When("User clicks navigate < button")
    public void userClicksPreviousPageButton() {
        progfooter = new ProgramPageFooter();
        progfooter.clickpreviouspagebtn();
    }

    @Then("User navigated to first page number")
    public void userNavigatedToFirstPageNumber() {
        progfooter = new ProgramPageFooter();
        progfooter.valPageNumber();
    }

    @Then("Verify that next link is disabled")
    public void verifyThatNextLinkIsDisabled() {
        progfooter = new ProgramPageFooter();
        boolean VerifyLink1= progfooter.nextPageDisabled();
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(VerifyLink1,true);
    }

    @When("User clicks lastpage button")
    public void userClicksLastpageButton() {
        progfooter = new ProgramPageFooter();
        progfooter.clickLastPageButton();
    }

    @Then("User clicks on the Ascending arrow near to the Program name")
    public void userClicksOnTheAscendingArrowNearToTheProgramName() {
        progfooter = new ProgramPageFooter();
        progfooter.sortProgname();
    }

    @Then("User clicks onthe Ascending arrow near to the Program Description")
    public void userClicksOntheAscendingArrowNearToTheProgramDescription() {
        progfooter = new ProgramPageFooter();
        progfooter.sortProgdescription();
    }

    @Then("User clicks onthe Ascending arrow near to the Program Status")
    public void userClicksOntheAscendingArrowNearToTheProgramStatus() {
        progfooter = new ProgramPageFooter();
        progfooter.sortProgstatus();
    }

    @And("Validate Program Name Updated Successfully")
    public void validateProgramNameUpdatedSuccessfully() {
        progfooter = new ProgramPageFooter();
        progfooter.valDeleteSuccessMessage();
    }

    @Then("User should see a the heading with text headingval on the page")
    public void userShouldSeeATheHeadingWithTextHeadingvalOnThePage() throws InterruptedException {
        String getpageheading = loginpage.valHeading();
        System.out.println(getpageheading);
    }
}
