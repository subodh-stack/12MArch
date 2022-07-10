package FirtLecure;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class popUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alert.click();
		
		Alert a =driver.switchTo().alert();
		
		a.sendKeys("Subodh");
		Thread.sleep(3000);
		a.accept();
		
	}
}
