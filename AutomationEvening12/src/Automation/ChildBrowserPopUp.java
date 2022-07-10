package Automation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =Browser.openBrowser("https://vctcpune.com/");
	WebElement seleniumPractise =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	Thread.sleep(5000);
	seleniumPractise.click();
	Thread.sleep(5000);
	seleniumPractise.click();
	Thread.sleep(5000);
	seleniumPractise.click();

	
	
	ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
	int s =list.size();
	System.out.println(s);
	
//	driver.switchTo().window(list.get(0));
//	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(list.get(1));
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(list.get(2));
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(list.get(3));
	System.out.println(driver.getTitle());
	
	
	
	
	
}
}
