package Advance;

public class Demo {
	
	String s = "Velocity";
	public int addition(int a, int b) {
		int c = a+b;
		return c;//this will result the value in c
	}
	
	public void multiply(int c) {
		int d = c*10;
		System.out.println(d);
	}
	
	public String add() {
		int t = 90;
		String p =s.concat(" Katraj");
		return p;
	}
	
	public static void main(String[] args) {
		Demo obj = new Demo();
		int result = obj.addition(16, 9);
		obj.multiply(result);
		String q = obj.add();
		System.out.println(q);
	}
	
	
}
