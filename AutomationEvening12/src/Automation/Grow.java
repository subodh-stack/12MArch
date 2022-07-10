package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Grow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =Browser.openBrowser("https://groww.in/");
	WebElement login =driver.findElement(By.xpath("(//span[@class='absolute-center'])[1]"));
	login.click();
	WebElement email =driver.findElement(By.xpath("//input[@id='login_email1']"));
	email.sendKeys("xyz@gmail.com");
	WebElement next = driver.findElement(By.xpath("//div[@class='lils382ContinueBtn']"));
	next.click();
	
	Thread.sleep(2000);
	WebElement pass =driver.findElement(By.xpath("//input[@id='login_password1']"));
	//pass.sendKeys("12345678");
	
	WebElement submit = driver.findElement(By.xpath("(//div[@class='col l12 leps592LoginButton']//div//div)[1]"));
	//submit.click();
	boolean status = submit.isEnabled();
	System.out.println(status);
}
}
