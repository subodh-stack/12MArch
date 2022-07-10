package Automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
	  
	 String emailID = Parametrization.getData("Credentials", 0, 1);
	 WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	 email.sendKeys(emailID);
	 
	 String pass = Parametrization.getData("Credentials", 1, 1);
	 WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
	 password.sendKeys(pass);
	 
	 
	}
}
