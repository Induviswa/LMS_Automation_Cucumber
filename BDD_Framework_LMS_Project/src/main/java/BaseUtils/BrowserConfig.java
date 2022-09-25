package BaseUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserConfig {
    public static WebDriver driver;

    public static void initialization(){
        System.setProperty("webdriver.chrome.driver","/Users/Indu/Indu_Files/BDD_Framework_LMS_Project/src/main/resources/Browsers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://lms-frontend-phase2.herokuapp.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void closebrowser(){
        driver.quit();
    }
}
