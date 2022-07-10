package BasicJ;


 public  class Modifier {//for class only public and default are applicable
	public int a =10;
	
	int b =40;//default
	
	protected int c = 50;
	
	private int d = 20;
	
	private void test()
	{
		int e = 3;
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		Modifier obj = new Modifier();
		System.out.println(obj.a);//public can be accessed in same class
		System.out.println(obj.b);//default can be accessed in same class
		System.out.println(obj.c);//protected can be accessed in same class
		System.out.println(obj.d);//private can be accessed in same class
	}


	
	
	
}
