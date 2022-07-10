package FirtLecure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		
		WebElement signUp =driver.findElement(By.xpath("(//a[contains(@class,'selected')])[2]"));
		signUp.click();
		
		Thread.sleep(2000);
		WebElement firstName =driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Subodh");
	}
}
