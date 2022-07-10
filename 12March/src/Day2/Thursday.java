package Day2;

public interface Thursday {//default abstract no keyword required

	int a =20;//By default final, static, public 
	
	 void test();//by default abstract and public 
	 void test1();
	
	 static void test2() {//static method should be complete , public
		System.out.println("Hello");
		//a = 30;
	}
	
	 static void main(String[] args) {
	//	Thursday obj = new Thursday(); cannot create object as no constructor is present
		System.out.println(Thursday.a);
	}
	
	
}
