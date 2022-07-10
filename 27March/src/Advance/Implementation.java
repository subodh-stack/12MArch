package Advance;

public class Implementation implements Test2, Test {//multiple inheritance possible for interface


	public void demo() {
		System.out.println("Demo Implemented");	
	}


	public void demo1() {
	System.out.println("Demo1 implemented");	
	}
	
	public void sample() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Implementation obj = new Implementation();
		obj.demo();
		obj.demo1();
	}

}
