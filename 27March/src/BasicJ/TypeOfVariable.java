package BasicJ;

public class TypeOfVariable {
	
	
	public void test() {
		int i = 50;//local variable
		
		System.out.println(i);//local variable can only declared inside method.
	}
	
	public static void demo() {
		static int j =35;//static variable cannot be declared as local variable
		
		System.out.println(i);//local variable cannot be accessed outside the method
	}
	
	
	public static void main(String[] args) {
		TypeOfVariable obj = new TypeOfVariable();
		System.out.println(i);//local variable cannot be accessed outside the method
		System.out.println(j);//local variable cannot be accessed outside the method
	}

}
