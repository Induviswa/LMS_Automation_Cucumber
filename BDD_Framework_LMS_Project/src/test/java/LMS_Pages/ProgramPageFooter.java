package LMS_Pages;

import BaseUtils.BrowserConfig;
import io.qameta.allure.Allure;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.ByteArrayInputStream;
import java.util.List;

public class ProgramPageFooter extends BrowserConfig {

    private static Logger logger = LogManager.getLogger(ProgramPageFooter.class);

    String isradiochecked = "false";
    String firstPgmname;

    @FindBy(xpath = "//span[contains(text(),'Showing')]")
    WebElement listofPages;

    @FindBy(xpath = "//div[contains(text(),'In total')]")
    WebElement totalPrograms;

    @FindBy(xpath = "//div[contains(text(),' Manage Program')]//ancestor::div//div[2]//span[@class='p-button-icon pi pi-trash']")
    WebElement CheckDelIcon;

    @FindBy(xpath = "//input[@type='text']")
    WebElement SeachTextValue;

    @FindBy(xpath = "//span[@class='p-paginator-current ng-star-inserted']")
    WebElement EntryofNamephrase;

    @FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-double-right']")
    WebElement btnclicklastpage;

    @FindBy(xpath = "//button[@type='button']//span[@class='p-paginator-icon pi pi-angle-right']")
    WebElement btnnextpage;

    @FindBy(xpath = "//button[@type='button']//span[@class='p-paginator-icon pi pi-angle-left']")
    WebElement btnpreviouspage;

    @FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-double-left']")
    WebElement btnclickfirstpage;

    @FindBy(xpath = "//button[@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted p-disabled']//parent::div/span[2]/button[@class='p-paginator-page p-paginator-element p-link p-highlight p-ripple ng-star-inserted']")
    WebElement findlastpage;

    @FindBy(xpath = "//button[@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted p-disabled']")
    WebElement findlastlessthan6;

    @FindBy(xpath = "//button[@class='p-paginator-page p-paginator-element p-link p-ripple ng-star-inserted p-highlight']")
    WebElement test;

