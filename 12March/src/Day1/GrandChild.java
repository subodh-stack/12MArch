package Day1;

public class GrandChild{

	public void hello() {
		System.out.println("Hello");
	}
	
	public void test2() {
		System.out.println("Hello i am from grand child");
	}

	
	public static void main(String[] args) {
	ParentClass obj = new ChildClass();
	obj.test();
	obj.test1();
	
	}
}
