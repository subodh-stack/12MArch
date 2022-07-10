package Advance;

import java.util.Scanner;

public class UserForm {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter you pin");
	
	int pin= scan.nextInt();
	
	if(pin == 1234) {
		System.out.println("Please enter the amount");
		int amount = scan.nextInt();
		System.out.println("Please collect your cash of "+amount);
				}
	else {
		System.out.println("You have entered a incorrect pin");
	}
}
}
