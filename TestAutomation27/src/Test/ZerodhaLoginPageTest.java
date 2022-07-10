package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ZerodhaLoginPageTest {

	@Test(priority =1)
	public void testa() throws InterruptedException {//4
		Thread.sleep(0);
		System.out.println("Testa executed");
	}
	
	@Test(priority = 2)
	public void testb() {//7
		System.out.println("Testb Executed");
	}
	
	@Test()
	public void testc() {
		System.out.println("Testc Executed");
	}
	
	
	@Test()
	@Parameters({"b"})
	public void testd(int c) {
		System.out.println("testd Executed");
		System.out.println(c);
	}
	
	@BeforeClass
	public void beforeClass() {//2
		System.out.println("Before class is executed");
	}
	
	@AfterClass
	public void afterClass() {//9
		System.out.println("After class is executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {//3 6
		System.out.println("Before Method is executed");
	}
	
	@AfterMethod
	public void afterMethod() {//5 8
		System.out.println("After method is executed");
	}
	
	@BeforeTest
	public void beforeTest() {//1
		System.out.println("BeforeTest is execuetd");
	}
	
	@AfterTest
	public void afterTest() {//10
		System.out.println("AfterTest is executed");
	}
}
