package BasicJ;

public class ClassB {
	int b = 30;
	
	public void test() {
		int b =40;
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		ClassB obj = new ClassB();
		System.out.println(obj.b);
		obj.test();
	}
	
}
