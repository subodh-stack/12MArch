package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
		WebElement create =driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		Thread.sleep(1000);
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Velocity");
	}
}
