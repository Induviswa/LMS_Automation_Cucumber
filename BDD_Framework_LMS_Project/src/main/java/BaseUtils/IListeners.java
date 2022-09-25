package BaseUtils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class IListeners extends BrowserConfig implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
            saveScreenshotOnFailure(driver);
    }

    @Attachment(value = "Screenshot",type = "image/png")
    public void saveScreenshotOnFailure(WebDriver driver) {
        //Attach screen shot in allure report
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }
}
