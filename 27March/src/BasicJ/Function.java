package BasicJ;

public class Function {

	int a =10;
	int b =20;
	String d ="Velocity";
	
	public void test() //user defined method
	{
		System.out.println("Hello I am a method");
	}
	
	public void demo() {//user defined method
		System.out.println("I am demo");
	}
	
	public static void main(String[] args) {
		Function obj = new Function(); //object of class
		System.out.println(obj.b);
		System.out.println(obj.a);
		obj.test();//calling method with object
		obj.demo();//calling method with object
	}
	
}
