package BasicJ;

public abstract class AbstractClass {//need to use abstract keyword to declare a abstract class

	public void test() {
		System.out.println("Test");//complete method
	}
	
	public static void demo1() {
		System.out.println("Hello");
	}
	
	public abstract void login();//need to use abstract keyword in incomplete method
	
	public abstract void demo();
	//public abstract static void test1();//static method cannot be abstract
	
	public static void main(String[] args) {
		//AbstractClass obj = new AbstractClass();//cannot create the object of abstract class
		AbstractClass.demo1();
	}
}
