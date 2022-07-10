package Day1;

public class LocalVariable {
	 int b = 30;
	
	public void demo()
	{
		int a =10; //local variable cannot be accessed outside the method
		System.out.println(a);
	}
	
	public static  void test() {
		int i =20;
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		LocalVariable obj = new LocalVariable();
		obj.demo();
		System.out.println(obj.a);//local variable cannot be accessed outside the method where they are declared.
	}
	
}
