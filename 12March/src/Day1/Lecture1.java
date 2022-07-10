package Day1;

import java.util.Scanner;

public class Lecture1 {
	
	int a =10;
	
	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =scan.nextInt();
		
		System.out.println("Eneter second number");
		int b = scan.nextInt();
		
		try {
		System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	
		finally {//will run at any condition if exception is handled or not
			System.out.println("Hello Everyone");
		}
	}
	
	
	public static void main(String[] args) {
		Lecture1 obj = new Lecture1();
		obj.test();
		System.out.println(obj.a);
	}	
}
