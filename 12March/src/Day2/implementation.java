package Day2;

public class implementation implements Thursday,Friday {//multiple inheritance is possible for interface

	public void test() {
		System.out.println("implemented test");
	}
	
	public void test1() {
		System.out.println("Implemented test1");	
	}
	
	public void demo() {
		System.out.println("Implemented demo");
	}
	
	public void demo2() {
	 System.out.println("implemented demo2");
		
	}
	public static void main(String[] args) {
		implementation obj = new implementation();
		obj.test();
		obj.test1();
		System.out.println(implementation.a);
		System.out.println(implementation.c);
	}


}
