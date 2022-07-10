package Day1;

public class Polymorphism {//method overloading

	public static void test() {
		System.out.println("ZeroAgrgument");
	}
	
	public void test(int a) {
		System.out.println("int argument");
	}
	
	public void test(String b) {
		System.out.println("String ");
	}
	
	public void test(int a, int b) {
	
	System.out.println("int and int");
	}
	
	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.test("s");
		obj.test(6);
		Polymorphism.main(5);
	}
	
	public static void main(int a) {
	System.out.println("Hello everyone");	
	}
}
