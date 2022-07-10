package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOCATORS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
		
		email.sendKeys("Velocity");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Katraj");
		
		
		//WebElement forgot =driver.findElement(By.xpath("//a[text()='Forgotten password?']"));//xpath by text
		
		WebElement forgot =driver.findElement(By.xpath("(//a[contains(@href,'https://www.facebook.com')])[1]"));
		forgot.click();
		
		
	}
	
}
