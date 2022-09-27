package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
/*
 * This method is used to initialize the threadlocal driver on the basis of given browser
 */
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new  ThreadLocal();
	
	public static WebDriver init_driver(String browser)
	{
		System.out.println(browser);
		if(browser.equals(browser))
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		getDriver().get("https://lms-frontend-phase2.herokuapp.com/");
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}

	/*8public String getPageTitle()
	{
		return driver.getTitle();
		
	}*/
	public static WebDriver getDriver()
	{
		return tlDriver.get();
		
	}
}
