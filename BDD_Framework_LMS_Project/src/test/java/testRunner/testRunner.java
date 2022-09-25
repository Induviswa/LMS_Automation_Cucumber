package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/Program.feature",
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
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/Login_Hyma.feature",
                        "/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/test/resources/Features/Homepage_Hyma.feature"},
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
