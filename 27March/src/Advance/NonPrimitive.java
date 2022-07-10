package Advance;

public class NonPrimitive {

	public static void main(String[] args) {
		
		short a =10;
	
		int b = a;
		System.out.println(b);
		
		double d = b;
		System.out.println(d);
		
		double e = 100050.895;
		
		int i =(int) e;//explicit
		
		System.out.println(i);
		
		short s = (short)i;
		System.out.println(s);
	
	}
}
