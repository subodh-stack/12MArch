package BasicJ;

public class Logical {
	public static void main(String[] args) {
		int amount = 11;//price should 10 or eaual to 10 lakh
		int seat = 7;//car should 7 seater or more
		int interest = 8;
		boolean result = (amount<= 10)&&(seat>=7);		
		System.out.println(result);
		
		boolean orResult = (amount <= 10)||(seat>=7)||(interest<=6);
		System.out.println(orResult);
		
		
	}
}
                  