package FirtLecure;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://demoqa.com/text-box");
		
		WebElement firstName= driver.findElement(By.xpath("//input[@id='userName']"));
		firstName.sendKeys("Subodh");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB);
	
		
		action.sendKeys("Subodh@gmail.com");
		
		
		action.sendKeys(Keys.TAB);
	
		
		action.sendKeys("T22, Kharadi Pune, Maharashtra");
	
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.sendKeys(Keys.TAB);

		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();		
		
	}
}
