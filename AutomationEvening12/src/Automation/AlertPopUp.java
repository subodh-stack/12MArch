package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopUp {
public static void main(String[] args) {
	WebDriver driver =Browser.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
	WebElement jsPrompt =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	
	jsPrompt.click();
	
	Alert a =driver.switchTo().alert();//switch to method witch the focus of selenium and alert method returns Alert interface
	
	//a.accept();
	//a.dismiss();
//	a.sendKeys("Velocity");
//	a.accept();
	String text =a.getText();
	System.out.println(text);
}
}
