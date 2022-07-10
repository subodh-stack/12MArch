package FirtLecure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/");
		
		WebElement seleniumPractise =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumPractise.click();
		seleniumPractise.click();
		seleniumPractise.click();
		
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		int values = list.size();
		for(int i =0;i<values; i++) {
			driver.switchTo().window(list.get(i));
			String currentTitle = driver.getTitle();
			if(currentTitle.equals("Practice Page"))
			{
				driver.findElement(By.xpath("//input[@value='Radio1']")).click();
			}
		}
	}
}