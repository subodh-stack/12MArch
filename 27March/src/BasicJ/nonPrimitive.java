package BasicJ;

public class nonPrimitive {
	
	public static void main(String[] args) {
		String a = "Velocity Katraj";
		String b = "velocity KATRAJ";
		
		
		System.out.println(a.charAt(5));//helps us to get character at particular index
		
		
		int length = a.length();//to get length of string
		System.out.println(length);
		
		boolean result = a.equals(b);//to compare two String
		System.out.println(result);
		
		String sub = a.substring(1);//creates sub string.
		System.out.println(sub);
		
		System.out.println(a.substring(1, 5));//create substring
		
		boolean re = a.equalsIgnoreCase(b);//ignore the case while comparing
		System.out.println(re);
		
		System.out.println(a.concat("123"));//adds new string to existing
		
		
		
		System.out.println(a);
		
		boolean value = a.contains("ity");//matched character sequence
		System.out.println(value);
		
		System.out.println(a.toUpperCase());//changes string to upper case
		
		System.out.println(a.toLowerCase());//changes string to lower case
		
		for(int i =length-1;i>=0;i--) {//to print reverse String
			System.out.print(a.charAt(i));
		}
	
	}

}
