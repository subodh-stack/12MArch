package FirtLecure;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws IOException {
	  WebDriver driver =Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
	  //WebElement dropDown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	
	  WebElement heading =driver.findElement(By.xpath("//h1[@class=' header1 font-weight-bold text-white text-center']"));
	  String text = heading.getText();
	  System.out.println(text);
	  ScreenShot.teakeScreenShot(driver);
	  
	}  
	
}
