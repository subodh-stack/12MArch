package Day1;

public class Vriable {
	
	int a = 10;//Global- nonstatic or instance variable can only be called directly in nonstatic method inorder
				//to call this variable in static method we need to create object to call
	
	static int b = 20;//Global static or class variable
	
	String name = "Velocity";//Global nonstatic variable
	
	public static void test() //static method
	{ 
		Vriable obj = new Vriable();
		System.out.println(obj.a);//nonstatic variable cannot be used in static method directly
		System.out.println(b);//static variable can be directly called in static method
	}
	
	public void demo() //non static
	{
		System.out.println(a);//we can call nonstatic variable directly
		System.out.println(b);//also we can called static variable directly in nonstatic method
		
	}
	
	public static void main(String[] args) {
		Vriable.test();
		System.out.println(b);
		Vriable obj = new Vriable();
		obj.demo();	
	}
	//10
	//20
	//20
	//10
	//20
	
	

}