package Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.openBrowser("https://www.amazon.in/");
		
		ScreenShot.takeScreenShot(driver, "Amazon");
	}
}
