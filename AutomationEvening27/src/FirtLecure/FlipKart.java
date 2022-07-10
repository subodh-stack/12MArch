package FirtLecure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipKart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =Browser.openBrowser("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("Laptops");
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).click();
	
	
	
	
}
}
