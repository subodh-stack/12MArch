package Day1;

public class NestedConditional {
	public static void main(String[] args) {
		int a =1 ;
		int b =1 ;
		int c =0;
		
		if(a==b && b==c) {
			System.out.println("All number are equal ");
		}
		else 
		{
	
			if( a>b || a==b)//false
			{
				if(a==c) 
				{
					System.out.println("A and C are equal");
				}
				else
				{
					if(a>c) 
					{
						System.out.println("a is bigger");
					}
					else
					{
						System.out.println("c is bigger");
					}
				}
			}
			else
			{
				if(b==c) {
					System.out.println("B and C are equal");
				}
				else 
				{
					if(b>c)//false
					{
						System.out.println("B is bigger");
					}
					else 
					{
						System.out.println("c is bigger");
					}
				}
			}	
		}	
	}
}
