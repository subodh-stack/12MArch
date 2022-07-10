package FirtLecure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoFrame {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame3 =driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		
		
		driver.switchTo().frame(frame3);
		
		driver.switchTo().frame(0);
		
		WebElement radio = driver.findElement(By.xpath("(//div[@class=\"AB7Lab Id5V1\"])[1]"));
		radio.click();
		
		//driver.switchTo().parentFrame();
		WebElement text =driver.findElement(By.xpath("//input[@name=\"mytext3\"]"));
		text.sendKeys("Velocity");
	}
}
