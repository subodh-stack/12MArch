package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
	WebElement dropDown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	Select sel = new Select(dropDown);
	//sel.selectByValue("option2");//can select the option using attributeValue
	//sel.selectByVisibleText("Option3");//can select option with visible text
	sel.selectByIndex(2);//can select option using index
	
}
}
