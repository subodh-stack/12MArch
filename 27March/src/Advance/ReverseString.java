package Advance;

public class ReverseString {
	public static void main(String[] args) {
	String name = "Velocity Katraj is in Pune";
	int len = name.length();//8
	int count = 0;
	
	for(int i = len-1;i>=0;i--)//7,6,5,4,3,2,1,0,-1
	{
		if(name.charAt(i) == 'a')
		{
			count++;
		}
	}
	System.out.println(count);
	}

}
