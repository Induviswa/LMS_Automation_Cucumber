package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Login_Hyma.feature",
                        "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Homepage_Hyma.feature",
                        "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Program.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/Footer.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/Delete.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/NoofRecords.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/Search.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/EditProgram.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/DeleteProgram.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/AddNewProgram.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/MultiplePgmDelete.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/Pagination.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/SortAscending.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/SortDecending.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/add_new_assignment_V1_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/AddBatch_Lavi.feature",
                        "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Ascendingorder_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/BatchDelete_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/BNameSearch_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/cancel_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/CancelXicon_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/delete_assignment_V1_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Delete_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/DeleteIcon_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/DescendingOrder_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/edit_assignment_details_V1_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/EditBatch_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/editDeleteIcon_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/fill_Assignments_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Footer_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/footer_V1_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/heading_V1_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/label_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/LmsLogin_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/login_V1_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/manageUserPage_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Multiple _Assignment_Deletion_V1_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/NameDelete_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/PageHeading_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Pagination_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Pagination_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Records1_Lavi.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Results _in_ Descending_ order_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Results_ in _Ascending _order_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/Search_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/searchassignment_V1_Seema.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/submit_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/TableHeader_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/userDeatails_Kalpana.feature",
                "/Users/Indu/Indu_Files/LMS_Cucumber_Automation/LMS_Automation_Cucumber/BDD_Framework_LMS_Project/src/test/resources/Features/UserID_Kalpana.feature"},
                glue = "stepDefinition",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}

                //Check the cucumber verion and add related allure cucumber JVM dependeny from maven repository
                //eg. I have added Cucumber 7.8.0 so i have added allure cucumber 7JVM
                //Update plugin to "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        )
public class testRunner {
}
