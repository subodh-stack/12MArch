package Advance;

public class NonPrimitive2 {
	public static void main(String[] args) {
		
	String [] a = {"Velocity","Katraj","Pune"};	
	String value =a[1];
	int len =value.length();
	
	for(int i = len-1;i>=0;i--)
	{
		System.out.print(value.charAt(i));
	}
		
	
	}
}
