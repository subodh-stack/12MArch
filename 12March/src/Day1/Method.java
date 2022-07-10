package Day1;

public class Method {
		int a =10;
		static int b =20;
	
		public void test(int a,int b) {//parametrized user defined method 
			System.out.println(a+b);
		}
		
		public void demo() {// user defined method
			System.out.println("Hello");
		}
		
		public static void march() {//static keyword so its static method
			System.out.println("I am a static method");
		}
			
		public static void main(String[] args) {//main method
			Method obj = new Method();
			obj.test(10,30); //user defined method is always called inside main method
			obj.demo();//non static method are always called using object we cannot call it with class name
			System.out.println(obj.a);
			Method.march();//static element can be directly called with class name
			System.out.println(Method.b);
			
		}
		
		
}
