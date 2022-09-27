package stepDefinition;

import LMS_Pages.LoginPage_Kalpana;
import LMS_Pages.ManageUserPage_Kalpana;
import LMS_Pages.Pagination_Kalpana;
import LMS_Pages.UserDetailsPage_Kalpana;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.api.internal.Utils;

public class BaseClass_Kalpana {
	public WebDriver driver;
	public LoginPage_Kalpana lp;
	public ManageUserPage_Kalpana mp;
	public UserDetailsPage_Kalpana up;
	public utility.Utils utils;
	public Pagination_Kalpana page;
	
	
	
	public static String randomstring()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
		
	}
/*	public String getPageTitle()
	{
		return driver.getTitle();
		
	}*/
}
