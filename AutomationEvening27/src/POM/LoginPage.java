package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='email']") private WebElement email;//all the data members are private
	@FindBy(xpath ="//input[@id='pass']") private WebElement password;
	@FindBy(xpath = "//button[@name='login']") private WebElement login;
	
	
	public LoginPage(WebDriver driver) {//constructor is always public
		PageFactory.initElements(driver, this);//initelemets find the elemnet with the help of @FindBy annotation
	}
	
	
	
	public void enterEmail(String emailaddress) {//all the member functions are public
		email.sendKeys(emailaddress);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		login.click();
	}

}
