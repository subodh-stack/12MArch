package FirtLecure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radio {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement radio3 =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radio3.click();
		
		boolean result =radio3.isSelected();//it check if the element is selected and return boolean
		System.out.println(result);
		
		WebElement hide =driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		//hide.click();
		
		WebElement text =driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean status =text.isDisplayed();//check if the the element is displayed or not
		
		if(status == true) {
			text.sendKeys("it is displayed");
		}else {
			System.out.println("the text field is not displayed "+ status);
		}
		
		Thread.sleep(2000);
		text.clear();//clears the existing text from input field.
		
		WebElement title = driver.findElement(By.xpath("(//html//legend)[7]"));
		String value = title.getText();
		System.out.println(value);
		
		
	}
}
