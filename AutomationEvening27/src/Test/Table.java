package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FirtLecure.Browser;

public class Table {
public static void main(String[] args) {
	WebDriver driver =Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
	List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
	int columnsize =column.size();
	System.out.println(columnsize);
	
	List<WebElement> rows= driver.findElements(By.xpath("//table//tbody//tr"));
	int rowsSize = rows.size();
	
	List<WebElement> currentPrice= driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
	
	double max = 0;
	
	for(int i = 0; i<currentPrice.size();i++)
	{
		WebElement price = currentPrice.get(i);
		String currentPriceValue = price.getText();
		double value = Double.parseDouble(currentPriceValue);//919.4, 355.7, 752.5,967.5
		
		if(value > max) 
		{
			max = value;
		}
		
	}
	
	System.out.println(max);
	
	
}
}
