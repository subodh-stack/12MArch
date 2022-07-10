package BasicJ;

public class Unary {
	public static void main(String[] args) {
		//incremenet operator
		
		int a =1 ;
	
		a++; //1
		
		a++; //2  
		
		a = -a;//-3
		
		--a;//-3-1
		
		a--;//-4
		
		++a;//-4+1=-3
		
		a--;//-3
		
		a--;//-4 -4-1=-5+1
		
		++a;//-4
		System.out.println(a);
	}
}
