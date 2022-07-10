package BasicJ;

public class OverLoading {
	
	public void test() {
		System.out.println("Hello i am argument");
	}
	
	public void test(int a) {
		System.out.println(a);
	}
	
	public void test(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		OverLoading obj = new OverLoading();
		obj.test(5,10);
	}
	
	}
