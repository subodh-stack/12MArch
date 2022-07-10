package Day2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);//object of scanner class 
		System.out.println("Enter first number");
		int a = obj.nextInt();
		
		System.out.println("Enter second number");
		int b = obj.nextInt();
		
		System.out.println("The sum of number is");
		System.out.println(a+b);
		
	}
}
