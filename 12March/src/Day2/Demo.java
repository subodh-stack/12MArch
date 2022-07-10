package Day2;



public final class Demo {
	final int a =10;
	int b =5;
	
	
	public final void test() {
		System.out.println("Hello");
	}
	
	public final void test(int a) {//overloading is possible
		
	}
	
	public void test2() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.a= 20;//final variable cannot be changed.
		obj.b =30;
	}
}
