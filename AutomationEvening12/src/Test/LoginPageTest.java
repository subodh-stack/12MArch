package Test;

 import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Browser;
import Automation.ScreenShot;
import POM.FacebookLoginPage;

public class LoginPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void luanchBrowser() {
	 driver =Browser.openBrowser("https://www.facebook.com/");
	}
	
	@Test
	public void LoginTest() {
	    FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
	    facebookLoginPage.enterEmailId("Velocity");
	    facebookLoginPage.enterPassword("Katraj");
	    facebookLoginPage.clickOnLogin();
	}
	
	@Test
	public void LoginWithOnlyUserTest() {
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("Velocity");
		facebookLoginPage.clickOnLogin();  
	}
	
	@AfterMethod
	public void afterMethod() throws IOException {
		ScreenShot.takeScreenShot(driver, "LoginPageTest");
		driver.close();
	}

}
