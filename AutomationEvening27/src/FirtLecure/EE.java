package FirtLecure;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class EE {

	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		
		int a =scan.nextInt();
		
		System.out.println("Enter second number");
		int b = scan.nextInt();
		try //the code which can throw exception is wrriteen under try block
		{
		int c = a/b;
		System.out.println(c);
		}
		catch(Exception e){//it will handle all the exception
			System.out.println(e);
		}
		
		finally {
			System.out.println("Hello i am finally block");
		}
		
	}
	
	public void test2() {
		System.out.println("Thank you for using calculator");
	}
	

	
	public static void main(String[] args)  {//checked exception
		EE obj = new EE();
		obj.test();
		obj.test2();
		
	}
	
}
