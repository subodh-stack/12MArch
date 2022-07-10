package FirtLecure;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.tool.Extension.Param;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
	WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
	String userName = Parametrization.getData(0, 1);
	
	email.sendKeys(userName);
	
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	String pass =Parametrization.getData(1, 1);
	password.sendKeys(pass);
	
	
}
}
