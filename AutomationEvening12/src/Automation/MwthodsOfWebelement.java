package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MwthodsOfWebelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement input =driver.findElement(By.xpath("//input[@id='displayed-text']"));
		input.sendKeys("Velocity");
		
		Thread.sleep(2000);
		
		input.clear();
		
	
	}
}
