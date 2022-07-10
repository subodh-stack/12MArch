package Advance;

public interface Test {
	int a =30;	//by default static final public 
	
	public void demo();
	
	
	
	void demo1();//by default public 

	
	public static void demo3() {//we can write a complete static method in interface
		int b =60;
		System.out.println(b);
		
	}
	

	
	public static void main(String[] args) {
		
	System.out.println(Test.a);
	Test.demo3();
		
	}
	
}
