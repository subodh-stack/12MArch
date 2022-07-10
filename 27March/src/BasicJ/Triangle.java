package BasicJ;

public class Triangle {

	public void rightTriangle(int i)//parametrized method, used to provide some input data to method
	{
		for(int a=1; a<=i;a++) //1,2,3,4,5,6
		{
			for(int b =1;b<=a;b++)//1,2,3,4,5
			{
				System.out.print(" *");
			}						
			System.out.println();	
		}
	}
	
	public void reverseTriangle(int j)
	{
		for(int a=1; a<=j;a++) //1,2,3,4,5,6
		{
			for(int b =j;b>=a;b--)//1,2,3,4,5
			{
				System.out.print(" *");
			}						
			System.out.println();	
		}
	}
	
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		obj.rightTriangle(5,"Velicty");
		obj.reverseTriangle(4);
	
		
		
		
	}
	
}