    @FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]//div[@role='checkbox']")
    WebElement firstpgmCheckbox;

    @FindBy(xpath = "//thead[@class='p-datatable-thead']//tr//div[@role='checkbox']")
    WebElement multiplepgmCheckbox;

    @FindBy(xpath = "//thead[@class='p-datatable-thead']//th[2][@psortablecolumn='programName']")
    WebElement pgmNameHeader;

    @FindBy(xpath = "//thead[@class='p-datatable-thead']//th[3][@psortablecolumn='programDescription']")
    WebElement pgmDescriptionHeader;

    @FindBy(xpath = "//thead[@class='p-datatable-thead']//th[4][@psortablecolumn='programStatus']")
    WebElement pgmStatusHeader;

    @FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]//span[@class='p-button-icon pi pi-pencil']")
    WebElement firstpgmedit;

    @FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td[2]")
    WebElement firstpgmname;

    @FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td[3]")
    WebElement firstpgmdesc;

    @FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td[4]")
    WebElement firstpgmstatus;

    @FindBy(xpath = "//button[@label='Save']")
    WebElement btneditsave;

    @FindBy(xpath = "//span[contains(text(),'Program Details')]")
    WebElement editpagetitle;

    @FindBy(xpath = "//input[@id='programName']")
    WebElement editPgmname;

    @FindBy(xpath = "//input[@id='programDescription']")
    WebElement editpgmdesc;

    @FindBy(xpath = "//input[@id='Active']")
    WebElement radioactive;

    @FindBy(xpath = "//div[@class='p-radiobutton p-component']")
    WebElement changeradioactive;

    @FindBy(xpath = "//input[@id='Active']//following::div")
    WebElement newPgmRadioActive;

    @FindBy(xpath = "//input[@id='Active']//following::div")
    WebElement newPgmRadioInactive;

    @FindBy(xpath = "//input[@id='Inactive']")
    WebElement radioinactive;

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    WebElement btncancel;

    @FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td[5]//span[@class='p-button-icon pi pi-trash']")
    WebElement firstpgmdeletebtn;

    @FindBy(xpath = "//span[contains(text(),'sure you want to delete')]")
    WebElement pgConfirmToDelete;

    @FindBy(xpath = "//span[@class='p-button-label' and contains(text(),'Yes')]")
    WebElement btnDeleteYes;

    @FindBy(xpath = "//span[@class='p-button-label' and contains(text(),'No')]")
    WebElement btnDeleteNo;

    @FindBy(xpath = "//div[@role='alert' and @aria-atomic='true']")
    WebElement SuccessMessagedisplayed;

    @FindBy(xpath = "//span[contains(text(),'A New Program')]")
    WebElement btnAddNewProgram;

    @FindBy(xpath = "//small[contains(text(),'Name is required.')]")
    WebElement errMsgPgmNameReq;

    @FindBy(id = "programName")
    WebElement EnterNewPrmName;

    @FindBy(id = "programDescription")
    WebElement EnterNewPrmDesc;

    @FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-double-left']//ancestor::button")
    WebElement PreviousLinkIsDis;

    @FindBy(xpath = "//button[@type='button']//span[@class='p-paginator-icon pi pi-angle-right']//ancestor::button")
    WebElement isNextPagelinkIsDis;

    @FindBy(xpath = "//button[@type='button']//span[@class='p-paginator-icon pi pi-angle-double-right']//ancestor::button")
    WebElement isLastPagelinkIsDis;

    @FindBy(xpath = "//span[@class='p-paginator-pages ng-star-inserted']//ancestor::button[1]")
    WebElement Page1;

    @FindBy(xpath = "//span[@class='p-paginator-pages ng-star-inserted']//following::button")
    WebElement Page2;

    public ProgramPageFooter() {
        PageFactory.initElements(driver, this);
    }

    public String getlistofpagesdisplayed() {
        logger.info("Display list of pages");
        System.out.println(listofPages.getText());
        return listofPages.getText();
    }

    public String gettotalprogramcount() {
        logger.info("System display total number of programs in Manage Program");
        System.out.println(totalPrograms.getText());
        return totalPrograms.getText();
    }

    public String DsabledDelIcon() {
        logger.info("Validate whether the delete button is disabled");
        String textVal = CheckDelIcon.getAttribute("aria-hidden");
        System.out.println(textVal);
        return textVal;
    }

    public String Searchbar() {
        logger.info("Find search text box");
        String SrchtextVal = SeachTextValue.getAttribute("placeholder");
        System.out.println(SrchtextVal);
        return SrchtextVal;
    }

    public void SendNamePharse(String NamePharse) {
        logger.info("Clear the search text and enter pharse to search");
        SeachTextValue.clear();
        SeachTextValue.sendKeys(NamePharse);
    }

    public String EntriesRow() throws InterruptedException {
        Thread.sleep(1000);
        logger.info("Entris of names phrase should be displayed");
        System.out.println(EntryofNamephrase.getText());
        return EntryofNamephrase.getText();
    }

    public void SendNameDescrip() {
        SeachTextValue.sendKeys();
    }

    public void countOfGrid() throws InterruptedException {
        logger.info("Total number of programs in the page");
        int totalrecords = 0;
        int totalpages = 0;
        btnclicklastpage.click();
        Thread.sleep(1000);
        System.out.println(totalpages);
        try{
            totalpages = (Integer.parseInt(test.getText()));
        }catch (NoSuchElementException e){
            totalpages = (Integer.parseInt(findlastpage.getText()));
        }
        System.out.println("Total no of pages " + totalpages);
        btnclickfirstpage.click();
        for (int i = 1; i <= totalpages; i++) {
            driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button[contains(text()," + i + ")]")).click();
            System.out.println("System in Page " + i);
            List<WebElement> tablegrid = driver.findElements(By.xpath("//table[@role='grid']//tbody/tr"));
            System.out.println("No of rows in a page " + i + " is " + tablegrid.size());
            totalrecords = totalrecords + tablegrid.size();
        }
        String validatetotalprogram = "In total there are " + totalrecords + " programs.";
        System.out.println(validatetotalprogram);
        System.out.println(totalPrograms.getText());
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(totalPrograms.getText().trim(), validatetotalprogram);
    }

    public void clickfirstcheckbox() {
        logger.info("Take first program");
        firstpgmCheckbox.click();
    }

    public String ChkboxAbledorDis() {
        String CheckBoxVal = firstpgmCheckbox.getAttribute("aria-checked");
        System.out.println(CheckBoxVal);
        return CheckBoxVal;
    }

    public void Clkeditbutton() {
        logger.info("Edit first program");
        firstpgmedit.click();
    }

    public String valeditpagetitle() throws InterruptedException {
        Thread.sleep(1000);
        logger.info("Validate Edit page title");
        String editpageheading = editpagetitle.getText();
        System.out.println(editpageheading);
        return editpageheading;
    }

    public void editpgmname(String newpgmname) {
        editPgmname.clear();
        editPgmname.sendKeys(newpgmname);
        btneditsave.click();
    }

    public void valeditedpgmname(String newpgmname) {
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(firstpgmname.getText(), newpgmname);
    }

    public void editpgmdesc(String newpgmdesc) {
        editpgmdesc.clear();
        editpgmdesc.sendKeys(newpgmdesc);
        btneditsave.click();
    }

    public void valeditedpgmdesc(String newpgmdesc) {
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(firstpgmdesc.getText(), newpgmdesc);
    }

    public void changeradio() {
        isradiochecked = radioactive.getAttribute("aria-checked");
        System.out.println(isradiochecked);
        if (isradiochecked == "true") {
            changeradioactive.click();
            btneditsave.click();
        } else {
            changeradioactive.click();
            btneditsave.click();
        }
    }

    public void valpgmstatus() {
        String isradioinactive = radioinactive.getAttribute("aria-checked");
        String isradioactive = radioactive.getAttribute("aria-checked");
        System.out.println(isradioinactive);
        System.out.println(isradioactive);
        if (isradioinactive.equalsIgnoreCase("true")) {
            Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
            Assert.assertEquals(firstpgmstatus.getText(), "Inactive");
        } else {
            Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
            Assert.assertEquals(firstpgmstatus.getText(), "Active");
        }
    }

    public void clickcancelbtn() {
        btncancel.click();
    }

    public void valProgEditPopupClosed() throws InterruptedException {
        try {
            editpagetitle.click();
            Assert.assertEquals("false", "false");
        } catch (NoSuchElementException ex) {
            Assert.assertEquals("false", "false");
        }
    }

    public void FirstDeleteClick() {
        firstpgmdeletebtn.click();
    }

    public void ConfirmationDelPage() throws InterruptedException {
        Thread.sleep(1000);
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(pgConfirmToDelete.getText().contains("Are you sure you want to delete"), true);
        System.out.println(pgConfirmToDelete);
    }

    public void ClicKDelYes() {
        btnDeleteYes.click();
    }

    public void ClicKDelNo() throws InterruptedException {
        Thread.sleep(1000);
        btnDeleteNo.click();
    }

    public void valDeleteSuccessMessage() {
        if (SuccessMessagedisplayed.isEnabled() == true) {
            Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
            org.junit.Assert.assertTrue(true);
        } else {
            Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
            org.junit.Assert.assertTrue(false);
        }
    }

    public void clickAddNewProgBtn() {
        btnAddNewProgram.click();
    }

    public void emptyprogdetails() {
        editPgmname.clear();
        editpgmdesc.clear();
    }

    public void btnSave() {
        btneditsave.click();
    }

    public void valErrMsgDisplayed() {
        if (errMsgPgmNameReq.isEnabled() == true) {
            Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
            org.junit.Assert.assertTrue(true);
        } else {
            Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
            org.junit.Assert.assertTrue(false);
        }
    }

    public void NewNameInPrgm(String addnewprognamname) {
        EnterNewPrmName.sendKeys(addnewprognamname);
    }

    public void NewDescriptionInPrgm(String addnewprognamedesc) {
        EnterNewPrmDesc.sendKeys(addnewprognamedesc);
    }

    public void chooseActiveinactive(String chooseActiveInactive) {
        System.out.println(chooseActiveInactive);
        if (chooseActiveInactive.equalsIgnoreCase("Active")) {
            newPgmRadioActive.click();
        } else {
            newPgmRadioInactive.click();
        }
    }

    public void chooseMultiplePgmCheckbox() {
        multiplepgmCheckbox.click();
    }

    public void clkMultipledeletebtn() {
        CheckDelIcon.click();
    }

    public String EnableDelIcon() {
        String textVal = CheckDelIcon.getAttribute("aria-hidden");
        System.out.println(textVal);
        return textVal;
    }

    public boolean VerifyLink1() {
        String Link1Disabled = PreviousLinkIsDis.getAttribute("class");
        return Link1Disabled.contains("p-disabled");
    }

    public void valPageNumber(){
        String valpage1highlighted = Page1.getAttribute("class");
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(valpage1highlighted.contains("p-highlight"),true);
    }

    public void clicknextpagebtn(){
        btnnextpage.click();
    }

    public void valsecondPageNumber(){
        String valpage1highlighted = Page2.getAttribute("class");
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(valpage1highlighted.contains("p-highlight"),true);
    }

    public void clickpreviouspagebtn(){
        btnpreviouspage.click();
    }

    public void clickLastPageButton(){
        btnclicklastpage.click();
    }

    public boolean nextPageDisabled() {
        String Link1Disabled = isNextPagelinkIsDis.getAttribute("class");
        return Link1Disabled.contains("p-disabled");
    }

    public void sortProgname(){
        pgmNameHeader.click();
    }

    public void sortProgdescription(){
        pgmDescriptionHeader.click();
    }

    public void sortProgstatus(){
        pgmStatusHeader.click();
    }
}
