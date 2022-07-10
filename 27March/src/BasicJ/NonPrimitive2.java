package BasicJ;

public class NonPrimitive2 {
	
	public static void main(String[] args) {//to print in string
		
		String[] d = {"Suyog","Kunal","Minakshi","Harshal"};
		
		String name = d[0];
		
		
		int len = name.length();//5
		
		for(int i =0;i<len;i++)//4,3,2,1,0,-1
		{
			if(name.charAt(i) =='y')
			{
				System.out.println("y is at index "+i);
				System.out.println(name.charAt(i));
			}
		}
		
		
		
		
		
	}
	
}
