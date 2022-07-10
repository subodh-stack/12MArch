package FirtLecure;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =Browser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions action = new Actions(driver);
		
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(Iframe);
		
		List<WebElement> images = driver.findElements(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
		int numbers = images.size();//4//find element returns a list of webElement
		
		
		
		for (int i =0; i< numbers; i++) //0,1,2,3,4
		{
			WebElement image =images.get(i);
			
			WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
			
			action.dragAndDrop(image, trash);
			action.perform();
			Thread.sleep(3000);
		}	
	}
}
