package Test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Automation.Browser;
import POM.FacebookLoginPage;

public class HomePageTest {

	@Test
	public void GoToHomePageTest() {
		 WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		   FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		   facebookLoginPage.enterEmailId("xyz");
		   facebookLoginPage.enterPassword("123242");
		   facebookLoginPage.clickOnLogin();
		
	}
	
}
