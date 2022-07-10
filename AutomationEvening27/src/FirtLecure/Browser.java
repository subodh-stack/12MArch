package FirtLecure;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver openBrowser(String url)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91877\\OneDrive\\Documents\\Software\\Driver Update\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting Chrome driver class to WebDriver
		driver.get(url);//method of WebDriver interface
		driver.manage().window().maximize();
		return driver;
	}

}
