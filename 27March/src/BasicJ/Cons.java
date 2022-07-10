package BasicJ;

public class Cons {//constructor overloading
	
	private Cons(){//Zero argument
		System.out.println("Hello I am Constructor");//will run first in the class
	}
	
	public Cons(int a){//argument
		System.out.println("Constructor with int parameter");
	}
	
	Cons(int a, String c){
		System.out.println("Constructor with int and string");
	}
	
	protected Cons(String d) {
		System.out.println("Constructor with String argument");
	}
	
	
	public void test() {
		System.out.println("Hello i am Test");
	}
	
public static void main(String[] args) {
	Cons obj = new Cons();//constructor can be only called during abject creation
	obj.test();
	obj.test();
	obj.test();
	Cons obj2 = new Cons(5);
	Cons obj3 = new Cons(6,"Hi");
	
	//Constructor helps to load class members to the object, which helps to call non static members of class
	//Constrcutor helps to allocate memory to object of class.
	//COnstructor must be same as class name
	//it is not compulsary to write a constructor bcose java provides a default constructor by itself.
	//Constructor have no return type.
	//Constructor cannot be static, final, abstract
}
	
}
