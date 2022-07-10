package Day1;

public class Casting {
	public static void main(String[] args) {
		int a =10;
		
		double r =a;//implicit casting
		System.out.println(r);
		
		double d = 100.45;
		int i =(int) d;//explicit casting
		System.out.println(i);
		
		//boolean casting is not supported in JAVA
	}
}
