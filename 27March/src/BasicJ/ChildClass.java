package BasicJ;

public class ChildClass extends ParentClass {
		
		int c =30;
		int a =40;
		
		public void demo() {
			System.out.println("Hello");
		}
		
		public void test1() {//overriding property of parent
			System.out.println("Hello Everyone");
		}
		
		public void test() {
			System.out.println("I have overrided");
		}
	

		public static void main(String[] args) {
			ParentClass obj = new ChildClass();//upcasting
			obj.test();
			obj.test1();
			System.out.println(obj.a);
			
		
		}
}
