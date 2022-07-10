package BasicJ;

public final class ClassC {
	public final void test() {
		System.out.println("Hello");
	}
	
	public void demo() {
		System.out.println("Demo");
	}
	
	public static void main(String[] args) {
		final int a =20;
		int b = 30;
		
		b = 30-10;
		
		a = 20;//we cannot change the value of final variable
		
		System.out.println(b);
	}
}
