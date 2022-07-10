package Test;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Automation.Parametrization;



public class TestNGAnnotation {
	
	String value1;
	String value2;
	@BeforeClass
	public void getTestData() throws EncryptedDocumentException, IOException {
		 value1 =Parametrization.getData("xyz", 0, 1);
		 value2 =Parametrization.getData("xyz", 1, 1);
	}
	
	@DataProvider (name = "TestData")
	public Object[][] values(){
		return new Object[] [] {{5,7},{7,8}};
		}
	
	@Test(dataProvider = "TestData")
	public void test1(int a, int b) {
		System.out.println(a+b);	
	}
	
	@DataProvider(name= "NewData")
	public Object[][] stringData() throws EncryptedDocumentException, IOException{
		return new Object[][] {{value1},{value2}};
	}
	
	@Test(dataProvider = "NewData")
	public void test2(String name) {
		System.out.println(name);
	}
	
	

	
}
