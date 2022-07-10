package BasicJ;

public class Memory {
	int a = 20; //declaration save in heap area
	
	static int b = 30;//declaration save static pool area
	
	
	public void test() {//heap area
		System.out.println("Hello");// method area
	}
	
	public static void test2() {//static pool area
		System.out.println("Hi");//method area
	}
	
	public static void main(String[] args) {
		Memory obj = new Memory();
		obj.test();
		Memory.test2();
		System.out.println(Memory.b);
		System.out.println(obj.a);
	}
	
}
