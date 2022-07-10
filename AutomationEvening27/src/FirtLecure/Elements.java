package FirtLecure;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {

	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://demo.guru99.com/test/ajax.html");
		
		List<WebElement> headings =driver.findElements(By.xpath("//li[@class='d']"));
		
		System.out.println(headings.size());
		
		headings.get(2).click();
				
	}
}
