package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.Browser;

public class Table {
		
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
		int rowSize =row.size();
		double maxPrice = 100;
		for(int i =1; i<=rowSize; i++) //26
		{
			WebElement currentPrice =driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			
			String price =currentPrice.getText();
			
			double d =Double.parseDouble(price);//100,200,50
			
			if(d>maxPrice)
			{
				maxPrice = d; //200
			}
			
		}
		
		System.out.println("Max number is "+ maxPrice);
		
		for(int j =1; j<=row.size();j++) 
		{

			WebElement currentPrice =driver.findElement(By.xpath("//table//tbody//tr["+j+"]//td[4]"));
			
			String price =currentPrice.getText();
			
			double d =Double.parseDouble(price);
			
			if(d<maxPrice)
			{
				maxPrice = d;
			}
			
		}
		
		System.out.println("Min price is"+ maxPrice);
		
	
	}
}
