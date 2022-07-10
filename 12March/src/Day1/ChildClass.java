package Day1;

public class ChildClass extends ParentClass {
	
	public void demo() {//retina scan
		System.out.println("Hello i am from child");
	}
	
	public void test() {//face recognization
		System.out.println("overrided parent property");
	}
	
	public static void main(String[] args) {
		ParentClass obj = new ChildClass();//object of parent with the constructor of child
		obj.test();//will show only updated implementation as upcasting is done
		obj.test1();
	}
	
}
