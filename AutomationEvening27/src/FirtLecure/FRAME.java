package FirtLecure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FRAME {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.openBrowser("http://demo.automationtesting.in/Frames.html");
		
		WebElement doubleIframe =driver.findElement(By.xpath("//a[@href='#Multiple']"));
		doubleIframe.click();
		
		WebElement multiIframe =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(multiIframe);
		
		
		WebElement singleFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		//driver.switchTo().frame("singleframe");//frame with ID
		//driver.switchTo().frame(0);//frame with index
		driver.switchTo().frame(singleFrame);
		
		WebElement textField =driver.findElement(By.xpath("//input[@type='text']"));
		textField.sendKeys("Velocity");
		Thread.sleep(1000);
		textField.clear();
		
		driver.switchTo().parentFrame();
		
		
		
	}
	
}
