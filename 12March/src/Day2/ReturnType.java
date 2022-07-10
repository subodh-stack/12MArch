package Day2;

public class ReturnType {
	
	
	public void test() {
		int a = 10+20;	
	}
	
	public int addition() {
		int c =40+70;
		String d = "Katraj";
		return c;
	}
	
	public String text() {
		return "Velocity";
	}
	
	public static void main(String[] args) {
		ReturnType obj = new ReturnType();
		obj.test();
		int i =obj.addition();
		System.out.println(i);
		System.out.println(obj.text());
	}
}
