package FirtLecure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91877\\OneDrive\\Documents\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//upcasting Chrome driver class to WebDriver
	driver.get("https://vctcpune.com/");//method of WebDriver interface
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement search =driver.findElement(By.xpath("//span[@id='et_search_icon']"));
	search.click();
}
}
