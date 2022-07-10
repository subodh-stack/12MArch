package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZerodhaLoginPageTest {

	@Test(priority =1,timeOut = 1000)
	public void testa() throws InterruptedException {//4
		Thread.sleep(0);
		System.out.println("Testa executed");
	}
	
	@Test(priority = 2,invocationCount = 3)
	public void testb() {//7
		System.out.println("Testb Executed");
	}
	
	@Test(enabled = false)
	public void testc() {
		System.out.println("Testc Executed");
	}
	
	
	@Test(dependsOnMethods = {"testa"})
	public void testd() {
		System.out.println("testd Executed");
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
