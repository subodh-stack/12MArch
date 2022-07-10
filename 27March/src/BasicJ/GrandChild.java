package BasicJ;

public class GrandChild extends ParentClass {//multiple inheritance not supported
	public void GChild() {
		System.out.println("I am grand child method");
	}
	
	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		obj.GChild();
		obj.test();
	}
}
