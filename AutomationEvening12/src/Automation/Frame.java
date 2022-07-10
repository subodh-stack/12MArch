package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {
public static void main(String[] args) {
	WebDriver driver = Browser.openBrowser("http://demo.automationtesting.in/Frames.html");
	
	
	WebElement doubleIframe = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
	doubleIframe.click();
	
	WebElement outerFrame =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerFrame);
	
	WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerFrame);
	
	WebElement text =driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("Velocity");
	
	driver.switchTo().defaultContent();//will switch focus to main page
	
	WebElement home =driver.findElement(By.xpath("//a[text()='Home']"));
	home.click();
	
}

}
